package hooks;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utility.InvokeBrowser;

public class Hooks {
public static 	WebDriver driver;
public  static 	InvokeBrowser obj_InvokeBrowser;
@Before(order = 0)
public void openBrowserUrl()
{
	  obj_InvokeBrowser=new InvokeBrowser();
	 driver=obj_InvokeBrowser.openUrl(obj_InvokeBrowser.setDriver());
}
@After(order=1)
public void attachScreenShotForFailTestCase(Scenario scenario1) throws IOException {
	
	if(scenario1.isFailed()) {
		
File ScreenShot_with_Scenarioname=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	              	
      String screenShotName  = scenario1.getName().replace(" ","_");
      
      Date date=new Date();
      
     SimpleDateFormat  obj_SimpleDateFormat=new SimpleDateFormat("ddmmyyy_HHmmss");
     
  String string_Date   =obj_SimpleDateFormat.format(date);
 File destination_Path=new File(System.getProperty("user.dir")+"/test-output/screenshot/"+screenShotName+"_"+string_Date+".png");
	
	Files.copy(ScreenShot_with_Scenarioname, destination_Path);
	
	}
}


@After(order = 0)
public void closeBrowser() {
	 driver.close();
}

}
