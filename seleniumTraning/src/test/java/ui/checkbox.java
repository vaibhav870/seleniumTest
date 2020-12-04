package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkbox {
	public static void main(String args[]) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.sugarcrm.com/request-demo/");
		driver.manage().window().maximize();
		//WebElement chbox=driver.findElement(By.id("interest_market_c0"));
		/*boolean status = chbox.isSelected();
		System.out.println(status);
		Actions action =new Actions(driver);
		WebElement radio= driver.findElement(By.xpath("//a[text()='Glossary']"));
		action.moveToElement(radio);
		action.perform();
		if(status == true) {
			System.out.println("Already Selected !!");
		}else {

			chbox.click();
		
		}
		
		*/
		List<WebElement> chkbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for (WebElement webElement : chkbox) {
			
			webElement.click();
		}
		
	}
}
