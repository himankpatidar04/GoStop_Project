package stepDefinations;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Base;
import io.cucumber.java.en.*;
import pageObject.*;
import java.net.*;
import java.time.Duration;

public class A_SelectPlace extends Base {	
	private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(A_SelectPlace.class);
HomePage homePage;


@Given("user is home page")
public void user_is_home_page() {
    // Write code here that turns the phrase above into concrete actions
	 try {
	    	logger.debug("Reached Method");
	    	getdriver().get(this.getUrl());
	    	logger.debug("URL Launched");
	    	getdriver().manage().window().maximize();
	    	logger.debug("Window Maximized");
	    }catch(Exception ex) {
	    	
	    }
}

@When("user go to destination page")
public void user_go_to_destination_page() {
    // Write code here that turns the phrase above into concrete actions
    try {
    		homePage = new HomePage(getdriver());
    		homePage.getDestination().click();
    		logger.debug("Click destination link");
    }catch(Exception ex) {
    	
    }
}

@When("user select destination as {string}")
public void user_select_destination_as(String string) {
    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
	try {
		homePage = new HomePage(getdriver());
		homePage.getMcLeodganj().click();
		Thread.sleep(3000);
		logger.debug("Mcleodganj clicked");
	}catch(Exception ex) {
		
	}
}

@When("user select destination option as {string}")
public void user_select_destination_option_as(String string) {
    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
	try {
		Thread.sleep(3000);
		homePage = new HomePage(getdriver());
		homePage.getMcleodganjBhagsu().click();
		Thread.sleep(3000);
		logger.debug("Option Selected");
	}catch(Exception ex) {
		
	}
}

@When("user select date from {string} to {string}")
public void user_select_date_from(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
	try {
		homePage = new HomePage(getdriver());
		
		WebDriverWait wait = new WebDriverWait(getdriver(),Duration.ofSeconds(20));
		
		String currentUrl = getdriver().getCurrentUrl();
		if(currentUrl.contains("?"))
		{
			currentUrl = currentUrl.substring(0,currentUrl.indexOf("?"));
		}
		
		String newUrl = currentUrl + "?checkin="+ string + "&checkout="+ string2;
		System.out.println(newUrl);
		getdriver().navigate().to(newUrl);
	
//		JavascriptExecutor js = (JavascriptExecutor) getdriver();
//		Thread.sleep(2000);
//		WebElement checkInOut = wait.until(ExpectedConditions.elementToBeClickable(homePage.getCheckInAndCheckOut()));
//		checkInOut.click();
//		Thread.sleep(5000);
//		js.executeScript("window.scrollBy(0,2000)");
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div//button[text()='30']"))).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(@class, 'rounded-full')])[2]")));
//		Thread.sleep(2000);
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div//button[text()='25']"))).click();
//		logger.debug("Date Selected");
	}catch(Exception ex) {
//		ex.printStackTrace();
		System.out.println("Error occured"+ex.getMessage());
	}
}

@Then("available room should be displayed")
public void available_room_should_be_displayed() {
    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
	System.out.println("Out");
	
}
}
