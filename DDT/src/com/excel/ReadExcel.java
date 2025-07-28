package com.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
		File src=new File("C:\\Apache Test Data");
		FileInputStream fis=new FileInputStream(src);
        XSSFWorkbook wb=new XSSFWorkbook(src);
        XSSFSheet sheet1=wb.getSheetAt(0);
        
        String data0=sheet1.getRow(0).getCell(0).getStringCellValue();
        String data1=sheet1.getRow(0).getCell(1).getStringCellValue();
	}

}
