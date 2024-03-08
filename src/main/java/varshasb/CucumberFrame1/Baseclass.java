package varshasb.CucumberFrame1;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import util.propertiesUtil;

public class Baseclass {

	public static WebDriver driver;

	public static void initializeDriver() {
		
         Properties properties = propertiesUtil.loadApplicationProperties();
         String url = properties.getProperty("application.url");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		

	}

	
  public static void closeDriver() {
		driver.quit();
	}
}
