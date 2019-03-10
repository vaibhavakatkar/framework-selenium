package com.inferyx.framework.dataPreparation.datapod;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.Test;

import com.inferyx.framework.pages.DatapodPage;
import com.inferyx.framework.selenium.TestBase;

public class DatapodActionUnLock extends TestBase {

	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		Thread.sleep(3000);
		start = System.currentTimeMillis();
	//driver.findElement(By.xpath("//*[@id='1549462066457-0-uiGrid-000C-cell']/div/div/div/button"));
		driver.findElement(By.cssSelector("button.btn.green.btn-xs.btn-outline.dropdown-toggle")).click();

		Thread.sleep(1000);
		//datapodAcationbutton.submit();
		Thread.sleep(1000);
	}
	
	@Test(priority =8, description = "Datapod UnLock Action")
	public void datapodUnLockAction() throws IOException, InterruptedException {
		try {
			WebElement actionUnLock = driver.findElement(By.xpath("/html/body/ul/li[4]/a"));
			actionUnLock.click();
			start = System.currentTimeMillis();
			Thread.sleep(1000);
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(4, 5, "Datapod Action UnLock", "PASS", totalTime, newFile);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4, 5, "Datapod Action UnLock", "FAIL", totalTime, newFile);
		}
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void AfterMethod() throws InterruptedException {
		Thread.sleep(3000);
		start = System.currentTimeMillis();
		WebElement actionUnLock = driver.findElement(By.xpath("//*[@id='lockedConfModal']/div/div/div[3]/button[2]"));
		actionUnLock.click();
		

	}
	
}