package com.inferyx.framework.dataProfiling.rule;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.inferyx.framework.selenium.TestBase;

public class DataProfilingRuleActionClone extends TestBase{
	@BeforeMethod
	public void setUp() throws InterruptedException {
		Thread.sleep(3000);
		start = System.currentTimeMillis();
		driver.findElement(By.cssSelector("button.btn.green.btn-xs.btn-outline.dropdown-toggle")).click();

		Thread.sleep(1000);
	}
	
	@Test(priority = 18, description = "Rule Clone  Action")
	public void ruleCloneAction() throws IOException, InterruptedException {
		try {
			WebElement actionClone = driver.findElement(By.xpath("/html/body/ul/li[7]/a"));
			actionClone.click();
			start = System.currentTimeMillis();
			Thread.sleep(1000);
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(7, 8, "Rule Action Clone", "PASS", totalTime, newFile);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(7, 8, "Rule Action Clone", "FAIL", totalTime, newFile);
		}
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void AfterMethod() throws InterruptedException {
		Thread.sleep(1000);
		start = System.currentTimeMillis();
		WebElement actionClone = driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[3]/div/div/div[9]/div/div/div[3]/button[2]"));
		actionClone.click();
		Thread.sleep(2000);
	}
}
