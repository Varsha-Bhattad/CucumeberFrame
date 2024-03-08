package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import PageObjects.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import varshasb.CucumberFrame1.Baseclass;


public class LoginSteps extends Baseclass  {
	
	 
	 @Given("User login into application with {string} and password {string}")
	 public void user_login_into_application_with_and_password(String username, String password) {
		LoginPage.Login(username, password);
		
	}	
	
	 @When("User clicks on login button")
	public void user_clicks_on_login_button() {
	LoginPage.clicklogin();
	}
	
	
	
	
	@Then("User clicks on hamburger menu")
	public void user_clicks_on_hamburger_menu() {
	  driver.findElement(By.id("react-burger-menu-btn")).click();
		
	}

	
	@When("User should see all the items")
	public void user_should_see_all_the_items() {
		
	   
	}
	
	@Then("User clicks on dropdown menu with filter icon")
	public void user_clicks_on_dropdown_menu_with_filter_icon() {
		WebElement element =driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		Select select = new Select(element);
		select.selectByVisibleText("Name (Z to A)");
	}
	
	@Then("User adds {string} to the cart")
	public void user_adds_to_the_cart(String products) {
		String[] productsList = products.split(",");
		for(String product : productsList){
			driver.findElement(By.xpath("//div[contains(text(),'"+product+"')]/../../..//button[contains(text(),'Add to cart')]")).click();
		}
	    
	}
	
	@Then("products will be added to the cart")
	public void products_will_be_added_to_the_cart() {
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
	}
	
	@And("User removes the {string} from the cart")
	public void User_removes_the_from_the_cart(String products) {
		driver.findElement(By.xpath("//div[contains(text(),'"+products+"')]/../../..//button[contains(text(),'Remove')]")).click();
	}
	
	@And("User clicks on checkout")
	public void User_clicks_on_checkout() {
		driver.findElement(By.id("checkout")).click();
	}

	@And("User enters checkout information {string} {string} {string}")
	public void user_enters_checkout_information(String fname, String lname, String zcode) {
		driver.findElement(By.id("first-name")).sendKeys(fname);
		driver.findElement(By.id("last-name")).sendKeys(lname);
		driver.findElement(By.id("postal-code")).sendKeys(zcode);
	}
	
	@And("User clicks on continue and should be able to see checkout overview page")
	public void User_clicks_on_continue_and_should_be_able_to_see_checkout_overview_page() {
		driver.findElement(By.id("continue")).click();
		
	}
	
	@And("User clicks on finish")
	public void User_clicks_on_finish() {
		driver.findElement(By.id("finish")).click();
	}
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

