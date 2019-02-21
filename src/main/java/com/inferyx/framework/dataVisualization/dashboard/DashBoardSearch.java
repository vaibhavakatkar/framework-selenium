package com.inferyx.framework.dataVisualization.dashboard;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.inferyx.framework.selenium.TestBase;

public class DashBoardSearch extends TestBase{
	
	@Test(priority =15, description = "Dashboard Search")
	public void datshBoardSearch() throws IOException, InterruptedException {
		Thread.sleep(3000);
		// Search Dashboard
		try {
			WebElement datshBoardSearch = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[5]/div/div/div[1]/div[1]/div[1]/input"));
			start = System.currentTimeMillis();
			Thread.sleep(1000);
			datshBoardSearch.sendKeys("test add");
			
			WebElement dashName=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[5]/div/div/div[2]/div/div[2]/div/a/div[1]/span[1]"));
			String text=dashName.getText();
			if(!text.contains("test add")) {
				dataFromExcelSheet.updateResult(4,5, "Dashboard Search", "FAIL", totalTime);
			}else {
				dataFromExcelSheet.updateResult(4,5, "Dashboard Search", "PASS", totalTime);
			}
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(4,5, "Dashboard Search", "PASS", totalTime);
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4,5, "Dashboard Search", "FAIL", totalTime);
		}
	}
  
	
}
