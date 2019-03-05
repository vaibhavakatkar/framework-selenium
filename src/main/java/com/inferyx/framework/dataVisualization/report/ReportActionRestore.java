package com.inferyx.framework.dataVisualization.report;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.inferyx.framework.selenium.TestBase;

public class ReportActionRestore extends TestBase{
	@BeforeMethod
	public void setUp() throws InterruptedException {
		Thread.sleep(3000);
		start = System.currentTimeMillis();
		driver.findElement(By.cssSelector("button.btn.green.btn-xs.btn-outline.dropdown-toggle")).click();

		Thread.sleep(1000);
	}
	@Test(priority =6, description = "Report Action Restore")
	public void reportRestore() throws IOException, InterruptedException {
		Thread.sleep(3000);
		//Report Action Restore
		try {
			WebElement reportRestore = driver
					.findElement(By.xpath("/html/body/ul/li[3]/a"));
			start = System.currentTimeMillis();
			reportRestore.click();
			Thread.sleep(1000);
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(4,5, "Report Action Restore", "PASS", totalTime, newFile);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4,5, "Report Action Restore", "FAIL", totalTime, newFile);
		}
	}
	
	@AfterMethod
	public void AfterMethod() throws InterruptedException {
		Thread.sleep(3000);
		start = System.currentTimeMillis();
		WebElement actionRestore = driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[3]/div/div/div[2]/div[1]/div/div/div[3]/button[2]"));
		actionRestore.click();
	}
}
