package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CompanyEntryPage {
	
	WebDriver driver;
	public CompanyEntryPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By companyID = By.xpath("//input[@id=\"__input0-inner\"]");
	By goBtn = By.xpath("//span[@id=\"__button0-img\"]");
	
	
	public WebElement companyID() {
		return driver.findElement(companyID);
	}
	
	public WebElement goBtn() {
		return driver.findElement(goBtn);
	}

}
