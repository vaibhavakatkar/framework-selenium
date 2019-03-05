package com.inferyx.framework.dataProfiling.rule;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.inferyx.framework.selenium.TestBase;

public class DataProfilingRuleActionView extends TestBase{
	@BeforeMethod
	public void setUp() throws InterruptedException {
		Thread.sleep(3000);
		start = System.currentTimeMillis();
		driver.findElement(By.cssSelector("button.btn.green.btn-xs.btn-outline.dropdown-toggle")).click();

		Thread.sleep(1000);
	}
	
	@Test(priority =10, description = "ruleView")
	public void ruleView() throws IOException, InterruptedException {
		Thread.sleep(3000);
		//ruleView
		try {
			WebElement ruleView = driver
					.findElement(By.xpath("/html/body/ul/li[1]/a"));
			start = System.currentTimeMillis();
			ruleView.click();
			Thread.sleep(1000);
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(7, 8, "Rule Action View", "PASS", totalTime, newFile);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(7, 8, "Rule Action View", "FAIL", totalTime, newFile);
		}
	}
	
	@AfterMethod
	public void AfterMethod() throws InterruptedException {
		Thread.sleep(3000);
		start = System.currentTimeMillis();
		WebElement ruleView = driver
				.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[1]/div/div[4]/div[1]/div[2]/a[5]/i"));
		Thread.sleep(1000);
		ruleView.click();
		Thread.sleep(1000);
	}
}
