package com.inferyx.framework.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;

public class ReadDataFromExcelSheet {

	public String[][] getExcelData(String excellocation, String sheetName) {
		try {
			String dataSets[][] = null;
			FileInputStream file = new FileInputStream(new File(excellocation));

			// Create Workbook instance holding reference to .xls file
			HSSFWorkbook workbook = new HSSFWorkbook(file);

			// Get first/desired sheet from the workbook
			HSSFSheet sheet = workbook.getSheet(sheetName);
			// count number of active rows
			int totalRow = sheet.getLastRowNum();
			// count number of active columns in row
			int totalColumn = sheet.getRow(0).getLastCellNum();
			// Create array of rows and column
			dataSets = new String[totalRow][totalColumn];
			// Iterate through each rows one by one
			Iterator<Row> rowIterator = sheet.iterator();
			int i = 0;
			while (rowIterator.hasNext()) {
				System.out.println(i);

				Row row = rowIterator.next();
				// For each row, iterate through all the columns
				Iterator<Cell> cellIterator = row.cellIterator();
				int j = 0;
				while (cellIterator.hasNext()) {

					Cell cell = cellIterator.next();
					if (cell.getStringCellValue().contains("User Name")) {
						break;
					}

					// Check the cell type and format accordingly
					switch (cell.getCellType()) {
					case Cell.CELL_TYPE_NUMERIC:
						dataSets[i - 1][j++] = cell.getStringCellValue();
						System.out.println(cell.getNumericCellValue());
						break;
					case Cell.CELL_TYPE_STRING:
						dataSets[i - 1][j++] = cell.getStringCellValue();
						System.out.println(cell.getStringCellValue());
						break;
					case Cell.CELL_TYPE_BOOLEAN:
						dataSets[i - 1][j++] = cell.getStringCellValue();
						System.out.println(cell.getStringCellValue());
						break;
					case Cell.CELL_TYPE_FORMULA:
						dataSets[i - 1][j++] = cell.getStringCellValue();
						System.out.println(cell.getStringCellValue());
						break;
					}

				}

				System.out.println("");
				i++;
			}
			file.close();
			return dataSets;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	/*
	 * public void updateResult(String excellocation, String sheetName, String
	 * testCaseName, long totalTime, FileInputStream newFile) throws IOException {
	 * 
	 * try { FileInputStream file = new FileInputStream( new
	 * File(System.getProperty("user.dir") +
	 * "/src/main/resources/Framework_Selenium_Testing_Report.xls"));
	 * 
	 * // Create Workbook instance holding reference to .xls file HSSFWorkbook
	 * workbook = new HSSFWorkbook(file);
	 * 
	 * // Get first/desired sheet from the workbook HSSFSheet sheet =
	 * workbook.getSheet(sheetName); // count number of active tows int totalRow =
	 * sheet.getLastRowNum() + 1; // count number of active columns in row for (int
	 * i = 1; i < totalRow; i++) { HSSFRow r = sheet.getRow(i);
	 * 
	 * String ce = r.getCell(1).getStringCellValue(); if (ce.contains(testCaseName))
	 * { r.createCell(2).setCellValue(totalTime); file.close();
	 * System.out.println("result updated"); FileOutputStream outFile = new
	 * FileOutputStream( new File(System.getProperty("user.dir") +
	 * "/src/main/resources/Framework_Selenium_Testing_Report.xls"));
	 * workbook.write(outFile); outFile.close(); break; }
	 * 
	 * } } catch (Exception e) { e.printStackTrace(); } }
	 */

	public void updateResult(int CheckCell, int putCell, String testCaseName, String testStatus, long totaltime,
			File newFile) throws IOException {

		try {
			
			  FileInputStream file = new FileInputStream(newFile);
			 
			// Create Workbook instance holding reference to .xls file
			HSSFWorkbook workbook = new HSSFWorkbook(file);

			// Get first/desired sheet from the workbook
			HSSFSheet sheet = workbook.getSheet("Framework_Selenium_Result");
					    
			// count number of active tows
			int totalRow = sheet.getLastRowNum() + 1;
			// count number of active columns in row
			for (int i = 1; i < totalRow; i++) {
				HSSFRow r = sheet.getRow(i);
				Cell cell = r.getCell(CheckCell);
				
				if (cell != null) {
					String ce = r.getCell(CheckCell).getStringCellValue();

					if (ce.contains(testCaseName)) {
						r.createCell(putCell).setCellValue(testStatus);
						r.createCell(putCell + 1).setCellValue(totaltime);

						System.out.println("result updated");
						FileOutputStream outFile = new FileOutputStream(newFile);
						workbook.write(outFile);
						outFile.flush();
						break;
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Object[][] getExcelDataBasedOnStartingPoint(String excellocation, String sheetName, String testName) {
		try {
			String dataSets[][] = null;
			FileInputStream file = new FileInputStream(new File(excellocation));

			// Create Workbook instance holding reference to .xls file
			HSSFWorkbook workbook = new HSSFWorkbook(file);

			// Get first/desired sheet from the workbook
			HSSFSheet sheet = workbook.getSheet(sheetName);
			// count number of active rows
			int totalRow = sheet.getLastRowNum();
			int totalColumn = 0;
			// Iterate through each rows one by one
			Iterator<Row> rowIterator = sheet.iterator();
			int i = 0;
			int count = 1;
			while (rowIterator.hasNext() && count == 1 || count == 2) {
				// System.out.println(i);

				Row row = rowIterator.next();
				// For each row, iterate through all the columns
				Iterator<Cell> cellIterator = row.cellIterator();
				int j = 0;
				while (cellIterator.hasNext()) {

					Cell cell = cellIterator.next();

					if (cell.getStringCellValue().contains(testName + "end")) {
						count = 0;
						break;
					}

					// System.out.println(sheetName+"Start");
					if (cell.getStringCellValue().contains(testName + "start")) {
						// count number of active columns in row
						totalColumn = row.getPhysicalNumberOfCells() - 1;
						// Create array of rows and column
						dataSets = new String[totalRow][totalColumn];
					}
					// System.out.println(sheetName+"Start");
					if (cell.getStringCellValue().contains(testName + "start") || count == 2) {
						System.out.println(sheetName + "start");
						count = 2;
						// Check the cell type and format accordingly

						switch (cell.getCellType()) {
						case Cell.CELL_TYPE_NUMERIC:
							dataSets[i - 1][j++] = cell.getStringCellValue();
							System.out.println(cell.getNumericCellValue());
							break;
						case Cell.CELL_TYPE_STRING:
							if (!cell.getStringCellValue().contains(testName + "start")) {
								dataSets[i - 1][j++] = cell.getStringCellValue();
								System.out.println(cell.getStringCellValue());
							}
							break;
						case Cell.CELL_TYPE_BOOLEAN:
							dataSets[i - 1][j++] = cell.getStringCellValue();
							System.out.println(cell.getStringCellValue());
							break;
						case Cell.CELL_TYPE_FORMULA:
							dataSets[i - 1][j++] = cell.getStringCellValue();
							System.out.println(cell.getStringCellValue());
							break;
						}

					}
				}

				System.out.println("");
				i++;
			}
			file.close();

			return parseData(dataSets, totalColumn);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * This method is used to remove unwanted null data from array
	 * 
	 * @param data
	 * @return
	 */
	public Object[][] parseData(Object[][] data, int colSize) {
		// Creating array list to store data;
		ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();

		// This array list will store one Array index data, every array index
		// has three sets of data
		ArrayList<String> list1;

		System.out.println(data.length);

		// running for loop on array size
		for (int i = 0; i < data.length; i++) {
			// creates a list to store the elements != null

			System.out.println(data[i].length);

			list1 = new ArrayList<String>();
			// this for loop will run on array index, since each array index has
			// three sets of data
			for (int j = 0; j < data[i].length; j++) {
				// this if will check null
				if (data[i][j] != null) {
					list1.add((String) data[i][j]);
				}
			}
			// once all one array index data is entered in arrayList , then
			// putting this object in parent arrayList
			if (list1.size() > 0) {
				list.add(list1);
			}
		}
		// convert array List Data into 2D Array
		Object[][] arr2d = new Object[list.size()][colSize];
		// run loop on array list data
		for (int i = 0; i < list.size(); i++) {
			// every array list index has arryList inside
			ArrayList<String> t = list.get(i);
			// run loop on inner array List
			for (int j = 0; j < t.size(); j++) {
				arr2d[i][j] = t.get(j);
			}
		}
		System.out.println(list);
		System.out.println(arr2d);
		return arr2d;
	}

	public String getResult(String sheetName, String param, File newFile) throws IOException {
		String value = null;

		try {
			FileInputStream file = new FileInputStream(newFile);
			// Create Workbook instance holding reference to .xls file
			// HSSFWorkbook workbook = new HSSFWorkbook(file);
			HSSFWorkbook workbook = new HSSFWorkbook(file);

			// Get first/desired sheet from the workbook
			HSSFSheet sheet = workbook.getSheet(sheetName);
			// HSSFSheet sheet = workbook.getSheetAt(0);

			// count number of active tows
			int totalRow = sheet.getLastRowNum() + 1;
			// count number of active columns in row
			for (int i = 1; i < totalRow; i++) {
				HSSFRow r = sheet.getRow(i);
				String ce = r.getCell(1).getStringCellValue();
				if (ce.contains(param)) {
					value = r.getCell(2).getStringCellValue();

					System.out.println("result updated");
					FileOutputStream outFile = new FileOutputStream(newFile);
					workbook.write(outFile);
					outFile.flush();
					break;
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}

	public void updateResult(String sheetName, String testCaseName, String testStatus, long totalTime,
			File newFile) throws IOException {

		try {
			
			  FileInputStream file = new FileInputStream(newFile);
			 
			// Create Workbook instance holding reference to .xls file
			// HSSFWorkbook workbook = new HSSFWorkbook(file);
			HSSFWorkbook workbook = new HSSFWorkbook(file);

			// Get first/desired sheet from the workbook
			HSSFSheet sheet = workbook.getSheet(sheetName);
			// HSSFSheet sheet = workbook.getSheetAt(0);

			// count number of active tows
			int totalRow = sheet.getLastRowNum() + 1;
			// count number of active columns in row
			for (int i = 1; i < totalRow; i++) {
				HSSFRow r = sheet.getRow(i);
				Cell cell = r.getCell(1);
				if (cell != null) {
					String ce = r.getCell(1).getStringCellValue();
					if (ce.contains(testCaseName)) {
						r.createCell(2).setCellValue(testStatus);
						r.createCell(3).setCellValue(totalTime);
						System.out.println("result updated");
						FileOutputStream outFile = new FileOutputStream(newFile);
						workbook.write(outFile);
						outFile.flush();
						break;
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public File getWorkbook() throws IOException {
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss aa");

		File newFile = new File(System.getProperty("user.dir")+"/src/main/resources/Framework_Selenium_Testing_Report"
				+ dateFormat.format(date) + ".xls");
		
		
    	copyFile(System.getProperty("user.dir")+"/src/main/resources/Framework_Selenium_Testing_Report.xls", System.getProperty("user.dir")+"/src/main/resources/Framework_Selenium_Testing_Report"
				+ dateFormat.format(date) + ".xls");
		return newFile;
			
	/*	File inputFile = new File(
				"/home/ubuntu/git/framework-selenium/src/main/resources/Framework_Selenium_Testing_Report.xls");
		FileInputStream newFile = new FileInputStream(inputFile);

		HSSFWorkbook inputWorkbook = new HSSFWorkbook(newFile);

		int inputSheetCount = inputWorkbook.getNumberOfSheets();

		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss aa");

		// Step #2 : Locate path and file of output excel.
		File outputFile = new File(
				"/home/ubuntu/git/framework-selenium/src/main/resources/Framework_Selenium_Testing_Report"
						+ dateFormat.format(date) + ".xls");
		FileOutputStream fos = new FileOutputStream(outputFile);

		// Step #3 : Creating workbook for output excel file.
		HSSFWorkbook outputWorkbook = new HSSFWorkbook();

		for (int i = 0; i < inputSheetCount; i++) {
			HSSFSheet inputSheet = inputWorkbook.getSheetAt(i);
			String inputSheetName = inputWorkbook.getSheetName(i);
			HSSFSheet outputSheet = outputWorkbook.createSheet(inputSheetName);

			// Create and call method to copy the sheet and content in new workbook.
			copySheet(inputSheet, outputSheet);
		}
		// Step #9 : Write all the sheets in the new Workbook(testData_Copy.xls) using
		// FileOutStream Object
		outputWorkbook.write(fos);
		// Step #10 : At the end of the Program close the FileOutputStream object.
		fos.close();*/
	//return outputFile;

	}

	public void copyFile(String sourcePath, String destinationPath) throws IOException {
	    FileInputStream excelFile = new FileInputStream(new File(sourcePath));
	    Workbook workbook = new HSSFWorkbook(excelFile);
	    FileOutputStream outputStream = new FileOutputStream(destinationPath);
	    workbook.write(outputStream);
	     
	}
	
	/*public static void copySheet(HSSFSheet inputSheet, HSSFSheet outputSheet) {
		int rowCount = inputSheet.getLastRowNum();

		int currentRowIndex = 0;
		if (rowCount > 0) {
			Iterator rowIterator = inputSheet.iterator();
			while (rowIterator.hasNext()) {
				int currentCellIndex = 0;
				Iterator cellIterator = ((HSSFRow) rowIterator.next()).cellIterator();
				while (cellIterator.hasNext()) {
					// Step #5-8 : Creating new Row, Cell and Input value in the newly created
					// sheet.
					String cellData = cellIterator.next().toString();
					if (currentCellIndex == 0)
						outputSheet.createRow(currentRowIndex).createCell(currentCellIndex).setCellValue(cellData);
					else
						outputSheet.getRow(currentRowIndex).createCell(currentCellIndex).setCellValue(cellData);

					currentCellIndex++;
				}
				currentRowIndex++;
			}

		}
	}
*/
	/*
	 * public static void main(String[] args) throws IOException { String
	 * excellocation = "/home/ubuntu/selenium/testReport.xls"; String sheetName =
	 * "Sheet1"; ReadDataFromExcelSheet excel = new ReadDataFromExcelSheet();
	 * //Object[][] data = excel.getExcelDataBasedOnStartingPoint(excellocation,
	 * sheetName, "login"); //System.out.println(data);
	 * excel.updateResult(excellocation, sheetName, "Login_page", "FAIL");
	 * excel.updateResult(excellocation, sheetName, "Application_page", "PASS"); }
	 */
}
