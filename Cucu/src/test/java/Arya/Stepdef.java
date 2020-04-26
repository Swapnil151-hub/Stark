package Arya;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdef {
	ChromeDriver c;
	WebDriverWait wait;
	@Given("user should navigates demowebshod on chrome browser")
	public void user_should_navigates_demowebshod_on_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\Driver\\chromedriver.exe");
		 c=new ChromeDriver();
		c.get("http://demowebshop.tricentis.com");
	  
	}

	@When("user clicks on register link")
	public void user_clicks_on_register_link() {
    wait = new WebDriverWait(c, 10);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a"))).click();
	  
	}

	@When("user selects gender")
	public void user_selects_gender() {
		 c.findElement(By.id("gender-female")).click();
	  
	}

	@When("user enters with  first name")
	public void user_enters_with_first_name() {
		c.findElement(By.name("FirstName")).sendKeys("saranya");
	  
	}

	@When("user enters with  last name")
	public void user_enters_with_last_name() {
		c.findElement(By.name("LastName")).sendKeys("saro");
	   
	}

	@When("user enters with email")
	public void user_enters_with_email() {
		c.findElement(By.name("Email")).sendKeys("saro@gmail.com");
    
	  
	}

	@When("user enters with password")
	public void user_enters_with_password() {
		c.findElement(By.name("Password")).sendKeys("password@1");
	  
	}

	@When("user enters with confirm password")
	public void user_enters_with_confirm_password() {
		c.findElement(By.name("ConfirmPassword")).sendKeys("password@1");
	  
	}

	@When("user clicks on register button")
	public void user_clicks_on_register_button() {
		c.findElement(By.name("register-button")).click();
	  
	}

	@Then("user should verify registration success")
	public void user_should_verify_registration_success() {
		String title=c.getTitle();
	       Assert.assertTrue(title.contains("Register"));
	       c.close();
	
	}
	@Given("user enters with  first name as {string}")
	public void user_enters_with_first_name_as(String fn) {
		c.findElement(By.name("FirstName")).sendKeys(fn);
	}

	@Given("user enters with  last name as {string}")
	public void user_enters_with_last_name_as(String ln) {
		 c.findElement(By.name("LastName")).sendKeys(ln);
	}

	@Given("user enters with email as {string}")
	public void user_enters_with_email_as(String email) {
		c.findElement(By.name("Email")).sendKeys(email);
	}

	@Given("user enters with password as {string}")
	public void user_enters_with_password_as(String psd) {
		c.findElement(By.name("Password")).sendKeys(psd);
	 
	}

	@Given("user enters with confirm password as {string}")
	public void user_enters_with_confirm_password_as(String confirmpsd) {
		c.findElement(By.name("ConfirmPassword")).sendKeys(confirmpsd);
		 
	}


}
