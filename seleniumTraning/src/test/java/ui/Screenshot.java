package ui;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");

		File screenshotfile=driver.getScreenshotAs(OutputType.FILE);
		Date currentDate= new Date();
		String filename=currentDate.toString().replace(" ", "-").replace(":", "-");
		FileUtils.copyFile(screenshotfile,new File(".//screenshot/screen"+filename+".png"));
	}

}
