package IT;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import webpageInformation.CourseAssignments;
import webpageInformation.CourseModule;
import webpageInformation.Courses;
import webpageInformation.Login;

public class AddGroupMember {

	 private WebDriver driver;
	
	 @Before
	 public void setUp()
	 {
		System.setProperty("webdriver.chrome.driver", "SeleniumDrivers/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  }

	  @Test
	  public void AddNewGroupMembers()
	  {
		  Login.LoginUser(driver, "user1@umich.edu", "password");
		  driver.findElement(Courses.SelectCourseLink("course1Atitle")).click();
		  driver.findElement(CourseAssignments.SelectModule("mod1-course1Atitle")).click();
		  driver.findElement(CourseModule.CREATE_OR_EDIT_GROUP_BTN).click();
		  
		  //Adding users
		  CourseModule.SelectUserFromDropDown(driver, "User4fname User4lname");
		  driver.findElement(CourseModule.ADD_GROUP_MEMBER_BTN).click();
		  CourseModule.SelectUserFromDropDown(driver, "User5fname User5lname");
		  driver.findElement(CourseModule.ADD_GROUP_MEMBER_BTN).click();
	  }

	  @After
	  public void tearDown()
	  {
		  driver.quit();
	  }

}
