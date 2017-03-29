package IT;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.TestCase;
import webpageInformation.Courses;
import webpageInformation.Login;

public class UserLogin extends TestCase
{
	 private WebDriver driver;
	  
	 @Before
	 public void setUp()
	 {
		System.setProperty("webdriver.chrome.driver", "SeleniumDrivers/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  }

	  @Test
	  public void LoginStudent()
	  {
		  driver.get((Login.URL));
		  driver.findElement(Login.USERNAME_TXTBOX).clear();
		  driver.findElement(Login.USERNAME_TXTBOX).sendKeys("user1@umich.edu");
		  driver.findElement(Login.PASSWORD_TXTBOX).clear();
		  driver.findElement(Login.PASSWORD_TXTBOX).sendKeys("password");
		  driver.findElement(Login.LOGIN_BTN).click();
		  driver.findElement(Courses.LOGOUT_BTN).click();
	  }
	  
	  @Test
	  public void LoginInstructor()
	  {
		  driver.get((Login.URL));
		  driver.findElement(Login.USERNAME_TXTBOX).clear();
		  driver.findElement(Login.USERNAME_TXTBOX).sendKeys("user1@umich.edu");
		  driver.findElement(Login.PASSWORD_TXTBOX).clear();
		  driver.findElement(Login.PASSWORD_TXTBOX).sendKeys("password");
		  driver.findElement(Login.LOGIN_BTN).click();
		  driver.findElement(Courses.LOGOUT_BTN).click();
	  }
	  
	  @Test
	  public void LoginAdmin()
	  {
		  driver.get((Login.URL));
		  driver.findElement(Login.USERNAME_TXTBOX).clear();
		  driver.findElement(Login.USERNAME_TXTBOX).sendKeys("user1@umich.edu");
		  driver.findElement(Login.PASSWORD_TXTBOX).clear();
		  driver.findElement(Login.PASSWORD_TXTBOX).sendKeys("password");
		  driver.findElement(Login.LOGIN_BTN).click();
		  driver.findElement(Courses.LOGOUT_BTN).click();
	  }

	  @After
	  public void tearDown()
	  {
	    driver.quit();
	  }
}
