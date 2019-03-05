package com.inferyx.framework.dataVisualization.dashboard;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.inferyx.framework.selenium.TestBase;

public class DashBoardDelete extends TestBase{
	@BeforeMethod
	public void setUp() throws InterruptedException {
		Thread.sleep(3000);
		start = System.currentTimeMillis();
		WebElement dashboardTile = driver
				.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div/span[2]"));
		dashboardTile.click();
		driver.findElement(By.cssSelector("button.btn.green.btn-xs.btn-outline.dropdown-toggle")).click();

		Thread.sleep(1000);
	}
	@Test(priority =6, description = "dashboardDelete")
	public void vizpodDelete() throws IOException, InterruptedException {
		Thread.sleep(3000);
		//dashboardDelete
		try {
			WebElement dashboardDelete = driver
					.findElement(By.xpath("/html/body/ul/li[3]/a"));
			start = System.currentTimeMillis();
			dashboardDelete.click();
			Thread.sleep(1000);
			finish = System.currentTimeMillis();
			totalTime = finish - start;  
			dataFromExcelSheet.updateResult(4,5, "Dashboard Action Delete", "PASS", totalTime, newFile);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4,5, "Dashboard Action Delete", "FAIL", totalTime, newFile);
		}
	}
	
	@AfterMethod
	public void AfterMethod() throws InterruptedException {
		Thread.sleep(3000);
		start = System.currentTimeMillis();
		WebElement actionDelete = driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[7]/div/div/div[3]/button[2]"));
		actionDelete.click();
	}
	
  
}
