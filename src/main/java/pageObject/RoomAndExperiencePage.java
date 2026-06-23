package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RoomAndExperiencePage {
	
	WebDriver driver;
	
	By BedAndBreakFast = By.xpath("(//button[contains(text(), 'Add')])[3]");
	By ParaglidingBtn = By.xpath("//h3[contains(text(), 'Paragliding')]");
//	By TrekkingBtn = By.xpath("//h3[contains(text(), 'Kareri')]");
	By ProceedBtn = By.xpath("//button[contains(text(),'Proceed')]");
	


	public RoomAndExperiencePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement getBedAndBreakFast() {
		return driver.findElement(BedAndBreakFast);
	}
	public WebElement getParaglidingBtn() {
		return driver.findElement(ParaglidingBtn);
	}
//	public WebElement getTrekkingBtn() {
//		return driver.findElement(TrekkingBtn);
//	}
	public WebElement getProceedBtn() {
		return driver.findElement(ProceedBtn);
	}
	
	
			
}
