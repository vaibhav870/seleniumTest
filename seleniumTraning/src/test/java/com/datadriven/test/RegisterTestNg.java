package com.datadriven.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.excel.util.DataUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterTestNg {
	WebDriver driver;
	WebElement firstname;
	WebElement lastname;
	WebElement Email;
	public void cleardata(WebElement element) {
		element.clear();
	}

	@BeforeMethod
	public void SetUp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.get("https://testingbot.com/users/sign_up");
		 firstname = driver.findElement(By.id("user_first_name"));
		 lastname = driver.findElement(By.id("user_last_name"));
		 Email = driver.findElement(By.id("user_email"));	
	}
	
	@DataProvider
	public Iterator<Object[]> fetchData() {
		ArrayList<Object[]> data= DataUtil.getData();
		return data.iterator();
	}
	
	@Test(dataProvider="fetchData")
	public void RunTest(String fname,String lname,String email) throws InterruptedException {
		
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		Email.sendKeys(email);
		Thread.sleep(200);
		cleardata(firstname);
		cleardata(lastname);
		cleardata(Email);
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
