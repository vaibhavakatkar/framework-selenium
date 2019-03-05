package com.inferyx.framework.dataProfiling.result;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.inferyx.framework.selenium.TestBase;

public class DataProfilingRuleViewResult extends TestBase{
	
	@Test(priority =2 , description = "Data Profile Auto Refresh")
	public void dataProfileAutoRefresh() throws IOException, InterruptedException {
		// Data Profiling Auto Refresh
		Thread.sleep(8000);
		try {
			WebElement autoResfresh = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[3]/div/div/div[13]/div[1]/div[1]/div/input[1]"));
			Thread.sleep(1000);
			autoResfresh.click();
			start = System.currentTimeMillis();
			Thread.sleep(30000);
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(7,8, "Data Profile Rule Auto Refresh", "PASS", totalTime, newFile);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			dataFromExcelSheet.updateResult(7,8, "Data Profile Rule Auto Refresh", "FAIL", totalTime, newFile);
		}
	}
	@Test(priority =3 , description = "Data Profile View Result")
	public void dataProfileResultView() throws IOException, InterruptedException {
		// Data Profiling Result View
		Thread.sleep(8000);
		try {
			driver.findElement(By.cssSelector("button.btn.green.btn-xs.btn-outline.dropdown-toggle")).click();
			WebElement ruleView = driver
					.findElement(By.xpath("/html/body/ul/li[1]/a"));
			ruleView.click();
			Thread.sleep(30000);
			start = System.currentTimeMillis();
			Thread.sleep(10000);
			driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[5]/div[2]/div/div[3]/div/div[1]/div[3]/div[1]/div/div[2]/div[2]/div/div[2]/div/div[1]/div/div"));
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(7,8, "Data Profile Rule Result View", "PASS", totalTime, newFile);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			dataFromExcelSheet.updateResult(7,8, "Data Profile Rule Result View", "FAIL", totalTime, newFile);
		}
	}
	@Test(priority =4 , description = "Data Profile Download")
	public void dataProfileResultDownload() throws IOException, InterruptedException {
		// Data Profiling Result Download
		Thread.sleep(8000);
		try {
			WebElement download = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[5]/div[1]/div[2]/a[2]/i"));
			download.click();
			start = System.currentTimeMillis();
			Thread.sleep(1000);
			WebElement submit = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[7]/div/div/form/div[2]/button[2]"));
			submit.click();
			Thread.sleep(1000);
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(7,8, "Data Profile Rule Result Download", "PASS", totalTime, newFile);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			dataFromExcelSheet.updateResult(7,8, "Data Profile Rule Result Download", "FAIL", totalTime, newFile);
		}
	}
	@Test(priority =5 , description = "Data Profile Graph")
	public void dataProfileGraph() throws IOException, InterruptedException {
		// Data Profiling Graph
		Thread.sleep(8000);
		try {
			WebElement graph = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[5]/div[1]/div[2]/a[3]/i"));
			graph.click();
			start = System.currentTimeMillis();
			Thread.sleep(1000);
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(7,8, "Data Profile Rule Graph", "PASS", totalTime, newFile);
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			dataFromExcelSheet.updateResult(7,8, "Data Profile Rule Graph", "FAIL", totalTime, newFile);
		}
	}
	@Test(priority =6 , description = "Data Profile Refresh")
	public void dataProfileRefresh() throws IOException, InterruptedException {
		// Data Profiling Refresh
		Thread.sleep(8000);
		try {
			WebElement refresh = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[5]/div[1]/div[2]/a[4]/i"));
			refresh.click();
			Thread.sleep(3000);
			start = System.currentTimeMillis();
			Thread.sleep(1000);
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(7,8, "Data Profile Rule Refresh", "PASS", totalTime, newFile);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			dataFromExcelSheet.updateResult(7,8, "Data Profile Rule Refresh", "FAIL", totalTime, newFile);
		}
	}
	@Test(priority =7 , description = "Data Profile Home")
	public void dataProfileHome() throws IOException, InterruptedException {
		// Data Profiling Home
		Thread.sleep(8000);
		try {
			WebElement home = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[5]/div[1]/div[2]/a[1]/i"));
			home.click();
			start = System.currentTimeMillis();
			Thread.sleep(10000);
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(7,8, "Data Profile Rule Home", "PASS", totalTime, newFile);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			dataFromExcelSheet.updateResult(7,8, "Data Profile Rule Home", "FAIL", totalTime, newFile);
		}
	}
	@Test(priority =8 , description = "Data Profile Close")
	public void dataProfileClose() throws IOException, InterruptedException {
		// Data Profiling Close
		Thread.sleep(8000);
		try {
			WebElement close = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[5]/div[1]/div[2]/a[6]/i"));
			close.click();
			start = System.currentTimeMillis();
			Thread.sleep(1000);
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(7,8, "Data Profile Rule Close", "PASS", totalTime, newFile);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			dataFromExcelSheet.updateResult(7,8, "Data Profile Rule Close", "FAIL", totalTime, newFile);
		}
	}
}
