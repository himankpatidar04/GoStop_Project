package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	WebDriver driver;
	
	By destination = By.xpath("//a[contains(text(),'Destinations')]");
	By McLeodganj = By.xpath("//h3[contains(text(),'McLeod Ganj')]");
	By McleodganjBhagsu = By.xpath("//h3[contains(text(),'Mcleodganj, Bhagsu')]");
	By CheckInAndCheckOut = By.xpath("//div[@class='ml-[8px] font-medium text-[16px] leading-[22px]']");
	
	public HomePage(WebDriver driver) {
		 this.driver = driver;
	}

	public WebElement getDestination() {
		return driver.findElement(destination);
	}

	public WebElement getMcLeodganj() {
		return driver.findElement(McLeodganj);
	}
	
	public WebElement getMcleodganjBhagsu() {
		return driver.findElement(McleodganjBhagsu);
	}
	
	public WebElement getCheckInAndCheckOut() {
		return driver.findElement(CheckInAndCheckOut);
	}
	
	
	
}
