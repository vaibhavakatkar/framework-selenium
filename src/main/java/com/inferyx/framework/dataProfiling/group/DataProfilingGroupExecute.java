package com.inferyx.framework.dataProfiling.group;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import org.testng.annotations.Test;

import com.inferyx.framework.selenium.TestBase;

public class DataProfilingGroupExecute extends TestBase{
	
	@Test(priority =18, description = "Group Execute Action")
	public void groupExecute() throws IOException, InterruptedException {
		Thread.sleep(3000);
		//groupExecute
		try {
			//Group  Name Search
			getHtmlElementByXpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[3]/div/div/div[13]/div[1]/div[2]/div/input").sendKeys("profile_group_raw");
			Thread.sleep(1000);

			//Action Button
			driver.findElement(By.cssSelector("button.btn.green.btn-xs.btn-outline.dropdown-toggle")).click();
			Thread.sleep(1000);

			//Execute
			getHtmlElementByXpath("/html/body/ul/li[6]/a").click();
			Thread.sleep(1000);

			//Execute Confirm
			getHtmlElementByXpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[3]/div/div/div[2]/div/div/div[3]/button[2]").click();
			Thread.sleep(1000);
			
			//Result Page
			getHtmlElementByXpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[5]/ul/li[3]/a/span[1]").click();
			Thread.sleep(1000);

			//Rule Group
			getHtmlElementByXpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[3]/div/search-criteria/div/div[2]/form/div[1]/div/div/div/div/label[2]/input").click();
			Thread.sleep(1000);

			//Auto Refresh
			getHtmlElementByXpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[3]/div/div/div[13]/div[1]/div[1]/div/input[1]").click();
			//Get Status
			getHtmlElementByXpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[3]/div/div/div[13]/div[2]/div/div[2]/div[2]/div/div[1]/div/div[6]/div/div");
			Thread.sleep(1000);
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(7, 8, "Rule Execute View", "PASS", totalTime, newFile);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(7, 8, "Rule Execute View", "FAIL", totalTime, newFile);
		}
	}
	
	@Test(priority =19, description = "Rule Group Killed")
	public void groupKilled() throws IOException, InterruptedException {
		Thread.sleep(3000);
		//Rule Group Killed
		try {
			String val="Initialize";
			while(!val.equalsIgnoreCase("In Progress")){  
				   
				val=getHtmlElementByXpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[3]/div/div/div[13]/div[2]/div/div[2]/div[2]/div/div[1]/div/div[6]/div/div").getText();
			 }
			if(val.equalsIgnoreCase("In Progress")) {
					//Action Button
					driver.findElement(By.cssSelector("button.btn.green.btn-xs.btn-outline.dropdown-toggle")).click();
					//Killed Group
					getHtmlElementByXpath("/html/body/ul/li[3]/a").click();
					//Confirm killed
					getHtmlElementByXpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[3]/div/div/div[7]/div/div/div[3]/button[2]").click();
					start = System.currentTimeMillis();
				}	
			Thread.sleep(1000);
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(7, 8, "Rule Group Killed", "PASS", totalTime, newFile);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(7, 8, "Rule Group Killed", "FAIL", totalTime, newFile);
		}
	}
	@Test(priority =20, description = "Rule Group Restart")
	public void groupRestart() throws IOException, InterruptedException {
		Thread.sleep(3000);
		//Rule Group Restart
		try {
					//Action Button
			driver.findElement(By.cssSelector("button.btn.green.btn-xs.btn-outline.dropdown-toggle")).click();
			Thread.sleep(1000);
			//Restart Group
			getHtmlElementByXpath("/html/body/ul/li[4]/a").click();
			Thread.sleep(1000);
			//Confirm Restart
			getHtmlElementByXpath("//*[@id=\"restartmodal\"]/div/div/div[3]/button[2]").click();
			System.out.println("restarted");
				
			Thread.sleep(1000);
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(7, 8, "Rule Group Restart", "PASS", totalTime, newFile);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(7, 8, "Rule Group Restart", "FAIL", totalTime, newFile);
		}
	}
}