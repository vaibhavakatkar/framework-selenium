package com.inferyx.framework.dataPreparation.dataset;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.Test;

import com.inferyx.framework.selenium.TestBase;

public class DatasetActionClone extends TestBase {

	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		Thread.sleep(3000);
		start = System.currentTimeMillis();
		WebElement action=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[3]/div/div/div[13]/div[2]/div/div[2]/div[2]/div/div[1]/div/div[8]/div/div/div/button"));
		action.click();
		Thread.sleep(1000);
		//datasetAcationbutton.submit();
		Thread.sleep(1000);
	}
	
	@Test(priority = 11, description = "DataSet Clone  Action")
	public void datasetEditAction() throws IOException, InterruptedException {
		try {
			WebElement actionEdit = driver.findElement(By.xpath("/html/body/ul/li[6]/a"));
			actionEdit.click();
			start = System.currentTimeMillis();
			Thread.sleep(1000);
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(4, 5, "DataSet Action Clone", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4, 5, "DataSet Action Clone", "FAIL", totalTime);
		}
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void AfterMethod() throws InterruptedException {
		Thread.sleep(1000);
		start = System.currentTimeMillis();
		WebElement actionclose = driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[1]/div/div[4]/div[1]/div[2]/a[7]/i"));
		actionclose.click();
		Thread.sleep(2000);
	}

}