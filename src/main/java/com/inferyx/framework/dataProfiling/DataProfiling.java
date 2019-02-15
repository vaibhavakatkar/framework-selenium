package com.inferyx.framework.dataProfiling;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.inferyx.framework.selenium.TestBase;

public class DataProfiling extends TestBase{
	
	@Test(priority = 1, description = "dataProfiling")
	public void dataProfiling() throws IOException, InterruptedException {
		// dataProfiling
		Thread.sleep(8000);
		try {
			WebElement dataProfiling = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[5]/a/span[1]"));
			long start = System.currentTimeMillis();
			Thread.sleep(1000);
			dataProfiling.click();
			System.out.println(driver.getTitle() + dataProfiling.getText());
			long finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(updateResult, "Data Profile", "PASS", totalTime);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			dataFromExcelSheet.updateResult(updateResult, "Data Profile", "FAIL", totalTime);
		}
	}

	

}
