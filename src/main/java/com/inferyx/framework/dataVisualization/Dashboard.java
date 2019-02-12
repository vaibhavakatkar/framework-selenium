package com.inferyx.framework.dataVisualization;

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

public class Dashboard extends TestBase {
	
	DashboardPage dashboardPage;
	
	public Dashboard() {
		dashboardPage = new DashboardPage();
	}
	
	@Test(priority =2, description = "Dashboard")
	public void Dashboard() throws IOException, InterruptedException {
		Thread.sleep(1000);
		// Dashboard
		try {
			WebElement dashboard = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[3]/ul/li[1]/a/span[1]"));
			long start11 = System.currentTimeMillis();
			Thread.sleep(1000);
			dashboard.click();
			long finish11 = System.currentTimeMillis();
			totalTime = finish11 - start11; 
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
			long start11 = System.currentTimeMillis();
			Thread.sleep(1000);
			dashboardTile.click();
			long finish11 = System.currentTimeMillis();
			totalTime = finish11 - start11; 
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
			long start11 = System.currentTimeMillis();
			Thread.sleep(1000);
			datshBoardList.click();
			long finish11 = System.currentTimeMillis();
			totalTime = finish11 - start11; 
			dataFromExcelSheet.updateResult(4,5, "Dashboard List", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4,5, "Dashboard List", "FAIL", totalTime);
		}
	}
	
/*	@BeforeMethod
	public void setUp() throws InterruptedException {
		Thread.sleep(3000);
		start = System.currentTimeMillis();
		WebElement dashboardAdd =driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[5]/div/div/div[2]/div/div[1]/div/a/div[2]/div/i"));
		Thread.sleep(1000);
		dashboardAdd.click();

		Thread.sleep(1000);
	}*/
	
	@DataProvider
	public Object[][] getDummyData() {
		Object data[][] = TestUtil.getTestData("dashboard");
		return data;
	}
		
	@Test(priority =5, dataProvider = "getDummyData", description = "dashboardAdd")
	public void dashboardAdd(String dashboardName, String desc, String dependsOn, String name, String filter) throws IOException, InterruptedException {
		Thread.sleep(3000);
		
		WebElement dashboardAdd =driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[5]/div/div/div[2]/div/div[1]/div/a/div[2]/div/i"));
		dashboardAdd.click();
		dashboardPage.createDashboard(dashboardName, desc, dependsOn, name);
		
	
		
		
		
		
		// dashboardAdd
		try {
			/*WebElement dashboardAdd = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[5]/div/div/div[2]/div/div[1]/div/a"));
			long start11 = System.currentTimeMillis();
			Thread.sleep(1000);
			dashboardAdd.click();*/
			long finish11 = System.currentTimeMillis();
			//totalTime = finish11 - start11; 
			dataFromExcelSheet.updateResult(4,5, "DashboardAdd", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4,5, "DashboardAdd", "FAIL", totalTime);
		}
	}
}
