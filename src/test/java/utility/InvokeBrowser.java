package utility;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvokeBrowser{
	public static WebDriver driver;
	private static  Properties  getPropertiesfromPropertyReader;
	public WebDriver setDriver () {
PropertyReader obj_PropertyReader=new PropertyReader("browser_url");
		getPropertiesfromPropertyReader=obj_PropertyReader.propertyReader();
		if(getPropertiesfromPropertyReader.getProperty("browser").equalsIgnoreCase("chrome")) {
		ChromeOptions obj_ChromeOptions=new ChromeOptions();
		obj_ChromeOptions.addArguments("InCognito");
		obj_ChromeOptions.addArguments("start-maximized");
		WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver(obj_ChromeOptions);
		
		}
		return driver;
	}
	
	 public WebDriver openUrl(WebDriver driver)
	{
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(1));
	driver.get(getPropertiesfromPropertyReader.getProperty("url"));	
	return driver;
	} 
	/* public   WebDriver getDriver(WebDriver driver)
	{
		return driver;
	}*/
	public static void closeBrowser(WebDriver driver) {
		driver.close();
	}
	}

 
