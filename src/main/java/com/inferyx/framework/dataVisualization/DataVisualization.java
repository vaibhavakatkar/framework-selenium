package com.inferyx.framework.dataVisualization;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.inferyx.framework.selenium.ReadDataFromExcelSheet;
import com.inferyx.framework.selenium.TestBase;

public class DataVisualization extends TestBase {

	ReadDataFromExcelSheet dataFromExcelSheet = new ReadDataFromExcelSheet();

	@Test(priority = 1, description = "dataVisualization")
	public void dataDiscoveryList() throws IOException, InterruptedException {
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
	public void dataDiscoveryCard() throws IOException, InterruptedException {
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
	@Test(priority =3, description = "Vizpod")
	public void dataDiscoveryCardEdit() throws IOException, InterruptedException {
		Thread.sleep(1000);

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
	@Test(priority =4, description = "Report")
	public void dataDiscoveryCardMetaComp() throws IOException, InterruptedException {
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