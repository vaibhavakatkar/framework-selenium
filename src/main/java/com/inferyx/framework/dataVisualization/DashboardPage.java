package com.inferyx.framework.dataVisualization;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.inferyx.framework.selenium.TestBase;

public class DashboardPage extends TestBase{
  
	public void createDashboard(String dashdName, String description, String dependsOnName, String datapodName) {
		
		WebElement name =driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div/div/form/div[2]/div/input"));
		name.sendKeys(dashdName);
		
		WebElement desc =driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div/div/form/div[7]/div/textarea"));
		desc.sendKeys(description);
		
		WebElement dependsOn =driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div/div/form/div[8]/div[1]/select"));
		Select dropdownApp = new Select(dependsOn);
		dropdownApp.selectByVisibleText("datapod");
		
		WebElement filter =driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div/div/form/div[9]/div[1]/tags-input/div/div"));
		filter.click();
		
		WebElement filterAdd =driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div/div/form/div[9]/div[1]/tags-input/div/auto-complete/div/ul/li[1]/ti-autocomplete-match/ng-include/span"));
		Select filterlist = new Select(filterAdd);
		filterlist.selectByVisibleText("account.account_id");
				
		WebElement filterAdd1 =driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div/div/form/div[9]/div[1]/tags-input/div/auto-complete/div/ul/li[2]/ti-autocomplete-match/ng-include/span"));
		Select filterlist1 = new Select(filterAdd1);
		filterlist1.selectByVisibleText("account.account_type_id");	}
	
}
