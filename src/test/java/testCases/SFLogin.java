package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepo.CompanyEntryPage;
import objectRepo.SFLoginPage;
import objectRepo.SFLoginPagePageFactory;

public class SFLogin {
	
	
	@Test
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse_Workspace\\PageObjectModelProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://performancemanager10.successfactors.com/sf/start/login#/login");
		CompanyEntryPage cep = new CompanyEntryPage(driver);
		cep.companyID().sendKeys("C0016585093P");
		cep.goBtn().click();
		Thread.sleep(3000);
	//	SFLoginPage sfLoginPage = new SFLoginPage(driver);
		
		/*
		 * sfLoginPage.email().sendKeys("51453369");
		 * sfLoginPage.password().sendKeys("NE11**ha"); sfLoginPage.login().click();
		 */
		
		SFLoginPagePageFactory sfLoginPagePF = new SFLoginPagePageFactory(driver);
		Thread.sleep(2000);
		sfLoginPagePF.email().sendKeys("51453369");
		sfLoginPagePF.password().sendKeys("abc@123");
		sfLoginPagePF.login().click();
		
	}

}
