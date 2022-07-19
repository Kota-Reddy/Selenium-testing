package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SFLoginPage {
	WebDriver driver ;
	
	public SFLoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	By username = By.xpath("//input[@name=\"username\"]");
	By password = By.xpath("//input[@name=\"password\"]");
	By login = By.xpath("//span[@id=\"__button2-inner\"]");
	
	public WebElement email() {
		
		return driver.findElement(username);
		
	}
	public WebElement password() {
		
		return driver.findElement(password);
		
	}
	public WebElement login() {
		
		return driver.findElement(login);
		
	}

}
