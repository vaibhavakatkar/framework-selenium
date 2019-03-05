package com.inferyx.framework.dataProfiling.rule;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

import com.inferyx.framework.selenium.TestBase;

public class DataProfilingRuleActionExecute extends TestBase{
	
	@Test(priority =1, description = "Rule Execute Action")
	public void ruleExecute() throws IOException, InterruptedException {
		Thread.sleep(3000);
		//ruleExecute
		try {
			//rule name
			getHtmlElementByXpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[3]/div/div/div[13]/div[1]/div[2]/div/input").sendKeys("profile_address");
			Thread.sleep(1000);
			
			//Action Button
			driver.findElement(By.cssSelector("button.btn.green.btn-xs.btn-outline.dropdown-toggle")).click();
			Thread.sleep(1000);
			
			//Execute Rule
			getHtmlElementByXpath("/html/body/ul/li[6]/a").click();
			Thread.sleep(1000);
			start = System.currentTimeMillis();
			
			//Execution confirm
			getHtmlElementByXpath("//*[@id=\"DagConfExModal\"]/div/div/div[3]/button[2]").click();
			Thread.sleep(1000);
			
			//Result Page
			getHtmlElementByXpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[5]/ul/li[3]/a/span[1]").click();
			Thread.sleep(1000);
			
			//Auto Refresh
			getHtmlElementByXpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[3]/div/div/div[13]/div[1]/div[1]/div/input[1]").click();
			Thread.sleep(1000);
			
			//Get Status
			getHtmlElementByXpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[3]/div/div/div[13]/div[2]/div/div[2]/div[2]/div/div[1]/div/div[6]/div/div");
			Thread.sleep(1000);
			
		/*	String val="Initialize";
		   while(!val.equalsIgnoreCase("In Progress")){  
				val=getHtmlElementByXpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[3]/div/div/div[13]/div[2]/div/div[2]/div[2]/div/div[1]/div/div[6]/div/div").getText();
			   //code to be executed  
			 }  
			if(val.equalsIgnoreCase("In Progress")) {
				//Action Button
				driver.findElement(By.cssSelector("button.btn.green.btn-xs.btn-outline.dropdown-toggle")).click();
				//Killed
				getHtmlElementByXpath("/html/body/ul/li[3]/a").click();
				//Killed Confirm
				getHtmlElementByXpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[3]/div/div/div[7]/div/div/div[3]/button[2]").click();
				//Action Button
				driver.findElement(By.cssSelector("button.btn.green.btn-xs.btn-outline.dropdown-toggle")).click();
				//Restart Group
				getHtmlElementByXpath("/html/body/ul/li[4]/a").click();
				//Confirm Restart
				getHtmlElementByXpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[3]/div/div/div[8]/div/div/div[3]/button[2]").click();

			}	*/	
		
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(7, 8, "Rule Execute Action", "PASS", totalTime, newFile);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(7, 8, "Rule Execute Action", "FAIL", totalTime, newFile);
		}
	}
	@Test(priority =2, description = "Rule Killed Action")
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
			dataFromExcelSheet.updateResult(7, 8, "Rule Killed Action", "PASS", totalTime, newFile);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(7, 8, "Rule Killed Action", "FAIL", totalTime, newFile);
		}
	}
	@Test(priority =3, description = "Rule Group Restart")
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
				
			Thread.sleep(1000);
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(7, 8, "Rule Restart Action", "PASS", totalTime, newFile);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(7, 8, "Rule Restart Action", "FAIL", totalTime, newFile);
		}
	}
}
