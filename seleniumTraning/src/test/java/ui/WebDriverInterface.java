package ui;

import java.awt.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverInterface {

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("Title is " + title);
		String source = driver.getPageSource();
		// System.out.println(source);
		// driver.navigate().to("http://www.google.com");
		// driver.navigate().back();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		java.util.List<WebElement> webelements = driver.findElements(By.xpath("//*[@class='inventory_list']/div"));
		System.out.println(webelements);

		driver.navigate().to("https://www.sugarcrm.com/");
		String windowhandle = driver.getWindowHandle();
		System.out.println(windowhandle);
		driver.findElement(By.xpath("/html/body/div/main/section[4]/div/div/div[1]/a")).click();
		Set<String> windowhandles = driver.getWindowHandles();
		driver.close();
	}

}
