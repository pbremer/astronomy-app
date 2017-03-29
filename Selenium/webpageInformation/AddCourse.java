package webpageInformation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AddCourse 
{
	public static final By TITLE_FIELD = By.name("title");
	public static final By COURSE_CODE_FIELD = By.name("courseCode");
	public static final By SUBJECT_CODE_FIELD = By.name("subjectCode");
	public static final By OPEN_DATE_FIELD = By.name("openDate");
	public static final By CLOSE_DATE_FIELD = By.name("closeDate");
	public static final By SUBMIT_BTN = By.xpath("//button");

	static public void SelectCourseFromDropDown(WebDriver driver, String item)
	{
	    new Select(driver.findElement(By.xpath("//select"))).selectByVisibleText(item);
	}
        
}
