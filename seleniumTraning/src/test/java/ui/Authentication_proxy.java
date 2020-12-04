package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Authentication_proxy {

	public static String usename="admin";
	public static String password="admin";
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		driver.navigate().to("http://"+usename+":"+password+"@the-internet.herokuapp.com/basic_auth");
	}

}
