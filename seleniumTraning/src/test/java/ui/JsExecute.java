package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JsExecute {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		
		JavascriptExecutor jsex= driver;
		String scr1="return document.title;";
		String title=(String) jsex.executeScript(scr1);
		System.out.println(title);
		
		
		driver.switchTo().frame("iframeResult");
		
		jsex.executeScript("myFunction()");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		WebElement btn= driver.findElement(By.xpath("/html/body/button"));
		jsex.executeScript("arguments[0].style.border='5x solid green';", btn);
		
		/*driver.navigate().to("https://www.w3schools.com");
		WebElement certbtn=driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/nav[1]/a[1]"));
		jsex.executeScript("arguments[0].scrollIntoView(true);", certbtn);*/
		
	}

}
