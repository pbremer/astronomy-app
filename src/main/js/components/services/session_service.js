

function SessionService($window){
    "ngInject";

    this._$window = $window;
    this._user = JSON.parse(localStorage.getItem('session.user'));
    this._accessToken = JSON.parse(localStorage.getItem('session.accessToken'));
    this._courseUserId = JSON.parse(localStorage.getItem('session.courseUserId'));
}

SessionService.prototype.getUser = function(){
    return this._user;
}

SessionService.prototype.setCourseUserId = function(courseUserId){
    this._courseUserId = courseUserId;
    this._$window.localStorage.setItem('session.courseUserId', JSON.stringify(courseUserId));
}

SessionService.prototype.getCourseUserId = function(){
    var self = this;
    return self._courseUserId;
}

SessionService.prototype.setUser = function(user){
    this._user = user;
    this._$window.localStorage.setItem('session.user', JSON.stringify(user));
    return this;
}

SessionService.prototype.getAccessToken = function(){
    var self = this;
    return this._accessToken;
}

SessionService.prototype.setAccessToken = function(accessToken){
    this._accessToken = accessToken;
    this._$window.localStorage.setItem('session.accessToken', JSON.stringify(accessToken));
    return this;
}

SessionService.prototype.destroy = function(){
    this.setUser(null);
    this.setAccessToken(null);
}

SessionService.prototype.create = function(user, accessToken){
    var tempUser = {
        "email" : user.email,
        "firstName" : user.firstName,
        "lastName" : user.lastName,
        "roles" : user.appRoles
    }
    this.setUser(tempUser);
    this.setAccessToken(accessToken);
    return tempUser;
}

module.exports = angular.module('app.components.services.session_service', [])
    .service('SessionService', SessionService);



