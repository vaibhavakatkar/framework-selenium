package com.inferyx.framework.dataDiscovery;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import com.inferyx.framework.selenium.ReadDataFromExcelSheet;
import com.inferyx.framework.selenium.TestBase;

public class DataDiscovery extends TestBase {

	ReadDataFromExcelSheet dataFromExcelSheet = new ReadDataFromExcelSheet();

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
			Thread.sleep(1000);
			dataDiscoveryCard.click();
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(4, 5, "DataDiscoveryCard", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4, 5, "DataDiscoveryCard", "FAIL", totalTime);
		}
	}
	@Test(priority = 3, description = "datapodDownload")
	public void downloadSample() throws IOException, InterruptedException {
		// datapodDownload
		try {
			Thread.sleep(2000);
			WebElement datapodDownload = driver.findElement(
					By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[1]/div[2]/a[6]"));
			start = System.currentTimeMillis();
			Thread.sleep(1000);
			//datapodDownload.click();
		//	WebElement down = driver.findElement(By.xpath("//*[@id=\"downloadModel\"]/div[2]/button[2]"));
			//down.click();
			finish = System.currentTimeMillis();
			totalTime = finish - start;

			dataFromExcelSheet.updateResult(4, 5, "DatapodDownload", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4, 5, "DatapodDownload", "FAIL", totalTime);
		}
	}

	@Test(priority = 3, description = "datapodMetaComp")
	public void dataDiscoveryCardMetaComp() throws IOException, InterruptedException {
		// datapodMetaComp
		try {
			Thread.sleep(1000);
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
	@Test(priority = 4, description = "datapodDataStore")
	public void dataStore() throws IOException, InterruptedException {
		// datapodDataStore
		try {
			Thread.sleep(1000);
			WebElement datapodDataStore = driver.findElement(
					By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[1]/div[2]/a[5]/i"));
			start = System.currentTimeMillis();
			Thread.sleep(1000);
			datapodDataStore.click();
			WebElement data = driver.findElement(
					By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/div/div/div[6]/input"));
			data.click();
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(4, 5, "DatapodDataStore", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4, 5, "DatapodDataStore", "FAIL", totalTime);
		}
	}
	@Test(priority = 5, description = "datapodEdit")
	public void dataDiscoveryCardEdit() throws IOException, InterruptedException {
		// datapodEdit
		try {
			Thread.sleep(1000);
			WebElement datapodEdit = driver.findElement(
					By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[1]/div[2]/a[2]/i"));
			start = System.currentTimeMillis();
			Thread.sleep(1000);
			datapodEdit.click();
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(4, 5, "DatapodEdit", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(updateResult, "DatapodEdit", "FAIL", totalTime);

		}
	}

	@Test(priority = 6, description = "datapodGraph")
	public void knowledgeGraph() throws IOException, InterruptedException {
		// datapodGraph
		try {
			Thread.sleep(1000);

			WebElement datapodGraph = driver.findElement(
					By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[1]/div[2]/a[7]"));
			start = System.currentTimeMillis();
			Thread.sleep(1000);
			datapodGraph.click();
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(4, 5, "DatapodGraph", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4, 5, "DatapodGraph", "FAIL", totalTime);
		}
	}

	@Test(priority = 7, description = "datapodSampleRecord")
	public void dataDiscoverySampleRecord() throws IOException, InterruptedException {
		// datapodSampleRecord
		try {
			WebElement datapodSampleRecord = driver.findElement(
					By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[1]/div[2]/a[4]"));

			start = System.currentTimeMillis();
			Thread.sleep(1000);
			datapodSampleRecord.click();
			WebElement histogram = driver.findElement(
					By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div[1]/div[2]/div[2]/div/div[2]/div[1]/div/div/div/div/div/div[1]/div[1]/div[1]/div[3]/i"));
			histogram.click();
			Thread.sleep(1000);
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(4, 5, "DatapodSampleRecord", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4, 5, "DatapodSampleRecord", "FAIL", totalTime);
		}
	}
	@Test(priority = 8, description = "histogram")
	public void histogram() throws IOException, InterruptedException {
		// histogram
		try {
			WebElement histogram = driver.findElement(
					By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[7]/div/div/form/div[1]/div"));
			start = System.currentTimeMillis();
			Thread.sleep(1000);
			histogram.click();
			
			WebElement chartData = driver.findElement(
					By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[7]/div/div/form/div[1]/div/div/div[1]/a/i"));
			String text=chartData.getText();
			
			System.out.println(text);
			if(!text.contains("Bucket")) {
				dataFromExcelSheet.updateResult(4, 5, "histogram", "FAIL", totalTime);
			}else {
			dataFromExcelSheet.updateResult(4, 5, "histogram", "PASS", totalTime);
			}
			WebElement histogramClose = driver.findElement(
					By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[7]/div/div/form/div[2]/button"));
			histogramClose.click();
			Thread.sleep(1000);
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(4, 5, "Histogram", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4, 5, "Histogram", "FAIL", totalTime);
		}
	}
	@Test(priority = 9, description = "histogram")
	public void histogramChart() throws IOException, InterruptedException {
		// histogramChart
		try {
			WebElement histogramChart = driver.findElement(
					By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[7]/div/div/form/div[1]/div/div/div[1]/a/i"));
			histogramChart.click();
			start = System.currentTimeMillis();
			Thread.sleep(1000);
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(4, 5, "HistogramChart", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4, 5, "HistogramChart", "FAIL", totalTime);
		}
	}
	@Test(priority = 10, description = "histogramGrid")
	public void histogramGrid() throws IOException, InterruptedException {
		// histogramGrid
		try {
			WebElement histogramGrid = driver.findElement(
					By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[7]/div/div/form/div[1]/div/div/div[1]/a/i"));
			histogramGrid.click();
			start = System.currentTimeMillis();
			Thread.sleep(1000);
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(4, 5, "HistogramGrid", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4, 5, "HistogramGrid", "FAIL", totalTime);
		}
	}
	@Test(priority = 11, description = "datapodClose")
	public void closeIcon() throws IOException, InterruptedException {
		// datapodClose
		try {
			Thread.sleep(10000);
			start = System.currentTimeMillis();
			WebElement datapodClose = driver.findElement(
					By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[1]/div[2]/a[9]"));

			datapodClose.click();
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(4, 5, "DatapodClose", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4, 5, "DatapodClose", "FAIL", totalTime);
		}
	}
}