package IT;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import webpageInformation.CourseAssignments;
import webpageInformation.CourseModule;
import webpageInformation.Courses;
import webpageInformation.Login;

public class FinalizeGroup 
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
	  public void FinalizeUserGroup()
	  {
		  Login.LoginUser(driver, "user1@umich.edu", "password");
		  driver.findElement(Courses.SelectCourseLink("course1Atitle")).click();
		  driver.findElement(CourseAssignments.SelectModule("mod1-course1Atitle")).click();
		  driver.findElement(CourseModule.CONFIRM_GROUP_BTN).click();
		  retry(CourseModule.FINALIZE_BTN);
		  driver.switchTo().activeElement();
		  driver.findElement(CourseModule.REJECT_GROUP_BTN).click();
	  }

	  @After
	  public void tearDown()
	  {
		  driver.quit();
	  }
	  
	  public void retry(By by)
	  {
		  int attempts = 0;
		  while(attempts < 3)
		  {
			  try
			  {
				  driver.findElement(by).click();
				  break;
			  }
			  catch(StaleElementReferenceException e){
			  }
			  attempts++;
		  }
	  }
}