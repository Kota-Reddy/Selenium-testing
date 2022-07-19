package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SFLoginPagePageFactory {
	WebDriver driver ;
	
	public SFLoginPagePageFactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
//	By username = By.xpath("//input[@name=\"username\"]");
	@FindBy(xpath="//input[@name=\"username\"]")
	WebElement username;
	
	@FindBy(xpath="//input[@name=\"password\"]")
	WebElement password;
	
	@FindBy(xpath="//span[@id=\"__button2-inner\"]")
	WebElement login;
	
	public WebElement email() {
		
		return username;
		
	}
	public WebElement password() {
		
		return password;
		
	}
	public WebElement login() {
		
		return login;
		
	}

}
