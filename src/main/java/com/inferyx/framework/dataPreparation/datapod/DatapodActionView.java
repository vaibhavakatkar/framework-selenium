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

public class DatapodActionView extends TestBase {
	DatapodPage datapodTest;

	
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
	
	@Test(priority = 4, description = "Datapod View Action")
	public void datapodViewAction() throws IOException, InterruptedException {
		// Datapod Action
		try {
			WebElement actionView = driver.findElement(By.xpath("/html/body/ul/li[1]/a"));
			actionView.click();
			start = System.currentTimeMillis();
			Thread.sleep(1000);
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(4, 5, "Datapod Action View", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4, 5, "Datapod Action View", "FAIL", totalTime);
		}
		Thread.sleep(3000);
	}
	
	
	
	@AfterMethod
	public void AfterMethod() throws InterruptedException {
		Thread.sleep(3000);
		start = System.currentTimeMillis();
		WebElement datapodAcationbutton = driver
				.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[1]/div[2]/a[9]/i"));
		Thread.sleep(1000);
		datapodAcationbutton.click();
		Thread.sleep(1000);
	}
	

}