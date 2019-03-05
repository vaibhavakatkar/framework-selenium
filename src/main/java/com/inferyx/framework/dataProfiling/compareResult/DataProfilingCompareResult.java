package com.inferyx.framework.dataProfiling.compareResult;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.inferyx.framework.selenium.TestBase;

public class DataProfilingCompareResult extends TestBase{
	@Test(priority =1 , description = "Data Profile Group")
	public void dataVisualization() throws IOException, InterruptedException {
		// dataProfiling Compare Result
		Thread.sleep(8000);
		try {
			WebElement compareResult = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[5]/ul/li[4]/a/span[1]"));
			start = System.currentTimeMillis();
			Thread.sleep(1000);
			compareResult.click();
			System.out.println(driver.getTitle() + compareResult.getText());
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(4,5, "Data Profile Compare Result", "PASS", totalTime, newFile);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			dataFromExcelSheet.updateResult(4,5, "Data Profile Compare Result", "FAIL", totalTime, newFile);
		}
	}
	
}
