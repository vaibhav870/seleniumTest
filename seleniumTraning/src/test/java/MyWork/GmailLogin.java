package MyWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GmailLogin {

	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	}
	
	
	@Test
	@Parameters({"url","email","pass"})
	public void RunTest(String url,String email,String pass) {
		
		driver.get(url);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[4]/ul[1]/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys(email);
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys(pass);
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button")).click();
	}
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
	
}
