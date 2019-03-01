package com.inferyx.framework.dataProfiling.group;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.inferyx.framework.selenium.TestBase;

public class DataProfilingGroupActionViewIcon extends TestBase{
	@Test(priority = 12, description = "Group Action View")
	public void groupView() throws IOException, InterruptedException {
		try {
			driver.findElement(By.cssSelector("button.btn.green.btn-xs.btn-outline.dropdown-toggle")).click();
			Thread.sleep(1000);
			
			WebElement groupView = driver
					.findElement(By.xpath("/html/body/ul/li[1]/a"));
			start = System.currentTimeMillis();
			groupView.click();
			Thread.sleep(1000);
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(7, 8, "Group Action View", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(7, 8, "Group Action View", "FAIL", totalTime);
		}
		Thread.sleep(2000);
	}
	@Test(priority = 13, description = "Group Graph")
	public void groupGraph() throws IOException, InterruptedException {
		try {
			WebElement groupGraph = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[4]/div[1]/div[2]/a[3]/i"));
			start = System.currentTimeMillis();
			groupGraph.click();
			Thread.sleep(1000);
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(7, 8, "Group Graph", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(7, 8, "Group Graph", "FAIL", totalTime);
		}
		Thread.sleep(2000);
	}
	@Test(priority = 14, description = "Group Graph Refresh")
	public void groupRefresh() throws IOException, InterruptedException {
		try {
			WebElement groupGraphRefresh = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[5]/div[1]/div[2]/a[4]/i"));
			start = System.currentTimeMillis();
			groupGraphRefresh.click();
			Thread.sleep(1000);
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(7, 8, "Group Graph Refresh", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(7, 8, "Group Graph Refresh", "FAIL", totalTime);
		}
		Thread.sleep(2000);
	}
	
	@Test(priority = 15, description = "Group Home")
	public void ruleHome() throws IOException, InterruptedException {
		try {
			WebElement groupHome = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[5]/div[1]/div[2]/a[1]/i"));
			start = System.currentTimeMillis();
			groupHome.click();
			Thread.sleep(1000);
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(7, 8, "Group Home", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(7, 8, "Group Home", "FAIL", totalTime);
		}
		Thread.sleep(2000);
	}
	@Test(priority = 16, description = "Group Edit")
	public void ruleEdit() throws IOException, InterruptedException {
		try {	
			WebElement editGroup=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[4]/div[1]/div[2]/a[2]/i"));
			editGroup.click();
			Thread.sleep(1000);
			
			WebElement editName = driver.findElement(
					By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[4]/div[2]/form/div/div[1]/div[2]/div/input"));
			editName.clear();
			editName.sendKeys("Edit Group");
			Thread.sleep(2000);
			WebElement submit = driver.findElement(
					By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[4]/div[2]/form/div/div[2]/div/div/button"));
			submit.click();
			Thread.sleep(5000);
			driver.findElement(By.cssSelector("button.btn.green.btn-xs.btn-outline.dropdown-toggle")).click();
			Thread.sleep(1000);	
			WebElement groupView = driver
					.findElement(By.xpath("/html/body/ul/li[1]/a"));
			groupView.click();
			Thread.sleep(2000);
			WebElement groupNameVerify = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[4]/div[2]/form/div/div[1]/div[2]/div/input"));
			String text=groupNameVerify.getAttribute("value");
			if(!text.equalsIgnoreCase("Edit Group")) {
				dataFromExcelSheet.updateResult(7, 8, "Group Edit", "FAIL", totalTime);

			}else {
				dataFromExcelSheet.updateResult(7, 8, "Group Edit", "PASS", totalTime);
			}
			Thread.sleep(1000);
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(7, 8, "Group Edit", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(7, 8, "Group Edit", "FAIL", totalTime);
		}
		Thread.sleep(2000);
	}
	@Test(priority = 17, description = "Group Close")
	public void ruleClose() throws IOException, InterruptedException {
		try {
			WebElement ruleClose = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[4]/div[1]/div[2]/a[5]/i"));
			start = System.currentTimeMillis();
			ruleClose.click();
			Thread.sleep(1000);
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(7, 8, "Group Close", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(7, 8, "Group Close", "FAIL", totalTime);
		}
		Thread.sleep(2000);
	}
}
