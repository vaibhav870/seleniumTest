package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.session.FirefoxFilter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyTest {

	// public static WebDriver driver;
	public static String browser = "chorme";

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://developer.salesforce.com/signup?d=70130000000td6N");
		driver.manage().window().maximize();
		// driver.findElement(By.xpath("//a[text()=\" Terms of Use\"]")).click();
		// driver.findElement(By.cssSelector("input[name='user[first_name]']
		// ")).sendKeys("vaibhav");
		// driver.findElement(By.cssSelector("input.signUp")).sendKeys("vaibhav");
		driver.findElement(By.cssSelector("select#job_role>option[value='Developer']")).click();
		driver.findElement(By.cssSelector("select#country>option[value='IN']")).click();
		// String data
		// =driver.findElement(By.xpath("//select[@name='user[country]']//self::select")).getText();
		// System.out.println(data);
		try {
			driver.wait(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}

}
