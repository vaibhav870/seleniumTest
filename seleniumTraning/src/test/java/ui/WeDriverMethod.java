package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WeDriverMethod {

	public static void main(String[] args) {
	
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://www.sugarcrm.com/request-demo/");
		driver.manage().window().maximize();
		driver.findElement(By.name("firstname")).sendKeys("vaibhav");
		driver.findElement(By.name("firstname")).clear();
		System.out.println(driver.findElement(By.name("firstname")).getAttribute("class"));
		System.out.println(driver.findElement(By.xpath("/html/body/div/main/div[2]/div[1]/div/div/div/div[1]/form/div/div[12]/div/input")).getCssValue("text-transform"));
		System.out.println(driver.findElement(By.xpath("/html/body/div/main/div[2]/div[1]/div/div/div/div[1]/form/div/div[12]/div/input")).getSize());
		System.out.println(driver.findElement(By.xpath("/html/body/div/main/div[2]/div[1]/div/div/div/div[1]/form/div/div[12]/div/input")).getLocation());
		System.out.println(driver.findElement(By.xpath("/html/body/div/main/div[2]/div[1]/div/div/div/div[1]/form/div/div[12]/div/input")).getTagName());
		System.out.println(driver.findElement(By.xpath("/html/body/div/main/div[2]/div[3]/div/div/h3")).getText());
		System.out.println(driver.findElement(By.xpath("/html/body/div/main/div[2]/div[1]/div/div/div/div[1]/form/div/div[12]/div/input")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("/html/body/div/main/div[2]/div[1]/div/div/div/div[1]/form/div/div[12]/div/input")).isEnabled());
		System.out.println(driver.findElement(By.xpath("/html/body/div/main/div[2]/div[1]/div/div/div/div[1]/form/div/div[9]/div[1]/div/label")).isSelected());
	}

}
