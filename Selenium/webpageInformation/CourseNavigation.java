package webpageInformation;

import org.openqa.selenium.By;

public class CourseNavigation 
{
	public static final By ASSIGNMENTS_BTN = By.cssSelector("div.childNavWrapper > ul > li.ng-scope > a > div.navLiWrapper");
	public static final By GRADES_BTN = By.xpath("//child-navigation/div/ul/li[2]/a/div");
	public static final By MEMBERS_BTN = By.xpath("//li[3]/a/div");
}
