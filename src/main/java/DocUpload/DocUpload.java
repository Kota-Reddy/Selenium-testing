package DocUpload;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DocUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse_Workspace\\PageObjectModelProject\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("https://www.monsterindia.com/seeker/registration");
		/*
		 * WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(20));
		 * wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("")
		 * ))); driver.findElement(By.linkText("")).click();
		 */
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement browse = driver.findElement(By.xpath("//span[@class=\"browse-text\"]"));
		browse.sendKeys("D:\\abc.txt");
		System.out.println("File uploaded successfully");
		

	}

}
