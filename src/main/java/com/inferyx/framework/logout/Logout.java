package com.inferyx.framework.logout;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.inferyx.framework.selenium.TestBase;

public class Logout extends TestBase{
	
	@Test(priority = 1, description = "Logout")
	public void dataDiscoveryList() throws IOException, InterruptedException {
		// DataDiscovery
		try {
			//Ypalrecha
			
			Actions actions = new Actions(driver);

			WebElement menuOption = driver.findElement(By.xpath("/html/body/screenshot/div[2]/div/div[2]/ul/li[4]/a"));
			actions.moveToElement(menuOption).perform();
			Thread.sleep(1000);
			WebElement selectMenuOption = driver.findElement(By.xpath("/html/body/screenshot/div[2]/div/div[2]/ul/li[4]/ul/li[8]/a"));
			selectMenuOption.click();
			Thread.sleep(1000);
			
			
			/*
			 * getHtmlElementByXpath(
			 * "/html/body/screenshot/div[2]/div/div[2]/ul/li[3]/a/span").click();
			 * Thread.sleep(1000);
			 * 
			 * getHtmlElementByXpath(
			 * "/html/body/screenshot/div[2]/div/div[2]/ul/li[3]/a/span").click();
			  //logout
			 * getHtmlElementByXpath(
			 * "/html/body/screenshot/div[2]/div/div[2]/ul/li[3]/ul/li[7]/a").click();
			 * Thread.sleep(1000);
			 */		
			Thread.sleep(1000); start = System.currentTimeMillis();
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(updateResult, "Logout", "PASS", totalTime, newFile);

		} catch (InterruptedException e) {
			dataFromExcelSheet.updateResult(updateResult, "Logout", "FAIL", totalTime, newFile);
		}
	}
 
}
