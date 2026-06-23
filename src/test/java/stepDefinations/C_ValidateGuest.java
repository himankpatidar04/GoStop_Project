package stepDefinations;

import org.apache.logging.log4j.LogManager;

import base.Base;
import io.cucumber.java.en.*;
import pageObject.GuestPage;
import pageObject.HomePage;
import pageObject.RoomAndExperiencePage;

public class C_ValidateGuest extends Base{
	private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(C_ValidateGuest.class);
	GuestPage guestPage;
	
	@Given("user is on guest detail page")
	public void user_is_on_guest_detail_page() {
	    // Write code here that turns the phrase above into concrete actions
	    try {
	    		System.out.println("user is on Guest Page");
	    		Thread.sleep(2000);
	    }catch(Exception ex) {
	    	
	    }
	}

	@Given("user enters first name {string}")
	public void user_enters_first_name(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		try {
			guestPage = new GuestPage(getdriver());
		    guestPage.getFirstName().sendKeys("Jay");
		    logger.debug("First name Added");
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	@Given("user enters  last name {string}")
	public void user_enters_last_name(String string) {
	    // Write code here that turns the phrase above into concrete actions
		try {
			guestPage = new GuestPage(getdriver());
		    guestPage.getLastName().sendKeys("Jay");
		    logger.debug("Last name Added");
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	    
	}

	@Given("user enters mobile number {string}")
	public void user_enters_mobile_number(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		try {
			guestPage = new GuestPage(getdriver());
		    guestPage.getMobileNumber().sendKeys("987543210");
		    logger.debug("Mobil no. name Added");
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	    
	}

	@Given("user enters email {string}")
	public void user_enters_email(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		try {
			guestPage = new GuestPage(getdriver());
		    guestPage.getEmail().sendKeys("jay098@gmail.com");
		    logger.debug("email name Added");
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}


}
