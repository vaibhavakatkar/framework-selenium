package com.inferyx.framework.dataProfiling.rule.listPage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.inferyx.framework.selenium.TestBase;

public class RuleListPage extends TestBase{
	
	@Test(priority= 3, description = "Rule Search By Name")
	public void RuleSearchByName() throws IOException, InterruptedException {
		Thread.sleep(3000);
		//RuleSearchByName
		try {
			WebElement ruleSearchByName = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[3]/div/search-criteria/div/div[2]/form/div[1]/div/div[1]/div/div/span/span[1]/span"));
			ruleSearchByName.click();
			Thread.sleep(1000);
			start = System.currentTimeMillis();

			WebElement selectName=driver.findElement(By.xpath("//ul[@class='select2-results__options']//li[contains(text(),'profile_transaction')]"));
			selectName.click();
			Thread.sleep(1000);
			
			WebElement searchBtn=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[3]/div/search-criteria/div/div[2]/form/div[3]/div/div[1]/div/div/input"));
			searchBtn.click();
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(4,5, "Rule Search By Name", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4,5, "Rule Search By Name", "FAIL", totalTime);
		}
	}
	@Test(priority=4 , description = "Rule Search By User")
	public void RuleSearchByUser() throws IOException, InterruptedException {
		Thread.sleep(3000);
		//Rule Search By User
		try {
			WebElement ruleSearchByUser = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[3]/div/search-criteria/div/div[2]/form/div[2]/div/div[1]/div/div/span/span[1]/span"));
			ruleSearchByUser.click();
			Thread.sleep(1000);
			start = System.currentTimeMillis();

			WebElement selectUser=driver.findElement(By.xpath("//ul[@class='select2-results__options']//li[contains(text(),'ypalrecha')]"));
			selectUser.click();
			Thread.sleep(1000);
			
			WebElement searchBtn=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[3]/div/search-criteria/div/div[2]/form/div[3]/div/div[1]/div/div/input"));
			searchBtn.click();
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(4,5, "Rule Search By User", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4,5, "Rule Search By User", "FAIL", totalTime);
		}
	}
	@Test(priority=5 , description = "Rule Search Criteria Refresh")
	public void VizpodSearchCriteriaRefresh() throws IOException, InterruptedException {
		Thread.sleep(3000);
		//Rule Search Criteria Refresh
		try {
			WebElement ruleSearchCriteriaRefresh = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[3]/div/search-criteria/div/div[1]/div[2]/a[1]/i"));
			ruleSearchCriteriaRefresh.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[3]/div/div/div[13]"));
			start = System.currentTimeMillis();
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(4,5, "Rule Search Criteria Refresh", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4,5, "Rule Search Criteria Refresh", "FAIL", totalTime);
		}
	}
	@Test(priority=6 , description = "Rule Start and End Date")
	public void RuleStartAndEndDate() throws IOException, InterruptedException {
		Thread.sleep(3000);
		//Rule Start and End Date
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

			WebElement ruleSearchCriteriaRefresh = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[3]/div/search-criteria/div/div[1]/div[2]/a[1]/i"));
			ruleSearchCriteriaRefresh.click();
			
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(4,5, "Rule Start and End Date", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4,5, "Rule Start and End Date", "FAIL", totalTime);
		}
	}
	@Test(priority=7 , description = "Rule Search Status")
	public void RuleSearchStatus() throws IOException, InterruptedException {
		Thread.sleep(3000);
		//Rule Search Status
		try {
			WebElement ruleStatus = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[3]/div/search-criteria/div/div[2]/form/div[2]/div/div[3]/div[2]/div/span/span[1]/span"));
			ruleStatus.click();
			Thread.sleep(1000);
			start = System.currentTimeMillis();
			
			WebElement selelctStatus = driver
					.findElement(By.xpath("//ul[@class='select2-results__options']//li[contains(text(),'Inactive')]"));
			selelctStatus.click();
			Thread.sleep(1000);
			
			WebElement searchBtn=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[3]/div/search-criteria/div/div[2]/form/div[3]/div/div[1]/div/div/input"));
			searchBtn.click();
			
			Thread.sleep(3000);
			WebElement ruleSearchCriteriaRefresh = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[3]/div/search-criteria/div/div[1]/div[2]/a[1]/i"));
			ruleSearchCriteriaRefresh.click();
			
			finish = System.currentTimeMillis();
			totalTime = finish - start; 

			dataFromExcelSheet.updateResult(4,5, "Rule Search Status", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4,5, "Rule Search Status", "FAIL", totalTime);
		}
	}
	@Test(priority=8 , description = "Rule Search Name")
	public void RuleSearchName() throws IOException, InterruptedException {
		Thread.sleep(3000);
		//Rule Search Name
		try {
			WebElement ruleSearch = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[3]/div/div/div[13]/div[1]/div[2]/div/input"));
			ruleSearch.sendKeys("profile_cust");
			Thread.sleep(2000);
			start = System.currentTimeMillis();
			WebElement vizpodSearchCriteriaRefresh = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[3]/div/search-criteria/div/div[1]/div[2]/a[1]/i"));
			vizpodSearchCriteriaRefresh.click();
			
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(4,5, "Rule Search Name", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4,5, "Rule Search Name", "FAIL", totalTime);
		}
	}
}
