package com.inferyx.framework.dataVisualization;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.inferyx.framework.selenium.TestBase;

public class Report extends TestBase {
 
	@Test(priority =8, description = "Report")
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
