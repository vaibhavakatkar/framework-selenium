package com.inferyx.framework.dataProfiling.result;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.inferyx.framework.selenium.TestBase;

public class DataProfilingResult extends TestBase{
	@Test(priority =1 , description = "Data Profile Result")
	public void dataProfileResult() throws IOException, InterruptedException {
		// dataProfilingResult
		Thread.sleep(8000);
		try {
			WebElement dataProfilingResult = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[5]/ul/li[3]/a/span[1]"));
			start = System.currentTimeMillis();
			Thread.sleep(1000);
			dataProfilingResult.click();
			System.out.println(driver.getTitle() + dataProfilingResult.getText());
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(4,5, "Data Profile Result", "PASS", totalTime);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			dataFromExcelSheet.updateResult(4,5, "Data Profile Result", "FAIL", totalTime);
		}
	}
}
