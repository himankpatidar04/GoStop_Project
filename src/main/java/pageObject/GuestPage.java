package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GuestPage {
	WebDriver driver;
	
	By FirstName = By.xpath("//input[@id='outlined-firstName']");
	By LastName = By.xpath("//input[@id='outlined-lastName']");
	By MobileNumber = By.xpath("//input[@id='outlined-mobileNumber']");
	By email = By.xpath("//input[@id='outlined-email']");
	By ProceedPay = By.xpath("//button[contains(text(),'Proceed')]");
	
	public GuestPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}


	public WebElement getFirstName() {
		return driver.findElement(FirstName);
	}

	public WebElement getLastName() {
		return driver.findElement(LastName);
	}

	public WebElement getMobileNumber() {
		return driver.findElement(MobileNumber);
	}

	public WebElement getEmail() {
		return driver.findElement(email);
	}

	public WebElement getProceedPay() {
		return driver.findElement(ProceedPay);
	}
	
}
