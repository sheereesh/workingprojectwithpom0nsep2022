package commonMethods;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.InvokeBrowser;

 
public class SpecificToSelenium {
	//windows related
	/****
	 * @sheereesh
	 * @validate expectedPageTitle, calling static variable through  class return driver
	 */
	
public static void validatePageTitle(String expectedPageTitle) {
	Assert.assertEquals(expectedPageTitle,SpecificToSelenium.getDriver().getTitle());
}

public static void clikOnIt(WebElement link) {
	link.click();
}

public static WebDriver getDriver() {
	return InvokeBrowser.driver;
}
 public static void windowMaximize() {
	SpecificToSelenium.getDriver().manage().window().maximize();
 }
 
}
