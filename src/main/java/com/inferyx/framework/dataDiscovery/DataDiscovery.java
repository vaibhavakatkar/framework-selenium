package com.inferyx.framework.dataDiscovery;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.inferyx.framework.selenium.ReadDataFromExcelSheet;
import com.inferyx.framework.selenium.TestBase;

public class DataDiscovery extends TestBase {

	ReadDataFromExcelSheet dataFromExcelSheet = new ReadDataFromExcelSheet();

	@Test(priority = 1, description = "dataDiscovery")
	public void dataDiscoveryList() throws IOException, InterruptedException {
		// DataDiscovery

		try {
			WebElement dataDiscovery = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[2]/a/span[1]"));
			start = System.currentTimeMillis();
			Thread.sleep(1000);
			dataDiscovery.click();
			finish = System.currentTimeMillis();
			totalTime = finish - start;

			dataFromExcelSheet.updateResult(updateResult, "Data Discovery", "PASS", totalTime);
			System.out.println(driver.getTitle() + dataDiscovery.getText());

		} catch (InterruptedException e) {
			dataFromExcelSheet.updateResult(updateResult, "Data Discovery", "FAIL", totalTime);
		}
	}
	
	@Test(priority =2, description = "dataDiscoveryCard")
	public void dataDiscoveryCard() throws IOException, InterruptedException {
		// DataDiscovery
		try {
			WebElement accountData = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[2]/div/div/div[2]/div[1]/div[1]/div/a/div/div[1]"));
			 start = System.currentTimeMillis();
			Thread.sleep(1000);
			accountData.click();
			 finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(4,5,"Account Card", "PASS",totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(updateResult, "Account Card", "FAIL", totalTime);
		}
	}
	@Test(priority =3, description = "dataDiscoveryCardEdit")
	public void dataDiscoveryCardEdit() throws IOException, InterruptedException {
		// DataDiscovery
		try {
			System.out.println("test non 6");
			WebElement accountEdit = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[1]/div[2]/a[2]/i"));
			 start = System.currentTimeMillis();
			Thread.sleep(1000);
			accountEdit.click();
			 finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(4,5,"Account Edit", "PASS",totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(updateResult, "Account Edit", "FAIL", totalTime);
		}
	}
	@Test(priority =4, description = "dataDiscoveryMetaComp")
	public void dataDiscoveryCardMetaComp() throws IOException, InterruptedException {
		// DataDiscovery
		try {
			WebElement accountComp = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[1]/div[2]/a[3]/i"));
			 start = System.currentTimeMillis();
			Thread.sleep(1000);
			accountComp.click();
			 finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(4,5,"Meta Comp", "PASS",totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(updateResult, "Account Edit", "FAIL", totalTime);
		}
	}
	
	
}