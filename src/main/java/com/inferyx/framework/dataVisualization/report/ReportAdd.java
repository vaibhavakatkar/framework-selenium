package com.inferyx.framework.dataVisualization.report;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inferyx.framework.pages.ReportPage;
import com.inferyx.framework.selenium.TestBase;
import com.inferyx.framework.util.TestUtil;

public class ReportAdd extends TestBase{
	
	ReportPage reportPage;
	
	public ReportAdd() {
		reportPage = new ReportPage();
	}
	
	@DataProvider
	public Object[][] getDummyData() {
		Object data[][] = TestUtil.getTestData("report");
		return data;
	}
	
	@Test(priority =2,dataProvider = "getDummyData",description = "Report Add")
	public void ReportAdd(String name, String desc, String source, String sourceName, String title, String header, String footer ) throws IOException, InterruptedException {
		Thread.sleep(1000);
		//Report Add
		
		WebElement reportAdd = driver
				.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[3]/div/div/div[1]/div[2]/a"));
		Thread.sleep(1000);
		reportAdd.click();
		start = System.currentTimeMillis();
		reportPage.createReport(name, desc, source, sourceName,title, header, footer);
		try {
			WebElement submitBtn= driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div[1]/form/div[1]/div[2]/div[2]/div/div/div[20]/div/input"));
			submitBtn.submit();
			Thread.sleep(1000);
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(4,5, "Report Add", "PASS", totalTime, newFile);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4,5, "Report Add", "FAIL", totalTime, newFile);
		}
	}
}
