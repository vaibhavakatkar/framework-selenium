package com.inferyx.framework.dataVisualization.vizpod;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.inferyx.framework.selenium.TestBase;

public class VizpodActionRestore extends TestBase{
 
	@BeforeMethod
	public void setUp() throws InterruptedException {
		Thread.sleep(3000);
		start = System.currentTimeMillis();
		driver.findElement(By.cssSelector("button.btn.green.btn-xs.btn-outline.dropdown-toggle")).click();

		Thread.sleep(1000);
	}
	@Test(priority =7, description = "vizpodRestore")
	public void vizpodRestore() throws IOException, InterruptedException {
		Thread.sleep(3000);
		//vizpodRestore
		try {
			WebElement vizpodRestore = driver
					.findElement(By.xpath("/html/body/ul/li[3]/a"));
			long start1 = System.currentTimeMillis();
			vizpodRestore.click();
			Thread.sleep(1000);
			long finish1 = System.currentTimeMillis();
			totalTime = finish1 - start1; 
			dataFromExcelSheet.updateResult(4,5, "Vizpod Action Restore", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4,5, "Vizpod Action Restore", "FAIL", totalTime);
		}
	}
	
	@AfterMethod
	public void AfterMethod() throws InterruptedException {
		Thread.sleep(3000);
		start = System.currentTimeMillis();
		WebElement actionRestore = driver.findElement(By.xpath("//*[@id='DeleteConfModal']/div/div/div[3]/button[2]"));
		actionRestore.click();
	}

}
