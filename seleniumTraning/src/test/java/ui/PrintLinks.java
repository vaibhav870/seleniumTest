package ui;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintLinks {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.sugarcrm.com/request-demo/");
		driver.manage().window().maximize();
		
	List<WebElement> alltags=driver.findElementsByTagName("a");
	System.out.println("Total tags are " +alltags.size());
	for (WebElement webElement : alltags) {
		System.out.println("Text: "+webElement.getText()+"  Link: "+webElement.getAttribute("href"));
	}
	driver.close();
	}
}
