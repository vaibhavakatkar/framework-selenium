package com.inferyx.framework.dataPreparation.datapod.listpage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.inferyx.framework.selenium.TestBase;

public class Datapod extends TestBase{
	@Test(priority =1, description = "Datapod")
	public void dataDatapod() throws IOException, InterruptedException {
		//Datapod click
		Thread.sleep(1000);try { start = System.currentTimeMillis();
			WebElement datapod = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[7]/ul/li[1]/a/span[1]"));
			
			Thread.sleep(1000);
			datapod.click();
		    finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(updateResult, "Datapod", "PASS", totalTime, newFile);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(updateResult, "Datapod", "FAIL", totalTime, newFile);
		}
		Thread.sleep(1000);
	}
}
