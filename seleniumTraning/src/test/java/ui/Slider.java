package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Slider {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/slider/#colorpicker");
		driver.manage().window().maximize();
		WebElement frame1=driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(frame1);
		WebElement Red = driver.findElement(By.xpath("//*[@id=\"red\"]/span"));
		WebElement green = driver.findElement(By.xpath("//*[@id=\"green\"]/span"));
		WebElement blue = driver.findElement(By.xpath("//*[@id=\"blue\"]/span"));
		
		Actions slide=new Actions(driver);
		slide.dragAndDropBy(Red, -50,82).perform();
		slide.dragAndDropBy(blue, 60,120).perform();
		slide.dragAndDropBy(green, 70,170).perform();
		
	}

}
