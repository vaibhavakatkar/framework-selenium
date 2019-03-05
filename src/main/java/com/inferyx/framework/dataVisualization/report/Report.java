package com.inferyx.framework.dataVisualization.report;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.inferyx.framework.selenium.TestBase;

public class Report extends TestBase {
 
	@Test(priority =1, description = "Report")
	public void Report() throws IOException, InterruptedException {
		Thread.sleep(1000);
		//Report
		try {
			WebElement report = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[3]/ul/li[3]/a/span[1]"));
			start = System.currentTimeMillis();
			Thread.sleep(1000);
			report.click();
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(4,5, "Report", "PASS", totalTime, newFile);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4,5, "Report", "FAIL", totalTime, newFile);
		}
	}
}
