package com.inferyx.framework.dataProfiling.rule;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inferyx.framework.pages.DataProfilingRulePage;
import com.inferyx.framework.selenium.TestBase;
import com.inferyx.framework.util.TestUtil;

public class DataProfilingRuleAdd extends TestBase{
  
	DataProfilingRulePage dataProfilingRulePage;
	
	public DataProfilingRuleAdd() {
		dataProfilingRulePage = new DataProfilingRulePage();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {
		Thread.sleep(3000);
		start = System.currentTimeMillis();
		WebElement ruleAddbutton = driver.findElement(
				By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[3]/div/div/div[1]/div[2]/a"));
		Thread.sleep(1000);
		ruleAddbutton.click();

		Thread.sleep(1000);
	}
	@DataProvider
	public Object[][] getDummyData() {
		Object data[][] = TestUtil.getTestData("dataProfileRule");
		return data;
	}
	@Test(priority = 9, dataProvider = "getDummyData", description = "Rule  Add")
	public void validateAdd(String name, String desc, String source)
			throws IOException, InterruptedException {
		// Rule
		try {
			dataProfilingRulePage.addNewRule(name, desc, source);
			WebElement submitBtn = driver.findElement(By.xpath(
					"/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[1]/div/div[4]/div[2]/div/div/div[2]/div[3]/form/div[2]/div/button"));
			submitBtn.click();
			start = System.currentTimeMillis();
			Thread.sleep(1000);
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(7, 8, "Rule Add", "PASS", totalTime, newFile);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(7, 8, "Rule Add", "FAIL", totalTime, newFile);
		}
		Thread.sleep(3000);
	}
}
