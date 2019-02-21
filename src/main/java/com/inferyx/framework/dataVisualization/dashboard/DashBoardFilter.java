package com.inferyx.framework.dataVisualization.dashboard;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.inferyx.framework.selenium.TestBase;

public class DashBoardFilter extends TestBase{
	
	@Test(priority =22, description = "Dashboard Filter")
	public void datshBoardFilter() throws IOException, InterruptedException {
		Thread.sleep(3000);
		//Dashboard Filter
		try {
			WebElement datshBoardFilter = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[2]/div/div/div[2]/div[1]/div/div[2]/span"));
			datshBoardFilter.click();
			start = System.currentTimeMillis();
			Thread.sleep(1000);	
			
			WebElement pinNumber=driver.findElement(By.xpath("//*[@id=\"attrFilter\"]/div/div/div[2]/div/div/form/div[3]/div[1]/div/span/span[1]/span"));
			pinNumber.click();
			Thread.sleep(1000);
			WebElement pinValue=driver.findElement(By.xpath("//ul[@class='select2-results__options']//li[contains(text(),'3980')]"));
			pinValue.click();
			Thread.sleep(1000);
			WebElement nationality=driver.findElement(By.xpath("//*[@id=\"attrFilter\"]/div/div/div[2]/div/div/form/div[3]/div[2]/div/span/span[1]/span"));
			nationality.click();
			Thread.sleep(1000);
			WebElement nationalityValue=driver.findElement(By.xpath("//span[@class='select2-results']//ul[@class='select2-results__options']//li[contains(text(),'American')]"));
			nationalityValue.click();
			Thread.sleep(1000);
		
			WebElement submitBtn=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[5]/div/div/div[3]/button[2]"));
			submitBtn.click();
			driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[2]/div/div/div[2]/div[1]/div/div[1]"));
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(4,5, "Dashboard Filter", "PASS", totalTime);
			Thread.sleep(3000);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4,5, "Dashboard Filter", "FAIL", totalTime);
		}
	}

	@Test(priority =23, description = "Dashboard Close")
	public void datshBoardClose() throws IOException, InterruptedException {
		Thread.sleep(3000);
		//Dashboard Close
		try {
			WebElement datshBoardClose = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[2]/div/div/div[1]/div[2]/a[6]/i"));
			datshBoardClose.click();
			start = System.currentTimeMillis();
			Thread.sleep(1000);			
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(4,5, "Dashboard Close", "PASS", totalTime);
			Thread.sleep(3000);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4,5, "Dashboard Close", "FAIL", totalTime);
		}
	}
	@Test(priority =24, description = "Dashboard Delete")
	public void datshBoardDelete() throws IOException, InterruptedException {
		Thread.sleep(3000);
		//Dashboard Delete
		try {
			WebElement datshBoardDelete = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[5]/div/div/div[2]/div/div[5]/div/a/div[1]/span[2]/i"));
			datshBoardDelete.click();
			start = System.currentTimeMillis();
			Thread.sleep(1000);			
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(4,5, "Dashboard Delete", "PASS", totalTime);
			Thread.sleep(3000);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4,5, "Dashboard Delete", "FAIL", totalTime);
		}
	}
	@Test(priority =25, description = "Dashboard Restore")
	public void datshBoardRestore() throws IOException, InterruptedException {
		Thread.sleep(3000);
		//Dashboard Restore
		try {
			WebElement datshBoardDelete = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[5]/div/div/div[2]/div/div[5]/div/a/div[1]/span[2]/i"));
			datshBoardDelete.click();
			start = System.currentTimeMillis();
			Thread.sleep(1000);			
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(4,5, "Dashboard Restore", "PASS", totalTime);
			Thread.sleep(3000);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4,5, "Dashboard Restore", "FAIL", totalTime);
		}
	}
	
}
