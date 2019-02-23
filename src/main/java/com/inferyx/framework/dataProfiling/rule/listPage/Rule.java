package com.inferyx.framework.dataProfiling.rule.listPage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.inferyx.framework.selenium.TestBase;

public class Rule extends TestBase{
	

	@Test(priority =2 , description = "Data Profile Rule")
	public void dataVisualization() throws IOException, InterruptedException {
		// dataProfiling
		Thread.sleep(8000);
		try {
			WebElement dataProfilingRule = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[5]/ul/li[1]/a/span[1]"));
			start = System.currentTimeMillis();
			Thread.sleep(1000);
			dataProfilingRule.click();
			System.out.println(driver.getTitle() + dataProfilingRule.getText());
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(4,5, "Data Profile Rule", "PASS", totalTime);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			dataFromExcelSheet.updateResult(4,5, "Data Profile Rule", "FAIL", totalTime);
		}
	}
}
