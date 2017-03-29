package webpageInformation;

import org.openqa.selenium.By;

public class CourseAssignments extends MainNavigation
{
	public static final By NEW_ASSIGNMENT_BTN = By.xpath("//button");

	static public By SelectModule(String item)
	{
		return By.linkText(item);
	}
	
	static public By SelectModuleEdit(int index)
	{
		return By.xpath("//tr["+ index + "]/td[5]/a");
	}
}
