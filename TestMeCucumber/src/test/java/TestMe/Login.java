package TestMe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;

public class Login {
	ChromeDriver c;
	WebDriverWait wait;
	@Given("user should navigates Login on chrome browser")
	public void user_should_navigates_Login_on_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\Driver\\chromedriver.exe");
		 c=new ChromeDriver();
		c.get("https://lkmdemoaut.accenture.com/TestMeApp/login.htm");
	}
	@Given("user enters the valid username")
	public void user_enters_the_valid_username() {
		c.findElement(By.name("userName")).sendKeys("Lalitha");
	
	}

	@Given("user enters with valid password")
	public void user_enters_with_valid_password() {
		c.findElement(By.name("password")).sendKeys("password123");
	}

	@Given("user clicks on login button")
	public void user_clicks_on_login_button() {
		c.findElement(By.xpath("//input[@name='Login']")).click();
	}
	@Given("user select the product headphone")
	public void user_select_the_product_headphone() throws InterruptedException {
		WebElement search=c.findElement(By.name("products"));
		Actions a=new Actions(c);
		a.keyDown(search,Keys.SHIFT).sendKeys("headphone").keyUp(Keys.SHIFT).build().perform();
		Thread.sleep(2000);
		
		a.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		c.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Given("user click on find details")
	public void user_click_on_find_details() {
		wait = new WebDriverWait(c, 10);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a"))).click();
	}

	@Given("user add product to cart")
	public void user_add_product_to_cart() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]"))).click();
	}

	@Given("user navigates to cart{int}")
	public void user_navigates_to_cart(Integer int1) {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a"))).click();
	}

	@Given("user click on checkout button")
	public void user_click_on_checkout_button() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input"))).click();
	}

	@Given("user select bank")
	public void user_select_bank() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"swit\"]/div[1]/div/label/i"))).click();
	}

	@Given("user click on continue button")
	public void user_click_on_continue_button() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"btn\"]"))).click();
	}

	@Given("user enters the bank username")
	public void user_enters_the_bank_username() {
		c.findElement(By.name("username")).sendKeys("123456");
    
	}

	@Given("user enters the bank password")
	public void user_enters_the_bank_password() {
	    c.findElement(By.name("password")).sendKeys("Pass@456");
	}

	@Given("user click on bank login button")
	public void user_click_on_bank_login_button() {
    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[3]/input"))).click();
	}

	@Given("user enters transaction id")
	public void user_enters_transaction_id() {
		c.findElement(By.name("transpwd")).sendKeys("Trans@456");
	}

	@Given("user click on proceed button")
	public void user_click_on_proceed_button() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[2]/input"))).click();
	}

}