package com.excel.util;

public class ExcelOperation {

	public static void main(String[] args) {
		Xls_Reader reader = new Xls_Reader(
				"C:/Users/vaibhav/Selenium/seleniumTraning/src/main/java/com/test/data/SampleData.xlsx");
		
		if(!reader.isSheetExist("HomeSheet"))
		
		reader.addSheet("HomeSheet");

	}

}
