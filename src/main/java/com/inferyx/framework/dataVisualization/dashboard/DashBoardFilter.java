package com.inferyx.framework.dataVisualization.dashboard;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.inferyx.framework.selenium.TestBase;

public class DashBoardFilter extends TestBase{
	
	@Test(priority =21, description = "Dashboard Filter")
	public void datshBoardFilter() throws IOException, InterruptedException {
		Thread.sleep(3000);
		//Dashboard Filter
		try {
			WebElement datshBoardFilter = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/a"));
			datshBoardFilter.click();
			start = System.currentTimeMillis();
			Thread.sleep(1000);	
			
			WebElement branchName=driver.findElement(By.xpath("//*[@id=\"attrFilter\"]/div/div/div[2]/div/div/form/div[3]/div[1]/div/span/span[1]/span"));
			branchName.click();
			Thread.sleep(1000);
			WebElement branchValue=driver.findElement(By.xpath("//ul[@class='select2-results__options']//li[contains(text(),'Brighton')]"));
			branchValue.click();
			Thread.sleep(1000);
			
			WebElement transaction_type_code=driver.findElement(By.xpath("//*[@id=\"attrFilter\"]/div/div/div[2]/div/div/form/div[3]/div[2]/div/span/span[1]/span"));
			transaction_type_code.click();
			Thread.sleep(1000);
			WebElement transaction_type_codeValue=driver.findElement(By.xpath("//span[@class='select2-results']//ul[@class='select2-results__options']//li[contains(text(),'CA')]"));
			transaction_type_codeValue.click();
			Thread.sleep(1000);
			
			WebElement account_type_code=driver.findElement(By.xpath("//*[@id=\"attrFilter\"]/div/div/div[2]/div/div/form/div[3]/div[3]/div/span/span[1]/span"));
			account_type_code.click();
			Thread.sleep(1000);
			WebElement account_type_codeValue=driver.findElement(By.xpath("//span[@class='select2-results']//ul[@class='select2-results__options']//li[contains(text(),'CHK')]"));
			account_type_codeValue.click();
			Thread.sleep(1000);
		
			WebElement submitBtn=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[5]/div/div/div[3]/button[2]"));
			submitBtn.click();
			Thread.sleep(180000);
			driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[2]/div/div/div[2]/div[1]/div/div[1]"));
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(4,5, "Dashboard Filter", "PASS", totalTime, newFile);
			Thread.sleep(3000);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4,5, "Dashboard Filter", "FAIL", totalTime, newFile);
		}
	}

	@Test(priority =22, description = "Dashboard Close")
	public void datshBoardClose() throws IOException, InterruptedException {
		Thread.sleep(3000);
		//Dashboard Close
		try {
			WebElement datshBoardClose = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[2]/div/div/div[1]/div[2]/a[7]/i"));
			datshBoardClose.click();
			start = System.currentTimeMillis();
			Thread.sleep(1000);			
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(4,5, "Dashboard Close", "PASS", totalTime, newFile);
			Thread.sleep(3000);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4,5, "Dashboard Close", "FAIL", totalTime, newFile);
		}
	}
	@Test(priority =23, description = "Dashboard Delete")
	public void datshBoardDelete() throws IOException, InterruptedException {
		Thread.sleep(3000);
		//Dashboard Delete
		try {
			WebElement datshBoardDelete = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[5]/div/div/div[2]/div/div[2]/div/a/div[1]/span[2]/i"));
			datshBoardDelete.click();
			Thread.sleep(1000);
			getHtmlElementByXpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[2]/div/div/div[3]/button[2]").click();
			start = System.currentTimeMillis();
			Thread.sleep(1000);			
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(4,5, "Dashboard Delete", "PASS", totalTime, newFile);
			Thread.sleep(3000);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4,5, "Dashboard Delete", "FAIL", totalTime, newFile);
		}
	}
	@Test(priority =24, description = "Dashboard Restore")
	public void datshBoardRestore() throws IOException, InterruptedException {
		Thread.sleep(3000);
		//Dashboard Restore
		try {
			WebElement datshBoardRestore = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[5]/div/div/div[2]/div/div[2]/div/a/div[1]/span[2]/i"));
			datshBoardRestore.click();
			Thread.sleep(1000);
			getHtmlElementByXpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[2]/div/div/div[3]/button[2]").click();
			start = System.currentTimeMillis();
			Thread.sleep(1000);			
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(4,5, "Dashboard Restore", "PASS", totalTime, newFile);
			Thread.sleep(3000);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4,5, "Dashboard Restore", "FAIL", totalTime, newFile);
		}
	}
	
}
