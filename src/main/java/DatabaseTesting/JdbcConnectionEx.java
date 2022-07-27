package DatabaseTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JdbcConnectionEx {

	public static void main(String[] args) throws SQLException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse_Workspace\\PageObjectModelProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String host ="localhost";
		String port = "3306";
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port +"/qadbt", "root", "root");
		Statement stat = connection.createStatement();
		ResultSet rs = stat.executeQuery("select * from credentials where scenario='CorrectCredetial'");
		
		while(rs.next()) {
		
			String username = rs.getString("username");
			System.out.println(username);
			String password = rs.getString("password");
			System.out.println(password);
			
			driver.get("https://nec-c.my.salesforce.com/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys(username);
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			Thread.sleep(2000);
			driver.quit();
		}

	}

}
