package ui;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindow {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.salesforce.com/au/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"main\"]/div[4]/div/div/div/div[2]/div[1]/div[1]/div[3]/div/div[2]/div/div[1]/div/div[1]/div/a")).click();
		Set<String> windows =driver.getWindowHandles();

		Iterator<String> iteretor=windows.iterator();
		String parentwindow= iteretor.next();
		String childwindow=iteretor.next();
		
		driver.switchTo().window(childwindow);
		System.out.println(driver.getTitle());
		
		driver.findElement(By.name("UserFirstName")).sendKeys("vaibhav");
		driver.findElement(By.name("UserLastName")).sendKeys("Muddebihalkar");
		driver.switchTo().window(parentwindow);
	}

}
