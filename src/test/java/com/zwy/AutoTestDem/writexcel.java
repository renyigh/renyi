package com.zwy.AutoTestDem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class writexcel {
	@Test
	public void name() throws IOException {
			String path=System.getProperty("user.dir");
			String finalXlsxPath=path+"/src/test/java/com/zwy/AutoTestDem/a.xlsx";
			File finalXlsxFile = new File(finalXlsxPath);
			Workbook workBook = getWorkbok(finalXlsxFile);
			Sheet sheet = workBook.getSheetAt(0);

			
			Row row = sheet.createRow(1);
			Cell cell=row.createCell(0);
			cell.setCellValue("dafdsaf");
			OutputStream out =  new FileOutputStream(finalXlsxPath);
			workBook.write(out);
			out.flush();
			out.close();
	 }
	
  

		
		
		public  Workbook getWorkbok(File file) throws IOException{
	        Workbook wb = null;
	        FileInputStream in = new FileInputStream(file);
	         wb = new XSSFWorkbook(in);
	        return wb;

		

	}}

