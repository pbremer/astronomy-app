package IT;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import webpageInformation.Account;
import webpageInformation.Courses;
import webpageInformation.Login;

public class ChangeUserPassword {

	 private WebDriver driver;

	 @Before
	 public void setUp()
	 {
		System.setProperty("webdriver.chrome.driver", "SeleniumDrivers/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  }

	  @Test
	  public void ChangeUsersPassword()
	  {
		  Login.LoginUser(driver, "user1@umich.edu", "password");
		  driver.findElement(Courses.ACCOUNT_BTN).click();
		  
		  //Changing password
		  driver.findElement(Account.NEW_PASSWORD_FIELD).clear();
		  driver.findElement(Account.NEW_PASSWORD_FIELD).sendKeys("password1");
		  driver.findElement(Account.RETYPE_PASSWORD_FIELD).clear();
		  driver.findElement(Account.RETYPE_PASSWORD_FIELD).sendKeys("password1");
	  }

	  @After
	  public void tearDown()
	  {
		  driver.quit();
	  }

}
