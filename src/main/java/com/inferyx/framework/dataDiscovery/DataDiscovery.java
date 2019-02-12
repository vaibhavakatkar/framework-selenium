package com.inferyx.framework.dataDiscovery;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

import com.inferyx.framework.selenium.TestBase;


public class DataDiscovery extends TestBase {
	@Test(priority = 1, description = "dataDiscovery")
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
	@Test(priority = 2, description = "dataDiscoveryCard")
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
			dataFromExcelSheet.updateResult(4, 5, "DataDiscoveryCard", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4, 5, "DataDiscoveryCard", "FAIL", totalTime);
		}
	}
	
	@Test(priority = 3, description = "datapodMetaComp")
	public void dataDiscoveryCardMetaComp() throws IOException, InterruptedException {
		// datapodMetaComp
		try {
			Thread.sleep(2000);
			WebElement datapodMetaComp = driver.findElement(
					By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[1]/div[2]/a[3]/i"));
			start = System.currentTimeMillis();
			Thread.sleep(1000);
			datapodMetaComp.click();
			Thread.sleep(15000);
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			WebElement datapodCompverification = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div[1]/div/div[7]/div/div"));
			String text=datapodCompverification.getText();		
			System.out.println(text);
			if(!text.contains("No Change")) {
				dataFromExcelSheet.updateResult(4, 5, "DatapodMetaComp", "FAIL", totalTime);
			}else {
			dataFromExcelSheet.updateResult(4, 5, "DatapodMetaComp", "PASS", totalTime);
			}

		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4, 5, "DatapodMetaComp", "FAIL", totalTime);
		}
	}
	@Test(priority = 4, description = "datapodSampleRecord")
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
					By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div[1]/div[2]/div[2]/div/div[2]/div[1]/div/div/div/div/div/div[1]/div[1]/div[1]/div[3]/i"));
			histogram.click();
			Thread.sleep(3000);
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(4, 5, "DatapodSampleRecord", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4, 5, "DatapodSampleRecord", "FAIL", totalTime);
		}
	}
	@Test(priority = 5, description = "histogramGrid")
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
				dataFromExcelSheet.updateResult(4, 5, "HistogramGrid", "FAIL", totalTime);
			}else {
			dataFromExcelSheet.updateResult(4, 5, "HistogramGrid", "PASS", totalTime);
			}
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(4, 5, "HistogramGrid", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4, 5, "HistogramGrid", "FAIL", totalTime);
		}
	}
	
	@Test(priority = 6, description = "histogramChart")
	public void histogramChart() throws IOException, InterruptedException {
		// histogramChart
		try {
			WebElement histogramChart = driver.findElement(
					By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[7]/div/div/form/div[1]/div/div/div[1]/a/i"));
			start = System.currentTimeMillis();
			Thread.sleep(1000);
			histogramChart.click();
			Thread.sleep(3000);
			WebElement histogramChartVerify = driver.findElement(
					By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[7]/div/div/form/div[1]/div/div/div[2]"));
			WebElement histogramClose = driver.findElement(
					By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[7]/div/div/form/div[2]/button"));
			histogramClose.click();
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(4, 5, "HistogramChart", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4, 5, "HistogramChart", "FAIL", totalTime);
		}
	}
	@Test(priority = 7, description = "datapodDownload")
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
			dataFromExcelSheet.updateResult(4, 5, "DatapodDownload", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4, 5, "DatapodDownload", "FAIL", totalTime);
		}
	}
	@Test(priority = 8, description = "datapodDataStore")
	public void dataStore() throws IOException, InterruptedException {
		// datapodDataStore
		try {
			Thread.sleep(1000);
			WebElement datapodDataStore = driver.findElement(
					By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[1]/div[2]/a[5]/i"));
			start = System.currentTimeMillis();
			Thread.sleep(1000);
			datapodDataStore.click();
			WebElement datapodDataStoreVerification = driver.findElement(
					By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div[1]/div[2]/div[1]"));
			Thread.sleep(15000);
			/*WebElement data = driver.findElement(
					By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/div/div/div[6]/input"));
			data.click();*/
			Thread.sleep(10000);
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(4, 5, "DatapodDataStore", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4, 5, "DatapodDataStore", "FAIL", totalTime);
		}
	}
	@Test(priority = 9, description = "dataStoreResult")
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
			dataFromExcelSheet.updateResult(4, 5, "DataStoreResult", "PASS", totalTime);
			Thread.sleep(3000);

		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4, 5, "DataStoreResult", "FAIL", totalTime);
		}
	}
	@Test(priority = 10, description = "dataStoreResultDownload")
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
			dataFromExcelSheet.updateResult(4, 5, "DataStoreResultDownload", "PASS", totalTime);
			Thread.sleep(5000);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4, 5, "DataStoreResultDownload", "FAIL", totalTime);
		}
	}
	
	@Test(priority = 11, description = "datapodGraph")
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
			dataFromExcelSheet.updateResult(4, 5, "DatapodGraph", "PASS", totalTime);
			Thread.sleep(4000);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4, 5, "DatapodGraph", "FAIL", totalTime);
		}
	}
	@Test(priority = 12, description = "datapodEdit")
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
			editDescription.sendKeys("editTest");
			WebElement submitBtn = driver.findElement(
					By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div[2]/div/form/div[13]/div/input"));
			submitBtn.submit();
			
			WebElement dataodUpdate = driver.findElement(
					By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[3]/div/div/div[13]/div[2]/div/div[2]/div[2]/div/div[1]/div/div[8]/div/div/div/button"));
			dataodUpdate.click();
			WebElement dataodView = driver.findElement(
					By.xpath("/html/body/ul/li[1]/a"));
			dataodView.click();
			WebElement datapodVerify = driver.findElement(
					By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div[2]/div/form/div[7]/div/textarea"));
			String text = datapodVerify.getAttribute("value");
			if(!text.contains("editTest")) {
				dataFromExcelSheet.updateResult(4, 5, "DatapodEdit", "FAIL", totalTime);
			}else {
				dataFromExcelSheet.updateResult(4, 5, "DatapodEdit", "PASS", totalTime);
				Thread.sleep(3000);
			}		
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(4, 5, "DatapodEdit", "PASS", totalTime);
			Thread.sleep(3000);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4, 5, "DatapodEdit", "FAIL", totalTime);

		}
	}
	@Test(priority = 13, description = "datapodClose")
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
			dataFromExcelSheet.updateResult(4, 5, "DatapodClose", "PASS", totalTime);
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4, 5, "DatapodClose", "FAIL", totalTime);
		}
	}

}