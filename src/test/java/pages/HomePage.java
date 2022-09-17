package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethods.SpecificToSelenium;

public class HomePage {

	public  HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
 @FindBy(xpath = "//a[contains(text(),'Login Form')]")
 public WebElement link_LoginForm;
 public void clik_LoginForm() {
	 SpecificToSelenium.clikOnIt(link_LoginForm);
 }
}

