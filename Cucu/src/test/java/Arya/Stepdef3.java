package Arya;

import cucumber.api.java.en.Given;

public class Stepdef3 {
	@Given("user perform login")
	public void user_perform_login() {
	    System.out.println("login");
	}

	@Given("user select the product")
	public void user_select_the_product() {
		System.out.println("select");
	}

	@Given("user is moving the product to cart")
	public void user_is_moving_the_product_to_cart() {
	    System.out.println("cart");
	}

	@Given("user proceeding to payment")
	public void user_proceeding_to_payment() {
		System.out.println("payment");
	}

	@Given("user closing browser")
	public void user_closing_browser() {
		System.out.println("close");
	}


}
