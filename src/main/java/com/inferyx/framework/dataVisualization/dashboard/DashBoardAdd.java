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

public class DashBoardAdd extends TestBase{
  
DashboardPage dashboardPage;
	
	public DashBoardAdd() {
		dashboardPage = new DashboardPage();
	}
	
	@DataProvider
	public Object[][] getDummyData() {
		Object data[][] = TestUtil.getTestData("dashboard");
		return data;
	}
	
	@Test(priority =13, dataProvider = "getDummyData", description = "dashboardAdd")
	public void datshBoardAdd(String dashboardName, String desc, String dependsOn, String name) throws IOException, InterruptedException {
		Thread.sleep(3000);
		
		WebElement dashboardAdd =driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[5]/div/div/div[1]/div[2]/a"));
		dashboardAdd.click();
		start = System.currentTimeMillis();
		dashboardPage.createDashboard(dashboardName, desc, dependsOn, name);
		
		try {
			WebElement submitBtn= driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div/form/div[4]/div/div/input"));
			submitBtn.submit();
			Thread.sleep(1000);
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(4,5, "Dashboard Add", "PASS", totalTime, newFile);
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4,5, "Dashboard Add", "FAIL", totalTime, newFile);
		}
	}

}
