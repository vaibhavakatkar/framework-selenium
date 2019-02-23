package com.inferyx.framework.dataProfiling.group;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inferyx.framework.pages.DataProfilingGroup;
import com.inferyx.framework.selenium.TestBase;
import com.inferyx.framework.util.TestUtil;

public class DataProfilingGroupAdd extends TestBase{
	
	DataProfilingGroup dataProfilingGroup;
	
	public DataProfilingGroupAdd() {
		dataProfilingGroup = new DataProfilingGroup();
	}
  
	@DataProvider
	public Object[][] getDummyData() {
		Object data[][] = TestUtil.getTestData("dataProfilingGroup");
		return data;
	}
	
	@Test(priority =8,dataProvider = "getDummyData", description = "dataProfilingGroup Add")
	public void vizpodAdd(String name, String desc) throws IOException, InterruptedException {
		Thread.sleep(5000);
		//groupAdd
		WebElement groupAdd = driver
				.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[3]/div/div/div[1]/div[2]/a"));
		start = System.currentTimeMillis();
		groupAdd.click();
		dataProfilingGroup.createGroup(name, desc);
			
			try {
				WebElement submitBtn= driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[4]/div[2]/form/div/div[2]/div/div/button"));
				submitBtn.click();
				Thread.sleep(1000);
				finish = System.currentTimeMillis();
				totalTime = finish - start; 
				dataFromExcelSheet.updateResult(4,5, "Group Add", "PASS", totalTime);
			} catch (NoSuchElementException e) {
				dataFromExcelSheet.updateResult(4,5, "Group Add", "FAIL", totalTime);
			}
			
		}		
}
