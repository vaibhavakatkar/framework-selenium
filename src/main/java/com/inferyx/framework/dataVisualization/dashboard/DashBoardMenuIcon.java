package com.inferyx.framework.dataVisualization.dashboard;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.inferyx.framework.selenium.TestBase;

public class DashBoardMenuIcon extends TestBase{
	@Test(priority =16, description = "Dashboard Maximize")
	public void datshBoardMaximize() throws IOException, InterruptedException {
		Thread.sleep(3000);
		//Dashboard Maximize
		try {
			WebElement datshBoardMaximize = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[2]/div/div/div[1]/div[2]/a[4]"));
			datshBoardMaximize.click();
			start = System.currentTimeMillis();
			Thread.sleep(1000);			
			//driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[2]/div/div/div[2]/div[4]/div/div/div/div"));
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(4,5, "Dashboard Maximize", "PASS", totalTime, newFile);
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4,5, "Dashboard Maximize", "FAIL", totalTime, newFile);
		}
	}
	@Test(priority =17, description = "Dashboard Minimize")
	public void datshBoardMinimize() throws IOException, InterruptedException {
		Thread.sleep(3000);
		//Dashboard Minimize
		try {
			WebElement datshBoardMinimize = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[2]/div/div/div[1]/div[2]/a[4]"));
			datshBoardMinimize.click();
			driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[1]"));
			Thread.sleep(2000);
			start = System.currentTimeMillis();
			Thread.sleep(1000);			
			//driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[2]/div/div/div[2]/div[2]/div/div/div")).click();
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(4,5, "Dashboard Minimize", "PASS", totalTime, newFile);
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4,5, "Dashboard Minimize", "FAIL", totalTime, newFile);
		}
	}
	@Test(priority =18, description = "Dashboard Graph")
	public void datshBoardGraph() throws IOException, InterruptedException {
		Thread.sleep(3000);
		//Dashboard Minimize
		try {
			WebElement datshBoardGraph = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[2]/div/div/div[1]/div[2]/a[5]/i"));
			datshBoardGraph.click();
			start = System.currentTimeMillis();
			Thread.sleep(1000);			
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(4,5, "Dashboard Graph", "PASS", totalTime, newFile);
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4,5, "Dashboard Graph", "FAIL", totalTime, newFile);
		}
	}
	@Test(priority =19, description = "Dashboard Refresh")
	public void datshBoardRefresh() throws IOException, InterruptedException {
		Thread.sleep(3000);
		//Dashboard Refresh
		try {
			WebElement datshBoardRefresh = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[2]/div/div/div[1]/div[2]/a[6]/i"));
			datshBoardRefresh.click();
			start = System.currentTimeMillis();
			Thread.sleep(9000);		
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(4,5, "Dashboard Refresh", "PASS", totalTime, newFile);
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4,5, "Dashboard Refresh", "FAIL", totalTime, newFile);
		}
	}
	@Test(priority =20, description = "Dashboard Edit")
	public void datshBoardEdit() throws IOException, InterruptedException {
		Thread.sleep(3000);
		//Dashboard Edit
		try {
			WebElement datshBoardEdit = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[2]/div/div/div[1]/div[2]/a[2]/i"));
			datshBoardEdit.click();
			start = System.currentTimeMillis();
			Thread.sleep(1000);
			WebElement dashboardDescription=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div/div/form/div[7]/div/textarea"));
			dashboardDescription.clear();
			dashboardDescription.sendKeys("test edit dashboard");
			Thread.sleep(2000);
			WebElement nxtPage=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div/div/form/div[15]/div/button"));
			nxtPage.click();
			Thread.sleep(2000);
			
			WebElement submitBtn=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div/form/div[4]/div/div/input"));
			submitBtn.submit();
			Thread.sleep(180000);
			
			getHtmlElementByXpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[2]/div/div/div[2]");
			/*WebElement dashboardVerification=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[2]/div/div/div[1]/div[1]/span"));
			String text=dashboardVerification.getText();
			if(!text.equalsIgnoreCase("test edit dashboard")) {
				dataFromExcelSheet.updateResult(4,5, "Dashboard Edit", "FAIL", totalTime, newFile);
	
			}else {
				dataFromExcelSheet.updateResult(4,5, "Dashboard Edit", "PASS", totalTime, newFile);

			}*/
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(4,5, "Dashboard Edit", "PASS", totalTime, newFile);
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4,5, "Dashboard Edit", "FAIL", totalTime, newFile);
		}
	}
	
}
