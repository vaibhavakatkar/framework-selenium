package com.inferyx.framework.dataVisualization;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.inferyx.framework.selenium.ReadDataFromExcelSheet;
import com.inferyx.framework.selenium.TestBase;

public class DataVisualization extends TestBase {


	@Test(priority = 1, description = "dataVisualization")
	public void dataVisualization() throws IOException, InterruptedException {
		// dataVisualization
		Thread.sleep(8000);
		try {
			WebElement dataVisualization = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[3]/a/span[1]"));
			long start = System.currentTimeMillis();
			Thread.sleep(1000);
			dataVisualization.click();
			System.out.println(driver.getTitle() + dataVisualization.getText());
			long finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(updateResult, "Data Visualization", "PASS", totalTime);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			dataFromExcelSheet.updateResult(updateResult, "Data Visualization", "FAIL", totalTime);
		}
	}
	@Test(priority =2, description = "Dashboard")
	public void Dashboard() throws IOException, InterruptedException {
		Thread.sleep(1000);
		// Dashboard
		try {
			WebElement dashboard = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[3]/ul/li[1]/a/span[1]"));
			long start11 = System.currentTimeMillis();
			Thread.sleep(1000);
			dashboard.click();
			long finish11 = System.currentTimeMillis();
			totalTime = finish11 - start11; 
			dataFromExcelSheet.updateResult(updateResult, "Dashboard", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(updateResult, "Dashboard", "FAIL", totalTime);
		}
	}	
	@Test(priority =3, description = "datshBoardTile")
	public void datshBoardTile() throws IOException, InterruptedException {
		Thread.sleep(3000);
		// datshBoardTile
		try {
			WebElement dashboardTile = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div"));
			long start11 = System.currentTimeMillis();
			Thread.sleep(1000);
			dashboardTile.click();
			long finish11 = System.currentTimeMillis();
			totalTime = finish11 - start11; 
			dataFromExcelSheet.updateResult(4,5, "Dashboard Tile", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4,5, "Dashboard Tile", "FAIL", totalTime);
		}
	}
	@Test(priority =3, description = "dashboardAdd")
	public void createDashboard() throws IOException, InterruptedException {
		Thread.sleep(3000);
		// dashboardAdd
		try {
			WebElement dashboardAdd = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[5]/div/div/div[2]/div/div[1]/div/a"));
			long start11 = System.currentTimeMillis();
			Thread.sleep(1000);
			dashboardAdd.click();
			long finish11 = System.currentTimeMillis();
			totalTime = finish11 - start11; 
			dataFromExcelSheet.updateResult(4,5, "DashboardAdd", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4,5, "Create Dashboard", "FAIL", totalTime);
		}
	}
	@Test(priority =4, description = "Vizpod")
	public void Vizpod() throws IOException, InterruptedException {
		Thread.sleep(3000);
		//Vizpod
		try {
			WebElement vizpod = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[3]/ul/li[2]/a"));
			long start1 = System.currentTimeMillis();
			vizpod.click();
			Thread.sleep(1000);
			long finish1 = System.currentTimeMillis();
			totalTime = finish1 - start1; 
			dataFromExcelSheet.updateResult(updateResult, "Vizpod", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(updateResult, "Vizpod", "FAIL", totalTime);
		}
	}
	
	@Test(priority =5, description = "vizpodAdd")
	public void vizpodAdd() throws IOException, InterruptedException {
		Thread.sleep(5000);
		//vizpodAdd
		try {
			WebElement vizpodAdd = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[3]/div/div/div[1]/div[2]/a"));
			long start1 = System.currentTimeMillis();
			vizpodAdd.click();
			Thread.sleep(1000);
			long finish1 = System.currentTimeMillis();
			totalTime = finish1 - start1; 
			dataFromExcelSheet.updateResult(4,5, "Vizpod Add", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4,5, "Vizpod Add", "FAIL", totalTime);
		}
	}
	
	@Test(priority =6, description = "Report")
	public void Report() throws IOException, InterruptedException {
		Thread.sleep(1000);
		//Report
		try {
			WebElement report = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[3]/ul/li[3]/a/span[1]"));
			long start1 = System.currentTimeMillis();
			Thread.sleep(1000);
			report.click();
			long finish1 = System.currentTimeMillis();
			totalTime = finish1 - start1;
			dataFromExcelSheet.updateResult(updateResult, "Report", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(updateResult, "Report", "FAIL", totalTime);
		}
	}
	
	
	}