package com.inferyx.framework.dataVisualization.result;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.inferyx.framework.selenium.TestBase;

public class Result extends TestBase{
	
	@Test(priority =1, description = "Result")
	public void Report() throws IOException, InterruptedException {
		Thread.sleep(1000);
		//Result
		try {
			
			WebElement result = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[3]/ul/li[4]/a"));
			result.click();
			driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[2]/div[2]/div[2]"));
			Thread.sleep(1000);
			start = System.currentTimeMillis();
			Thread.sleep(1000);
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(updateResult, "Result", "PASS", totalTime, newFile);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(updateResult, "Result", "FAIL", totalTime, newFile);
		}
	}
}
