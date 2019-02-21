package com.inferyx.framework.dataVisualization.vizpod;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.inferyx.framework.selenium.TestBase;

public class VizpodActionPublish extends TestBase{
	@BeforeMethod
	public void setUp() throws InterruptedException {
		Thread.sleep(3000);
		start = System.currentTimeMillis();
		driver.findElement(By.cssSelector("button.btn.green.btn-xs.btn-outline.dropdown-toggle")).click();

	Thread.sleep(1000);
	}
	
	@Test(priority = 15, description = "Vizpod Publish Action")
	public void vizpodPublishAction() throws IOException, InterruptedException {
		try {
			WebElement actionPublish = driver.findElement(By.xpath("/html/body/ul/li[5]/a"));
			actionPublish.click();
			start = System.currentTimeMillis();
			Thread.sleep(1000);
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(4, 5, "Vizpod Action Publish", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4, 5, "Vizpod Action Publish", "FAIL", totalTime);
		}
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void AfterMethod() throws InterruptedException {
		Thread.sleep(3000);
		start = System.currentTimeMillis();
		WebElement actionPublish = driver.findElement(By.xpath("//*[@id='publishedConfModal']/div/div/div[3]/button[2]"));
		actionPublish.click();

	}
}
