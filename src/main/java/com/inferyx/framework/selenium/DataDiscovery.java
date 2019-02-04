package com.inferyx.framework.selenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DataDiscovery extends TestBase {
	
	ReadDataFromExcelSheet dataFromExcelSheet = new ReadDataFromExcelSheet();

	
	@Test(priority = 4, description = "DataDiscovery")
	public void test1()throws IOException, InterruptedException {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(8000);
		long totalTime = 0;
		// Data Discovery
		try {
			WebElement dataDiscovery = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[2]/a/span[1]"));
			long start = System.currentTimeMillis();
			Thread.sleep(1000);
			dataDiscovery.click();			
			long finish = System.currentTimeMillis();
			totalTime = finish - start; 
			
			dataFromExcelSheet.updateResult(updateResult, "Data Discovery", "PASS", totalTime);
			System.out.println(driver.getTitle() + dataDiscovery.getText());
			Thread.sleep(1000);
			// account datapod
			try {
				WebElement accountData = driver
						.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[2]/div/div/div[2]/div[1]/div[1]/div/a/div/div[1]"));
				long start11 = System.currentTimeMillis();
				Thread.sleep(1000);
				accountData.click();
				long finish11 = System.currentTimeMillis();
				totalTime = finish11 - start11; 
				dataFromExcelSheet.updateResult(4,5,"Account Card", "PASS",totalTime);
			} catch (NoSuchElementException e) {
				dataFromExcelSheet.updateResult(updateResult, "Account Card", "FAIL", totalTime);
			}
		
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(updateResult, "Data Discovery", "FAIL", totalTime);
		}
}
}
