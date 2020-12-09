package com.datadriven.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.util.Xls_Reader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenTest {
	public static void main(String args[]) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2F");
		driver.manage().window().maximize();

		Xls_Reader reader = new Xls_Reader(
				"C:/Users/vaibhav/Selenium/seleniumTraning/src/main/java/com/test/data/SampleData.xlsx");

		String fname = reader.getCellData("Sheet1", "firstname", 2);
		System.out.print(fname);

		String lname = reader.getCellData("Sheet1", "lastname", 2);
		System.out.print("\t" + lname);

		String email = reader.getCellData("Sheet1", "emailaddress", 2);
		System.out.print("\t" + email);
		driver.findElement(By.id("firstname")).sendKeys(fname);
		driver.findElement(By.id("lastname")).sendKeys(lname);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.close();

	}
}
