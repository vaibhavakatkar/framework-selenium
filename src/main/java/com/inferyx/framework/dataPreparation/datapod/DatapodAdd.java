package com.inferyx.framework.dataPreparation.datapod;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inferyx.framework.pages.DatapodPage;
import com.inferyx.framework.selenium.TestBase;
import com.inferyx.framework.util.TestUtil;

public class DatapodAdd extends TestBase {
	DatapodPage datapodTest;

	public DatapodAdd() {
		datapodTest = new DatapodPage();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {
		Thread.sleep(3000);
		start = System.currentTimeMillis();
		WebElement datapodAddbutton = driver.findElement(
				By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[3]/div/div/div[1]/div[2]/a"));

		Thread.sleep(1000);
		datapodAddbutton.click();

		Thread.sleep(1000);
	}
	@DataProvider
	public Object[][] getDummyData() {
		Object data[][] = TestUtil.getTestData("datapod");
		return data;
	}

	@Test(priority = 3, dataProvider = "getDummyData", description = "Datapod  Add")
	public void validateAdd(String title, String firstName, String lastName, String company)
			throws IOException, InterruptedException {
		// Datapod
		try {
			// createNewDatapod("title", "ftName", " ltName", " comp");
			datapodTest.createNewDatapod(title, firstName, lastName, company);
			WebElement saveBtndriver = driver.findElement(By.xpath(
					"/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div[2]/div/form/div[13]/div/input"));
			saveBtndriver.click();
			start = System.currentTimeMillis();
			Thread.sleep(1000);
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(4, 5, "Datapod  Add", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4, 5, "Datapod  Add", "FAIL", totalTime);
		}
		Thread.sleep(3000);
	}

}