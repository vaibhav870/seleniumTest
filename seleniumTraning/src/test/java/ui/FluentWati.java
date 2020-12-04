package ui;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWati {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement elect=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[5]/a"));
		Actions mhover=new Actions(driver);
		mhover.moveToElement(elect).perform();
		//Thread.sleep(2000);
		
		WebElement smartwatch= driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[5]/div[2]/div[1]/div[2]/ul/li[2]/a"));
		
		//WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.visibilityOf(smartwatch)).click();
		
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.withMessage("This is Custom Message")
				.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[5]/div[2]/div[1]/div[2]/ul/li[2]/a/j"))).click();
	}

}
