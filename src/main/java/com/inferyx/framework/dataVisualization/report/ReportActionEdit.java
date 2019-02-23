package com.inferyx.framework.dataVisualization.report;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.inferyx.framework.selenium.TestBase;

public class ReportActionEdit extends TestBase{
	@BeforeMethod
	public void setUp() throws InterruptedException {
		Thread.sleep(3000);
		start = System.currentTimeMillis();
		driver.findElement(By.cssSelector("button.btn.green.btn-xs.btn-outline.dropdown-toggle")).click();

		Thread.sleep(1000);
	}
	@Test(priority =4, description = "Report Action Edit")
	public void reportEdit() throws IOException, InterruptedException {
		Thread.sleep(3000);
		//Report Action Edit
		try {
			WebElement vizpodEdit = driver
					.findElement(By.xpath("/html/body/ul/li[2]/a"));
			start = System.currentTimeMillis();
			vizpodEdit.click();
			Thread.sleep(1000);
			WebElement editName= driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div[1]/form/div[1]/div[2]/div[2]/div/div/div[2]/div/input"));
			editName.clear();
			editName.sendKeys("Edit Report");
			
			WebElement submitBtn = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div[1]/form/div[1]/div[2]/div[2]/div/div/div[20]/div/input"));
			submitBtn.submit();
			driver.findElement(By.cssSelector("button.btn.green.btn-xs.btn-outline.dropdown-toggle")).click();
			WebElement vizpodView = driver
					.findElement(By.xpath("/html/body/ul/li[1]/a"));
			vizpodView.click();
			WebElement editVerify = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div[1]/form/div[1]/div[2]/div[2]/div/div/div[2]/div/input"));
			String text=editVerify.getAttribute("value");
			if(!text.equalsIgnoreCase("Edit Report")) {
				dataFromExcelSheet.updateResult(4,5, "Report Action Edit", "FAIL", totalTime);
	
			}else {
				dataFromExcelSheet.updateResult(4,5, "Report Action Edit", "PASS", totalTime);

			}
			
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(4,5, "Report Action Edit", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4,5, "Report Action Edit", "FAIL", totalTime);
		}
	}
	
	@AfterMethod
	public void AfterMethod() throws InterruptedException {
		Thread.sleep(3000);
		start = System.currentTimeMillis();
		WebElement actionBtn = driver
				.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div[1]/form/div[1]/div[1]/div[2]/a[5]/i"));
		Thread.sleep(1000);
		actionBtn.click();
		Thread.sleep(1000);
	}
}
