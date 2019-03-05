package com.inferyx.framework.dataPreparation.datapod;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.inferyx.framework.selenium.ReadDataFromExcelSheet;
import com.inferyx.framework.selenium.TestBase;

public class DataPreaparation extends TestBase {

	ReadDataFromExcelSheet dataFromExcelSheet = new ReadDataFromExcelSheet();

	@Test(priority = 1, description = "Data Preparation ")
	public void dataPreparationList() throws IOException, InterruptedException {
		try {
			//click on datapreparation
			WebElement dataPreparation = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[7]/a/span[1]"));
			 start = System.currentTimeMillis();
			Thread.sleep(1000); 
			dataPreparation.click();
			 finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(updateResult, "Data Preparation", "PASS", totalTime, newFile);
			System.out.println(driver.getTitle() + dataPreparation.getText());
			Thread.sleep(1000);
		
		} catch (InterruptedException e) {
			dataFromExcelSheet.updateResult(updateResult, "Data Preparation", "FAIL", totalTime, newFile);
		}
	}
	
	@Test(priority =2, description = "Datapod")
	public void dataDatapod() throws IOException, InterruptedException {
		//Datapod click
		Thread.sleep(1000);try { start = System.currentTimeMillis();
			WebElement datapod = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[7]/ul/li[1]/a/span[1]"));
			
			Thread.sleep(1000);
			datapod.click();
		    finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(updateResult, "Datapod", "PASS", totalTime, newFile);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(updateResult, "Datapod", "FAIL", totalTime, newFile);
		}
		Thread.sleep(1000);
	}
	

	
	
	
	
	}