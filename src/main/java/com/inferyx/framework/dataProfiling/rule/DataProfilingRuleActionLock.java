package com.inferyx.framework.dataProfiling.rule;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.inferyx.framework.selenium.TestBase;

public class DataProfilingRuleActionLock extends TestBase{
	@BeforeMethod
	public void setUp() throws InterruptedException {
		Thread.sleep(3000);
		start = System.currentTimeMillis();
		driver.findElement(By.cssSelector("button.btn.green.btn-xs.btn-outline.dropdown-toggle")).click();

		Thread.sleep(1000);
	}
	
	@Test(priority =14, description = "Rule Lock Action")
	public void ruleLockAction() throws IOException, InterruptedException {
		try {
			WebElement actionLock = driver.findElement(By.xpath("/html/body/ul/li[4]/a"));
			actionLock.click();
			start = System.currentTimeMillis();
			Thread.sleep(1000);
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(7, 8, "Rule Action Lock", "PASS", totalTime, newFile);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(7, 8, "Rule Action Lock", "FAIL", totalTime, newFile);
		}
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void AfterMethod() throws InterruptedException {
		Thread.sleep(3000);
		start = System.currentTimeMillis();
		WebElement actionLock = driver.findElement(By.xpath("//*[@id='lockedConfModal']/div/div/div[3]/button[2]"));

		actionLock.click();
	}
}
