package com.inferyx.framework.dataVisualization.dashboard;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.inferyx.framework.selenium.TestBase;

public class DashBoardIcon extends TestBase{
	
	@Test(priority =26, description = "Dashboard view")
	public void datshBoardView() throws IOException, InterruptedException {
		Thread.sleep(3000);
		//Dashboard View
		try {
			start = System.currentTimeMillis();
			Thread.sleep(1000);			
			WebElement dashView=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[5]/div/div/div[2]/div/div[2]/div/a/div[2]"));
			dashView.click();
			Thread.sleep(60000);			
			driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[2]/div/div/div[2]"));
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(4,5, "Dashboard View", "PASS", totalTime);
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4,5, "Dashboard View", "FAIL", totalTime);
		}
	}
	@Test(priority =27, description = "Dashboard Grid")
	public void datshBoardGrid() throws IOException, InterruptedException {
		Thread.sleep(3000);
		//Dashboard Grid
		try {
			Thread.sleep(1000);			
			WebElement datshBoardGrid=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[2]/div/div/div[2]/div[2]/div[1]/div[1]/div/div[1]/div[2]/a[2]/i"));
			datshBoardGrid.click();
			start = System.currentTimeMillis();
			Thread.sleep(15000);
			driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[2]/div/div/div[2]/div[2]/div[1]/div[1]/div/div[2]"));
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(4,5, "Dashboard Grid", "PASS", totalTime);
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4,5, "Dashboard Grid", "FAIL", totalTime);
		}
	}
	@Test(priority =28, description = "Dashboard Chart")
	public void datshBoardChart() throws IOException, InterruptedException {
		Thread.sleep(3000);
		//Dashboard Chart
		try {
			Thread.sleep(1000);			
			WebElement datshBoardChart=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[2]/div/div/div[2]/div[2]/div[1]/div[1]/div/div[1]/div[2]/a[1]/i"));
			datshBoardChart.click();
			start = System.currentTimeMillis();
			Thread.sleep(15000);
			driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[2]/div/div/div[2]/div[2]/div[1]/div[1]/div/div[2]"));
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(4,5, "Dashboard Chart", "PASS", totalTime);
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4,5, "Dashboard Chart", "FAIL", totalTime);
		}
	}
	@Test(priority =29, description = "Dashboard Download")
	public void datshBoardDownload() throws IOException, InterruptedException {
		Thread.sleep(3000);
		//Dashboard Chart
		try {
			Thread.sleep(1000);			
			WebElement datshBoardDownload=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[2]/div/div/div[2]/div[2]/div[1]/div[1]/div/div[1]/div[2]/a[4]/i"));
			datshBoardDownload.click();
			start = System.currentTimeMillis();
			Thread.sleep(1000);
			
			WebElement submitBtn=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/form/div[2]/button[2]"));
			submitBtn.click();
			Thread.sleep(1000);
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(4,5, "Dashboard Download", "PASS", totalTime);
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4,5, "Dashboard Download", "FAIL", totalTime);
		}
	}
  
	@Test(priority =30, description = "Dashboard Graph Maximize")
	public void datshBoardMaximize() throws IOException, InterruptedException {
		Thread.sleep(3000);
		//Dashboard Graph Maximize
		try {
			WebElement datshBoardMaximizeGraph = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[2]/div/div/div[2]/div[2]/div[1]/div[1]/div/div[1]/div[2]/a[5]/i"));
			datshBoardMaximizeGraph.click();
			Thread.sleep(5000);			

			start = System.currentTimeMillis();
			driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[2]/div/div/div[2]/div[2]/div[1]/div[1]/div"));
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(4,5, "Dashboard Graph Maximize", "PASS", totalTime);
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4,5, "Dashboard Graph Maximize", "FAIL", totalTime);
		}
	}
	@Test(priority =31, description = "Dashboard Graph Minimize")
	public void datshBoardMinimizeGraph() throws IOException, InterruptedException {
		Thread.sleep(3000);
		//Dashboard Graph Minimize
		try {
			WebElement datshBoardMaximize = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[2]/div/div/div[2]/div[2]/div[1]/div[1]/div/div[1]/div[2]/a[5]/i"));
			datshBoardMaximize.click();
			Thread.sleep(5000);			
			start = System.currentTimeMillis();
			driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[2]/div/div/div[2]/div[2]/div[1]/div[1]/div/div[2]"));
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(4,5, "Dashboard Graph Minimize", "PASS", totalTime);
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4,5, "Dashboard Graph Minimize", "FAIL", totalTime);
		}
	}
	@Test(priority =32, description = "Dashboard Refresh")
	public void datshBoardRefresh() throws IOException, InterruptedException {
		Thread.sleep(3000);
		//Dashboard Refresh
		try {
			WebElement datshBoardRefresh = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[2]/div/div/div[2]/div[2]/div[1]/div[1]/div/div[1]/div[2]/a[6]/i"));
			datshBoardRefresh.click();
			start = System.currentTimeMillis();
			Thread.sleep(15000);			
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(4,5, "Dashboard Refresh", "PASS", totalTime);
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4,5, "Dashboard Refresh", "FAIL", totalTime);
		}
	}
	
	@Test(priority =33, description = "Dashboard Vizpod Graph Edit")
	public void datshBoardEdit() throws IOException, InterruptedException {
		Thread.sleep(3000);
		//Dashboard Edit
		try {
			Thread.sleep(1000);
			WebElement datshBoardEdit = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[2]/div/div/div[2]/div[2]/div[1]/div[1]/div/div[1]/div[2]/a[3]/i"));
			datshBoardEdit.click();
			start = System.currentTimeMillis();
			Thread.sleep(3000);
			WebElement dashboardName=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div[2]/div/form/div/div[2]/div/input"));
			dashboardName.clear();
			dashboardName.sendKeys("check edit");
			Thread.sleep(1000);
			WebElement submitBtn=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div[2]/div/form/div/div[19]/div/input"));
			submitBtn.submit();
			Thread.sleep(60000);
			WebElement vizpodPage=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[3]/ul/li[2]/a/span[1]"));
			vizpodPage.click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("button.btn.green.btn-xs.btn-outline.dropdown-toggle")).click();
			Thread.sleep(1000);
			WebElement vizpodView = driver
					.findElement(By.xpath("/html/body/ul/li[1]/a"));
			vizpodView.click();
			
			WebElement editVerification=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div[2]/div/form/div/div[2]/div/input"));
			editVerification.click();
				
			String text=editVerification.getAttribute("value");
			System.out.println(text+"value of text");
			if(!text.equalsIgnoreCase("check edit")) {
				dataFromExcelSheet.updateResult(4,5, "Dashboard Vizpod Graph Edit", "FAIL", totalTime);
	
			}else {
				dataFromExcelSheet.updateResult(4,5, "Dashboard Vizpod Graph Edit", "PASS", totalTime);

			}
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(4,5, "Dashboard Vizpod Graph Edit", "PASS", totalTime);
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4,5, "Dashboard Vizpod Graph Edit", "FAIL", totalTime);
		}
	}
}
