package com.inferyx.framework.dataProfiling.group;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.inferyx.framework.selenium.TestBase;

public class DataProfilingGroupRestore extends TestBase{
	@BeforeMethod
	public void setUp() throws InterruptedException {
		Thread.sleep(3000);
		start = System.currentTimeMillis();
		driver.findElement(By.cssSelector("button.btn.green.btn-xs.btn-outline.dropdown-toggle")).click();

		Thread.sleep(1000);
	}
	@Test(priority =5, description = "groupRestore")
	public void groupRestore() throws IOException, InterruptedException {
		Thread.sleep(3000);
		//groupRestore
		try {
			WebElement groupRestore = driver
					.findElement(By.xpath("/html/body/ul/li[3]/a"));
			start = System.currentTimeMillis();
			groupRestore.click();
			Thread.sleep(1000);
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(7, 8, "Group Action Restore", "PASS", totalTime, newFile);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(7, 8, "Group Action Restore", "FAIL", totalTime, newFile);
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
