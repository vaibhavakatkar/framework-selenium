package com.inferyx.framework.dataProfiling.compareResult;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.inferyx.framework.selenium.TestBase;

public class DataProfilingAttribute extends TestBase{
	
	@Test(priority =3 , description = "Data Profile Attribute")
	public void dataProfileAttribute() throws IOException, InterruptedException {
		// dataProfiling Attribute
		Thread.sleep(8000);
		try {
			WebElement attribute = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[3]/ul/li[2]/a"));
			start = System.currentTimeMillis();
			Thread.sleep(1000);
			attribute.click();
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(4,5, "Data Profile Attribute", "PASS", totalTime, newFile);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			dataFromExcelSheet.updateResult(4,5, "Data Profile Attribute", "FAIL", totalTime, newFile);
		}
	}
	@Test(priority =4 , description = "Data Profile Attribute Search Criteria")
	public void data() throws IOException, InterruptedException {
		// dataProfiling Attribute Search Criteria
		Thread.sleep(8000);
		try {
			WebElement sourceDatapod = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[3]/div/div[2]/div/div[1]/div[2]/form/div[2]/div/div[1]/div/div/span/span[1]/span"));
			sourceDatapod.click();
			start = System.currentTimeMillis();
			Thread.sleep(2000);
			
			WebElement sourceDatapodName = driver
					.findElement(By.xpath("//ul[@class='select2-results__options']//li[text()='account']"));
			sourceDatapodName.click();
			Thread.sleep(2000);
			
			WebElement sourceAttribute = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[3]/div/div[2]/div/div[1]/div[2]/form/div[3]/div/div[1]/div/div/span/span[1]/span"));
			sourceAttribute.click();
			Thread.sleep(2000);
			
			WebElement sourceAttributeName = driver
					.findElement(By.xpath("//ul[@class='select2-results__options']//li[text()='pin_number']"));
			sourceAttributeName.click();
			Thread.sleep(2000);
			
			WebElement sourceProfileAttribute = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[3]/div/div[2]/div/div[1]/div[2]/form/div[2]/div/div[2]/div/div/span/span[1]/span"));
			sourceProfileAttribute.click();
			Thread.sleep(2000);
			
			WebElement sourceProfileAttributeValue = driver
					.findElement(By.xpath("//ul[@class='select2-results__options']//li[text()='maxval']"));
			sourceProfileAttributeValue.click();
			Thread.sleep(2000);
			
			WebElement sourcePeriod=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[3]/div/div[2]/div/div[1]/div[2]/form/div[3]/div/div[2]/div/div/span/span[1]/span"));
			sourcePeriod.click();
			Thread.sleep(2000);
			
			WebElement sourcePeriodValue=driver.findElement(By.xpath("//ul[@class='select2-results__options']//li[text()=' 1 week']"));
			sourcePeriodValue.click();
			Thread.sleep(2000);
			
			WebElement targetDatapod = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[3]/div/div[2]/div/div[1]/div[2]/form/div[5]/div/div[1]/div/div/span/span[1]/span"));
			targetDatapod.click();
			Thread.sleep(2000);
			
			WebElement targetDatapodName = driver
					.findElement(By.xpath("//ul[@class='select2-results__options']//li[text()='account']"));
			targetDatapodName.click();
			Thread.sleep(2000);
			
			
			WebElement targetAttribute = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[3]/div/div[2]/div/div[1]/div[2]/form/div[6]/div/div[1]/div/div/span/span[1]/span"));
			targetAttribute.click();
			Thread.sleep(2000);
			
			WebElement targetAttributeName = driver
					.findElement(By.xpath("//ul[@class='select2-results__options']//li[text()='customer_id']"));
			targetAttributeName.click();
			Thread.sleep(2000);
			
			WebElement targetProfileAttribute = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[3]/div/div[2]/div/div[1]/div[2]/form/div[5]/div/div[2]/div/div/span/span[1]/span"));
			targetProfileAttribute.click();
			Thread.sleep(2000);
			
			WebElement targetProfileAttributeValue = driver
					.findElement(By.xpath("//ul[@class='select2-results__options']//li[text()='maxval']"));
			targetProfileAttributeValue.click();
			Thread.sleep(2000);
			
			WebElement targetPeriod=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[3]/div/div[2]/div/div[1]/div[2]/form/div[6]/div/div[2]/div/div/span/span[1]/span"));
			targetPeriod.click();
			Thread.sleep(2000);
			
			WebElement targetPeriodValue=driver.findElement(By.xpath("//ul[@class='select2-results__options']//li[text()=' 1 week']"));
			targetPeriodValue.click();
			Thread.sleep(2000);
			
			WebElement searchBtn=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[3]/div/div[2]/div/div[1]/div[2]/form/div[7]/div/div/div/div/input"));
			searchBtn.click();
			Thread.sleep(20000);
			
			driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[3]/div/div[2]/div/div[2]/div/div/div[2]/div/div"));
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(4,5, "Data Profile Attribute Search Criteria", "PASS", totalTime, newFile);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			dataFromExcelSheet.updateResult(4,5, "Data Profile Attribute Search Criteria", "FAIL", totalTime, newFile);
		}
	}
	@Test(priority =5 , description = "Data Profile Trend Analysis Minimize")
	public void dataProfileTrendAnalysisMinimize() throws IOException, InterruptedException {
		//Data Profile Trend Analysis Minimize
		Thread.sleep(8000);
		try {
			WebElement trendAnalysisMinimize = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[3]/div/div[2]/div/div[2]/div/div/div[1]/div[2]/a[2]"));
			start = System.currentTimeMillis();
			Thread.sleep(1000);
			trendAnalysisMinimize.click();
			driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[3]/div/div[2]/div/div[2]/div"));
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(4,5, "Data Profile Trend Analysis Minimize", "PASS", totalTime, newFile);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			dataFromExcelSheet.updateResult(4,5, "Data Profile Trend Analysis Minimize", "FAIL", totalTime, newFile);
		}
	}
	@Test(priority =6 , description = "Data Profile Trend Analysis Maximize")
	public void dataProfileTrendAnalysisMaximize() throws IOException, InterruptedException {
		//Data Profile Trend Analysis Minimize
		Thread.sleep(8000);
		try {
			WebElement trendAnalysisMaximize = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[3]/div/div[2]/div/div[2]/div/div/div[1]/div[2]/a[2]"));
			start = System.currentTimeMillis();
			Thread.sleep(1000);
			trendAnalysisMaximize.click();
			driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[3]/div/div[2]/div/div[2]/div/div/div[2]"));
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(4,5, "Data Profile Trend Analysis Maximize", "PASS", totalTime, newFile);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			dataFromExcelSheet.updateResult(4,5, "Data Profile Trend Analysis Maximize", "FAIL", totalTime, newFile);
		}
	}
	@Test(priority =7 , description = "Data Profile Search Criteria Minimize")
	public void dataProfileSearchCriteriaMinimize() throws IOException, InterruptedException {
		//Data Profile Search Criteria Minimize
		Thread.sleep(8000);
		try {
			WebElement searchCriteriaMinimize = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[3]/div/div[2]/div/div[1]/div[1]/div[2]/a[2]"));
			start = System.currentTimeMillis();
			Thread.sleep(1000);
			searchCriteriaMinimize.click();
			driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[3]/div/div[2]/div"));
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(4,5, "Data Profile Search Criteria Minimize", "PASS", totalTime, newFile);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			dataFromExcelSheet.updateResult(4,5, "Data Profile Search Criteria Minimize", "FAIL", totalTime, newFile);
		}
	}
	@Test(priority =8 , description = "Data Profile Search Criteria Maximize")
	public void dataProfileSearchCriteriaMaximize() throws IOException, InterruptedException {
		//Data Profile Search Criteria Maximize
		Thread.sleep(8000);
		try {
			WebElement searchCriteriaMaximize = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[3]/div/div[2]/div/div[1]/div[1]/div[2]/a[2]"));
			start = System.currentTimeMillis();
			Thread.sleep(1000);
			searchCriteriaMaximize.click();
			driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[3]/div"));
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(4,5, "Data Profile Trend Analysis Maximize", "PASS", totalTime, newFile);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			dataFromExcelSheet.updateResult(4,5, "Data Profile Trend Analysis Maximize", "FAIL", totalTime, newFile);
		}
	}
}
