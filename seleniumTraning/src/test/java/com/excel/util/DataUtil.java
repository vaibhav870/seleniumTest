package com.excel.util;

import java.util.ArrayList;

public class DataUtil {

	static Xls_Reader reader;
public static ArrayList<Object[]> getData(){
	
	
		
		ArrayList<Object[]> myData = new ArrayList<Object[]>();

		try {
			
			reader = new Xls_Reader(
					"C:/Users/vaibhav/Selenium/seleniumTraning/src/main/java/com/test/data/SampleData.xlsx");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		for (int rownum=2;rownum<=reader.getRowCount("Sheet1");rownum++) {
			String fname = reader.getCellData("Sheet1", "firstname", rownum);
			String lname = reader.getCellData("Sheet1", "lastname", rownum);
			String email = reader.getCellData("Sheet1", "emailaddress", rownum);
			
			Object[] ob= {fname,lname,email};
			myData.add(ob);
		}
		return myData;
		
		
		
	}

}
