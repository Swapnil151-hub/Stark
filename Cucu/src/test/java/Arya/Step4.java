package Arya;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;

public class Step4 {
	
WebDriver c;
    
    @Given("launch application on chrome browser")
    public void launch_application_on_chrome_browser() {
    	System.setProperty("webdriver.chrome.driver", "F:\\selenium\\Driver\\chromedriver.exe");
		 c=new ChromeDriver();
		c.get("http://demowebshop.tricentis.com");
    }
	
	
	@Given("click on login link")
	public void click_on_login_link() {
		Loginclass lc = PageFactory.initElements(c, Loginclass.class);
        lc.clicklogin();
	}

	@Given("enter email as {string}")
	public void enter_email_as(String mailid) {
		 Loginclass.enteremail(mailid);
	}

	@Given("enter password as {string}")
	public void enter_password_as(String password) {
        Loginclass.enterpsd(password);
	}

	@Given("click on login")
	public void click_on_login() {
        Loginclass.clickloginbutton();
	}

}
