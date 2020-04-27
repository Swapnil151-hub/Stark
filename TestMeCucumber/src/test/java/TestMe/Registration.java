package TestMe;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Registration {
	ChromeDriver c;
	WebDriverWait wait;
	@Given("user should navigates Registration on chrome browser")
	public void user_should_navigates_Registration_on_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\Driver\\chromedriver.exe");
		 c=new ChromeDriver();
		c.get("https://lkmdemoaut.accenture.com/TestMeApp/RegisterUser.htm");
		
	
	}
    @When("user enters the user name")
	public void user_enters_the_user_name() {
		c.findElement(By.name("userName")).sendKeys("Swapnil29");
	}

	@When("user enters with  first name")
	public void user_enters_with_first_name() {
		c.findElement(By.name("firstName")).sendKeys("Swapnil");
	}

	@When("user enters with  last name")
	public void user_enters_with_last_name() {
		c.findElement(By.name("lastName")).sendKeys("Ingole");
	}

	@When("user enters with password")
	public void user_enters_with_password() {
		c.findElement(By.name("password")).sendKeys("Swapnil29");
	}

	@When("user enters with confirm password")
	public void user_enters_with_confirm_password() {
		c.findElement(By.name("confirmPassword")).sendKeys("Swapnil29");
	}

	@When("user selects gender")
	public void user_selects_gender() {
    List<WebElement> radiobuttons= c.findElements(By.name("gender"));
		
		radiobuttons.get(0).click();
	}

	@When("user enters with email")
	public void user_enters_with_email() {
		c.findElement(By.name("emailAddress")).sendKeys("swapnilingole@gmail.com");
	}

	@When("user enters with mobile number")
	public void user_enters_with_mobile_number() {
		c.findElement(By.name("mobileNumber")).sendKeys("7030706615");
	}

	@When("user enters with date of birth")
	public void user_enters_with_date_of_birth() {
		c.findElement(By.name("dob")).sendKeys("04/29/1997");
	    
	}

	@When("user enters the address")
	public void user_enters_the_address() {
		c.findElement(By.name("address")).sendKeys("221 baker's street");

	}
	@When("user select the security question")
	public void user_select_the_security_question() {
		WebElement dropdown=c.findElement(By.name("securityQuestion"));
		Select s=new Select(dropdown);
		s.selectByIndex(0);
		
	}

	@When("user answer the security question")
	public void user_answer_the_security_question() {
		c.findElement(By.name("answer")).sendKeys("Wardha");
	}

	@When("user clicks on register button")
	public void user_clicks_on_register_button() {
		c.findElement(By.xpath("//input[@name='Submit']")).click();
	}

	@Then("user should verify registration success")
	public void user_should_verify_registration_success() {
		String title=c.getTitle();
	       Assert.assertTrue(title.contains("Register"));
	       c.close();
	}

}