package com.inferyx.framework.dataVisualization.vizpod.listPage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.inferyx.framework.selenium.TestBase;

public class Vizpod extends TestBase{
	
	@Test(priority= 1, description = "Vizpod")
	public void Vizpod() throws IOException, InterruptedException {
		Thread.sleep(3000);
		//Vizpod
		try {
			WebElement vizpod = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[3]/ul/li[2]/a"));
			long start1 = System.currentTimeMillis();
			vizpod.click();
			Thread.sleep(1000);
			long finish1 = System.currentTimeMillis();
			totalTime = finish1 - start1; 
			dataFromExcelSheet.updateResult(updateResult, "Vizpod", "PASS", totalTime, newFile);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(updateResult, "Vizpod", "FAIL", totalTime, newFile);
		}
	}

}
