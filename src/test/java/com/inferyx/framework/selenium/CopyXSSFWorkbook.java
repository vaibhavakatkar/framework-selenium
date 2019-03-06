package com.inferyx.framework.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

public class CopyXSSFWorkbook {

    public static void main(String[] args) throws IOException {
    	CopyXSSFWorkbook copyHSSFWorkbook=new CopyXSSFWorkbook();
    	copyHSSFWorkbook.copyFile("/home/rohini/git/framework-selenium/src/main/resources/excel.xls", "/home/rohini/git/framework-selenium/src/main/resources/excel_1273.xls");
	}
	public void copyFile(String sourcePath, String destinationPath) throws IOException {
	    FileInputStream excelFile = new FileInputStream(new File(sourcePath));
	    Workbook workbook = new HSSFWorkbook(excelFile);
	    FileOutputStream outputStream = new FileOutputStream(destinationPath);
	    workbook.write(outputStream);
	    ((FileInputStream) workbook).close();
	}


}