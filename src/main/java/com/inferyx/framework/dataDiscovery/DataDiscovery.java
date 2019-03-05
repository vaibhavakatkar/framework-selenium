package com.inferyx.framework.dataDiscovery;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

import com.inferyx.framework.selenium.TestBase;


public class DataDiscovery extends TestBase {
	@Test(priority = 1, description = "Data Discovery")
	public void dataDiscoveryList() throws IOException, InterruptedException {
		// DataDiscovery
		try {
			WebElement dataDiscovery = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[2]/a/span[1]"));
			start = System.currentTimeMillis();
			Thread.sleep(1000);
			dataDiscovery.click();
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(updateResult, "Data Discovery", "PASS", totalTime);
			System.out.println(driver.getTitle() + dataDiscovery.getText());

		} catch (InterruptedException e) {
			dataFromExcelSheet.updateResult(updateResult, "Data Discovery", "FAIL", totalTime);
		}
	}
	@Test(priority = 2, description = "Data Discovery Card")
	public void dataDiscoveryCard() throws IOException, InterruptedException {
		// DataDiscovery
		try {
			WebElement dataDiscoveryCard = driver.findElement(By.xpath(
					"/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[2]/div/div/div[2]/div[1]/div[1]/div/a/div/div[1]"));
			start = System.currentTimeMillis();
			Thread.sleep(3000);
			dataDiscoveryCard.click();
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(4, 5, "Data Discovery Card", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4, 5, "Data Discovery Card", "FAIL", totalTime);
		}
	}
	
