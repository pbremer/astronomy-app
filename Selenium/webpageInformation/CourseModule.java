package webpageInformation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CourseModule extends MainNavigation
{
	public static final By ADD_GROUP_MEMBER_BTN = By.cssSelector("button.btn.btn-primary");
	public static final By CREATE_OR_EDIT_GROUP_BTN = By.xpath("(//button[@type='button'])[2]");
	public static final By START_BTN = By.cssSelector(null);
	
	public static final By FINALIZE_BTN = By.xpath("//button[@type='button']");
	public static final By CONFIRM_GROUP_BTN = By.cssSelector("button.btn.btn-primary");
	public static final By REJECT_GROUP_BTN = By.cssSelector("button.btn.btn-warning");
	
	static public void SelectUserFromDropDown(WebDriver driver, String item)
	{
	    new Select(driver.findElement(By.xpath("//select"))).selectByVisibleText(item);
	}
        
	static public By RemoveGroupMember(int memberIndex)
	{
		String removeMemberAtIndex = String.format("//li[%1$d]/button", memberIndex);
		return By.xpath(removeMemberAtIndex);
	}
}
