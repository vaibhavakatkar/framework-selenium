package com.inferyx.framework.dataVisualization.vizpod;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inferyx.framework.pages.VizpodPage;
import com.inferyx.framework.selenium.TestBase;
import com.inferyx.framework.util.TestUtil;

public class VizpodAdd extends TestBase{
	
	VizpodPage vizpodPage;
	
	public VizpodAdd() {

		vizpodPage = new VizpodPage();
	}
	
	@DataProvider
	public Object[][] getDummyData() {
		Object data[][] = TestUtil.getTestData("vizpod");
		return data;
	}
	
	@Test(priority =1,dataProvider = "getDummyData", description = "vizpodAdd")
	public void vizpodAdd(String name, String desc, String source, String datapodName) throws IOException, InterruptedException {
		Thread.sleep(5000);
		//vizpodAdd
		WebElement vizpodAdd = driver
				.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[3]/div/div/div[1]/div[2]/a"));
		start = System.currentTimeMillis();
		vizpodAdd.click();
		vizpodPage.createVizpod(name, desc, source, datapodName);
			
			try {
				WebElement submitBtn= driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div[2]/div/form/div/div[20]/div/input"));
				submitBtn.click();
				Thread.sleep(1000);
				finish = System.currentTimeMillis();
				totalTime = finish - start; 
				dataFromExcelSheet.updateResult(4,5, "Vizpod Add", "PASS", totalTime, newFile);
			} catch (NoSuchElementException e) {
				dataFromExcelSheet.updateResult(4,5, "Vizpod Add", "FAIL", totalTime, newFile);
			}
			
		}		
	}
	

