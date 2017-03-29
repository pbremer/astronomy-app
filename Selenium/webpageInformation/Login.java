package webpageInformation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login
{
	public static final By USERNAME_TXTBOX = By.id("username");
	public static final By PASSWORD_TXTBOX = By.id("password");
	public static final By LOGIN_BTN = By.xpath("//button");
	public static final String URL = "http://localhost:8080/#/login";
	
	static public void LoginUser(WebDriver driver, String user, String password)
	{
		driver.get((Login.URL));
		driver.findElement(Login.USERNAME_TXTBOX).clear();
		driver.findElement(Login.USERNAME_TXTBOX).sendKeys(user);
		driver.findElement(Login.PASSWORD_TXTBOX).clear();
	    driver.findElement(Login.PASSWORD_TXTBOX).sendKeys(password);
	    driver.findElement(Login.LOGIN_BTN).click();
	}
}
