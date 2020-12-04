package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		
		driver.manage().window().maximize();
	//	WebElement frame1= driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
	//	driver.switchTo().frame(frame1);
		WebElement clickable= driver.findElement(By.xpath("//img[@id='gh-logo']"));
		
		Actions rghtclik=new Actions(driver);
		
		rghtclik.contextClick(clickable).perform();
		
		

	}

}
