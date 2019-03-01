package com.inferyx.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.inferyx.framework.selenium.TestBase;

public class DataProfilingGroup extends TestBase{

	public void createGroup(String name, String desc) throws InterruptedException {

		WebElement groupName=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[4]/div[2]/form/div/div[1]/div[2]/div/input"));
		groupName.sendKeys(name);
		Thread.sleep(1000);
		
		WebElement groupDesc=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[4]/div[2]/form/div/div[1]/div[7]/div/textarea"));
		groupDesc.sendKeys(desc);
		Thread.sleep(1000);
		
		WebElement selectProfile=driver.findElement(By.xpath("//*[@id=\"form_wizard_1\"]/div[2]/form/div/div[1]/div[13]/div[1]/tags-input/div/div"));
		selectProfile.click();
		Thread.sleep(1000);
		
		WebElement profileNameFirst=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[4]/div[2]/form/div/div[1]/div[13]/div[1]/tags-input/div/auto-complete/div/ul/li[4]"));
		profileNameFirst.click();
		Thread.sleep(1000);
		
		WebElement profileNameSecond=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[4]/div[2]/form/div/div[1]/div[13]/div[1]/tags-input/div/auto-complete/div/ul/li[5]/ti-autocomplete-match/ng-include/span"));
		profileNameSecond.click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[4]/div[2]/form/div/div[1]/div[13]/label")).click();
		
		/*WebElement runImmediately=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div/div[4]/div[2]/form/div/div[1]/div[14]/div/div/label/span"));
		runImmediately.click();
		Thread.sleep(1000);*/
		
	}
  
}
