package Arya;

import cucumber.api.java.en.Given;

public class StepDefination {
	@Given("user  navigates to demowebshop on chrome")
	public void user_navigates_to_demowebshop_on_chrome() {
	System.out.println("user  navigates to demowebshop");
	}

	@Given("user enter login credentials")
	public void user_enter_login_credentials() {
		System.out.println("user enter login credentials");
	 
	

	}

	@Given("user enter {string} in search store")
	public void user_enter_in_search_store(String product) {
		System.out.println("user entered the product name as " +product);
	}
	@Given("user selects the product")
	public void user_selects_the_product() {
	    System.out.println("select");
	}

	@Given("verify whether the application displayed with computer product")
	public void verify_whether_the_application_displayed_with_computer_product() {
	    ;	System.out.println("verify whether the application displayed with computer product");
	}

	
	@Given("user perform logout")
	public void user_perform_logout() {
		System.out.println("user perform logout");
	}



	@Given("close browser")
	public void close_browser() {
	  System.out.println("close browser");
	}
}
