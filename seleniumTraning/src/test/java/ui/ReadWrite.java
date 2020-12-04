package ui;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadWrite {

	public static void main(String[] args) throws IOException {
		Properties propert=new Properties();
		
		File data=new File("C:\\Users\\vaibhav\\Selenium\\seleniumTraning\\src\\test\\resources\\properties\\data.properties");
		
		FileInputStream file= new FileInputStream(data);
		propert.load(file);
		System.out.println(propert.getProperty("browser"));
		System.out.println(propert.getProperty("url"));
	
		FileOutputStream out= new FileOutputStream(data);
		
		propert.setProperty("url1", "https://www.saucedemo.com/");
		propert.store(out, "Updated Url");
		
	}

}
