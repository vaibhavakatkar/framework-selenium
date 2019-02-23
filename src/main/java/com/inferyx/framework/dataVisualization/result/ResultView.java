package com.inferyx.framework.dataVisualization.result;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.inferyx.framework.selenium.TestBase;

public class ResultView extends TestBase{
	@Test(priority =2, description = "Result View")
	public void Report() throws IOException, InterruptedException {
		Thread.sleep(1000);
		//Report
		try {
			driver.findElement(By.cssSelector("button.btn.green.btn-xs.btn-outline.dropdown-toggle")).click();

			WebElement resultView = driver
					.findElement(By.xpath("/html/body/ul/li[1]/a"));
			resultView.click();
			start = System.currentTimeMillis();
			driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[2]/div[2]/div[2]"));
			Thread.sleep(1000);
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(4,5, "Result View", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4,5, "Result View", "FAIL", totalTime);
		}
	}
	@Test(priority =3, description = "Result Download")
	public void ResultDownload() throws IOException, InterruptedException {
		Thread.sleep(1000);
		//Result Download
		try {

			WebElement resultDownload = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[2]/div[2]/div[1]/div[2]/a[2]/i"));
			resultDownload.click();
			start = System.currentTimeMillis();
			
			WebElement submit = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[2]/div[4]/div/div/form/div[2]/button[2]"));
			submit.submit();
			Thread.sleep(1000);
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(4,5, "Result Download", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4,5, "Result Download", "FAIL", totalTime);
		}
	}
	@Test(priority =4, description = "Result Graph")
	public void ResultGraph() throws IOException, InterruptedException {
		Thread.sleep(1000);
		//Result Graph
		try {

			WebElement resultGraph = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[2]/div[2]/div[1]/div[2]/a[3]/i"));
			resultGraph.click();
			start = System.currentTimeMillis();
			Thread.sleep(2000);
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(4,5, "Result Graph", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4,5, "Result Graph", "FAIL", totalTime);
		}
	}
	@Test(priority =5, description = "Result Home")
	public void ResultHome() throws IOException, InterruptedException {
		Thread.sleep(1000);
		//Result Home
		try {

			WebElement resultHome = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[2]/div[2]/div[1]/div[2]/a[1]/i"));
			resultHome.click();
			start = System.currentTimeMillis();
			Thread.sleep(2000);
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(4,5, "Result Home", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4,5, "Result Home", "FAIL", totalTime);
		}
	}
	@Test(priority =6, description = "Result Refresh")
	public void ResultRefresh() throws IOException, InterruptedException {
		Thread.sleep(1000);
		//Result Refresh
		try {

			WebElement resultRefresh = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[2]/div[2]/div[1]/div[2]/a[4]/i"));
			resultRefresh.click();
			Thread.sleep(2000);
			start = System.currentTimeMillis();
			Thread.sleep(2000);
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(4,5, "Result Refresh", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4,5, "Result Refresh", "FAIL", totalTime);
		}
	}
	@Test(priority =7, description = "Result Close")
	public void ResultClose() throws IOException, InterruptedException {
		Thread.sleep(1000);
		//Result Close
		try {
			WebElement resultClose = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[2]/div[2]/div[1]/div[2]/a[5]/i"));
			resultClose.click();
			Thread.sleep(1000);
			start = System.currentTimeMillis();
			Thread.sleep(2000);
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(4,5, "Result Close", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4,5, "Result Close", "FAIL", totalTime);
		}
	}
}
