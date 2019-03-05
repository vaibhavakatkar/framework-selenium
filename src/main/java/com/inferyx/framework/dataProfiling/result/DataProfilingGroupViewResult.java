package com.inferyx.framework.dataProfiling.result;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.inferyx.framework.selenium.TestBase;

public class DataProfilingGroupViewResult extends TestBase{
	@Test(priority =9 , description = "Data Profile Group View")
	public void dataProfileGroupView() throws IOException, InterruptedException {
		// Data Profiling Group View
		Thread.sleep(8000);
		try {
			WebElement groupType=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[3]/div/search-criteria/div/div[2]/form/div[1]/div/div/div/div/label[2]/input"));
			groupType.click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("button.btn.green.btn-xs.btn-outline.dropdown-toggle")).click();
			WebElement groupView = driver
					.findElement(By.xpath("/html/body/ul/li[1]/a"));
			Thread.sleep(1000);
			groupView.click();
			start = System.currentTimeMillis();
			driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[4]/div[2]/div[3]/div[3]/svg/g/g[17]/path[4]"));
			Thread.sleep(30000);
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(7,8, "Data Profile Rule Group View", "PASS", totalTime, newFile);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			dataFromExcelSheet.updateResult(7,8, "Data Profile Rule Group View", "FAIL", totalTime, newFile);
		}
	}
	/*@Test(priority =10 , description = "Data Profile Result Show Details")
	public void dataProfileAutoRefresh() throws IOException, InterruptedException {
		//Data Profile Result Show Details
		Thread.sleep(8000);
		try {
			
			// Right click the button to launch right click menu options
			Actions action = new Actions(driver);

			WebElement link = driver.findElement(By.className("rotatable"));
			System.out.println("hi");
			action.contextClick(link).perform();
			System.out.println("hi");

			
			// Click on Edit link on the displayed menu options
			WebElement element = driver.findElement(By.cssSelector(".context-menu-icon-copy"));
			element.click();
			
			start = System.currentTimeMillis();
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[4]/div[2]/div[3]/div[3]/svg/g/g[17]/path[4]"));
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(7,8, "Data Profile Result Show Details", "PASS", totalTime);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			dataFromExcelSheet.updateResult(7,8, "Data Profile Result Show Details", "FAIL", totalTime);
		}
	}*/
	@Test(priority =10 , description = "Data Profile Group View")
	public void dataProfileGroupGraph() throws IOException, InterruptedException {
		// Data Profiling Group Graph
		Thread.sleep(8000);
		try {
			WebElement groupGraph=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[4]/div[1]/div[2]/a[3]/i"));
			groupGraph.click();
			Thread.sleep(1000);
			start = System.currentTimeMillis();
			Thread.sleep(2000);
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(7,8, "Data Profile Rule Group Graph", "PASS", totalTime, newFile);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			dataFromExcelSheet.updateResult(7,8, "Data Profile Rule Group Graph", "FAIL", totalTime, newFile);
		}
	}
	@Test(priority =11 , description = "Data Profile Group Refresh")
	public void dataProfileGroupRefresh() throws IOException, InterruptedException {
		// Data Profiling Group Refresh
		Thread.sleep(8000);
		try {
			WebElement groupRefresh=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[4]/div[1]/div[2]/a[4]/i"));
			groupRefresh.click();
			Thread.sleep(1000);
			start = System.currentTimeMillis();
			Thread.sleep(2000);
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(7,8, "Data Profile Rule Group Refresh", "PASS", totalTime, newFile);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			dataFromExcelSheet.updateResult(7,8, "Data Profile Rule Group Refresh", "FAIL", totalTime, newFile);
		}
	}
	@Test(priority =12 , description = "Data Profile Group Home")
	public void dataProfileGroupHome() throws IOException, InterruptedException {
		// Data Profiling Group Home
		Thread.sleep(8000);
		try {
			WebElement groupHome=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[4]/div[1]/div[2]/a[1]/i"));
			groupHome.click();
			Thread.sleep(1000);
			start = System.currentTimeMillis();
			Thread.sleep(2000);
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(7,8, "Data Profile Rule Group Home", "PASS", totalTime, newFile);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			dataFromExcelSheet.updateResult(7,8, "Data Profile Rule Group Home", "FAIL", totalTime, newFile);
		}
	}
	@Test(priority =13 , description = "Data Profile Group Close")
	public void dataProfileGroupClose() throws IOException, InterruptedException {
		// Data Profiling Group Home
		Thread.sleep(8000);
		try {
			WebElement groupClose=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[4]/div[1]/div[2]/a[6]/i"));
			groupClose.click();
			Thread.sleep(1000);
			start = System.currentTimeMillis();
			Thread.sleep(2000);
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(7,8, "Data Profile Rule Group Close", "PASS", totalTime, newFile);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			dataFromExcelSheet.updateResult(7,8, "Data Profile Rule Group Close", "FAIL", totalTime, newFile);
		}
	}
}
