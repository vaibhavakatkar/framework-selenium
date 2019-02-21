package com.inferyx.framework.dataVisualization.dashboard;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inferyx.framework.pages.DashboardPage;
import com.inferyx.framework.selenium.TestBase;
import com.inferyx.framework.util.TestUtil;

public class DashBoard extends TestBase {
	
	
	@Test(priority =2, description = "Dashboard")
	public void Dashboard() throws IOException, InterruptedException {
		Thread.sleep(1000);
		// Dashboard
		try {
			WebElement dashboard = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[3]/ul/li[1]/a/span[1]"));
			start = System.currentTimeMillis();
			Thread.sleep(1000);
			dashboard.click();
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(updateResult, "Dashboard", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(updateResult, "Dashboard", "FAIL", totalTime);
		}
	}
	
	@Test(priority =3, description = "datshBoardTile")
	public void datshBoardTile() throws IOException, InterruptedException {
		Thread.sleep(3000);
		// datshBoardTile
		try {
			WebElement dashboardTile = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div/span[2]"));
			start = System.currentTimeMillis();
			Thread.sleep(1000);
			dashboardTile.click();
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(4,5, "Dashboard Tile", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4,5, "Dashboard Tile", "FAIL", totalTime);
		}
	}
	@Test(priority =4, description = "datshBoardList")
	public void datshBoardList() throws IOException, InterruptedException {
		Thread.sleep(3000);
		// datshBoardTile
		try {
			WebElement datshBoardList = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div"));
			start = System.currentTimeMillis();
			datshBoardList.click();
			Thread.sleep(2000);
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(4,5, "Dashboard List", "PASS", totalTime);
			WebElement dashboardTile = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div/span[2]"));
			dashboardTile.click();
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4,5, "Dashboard List", "FAIL", totalTime);
		}
	}
	
	
}
