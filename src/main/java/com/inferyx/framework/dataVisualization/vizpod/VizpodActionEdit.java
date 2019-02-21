package com.inferyx.framework.dataVisualization.vizpod;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.inferyx.framework.selenium.TestBase;

public class VizpodActionEdit extends TestBase{
 
	@BeforeMethod
	public void setUp() throws InterruptedException {
		Thread.sleep(3000);
		start = System.currentTimeMillis();
		driver.findElement(By.cssSelector("button.btn.green.btn-xs.btn-outline.dropdown-toggle")).click();

		Thread.sleep(1000);
	}
	@Test(priority =10, description = "vizpodEdit")
	public void vizpodEdit() throws IOException, InterruptedException {
		Thread.sleep(3000);
		//vizpodEdit
		try {
			WebElement vizpodView = driver
					.findElement(By.xpath("/html/body/ul/li[2]/a"));
			long start1 = System.currentTimeMillis();
			vizpodView.click();
			Thread.sleep(1000);
			long finish1 = System.currentTimeMillis();
			totalTime = finish1 - start1; 
			dataFromExcelSheet.updateResult(4,5, "Vizpod Action Edit", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4,5, "Vizpod Action Edit", "FAIL", totalTime);
		}
	}
	
	@AfterMethod
	public void AfterMethod() throws InterruptedException {
		Thread.sleep(3000);
		start = System.currentTimeMillis();
		WebElement actionBtn = driver
				.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[1]/div[2]/a[7]/i"));
		Thread.sleep(1000);
		actionBtn.click();
		Thread.sleep(1000);
	}
}
