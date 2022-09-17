package stepDefinitions;

import commonMethods.SpecificToSelenium;
import io.cucumber.java.en.*;
import pages.HomePage;
 

public class StepDefintions {
	@Given("user is in the home page {string}")
	public void user_is_in_the_home_page(String expectedPageTitle) {
		SpecificToSelenium.validatePageTitle(expectedPageTitle); 
	}

	@Then("click on the {string} link")
	public void click_on_the_link(String string) {
 try {
	Thread.sleep(9000);
} catch (InterruptedException e) {
	System.out.println(e);
}
		HomePage obj_HomePage=new HomePage(SpecificToSelenium.getDriver());
		obj_HomePage.clik_LoginForm();
	}


}
