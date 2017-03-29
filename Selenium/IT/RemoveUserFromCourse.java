package IT;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;

public class RemoveUserFromCourse 
{
	private WebDriver driver;
	
	@Test
	public void RemoveStudentFromCourse() 
	{
		fail("Not yet implemented");
	}
	
	@Test
	public void RemoveInstructorFromCourse() 
	{
		fail("Not yet implemented");
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
