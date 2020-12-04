package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardEvent {

	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup();
		//ChromeDriver driver = new ChromeDriver();
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.lipsum.com/");
		//String Source=driver.findElement(By.tagName("h4")).getText();
		driver.navigate().to("https://extendsclass.com/text-compare.html");
		driver.manage().window().maximize();
		WebElement Source=driver.findElement(By.xpath("//*[@id=\"dropZone\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[7]/pre/span"));
		WebElement target=driver.findElement(By.xpath("//*[@id=\"dropZone2\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[2]/pre/span"));
		
		Actions copypaste=new Actions(driver);
		copypaste.keyDown(Source, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		copypaste.keyDown(target, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
		

	}

}
