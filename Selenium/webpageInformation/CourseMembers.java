package webpageInformation;

import org.openqa.selenium.By;

public class CourseMembers 
{
	public static final By ADD_MEMBERS_BTN = By.cssSelector("button.btn.btn-primary");
	public static final By CONFIRM_REMOVE_BTN = By.xpath("//button");
	public static final By REJECT_REMOVE_BTN = By.xpath("//button[2]");

	static public By SelectMemberToDrop(int index)
	{
		return By.xpath("//tr["+ index + "]/td[5]/a");
	}
}
