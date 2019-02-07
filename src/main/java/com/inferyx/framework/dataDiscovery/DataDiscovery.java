package com.inferyx.framework.dataDiscovery;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
			WebElement accountData = driver.findElement(By.xpath(
					"/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[2]/div/div/div[2]/div[1]/div[1]/div/a/div/div[1]"));
			start = System.currentTimeMillis();
			Thread.sleep(1000);
			accountData.click();
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(4, 5, "Account Card", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(updateResult, "Account Card", "FAIL", totalTime);
		}
	}

	@Test(priority = 3, description = "downloadSample")
	public void downloadSample() throws IOException, InterruptedException {
		// downloadSample
		try {
			Thread.sleep(2000);
			WebElement download = driver.findElement(
					By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[1]/div[2]/a[6]"));
			start = System.currentTimeMillis();
			Thread.sleep(1000);
			//download.click();
		//	WebElement down = driver.findElement(By.xpath("//*[@id=\"downloadModel\"]/div[2]/button[2]"));
			//down.click();
			
			
			finish = System.currentTimeMillis();
			totalTime = finish - start;

			dataFromExcelSheet.updateResult(4, 5, "Download", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4, 5, "Download", "FAIL", totalTime);
		}
	}

	@Test(priority = 4, description = "dataDiscoveryMetaComp")
	public void dataDiscoveryCardMetaComp() throws IOException, InterruptedException {
		// DataDiscovery
		try {
			Thread.sleep(1000);
			WebElement accountComp = driver.findElement(
					By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[1]/div[2]/a[3]/i"));
			start = System.currentTimeMillis();
			Thread.sleep(1000);
			accountComp.click();
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(4, 5, "Meta Comp", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4, 5, "Meta Comp", "FAIL", totalTime);
		}
	}

	@Test(priority = 5, description = "dataStore")
	public void dataStore() throws IOException, InterruptedException {
		// dataStore
		try {
			Thread.sleep(1000);
			WebElement dataStore = driver.findElement(
					By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[1]/div[2]/a[5]/i"));
			start = System.currentTimeMillis();
			Thread.sleep(1000);
			dataStore.click();
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(4, 5, "Data Store", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4, 5, "Data Store", "FAIL", totalTime);
		}
	}

	@Test(priority = 6, description = "dataDiscoveryCardEdit")
	public void dataDiscoveryCardEdit() throws IOException, InterruptedException {
		// DataDiscovery
		try {
			Thread.sleep(1000);
			WebElement accountEdit = driver.findElement(
					By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[1]/div[2]/a[2]/i"));
			start = System.currentTimeMillis();
			Thread.sleep(1000);
			accountEdit.click();
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(4, 5, "Account Edit", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(updateResult, "Account Edit", "FAIL", totalTime);
		}
	}

	@Test(priority = 7, description = "knowledgeGraph")
	public void knowledgeGraph() throws IOException, InterruptedException {
		// knowledgeGraph
		try {
			Thread.sleep(1000);

			WebElement knowledgeGraph = driver.findElement(
					By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[1]/div[2]/a[7]"));
			start = System.currentTimeMillis();
			Thread.sleep(1000);
			knowledgeGraph.click();
			/*
			 * WebElement down = driver
			 * .findElement(By.xpath("//*[@id=\"downloadModel\"]/div[2]/button[2]"));
			 */
			// download.submit();
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(4, 5, "Knowledge Graph", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4, 5, "Knowledge Graph", "FAIL", totalTime);
		}
	}

	@Test(priority = 8, description = "dataDiscoverySampleRecord")
	public void dataDiscoverySampleRecord() throws IOException, InterruptedException {
		// dataDiscoverySampleRecord
		try {
			WebElement sampleRecord = driver.findElement(
					By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[1]/div[2]/a[4]"));

			start = System.currentTimeMillis();
			Thread.sleep(1000);

			sampleRecord.click();
		//	driver.findElement(By.id("1549463795974-uiGrid-0096-header-text")).click();
			
			//driver.findElement(By.cssSelector("i.fa.fa-bar-chart")).click();
			/*WebElement data1 = driver.findElement(By.xpath("//*[@id=\"1549451749079-0-uiGrid-001D-cell\"]/div"));

			//*[@id="1549451749079-0-uiGrid-001D-cell"]/div
			WebElement data = driver.findElement(By.xpath("//*[@id=\"1549451162269-uiGrid-007T-header-text\"]/i"));
			data.click();*/
			Thread.sleep(1000);
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(4, 5, "Sample Record", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4, 5, "Sample Record", "FAIL", totalTime);
		}
	}

	@Test(priority = 9, description = "closeIcon")
	public void closeIcon() throws IOException, InterruptedException {
		// closeIcon
		try {
			Thread.sleep(10000);
			start = System.currentTimeMillis();
			WebElement closeIcon = driver.findElement(
					By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[1]/div[2]/a[9]"));

			closeIcon.click();
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(4, 5, "Close Icon", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4, 5, "Close Icon", "FAIL", totalTime);
		}
	}
}