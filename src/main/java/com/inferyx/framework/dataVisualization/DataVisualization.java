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
			dataFromExcelSheet.updateResult(updateResult, "Data Visualization", "PASS", totalTime, newFile);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			dataFromExcelSheet.updateResult(updateResult, "Data Visualization", "FAIL", totalTime, newFile);
		}
	}
	
}