package com.inferyx.framework.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.inferyx.framework.selenium.TestBase;

public class VizpodPage extends TestBase{

	public void createVizpod(String name, String desc, String source, String datapodName) throws InterruptedException {

		WebElement vizpodName=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div[2]/div/form/div/div[2]/div/input"));
		vizpodName.sendKeys(name);
		Thread.sleep(1000);
		
		WebElement vizpodDesc=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div[2]/div/form/div/div[7]/div/textarea"));
		vizpodDesc.sendKeys(desc);
		Thread.sleep(1000);
		
		WebElement sourceName = driver.findElement(By.xpath(
				"/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div[2]/div/form/div/div[8]/div[1]/select"));
		Select dropdown = new Select(sourceName);
		dropdown.selectByVisibleText("relation");
		
		WebElement selectType=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div[2]/div/form/div/div[9]/div/select"));
		selectType.click();
		Thread.sleep(1000);
		
		WebElement selectLimit=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div[2]/div/form/div/div[10]/div/input"));
		selectLimit.click();
		Thread.sleep(1000);
		
		WebElement increaseLimit=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div[2]/div/form/div/div[10]/div/input"));
		increaseLimit.click();
		Thread.sleep(1000);
		
		
		WebElement selectValue=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div[2]/div/form/div/div[9]/div/select/option[2]"));
		selectValue.click();
		Thread.sleep(1000);
		
		WebElement selectSortBy=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div[2]/div/form/div/div[12]/div/tags-input/div/div"));
		selectSortBy.click();
		Thread.sleep(1000);
		
		WebElement selectSortByValue=driver.findElement(By.xpath("//ng-include//span[contains(text(),'customer.address_id')]"));
		selectSortByValue.click();
		
		WebElement selectSortValue=driver.findElement(By.xpath("//ng-include//span[contains(text(),'customer.customer_id')]"));
		selectSortValue.click();
		
		WebElement sortOrder = driver.findElement(By.xpath(
				"/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div[2]/div/form/div/div[11]/div/select"));
		Select dropDownValue = new Select(sortOrder);
		dropDownValue.selectByVisibleText("ASC");
			
		//Element which needs to drag.    		
    	WebElement keyAttributeFrom=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div[2]/div/form/div/div[17]/div/ul/li[1]/span"));	
     
    	//Element on which need to drop into keys		
    	WebElement keyAttributeTo=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div[2]/div/form/div/div[18]/div/div/div[1]/ul"));
     
    	Actions act=new Actions(driver);					

	 	//Dragged and dropped.		
	     act.dragAndDrop(keyAttributeFrom, keyAttributeTo).build().perform();
	     System.out.println("aa");
	     
	     
	   	//Element which needs to drag.    		
	   	WebElement valueAttributeFrom=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div[2]/div/form/div/div[17]/div/ul/li[5]/span"));	
	     
	   	//Element on which need to drop into values	
	   	WebElement valueAttributeTo=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div[2]/div/form/div/div[18]/div/div/div[3]/ul"));
	     
    	Actions acttion=new Actions(driver);					
    	//Dragged and dropped.		
    	acttion.dragAndDrop(valueAttributeFrom, valueAttributeTo).build().perform();
    	
	}
}
