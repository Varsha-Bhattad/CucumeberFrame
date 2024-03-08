package PageObjects;

import org.openqa.selenium.By;

import varshasb.CucumberFrame1.Baseclass;

public class LoginPage extends Baseclass{
	
	private static String txtUsername = "user-name";
	private static String txtpassword = "password";
	private static String btnLogin =  ".submit-button";
	
	public static void Login(String username,String password) {
		driver.findElement(By.id(txtUsername)).sendKeys(username);
		driver.findElement(By.id(txtpassword)).sendKeys(password);
		
	}
	
	
    public static void clicklogin() {
    	driver.findElement(By.cssSelector(btnLogin)).click();
    	
    }
	
	
}