	@Test(priority = 3, description = "Datapod Meta Compare")
	public void dataDiscoveryCardMetaComp() throws IOException, InterruptedException {
		// datapodMetaComp
		try {
			Thread.sleep(2000);
			WebElement datapodMetaComp = driver.findElement(
					By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[1]/div[2]/a[3]/i"));
			start = System.currentTimeMillis();
			Thread.sleep(1000);
			datapodMetaComp.click();
			Thread.sleep(60000);
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			WebElement datapodCompverification = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div[1]/div/div[7]/div/div"));
			String text=datapodCompverification.getText();		
			System.out.println(text);
			if(!text.contains("No Change")) {
				dataFromExcelSheet.updateResult(4, 5, "Datapod Meta Compare", "FAIL", totalTime);
			}else {
			dataFromExcelSheet.updateResult(4, 5, "Datapod Meta Compare", "PASS", totalTime);
			}

		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4, 5, "DatapodMetaComp", "FAIL", totalTime);
		}
	}
	@Test(priority = 4, description = "Datapod Sample Record")
	public void datapodSampleRecord() throws IOException, InterruptedException {
		// datapodSampleRecord
		try {
			WebElement datapodSampleRecord = driver.findElement(
					By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[1]/div[2]/a[4]"));
			start = System.currentTimeMillis();
			Thread.sleep(2000);
			datapodSampleRecord.click();
			Thread.sleep(15000);
			WebElement histogram = driver.findElement(
					By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div[1]/div[2]/div[2]/div/div[2]/div[1]/div/div/div/div/div/div[1]/div[1]/div[1]/div[3]/a/i"));
			histogram.click();
			Thread.sleep(3000);
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(4, 5, "Datapod Sample Record", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4, 5, "Datapod Sample Record", "FAIL", totalTime);
		}
	}
	@Test(priority = 5, description = "Histogram Grid")
	public void histogramGrid() throws IOException, InterruptedException {
		// histogramGrid
		try {
			WebElement histogramGrid = driver.findElement(
					By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[7]/div/div/form/div[1]/div/div/div[1]/a/i"));
			start = System.currentTimeMillis();
			Thread.sleep(1000);
			histogramGrid.click();
			Thread.sleep(3000);
			WebElement histogramGridVerify = driver.findElement(
					By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[7]/div/div/form/div[1]/div/div/div[2]"));
			String text=histogramGridVerify.getText();
			if(!text.contains("Bucket")) {
				dataFromExcelSheet.updateResult(4, 5, "Histogram Grid", "FAIL", totalTime);
			}else {
			dataFromExcelSheet.updateResult(4, 5, "HistogramGrid", "PASS", totalTime);
			}
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(4, 5, "Histogram Grid", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4, 5, "Histogram Grid", "FAIL", totalTime);
		}
	}
	
	@Test(priority = 6, description = "Histogram Chart")
	public void histogramChart() throws IOException, InterruptedException {
		// histogramChart
		try {
			WebElement histogramChart = driver.findElement(
					By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[7]/div/div/form/div[1]/div/div/div[1]/a/i"));
			start = System.currentTimeMillis();
			Thread.sleep(1000);
			histogramChart.click();
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[7]/div/div/form/div[1]/div/div/div[2]"));
			WebElement histogramClose = driver.findElement(
					By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[7]/div/div/form/div[2]/button"));
			histogramClose.click();
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(4, 5, "Histogram Chart", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4, 5, "Histogram Chart", "FAIL", totalTime);
		}
	}
	@Test(priority = 7, description = "Datapod Download")
	public void downloadSample() throws IOException, InterruptedException {
		// datapodDownload
		try {
			WebElement datapodDownload = driver.findElement(
					By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[1]/div[2]/a[6]/i"));
			start = System.currentTimeMillis();
			datapodDownload.click();
			Thread.sleep(2000);
			WebElement submit = driver.findElement(
					By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[5]/div/div/form/div[2]/button[2]"));
			submit.submit();
			Thread.sleep(1000);
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(4, 5, "Datapod Download", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4, 5, "Datapod Download", "FAIL", totalTime);
		}
	}
	@Test(priority = 8, description = "Datapod Data Store")
	public void dataStore() throws IOException, InterruptedException {
		// datapodDataStore
		try {
			Thread.sleep(1000);
			WebElement datapodDataStore = driver.findElement(
					By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[1]/div[2]/a[5]/i"));
			start = System.currentTimeMillis();
			Thread.sleep(1000);
			datapodDataStore.click();
			driver.findElement(
					By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div[1]/div[2]/div[1]"));
			Thread.sleep(15000);
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(4, 5, "Datapod Data Store", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4, 5, "Datapod Data Store", "FAIL", totalTime);
		}
	}
	@Test(priority = 9, description = "Data Store Result")
	public void dataStoreResult() throws IOException, InterruptedException {
		// dataStoreResult
		try {
			Thread.sleep(1000);
			WebElement dataStoreResult = driver.findElement(
					By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/div/div/div[6]/input"));
			dataStoreResult.click();
			start = System.currentTimeMillis();
			Thread.sleep(15000);
			WebElement dataStoreResultVerification = driver.findElement(
					By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div[2]/div[2]"));
			dataStoreResultVerification.click();
			Thread.sleep(10000);
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(4, 5, "Data Store Result", "PASS", totalTime);
			Thread.sleep(3000);

		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4, 5, "Data Store Result", "FAIL", totalTime);
		}
	}
	@Test(priority = 10, description = "DataStore Result Download")
	public void dataStoreResultDownload() throws IOException, InterruptedException {
		// dataStoreResultDownload
		try {
			Thread.sleep(6000);
			WebElement dataStoreResultDownload = driver.findElement(
					By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div[2]/div[1]/div[2]/a[1]/i"));
			dataStoreResultDownload.click();
			WebElement submitBtn = driver.findElement(
					By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[5]/div/div/form/div[2]/button[2]"));
			Thread.sleep(2000);
			submitBtn.click();
			start = System.currentTimeMillis();
			Thread.sleep(15000);
			WebElement dataStoreResultVerification = driver.findElement(
					By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div[2]/div[2]"));
			dataStoreResultVerification.click();
			Thread.sleep(5000);
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(4, 5, "DataStore Result Download", "PASS", totalTime);
			Thread.sleep(5000);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4, 5, "DataStore Result Download", "FAIL", totalTime);
		}
	}
	
	@Test(priority = 11, description = "Datapod Graph")
	public void datapodGraph() throws IOException, InterruptedException {
		// datapodGraph
		try {
			Thread.sleep(2000);
			WebElement datapodGraph = driver.findElement(
					By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[1]/div[2]/a[7]/i"));
			start = System.currentTimeMillis();
			Thread.sleep(4000);
			datapodGraph.click();
			Thread.sleep(6000);
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(4, 5, "Datapod Graph", "PASS", totalTime);
			Thread.sleep(4000);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4, 5, "Datapod Graph", "FAIL", totalTime);
		}
	}
	@Test(priority = 12, description = "Datapod Graph Refresh")
	public void datapodGraphRefresh() throws IOException, InterruptedException {
		// datapodGraph
		try {
			Thread.sleep(2000);
			WebElement datapodGraphRefresh = driver.findElement(
					By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[1]/div[2]/a[8]/i"));
			start = System.currentTimeMillis();
			Thread.sleep(4000);
			datapodGraphRefresh.click();
			Thread.sleep(6000);
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(4, 5, "Datapod Graph Refresh", "PASS", totalTime);
			Thread.sleep(4000);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4, 5, "Datapod Graph Refresh", "FAIL", totalTime);
		}
	}
	@Test(priority = 13, description = "Datapod Edit")
	public void dataDiscoveryCardEdit() throws IOException, InterruptedException {
		// datapodEdit
		try {
			Thread.sleep(2000);
			WebElement datapodEdit = driver.findElement(
					By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[1]/div[2]/a[2]/i"));
			start = System.currentTimeMillis();
			Thread.sleep(1000);
			datapodEdit.click();
			WebElement editDescription = driver.findElement(
					By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div[2]/div/form/div[7]/div/textarea"));
			editDescription.sendKeys("Test Edit Description");
			WebElement submitBtn = driver.findElement(
					By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div[2]/div/form/div[14]/div/input"));
			submitBtn.click();
			
			WebElement datapodUpdate = driver.findElement(
					By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[3]/div/div/div[13]/div[2]/div/div[2]/div[2]/div/div[1]/div/div[8]/div/div/div/button"));
			datapodUpdate.click();
			WebElement datapodView = driver.findElement(
					By.xpath("/html/body/ul/li[1]/a"));
			datapodView.click();
			WebElement datapodVerify = driver.findElement(
					By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div[2]/div/form/div[7]/div/textarea"));
			String text = datapodVerify.getAttribute("value");
			if(!text.contains("Test Edit Description")) {
				dataFromExcelSheet.updateResult(4, 5, "Datapod Edit", "FAIL", totalTime);
			}else {
				dataFromExcelSheet.updateResult(4, 5, "Datapod Edit", "PASS", totalTime);
				Thread.sleep(3000);
			}		
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(4, 5, "Datapod Edit", "PASS", totalTime);
			Thread.sleep(3000);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4, 5, "Datapod Edit", "FAIL", totalTime);

		}
	}
	@Test(priority = 14, description = "Datapod Close")
	public void closeIcon() throws IOException, InterruptedException {
		// datapodClose
		try {
			Thread.sleep(10000);
			start = System.currentTimeMillis();
			WebElement datapodClose = driver.findElement(
					By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[1]/div[2]/a[9]/i"));
			datapodClose.click();
			Thread.sleep(4000);
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(4, 5, "Datapod Close", "PASS", totalTime);
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4, 5, "Datapod Close", "FAIL", totalTime);
		}
	}

}