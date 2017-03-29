package webpageInformation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Courses extends MainNavigation
{	
	public static final By CREATE_COURSE_BTN = By.xpath("//button");

	static public By SelectCourseLink(String item)
	{
		return By.linkText(item);
	}
	
	static public By SelectCourseEdit(WebDriver driver, int index )
	{
	    return By.xpath("//tr["+index+"]/td[4]/a");
	}
}
