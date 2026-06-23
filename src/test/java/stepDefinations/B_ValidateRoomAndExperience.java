package stepDefinations;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.Base;
import pageObject.*;
import io.cucumber.java.en.*;


public class B_ValidateRoomAndExperience extends Base{
	private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(B_ValidateRoomAndExperience.class);
	HomePage homePage;
	RoomAndExperiencePage roomPage;
	
	@Given("user is room page")
	public void user_is_room_page() {
	    // Write code here that turns the phrase above into concrete actions
		 try {
//		    	logger.debug("Reached Method");
//		    	getdriver().get(this.getUrl());
//		    	logger.debug("URL Launched");
//		    	getdriver().manage().window().maximize();
//		    	logger.debug("Window Maximized");
			 System.out.println("user is on Homme Page");
		    }catch(Exception ex) {
		    	
		    }
	}

	@Given("user select room type {string}")
	public void user_select_room_type(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    try {
	    		roomPage = new RoomAndExperiencePage(getdriver());
	    		Thread.sleep(3000);
	    		roomPage.getBedAndBreakFast().click();;
	    		logger.debug("Click Add Button");
	    		
	    }catch(Exception ex) {
	    		
	    }
	}

	@Given("user add experiance {string}")
	public void user_add_experiance(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		try {
//			Actions action = new Actions(getdriver());
			JavascriptExecutor js = (JavascriptExecutor)getdriver();
			roomPage = new RoomAndExperiencePage(getdriver());
			Thread.sleep(3000);
			WebElement para = roomPage.getParaglidingBtn();
//			roomPage.getParaglidingBtn().click();
			js.executeScript("arguments[0].click();", para);
			Thread.sleep(4000);
			WebElement BtnAdd = getdriver().findElement(By.xpath("(//button[text()='Add'])[12]"));
			js.executeScript("arguments[0].click();", BtnAdd);
//			WebElement BtnAdd = getdriver().findElement(By.xpath("(//button[contains(@class,'jsx-64d5105d4a008787')])[3]"));
//			BtnAdd.click();
//			JavascriptExecutor js = (JavascriptExecutor)getdriver();
//			WebElement BtnAdd = getdriver().findElement(By.xpath("//button[text()='Add']"));
//			js.executeScript("arguments[0].scrollIntoview({block:'center'})", BtnAdd);
//			Thread.sleep(2000);
//			js.executeScript("arguments[0].click()", BtnAdd);
			Thread.sleep(4000);
			getdriver().findElement(By.xpath("//span[text() = '3']")).click();
			Thread.sleep(4000);
			WebElement checkIn = getdriver().findElement(By.xpath("//input[@type='checkbox']"));
//			checkIn.click();
			js.executeScript("arguments[0].click();", checkIn);
			Thread.sleep(4000);
			getdriver().findElement(By.xpath("(//button[contains(text(),'Add')])[12]")).click();
			logger.debug("Room And Adventure Experience Clicked");
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	@Then("user click on {string}")
	public void user_click_on(String string) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		try {
			JavascriptExecutor js = (JavascriptExecutor)getdriver();
			roomPage = new RoomAndExperiencePage(getdriver());
    			Thread.sleep(3000);
    			WebElement proBtn = roomPage.getProceedBtn();
    			js.executeScript("arguments[0].scrollIntoView({block:'center'});", proBtn);
    			Thread.sleep(3000);
    			js.executeScript("arguments[0].click();", proBtn);
    			logger.debug("Proceed Btn Clicked");
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}


}
