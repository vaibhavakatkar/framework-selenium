package com.inferyx.framework.dataProfiling.compareResult;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.inferyx.framework.selenium.TestBase;

public class DataProfilingSearchCriteria extends TestBase{
	@Test(priority =2 , description = "Data Profile Search Result")
	public void dataVisualization() throws IOException, InterruptedException {
		// Data Profile Search Result
		Thread.sleep(8000);
		try {
			WebElement selectDatapod = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[3]/div/div[1]/div/div[1]/div/div/div[2]/form/div[1]/div/div[1]/div/div/span/span[1]/span"));
			start = System.currentTimeMillis();
			Thread.sleep(1000);
			selectDatapod.click();
			Thread.sleep(2000);
			WebElement datapodName=driver.findElement(By.xpath("//ul[@class='select2-results__options']//li[text()='bank']"));
			datapodName.click();
			Thread.sleep(2000);

			WebElement selelctAttribute=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[3]/div/div[1]/div/div[1]/div/div/div[2]/form/div[2]/div/div[1]/div/div/span/span[1]/span"));
			selelctAttribute.click();
			Thread.sleep(2000);

			WebElement attributeName=driver.findElement(By.xpath("//ul[@class='select2-results__options']//li[text()='bank_name']"));
			attributeName.click();
			Thread.sleep(2000);

			
			WebElement startDate=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[3]/div/div[1]/div/div[1]/div/div/div[2]/form/div[1]/div/div[2]/div/div/a/div/span[2]/i"));
			startDate.click();
			Thread.sleep(2000);

			WebElement selectStartDate=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[3]/div/div[1]/div/div[1]/div/div/div[2]/form/div[1]/div/div[2]/div/div/ul/div/table/tbody/tr[5]/td[4]"));
			selectStartDate.click();
			Thread.sleep(2000);

			WebElement selectStartTime=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[3]/div/div[1]/div/div[1]/div/div/div[2]/form/div[1]/div/div[2]/div/div/ul/div/table/tbody/tr/td/span[12]"));
			selectStartTime.click();
			Thread.sleep(2000);

			WebElement selectExactStartTime=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[3]/div/div[1]/div/div[1]/div/div/div[2]/form/div[1]/div/div[2]/div/div/ul/div/table/tbody/tr/td/span[1]"));
			selectExactStartTime.click();
			Thread.sleep(2000);

			
			WebElement endDate=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[3]/div/div[1]/div/div[1]/div/div/div[2]/form/div[2]/div/div[2]/div/div/a/div/span[2]/i"));
			endDate.click();
			Thread.sleep(2000);

			WebElement selectEndDate=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[3]/div/div[1]/div/div[1]/div/div/div[2]/form/div[2]/div/div[2]/div/div/ul/div/table/tbody/tr[5]/td[4]"));
			selectEndDate.click();
			Thread.sleep(2000);

			WebElement selectEndTime=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[3]/div/div[1]/div/div[1]/div/div/div[2]/form/div[2]/div/div[2]/div/div/ul/div/table/tbody/tr/td/span[16]"));
			selectEndTime.click();
			Thread.sleep(2000);

			WebElement selectExactEndTime=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[3]/div/div[1]/div/div[1]/div/div/div[2]/form/div[2]/div/div[2]/div/div/ul/div/table/tbody/tr/td/span[1]"));
			selectExactEndTime.click();
			Thread.sleep(2000);

			
			WebElement searchBtn=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[3]/div/div[1]/div/div[1]/div/div/div[2]/form/div[3]/div/div/div/div/input"));
			searchBtn.click();
			Thread.sleep(2000);

			
			WebElement selectSource=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[3]/div/div[1]/div/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div/div/div/span/span[1]/span"));
			selectSource.click();
			Thread.sleep(2000);

			WebElement profileDetail=driver.findElement(By.xpath("//ul[@class='select2-results__options']//li[text()='Wed Feb 27 13:12:06 IST 2019']"));
			profileDetail.click();
			Thread.sleep(2000);

			
			WebElement selectTarget=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[3]/div/div[1]/div/div[2]/div/div/div[2]/div/div/div[2]/div[1]/div/div/div/span/span[1]/span"));
			selectTarget.click();
			Thread.sleep(2000);

			WebElement targetValue=driver.findElement(By.xpath("//ul[@class='select2-results__options']//li[text()='Wed Feb 27 13:11:42 IST 2019']"));
			targetValue.click();
			Thread.sleep(2000);

			
			WebElement refreshCompareResult=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[3]/div/div[1]/div/div[2]/div/div/div[1]/div[2]/a[1]/i"));
			refreshCompareResult.click();
			Thread.sleep(2000);

			
			WebElement minimizeCompareResult=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[3]/div/div[1]/div/div[2]/div/div/div[1]/div[2]/a[2]"));
			minimizeCompareResult.click();
			Thread.sleep(2000);

			WebElement maximizeCompareResult=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[3]/div/div[1]/div/div[2]/div/div/div[1]/div[2]/a[2]"));
			maximizeCompareResult.click();
			Thread.sleep(2000);
			
			WebElement refreshSearchCriteria=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[3]/div/div[1]/div/div[1]/div/div/div[1]/div[2]/a[1]/i"));
			refreshSearchCriteria.click();
			Thread.sleep(2000);

			
			WebElement minimizeSearchCriteria=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[3]/div/div[1]/div/div[1]/div/div/div[1]/div[2]/a[2]"));
			minimizeSearchCriteria.click();
			Thread.sleep(2000);

			WebElement maximizeSearchCriteria=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[3]/div/div[1]/div/div[1]/div/div/div[1]/div[2]/a[2]"));
			maximizeSearchCriteria.click();
			Thread.sleep(2000);			
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(4,5, "Data Profile Search Result", "PASS", totalTime);
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			dataFromExcelSheet.updateResult(4,5, "Data Profile Search Result", "FAIL", totalTime);
		}
	}
}
