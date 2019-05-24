package com.zwy.AutoTestDem;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
public class excel {
	
	@Test
	public void name() throws Exception  {
		
		
		
		String path=System.getProperty("user.dir");
		String finalXlsxPath=path+"/src/test/java/com/zwy/AutoTestDem/a.xlsx";
		File excelFile = new File(finalXlsxPath);
		FileInputStream in = new FileInputStream(excelFile);
		Workbook wb = new XSSFWorkbook(in);  
		int sheetCount = wb.getNumberOfSheets();
		System.out.println(sheetCount);
		Sheet sheet=null;
		sheet = wb.getSheet("Sheet1");
		 
//		 Row row =null;
		 for(int i=0;i<sheet.getLastRowNum();i++){  // 循环获取每一行的数据
			  Row row= sheet.getRow(i);
			 for(int j=0;j<sheet.getLastRowNum();j++){ 
				 Cell cell= (Cell) row.getCell(j);
			System.out.println(cell);
		
	 }	
	
	}
}
}
