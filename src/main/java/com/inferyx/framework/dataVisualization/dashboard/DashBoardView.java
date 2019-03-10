package com.inferyx.framework.dataVisualization.dashboard;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.inferyx.framework.selenium.TestBase;

public class DashBoardView extends TestBase{
  
	@Test(priority =15, description = "Dashboard View")
	public void datshBoardView() throws IOException, InterruptedException {
		Thread.sleep(3000);
		//Dashboard View
		try {
			Thread.sleep(1000);			
			WebElement dashView=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[5]/div/div/div[2]/div/div[2]/div/a/div[2]"));
			dashView.click();
			start = System.currentTimeMillis();
			Thread.sleep(120000);
			driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[2]/div/div/div[2]"));
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(4,5, "Dashboard View", "PASS", totalTime, newFile);
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4,5, "Dashboard View", "FAIL", totalTime, newFile);
		}
	}
	
}
