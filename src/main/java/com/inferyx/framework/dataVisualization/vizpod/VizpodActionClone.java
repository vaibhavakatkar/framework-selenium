package com.inferyx.framework.dataVisualization.vizpod;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.inferyx.framework.selenium.TestBase;

public class VizpodActionClone extends TestBase{
	@BeforeMethod
	public void setUp() throws InterruptedException {
		Thread.sleep(3000);
		start = System.currentTimeMillis();
		driver.findElement(By.cssSelector("button.btn.green.btn-xs.btn-outline.dropdown-toggle")).click();

		Thread.sleep(1000);
	}
	
	@Test(priority = 17, description = "Vizpod Clone  Action")
	public void vizpodEditAction() throws IOException, InterruptedException {
		try {
			WebElement actionClone = driver.findElement(By.xpath("/html/body/ul/li[6]/a"));
			actionClone.click();
			start = System.currentTimeMillis();
			Thread.sleep(1000);
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(4, 5, "Vizpod Action Clone", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4, 5, "Vizpod Action Clone", "FAIL", totalTime);
		}
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void AfterMethod() throws InterruptedException {
		Thread.sleep(1000);
		start = System.currentTimeMillis();
		WebElement actionDelete = driver.findElement(By.xpath("//*[@id='clonemodal']/div/div/div[3]/button[2]"));
		actionDelete.click();
		Thread.sleep(2000);
	}
}
