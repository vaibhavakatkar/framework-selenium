package com.inferyx.framework.dataPreparation.datapod;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.Test;

import com.inferyx.framework.selenium.TestBase;

public class DatapodActionRestore extends TestBase {

	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		Thread.sleep(3000);
		start = System.currentTimeMillis();
		driver.findElement(By.cssSelector("button.btn.green.btn-xs.btn-outline.dropdown-toggle")).click();
		Thread.sleep(1000);

	}
	
	@Test(priority = 6, description = "Datapod Restore Action")
	public void datapodRestoreAction() throws IOException, InterruptedException {
		try {
			WebElement actionRestore = driver.findElement(By.xpath("/html/body/ul/li[3]/a"));
			actionRestore.click();
			start = System.currentTimeMillis();
			Thread.sleep(1000);
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(4, 5, "Datapod Action Restore", "PASS", totalTime, newFile);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4, 5, "Datapod Action Restore", "FAIL", totalTime, newFile);
		}
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void AfterMethod() throws InterruptedException {
		Thread.sleep(3000);
		start = System.currentTimeMillis();
		WebElement actionRestore = driver.findElement(By.xpath("//*[@id='DeleteConfModal']/div/div/div[3]/button[2]"));
		actionRestore.click();
	}

}