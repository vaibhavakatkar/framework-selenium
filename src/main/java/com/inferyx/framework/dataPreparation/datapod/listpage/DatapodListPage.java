package com.inferyx.framework.dataPreparation.datapod.listpage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.inferyx.framework.selenium.TestBase;

public class DatapodListPage extends TestBase{
 
	@Test(priority= 2, description = "Datapod Search By Name")
	public void DatapodSearchByName() throws IOException, InterruptedException {
		Thread.sleep(3000);
		//DatapodSearchByName
		try {
			//Select List Name
			getHtmlElementByXpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[3]/div/search-criteria/div/div[2]/form/div[1]/div/div[1]/div/div/span/span[1]/span").click();
			Thread.sleep(1000);
			start = System.currentTimeMillis();

			//Select Name
			getHtmlElementByXpath("//ul[@class='select2-results__options']//li[contains(text(),'target_pred_train_aft_survival_regression')]").click();
			Thread.sleep(1000);
			
			//Search Buttton
			getHtmlElementByXpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[3]/div/search-criteria/div/div[2]/form/div[3]/div/div[1]/div/div/input").click();
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(4,5, "Datapod Search By Name", "PASS", totalTime, newFile);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4,5, "Datapod Search By Name", "FAIL", totalTime, newFile);
		}
	}
	
	@Test(priority=3 , description = "Datapod Search By User")
	public void RuleSearchByUser() throws IOException, InterruptedException {
		Thread.sleep(3000);
		//Datapod Search By User
		try {
			//Select List User
			getHtmlElementByXpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[3]/div/search-criteria/div/div[2]/form/div[2]/div/div[1]/div/div/span/span[1]/span").click();
			Thread.sleep(1000);
			start = System.currentTimeMillis();
			
			//Select User
			getHtmlElementByXpath("//ul[@class='select2-results__options']//li[contains(text(),'ypalrecha')]").click();
			Thread.sleep(1000);
			
			////Search Buttton
			getHtmlElementByXpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[3]/div/search-criteria/div/div[2]/form/div[3]/div/div[1]/div/div/input").click();
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(4,5, "Datapod Search By User", "PASS", totalTime, newFile);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4,5, "Datapod Search By User", "FAIL", totalTime, newFile);
		}
	}
	@Test(priority=4 , description = "Datapod Search Criteria Refresh")
	public void VizpodSearchCriteriaRefresh() throws IOException, InterruptedException {
		Thread.sleep(3000);
		//Datapod Search Criteria Refresh
		try {
			//Refresh
			getHtmlElementByXpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[3]/div/search-criteria/div/div[1]/div[2]/a[1]/i").click();
			Thread.sleep(1000);
			start = System.currentTimeMillis();
			driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[3]/div/div/div[13]"));
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(4,5, "Datapod Search Criteria Refresh", "PASS", totalTime, newFile);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4,5, "Datapod Search Criteria Refresh", "FAIL", totalTime, newFile);
		}
	}
	@Test(priority=5 , description = "Datapod Start and End Date")
	public void RuleStartAndEndDate() throws IOException, InterruptedException {
		Thread.sleep(3000);
		//Datapod Start and End Date
		try {
			WebElement startDate = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[3]/div/search-criteria/div/div[2]/form/div[1]/div/div[2]/div/div/a/div/span[2]/i"));
			startDate.click();
			Thread.sleep(1000);
			start = System.currentTimeMillis();
			
			WebElement selectStartDate=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[3]/div/search-criteria/div/div[2]/form/div[1]/div/div[2]/div/div/ul/div/table/tbody/tr[1]/td[6]"));
			selectStartDate.click();
			Thread.sleep(1000);
			
			WebElement selectStartTime=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[3]/div/search-criteria/div/div[2]/form/div[1]/div/div[2]/div/div/ul/div/table/tbody/tr/td/span[1]"));
			selectStartTime.click();
			Thread.sleep(1000);
			
			WebElement selectEndTime=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[3]/div/search-criteria/div/div[2]/form/div[1]/div/div[2]/div/div/ul/div/table/tbody/tr/td/span[12]"));
			selectEndTime.click();
			Thread.sleep(1000);
			
			WebElement endDate = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[3]/div/search-criteria/div/div[2]/form/div[2]/div/div[2]/div[1]/div/a/div/span[2]/i"));
			endDate.click();
			Thread.sleep(1000);
			
			WebElement selectEndDate=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[3]/div/search-criteria/div/div[2]/form/div[2]/div/div[2]/div[1]/div/ul/div/table/tbody/tr[4]/td[3]"));
			selectEndDate.click();
			Thread.sleep(1000);
			
			WebElement selectStartTimeOfEndDate=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[3]/div/search-criteria/div/div[2]/form/div[2]/div/div[2]/div[1]/div/ul/div/table/tbody/tr/td/span[1]"));
			selectStartTimeOfEndDate.click();
			Thread.sleep(1000);
			
			WebElement selectEndTimeOfEndDate=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[3]/div/search-criteria/div/div[2]/form/div[2]/div/div[2]/div[1]/div/ul/div/table/tbody/tr/td/span[12]"));
			selectEndTimeOfEndDate.click();
			Thread.sleep(1000);
			
			WebElement searchBtn=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[3]/div/search-criteria/div/div[2]/form/div[3]/div/div[1]/div/div/input"));
			searchBtn.click();
			Thread.sleep(3000);

			WebElement datapodSearchCriteriaRefresh = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[3]/div/search-criteria/div/div[1]/div[2]/a[1]/i"));
			datapodSearchCriteriaRefresh.click();
			
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(4,5, "Datapod Start and End Date", "PASS", totalTime, newFile);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4,5, "Datapod Start and End Date", "FAIL", totalTime, newFile);
		}
	}
	@Test(priority=7 , description = "Datapod Search Status")
	public void datapodSearchStatus() throws IOException, InterruptedException {
		Thread.sleep(3000);
		//Datapod Search Status
		try {
			WebElement datapodStatus = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[3]/div/search-criteria/div/div[2]/form/div[2]/div/div[3]/div[2]/div/span/span[1]/span"));
			datapodStatus.click();
			Thread.sleep(1000);
			start = System.currentTimeMillis();
			
			WebElement selelctStatus = driver
					.findElement(By.xpath("//ul[@class='select2-results__options']//li[contains(text(),'Inactive')]"));
			selelctStatus.click();
			Thread.sleep(1000);
			
			WebElement searchBtn=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[3]/div/search-criteria/div/div[2]/form/div[3]/div/div[1]/div/div/input"));
			searchBtn.click();
			
			Thread.sleep(3000);
			WebElement datapodSearchCriteriaRefresh = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[3]/div/search-criteria/div/div[1]/div[2]/a[1]/i"));
			datapodSearchCriteriaRefresh.click();
			
			finish = System.currentTimeMillis();
			totalTime = finish - start; 

			dataFromExcelSheet.updateResult(4,5, "Datapod Search Status", "PASS", totalTime, newFile);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4,5, "Datapod Search Status", "FAIL", totalTime, newFile);
		}
	}
	@Test(priority=8 , description = "Datapod Search Name")
	public void datapodSearchName() throws IOException, InterruptedException {
		Thread.sleep(3000);
		//Datapod Search Name
		try {
			WebElement datapodSearch = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[3]/div/div/div[13]/div[1]/div[2]/div/input"));
			datapodSearch.sendKeys("dq_rule");
			Thread.sleep(2000);
			start = System.currentTimeMillis();
			WebElement vizpodSearchCriteriaRefresh = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[3]/div/search-criteria/div/div[1]/div[2]/a[1]/i"));
			vizpodSearchCriteriaRefresh.click();
			
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(4,5, "Datapod Search Name", "PASS", totalTime, newFile);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4,5, "Datapod Search Name", "FAIL", totalTime, newFile);
		}
	}
}
