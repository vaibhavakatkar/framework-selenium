package com.inferyx.framework.dataProfiling.rule;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

import com.inferyx.framework.selenium.TestBase;

public class DataProfilingRuleActionExecute extends TestBase{
	
	@Test(priority =26, description = "Rule Execute Action")
	public void ruleExecute() throws IOException, InterruptedException {
		Thread.sleep(3000);
		//ruleExecute
		try {
			//rule name
			getHtmlElementByXpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[3]/div/div/div[13]/div[1]/div[2]/div/input").sendKeys("profile_address");
			driver.findElement(By.cssSelector("button.btn.green.btn-xs.btn-outline.dropdown-toggle")).click();

			WebElement ruleExecute = driver
					.findElement(By.xpath("/html/body/ul/li[6]/a"));
			start = System.currentTimeMillis();
			ruleExecute.click();
			Thread.sleep(1000);
			//Execution confirm
			getHtmlElementByXpath("//*[@id=\"DagConfExModal\"]/div/div/div[3]/button[2]").click();
			//Result Page
			getHtmlElementByXpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[5]/ul/li[3]/a/span[1]").click();
			//Auto Refresh
			getHtmlElementByXpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[3]/div/div/div[13]/div[1]/div[1]/div/input[1]").click();
			//Get Status
			webElement=getHtmlElementByXpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[3]/div/div/div[13]/div[2]/div/div[2]/div[2]/div/div[1]/div/div[6]/div/div");
		   String val="Initialize";
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

			}		
		
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(7, 8, "Rule Execute View", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(7, 8, "Rule Execute View", "FAIL", totalTime);
		}
	}
}
