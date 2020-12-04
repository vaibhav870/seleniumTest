package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.bseindia.com/");
		//driver.manage().window().maximize();
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id=\"indi\"]/table/tbody[1]/tr"));
		List<WebElement> cols=driver.findElements(By.xpath("//*[@id=\"indi\"]/table/tbody[1]/tr[1]/td"));
		//*[@id='tblinsidertrd']/tbody/tr[1]/td[2]
		int rowsize=rows.size();
		int colsize=cols.size();
		System.out.println(rowsize);
		System.out.println(colsize);
		
		for(int i=1;i<=rowsize;i=i+2) {
			for(int j=1;j<=colsize;j++) {
				System.out.println(driver.findElement(By.xpath("//*[@id=\"indi\"]/table/tbody[1]/tr["+ i +"]/td["+ j +"]")).getText());
			}
		}
		
	}

}
