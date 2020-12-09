package com.datadriven.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.excel.util.Xls_Reader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterizedTest {

	public static void cleardata(WebElement element) {
		element.clear();
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://testingbot.com/users/sign_up");
		WebElement firstname = driver.findElement(By.id("user_first_name"));
		WebElement lastname = driver.findElement(By.id("user_last_name"));
		WebElement Email = driver.findElement(By.id("user_email"));

		Xls_Reader reader = new Xls_Reader(
				"C:/Users/vaibhav/Selenium/seleniumTraning/src/main/java/com/test/data/SampleData.xlsx");
		int rowcount = reader.getRowCount("Sheet1");
		reader.addColumn("Sheet1", "Status");
		// System.out.println(rowcount);
		for (int i = 2; i <= rowcount; i++) {
			String fname = reader.getCellData("Sheet1", "firstname", i);
			System.out.println(fname);
			String lname = reader.getCellData("Sheet1", "lastname", i);
			System.out.println(lname);
			String email = reader.getCellData("Sheet1", "emailaddress", i);
			System.out.println(email);
			System.out.println("----------");

			// driver.get("http://demo.automationtesting.in/Register.html");
			firstname.sendKeys(fname);
			lastname.sendKeys(lname);
			Email.sendKeys(email);
			Thread.sleep(200);
			cleardata(firstname);
			cleardata(lastname);
			cleardata(Email);
			Thread.sleep(200);
			// driver.close();
			reader.setCellData("Sheet1", "Status", i, "Pass");
			
		

		}
		driver.close();
	}

}
