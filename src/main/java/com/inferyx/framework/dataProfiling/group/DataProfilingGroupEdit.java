package com.inferyx.framework.dataProfiling.group;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.inferyx.framework.selenium.TestBase;

public class DataProfilingGroupEdit extends TestBase{
	@BeforeMethod
	public void setUp() throws InterruptedException {
		Thread.sleep(3000);
		start = System.currentTimeMillis();
		driver.findElement(By.cssSelector("button.btn.green.btn-xs.btn-outline.dropdown-toggle")).click();

		Thread.sleep(1000);
	}
	@Test(priority =3, description = "groupEdit")
	public void groupEdit() throws IOException, InterruptedException {
		Thread.sleep(3000);
		//groupEdit
		try {
			WebElement groupEdit = driver
					.findElement(By.xpath("/html/body/ul/li[2]/a"));
			start = System.currentTimeMillis();
			groupEdit.click();
			Thread.sleep(1000);
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(7, 8, "Group Action Edit", "PASS", totalTime, newFile);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(7, 8, "Group Action Edit", "FAIL", totalTime, newFile);
		}
	}
	
	@AfterMethod
	public void AfterMethod() throws InterruptedException {
		Thread.sleep(3000);
		start = System.currentTimeMillis();
		WebElement groupEdit = driver
				.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[4]/div[1]/div[2]/a[5]/i"));
		Thread.sleep(1000);
		groupEdit.click();
		Thread.sleep(1000);
	}
}
