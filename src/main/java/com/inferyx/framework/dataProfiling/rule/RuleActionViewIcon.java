package com.inferyx.framework.dataProfiling.rule;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.inferyx.framework.selenium.TestBase;

public class RuleActionViewIcon extends TestBase{
  
	@Test(priority = 21, description = "Rule Action View")
	public void ruleView() throws IOException, InterruptedException {
		try {
			driver.findElement(By.cssSelector("button.btn.green.btn-xs.btn-outline.dropdown-toggle")).click();
			Thread.sleep(1000);
			
			WebElement ruleView = driver
					.findElement(By.xpath("/html/body/ul/li[1]/a"));
			start = System.currentTimeMillis();
			ruleView.click();
			Thread.sleep(1000);
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(7, 8, "Rule Action View", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(7, 8, "Rule Action View", "FAIL", totalTime);
		}
		Thread.sleep(2000);
	}
	@Test(priority = 22, description = "Rule Graph")
	public void ruleGraph() throws IOException, InterruptedException {
		try {
			WebElement ruleGraph = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[1]/div/div[4]/div[1]/div[2]/a[3]/i"));
			start = System.currentTimeMillis();
			ruleGraph.click();
			Thread.sleep(1000);
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(7, 8, "Rule Graph", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(7, 8, "Rule Graph", "FAIL", totalTime);
		}
		Thread.sleep(2000);
	}
	@Test(priority = 23, description = "Rule Graph Refresh")
	public void ruleRefresh() throws IOException, InterruptedException {
		try {
			WebElement ruleGraphRefresh = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[1]/div/div[4]/div[1]/div[2]/a[4]/i"));
			start = System.currentTimeMillis();
			ruleGraphRefresh.click();
			Thread.sleep(1000);
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(7, 8, "Rule Graph Refresh", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(7, 8, "Rule Graph Refresh", "FAIL", totalTime);
		}
		Thread.sleep(2000);
	}
	@Test(priority = 24, description = "Rule Home")
	public void ruleHome() throws IOException, InterruptedException {
		try {
			WebElement ruleHome = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[1]/div/div[4]/div[1]/div[2]/a[1]/i"));
			start = System.currentTimeMillis();
			ruleHome.click();
			Thread.sleep(1000);
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(7, 8, "Rule Home", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(7, 8, "Rule Home", "FAIL", totalTime);
		}
		Thread.sleep(2000);
	}
	@Test(priority = 25, description = "Rule Edit")
	public void ruleEdit() throws IOException, InterruptedException {
		try {	
			WebElement editRule=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[1]/div/div[4]/div[1]/div[2]/a[2]/i"));
			editRule.click();
			Thread.sleep(1000);
			
			WebElement editName = driver.findElement(
					By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[1]/div/div[4]/div[2]/div/div/div[2]/div[1]/form/div/div/div[2]/div/input"));
			editName.clear();
			editName.sendKeys("Edit Rule");
			
			WebElement nextFirstPage = driver.findElement(
					By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[1]/div/div[4]/div[2]/div/div/div[2]/div[1]/form/div/div/div[12]/div/button"));
			nextFirstPage.click();
			WebElement nextSecondPage = driver.findElement(
					By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[1]/div/div[4]/div[2]/div/div/div[2]/div[2]/form/div[4]/div/button"));
			nextSecondPage.click();
			
			WebElement submit = driver.findElement(
					By.xpath("//*[@id=\"submit_form3\"]/div[2]/div/button"));
			submit.click();
			driver.findElement(By.cssSelector("button.btn.green.btn-xs.btn-outline.dropdown-toggle")).click();
			Thread.sleep(1000);	
			WebElement ruleView = driver
					.findElement(By.xpath("/html/body/ul/li[1]/a"));
			ruleView.click();
			WebElement ruleNameVerify = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[1]/div/div[4]/div[2]/div/div/div[2]/div[1]/form/div/div/div[2]/div/input"));
			String text=ruleNameVerify.getAttribute("value");
			if(!text.equalsIgnoreCase("Edit Rule")) {
				dataFromExcelSheet.updateResult(7, 8, "Rule Edit", "FAIL", totalTime);

			}else {
				dataFromExcelSheet.updateResult(7, 8, "Rule Edit", "PASS", totalTime);
			}
			Thread.sleep(1000);
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(7, 8, "Rule Edit", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(7, 8, "Rule Edit", "FAIL", totalTime);
		}
		Thread.sleep(2000);
	}
	@Test(priority = 26, description = "Rule Close")
	public void ruleClose() throws IOException, InterruptedException {
		try {
			WebElement ruleClose = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[1]/div/div[4]/div[1]/div[2]/a[5]"));
			start = System.currentTimeMillis();
			ruleClose.click();
			Thread.sleep(1000);
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(7, 8, "Rule Close", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(7, 8, "Rule Close", "FAIL", totalTime);
		}
		Thread.sleep(2000);
	}
}
