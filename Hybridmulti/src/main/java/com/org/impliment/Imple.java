package com.org.impliment;

import com.org.Locate.Locater;
import com.org.property.Base;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Imple extends Base{
	static Base be;
	Locater lo;

	@Given(": user is on facebook application")
	public void user_is_on_facebook_application() {
		
		be.property();
		

			
	}

	@When(": user enter the username and password")
	public void user_enter_the_username_and_password() {
	    
		lo = new Locater();
		lo.setUname("Sabha@gmail.com");
		lo.setPassword("Sabha90");
		
		
		
	}

	@Then(": user click the login button")
	public void user_click_the_login_button() {
	    
		lo.getLogin().click();	
	}

}
