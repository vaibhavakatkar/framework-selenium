package com.inferyx.framework.dataPreparation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.inferyx.framework.selenium.ReadDataFromExcelSheet;
import com.inferyx.framework.selenium.TestBase;

public class DataPreaparation extends TestBase {

	ReadDataFromExcelSheet dataFromExcelSheet = new ReadDataFromExcelSheet();

	@Test(priority = 1, description = "Data Preparation ")
	public void dataPreparationList() throws IOException, InterruptedException {
		try {
			//click on datapreparation
			WebElement dataPreparation = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[7]/a/span[1]"));
			 start = System.currentTimeMillis();
			Thread.sleep(1000); 
			dataPreparation.click();
			 finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(updateResult, "Data Preparation", "PASS", totalTime, newFile);
			System.out.println(driver.getTitle() + dataPreparation.getText());
			Thread.sleep(1000);
		
		} catch (InterruptedException e) {
			dataFromExcelSheet.updateResult(updateResult, "Data Preparation", "FAIL", totalTime, newFile);
		}
	}
}