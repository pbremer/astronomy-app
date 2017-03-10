
function Interceptor($injector, $q, SessionService){
    "ngInject";

    var sessionInjector = {
        request: function(config) {
            console.log("Sent request");
            if(SessionService.getAccessToken() != null) {
                //set the auth token for session
                config.headers['X-Auth-Token'] = SessionService.getAccessToken();
            }

            return config;
        },
        response: function(response) {
            var authToken = response.headers("x-auth-token");
            if( authToken != null ) {
                //set a new access token if it is availbale from the request
                SessionService.setAccessToken(authToken);
            }

            return response;
        },
        responseError : function(response) {
            if(response.status == 401){
                SessionService.destroy();
                $injector.get('$state').go('app.login', { sessionExpired : true }, { reload : true });
            }
            return $q.reject(response);
        }
    };

    return sessionInjector;
}

module.exports = Interceptor;


