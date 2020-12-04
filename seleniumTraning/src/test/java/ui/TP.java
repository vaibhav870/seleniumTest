package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TP {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("_nkw")).sendKeys("Toys");
		WebElement category=driver.findElement(By.id("gh-cat"));
		Select select= new Select(category);
		select.selectByIndex(0);
		driver.findElement(By.id("gh-btn")).click();
	}

}
