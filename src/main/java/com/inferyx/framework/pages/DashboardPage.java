package com.inferyx.framework.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.inferyx.framework.selenium.TestBase;

public class DashboardPage extends TestBase {

	public void createDashboard(String dashdName, String description, String dependsOnName, String datapodName) throws InterruptedException {

		WebElement name = driver.findElement(By.xpath(
				"/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div/div/form/div[2]/div/input"));
		name.sendKeys(dashdName);

		WebElement desc = driver.findElement(By.xpath(
				"/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div/div/form/div[7]/div/textarea"));
		desc.sendKeys(description);

		WebElement dependsOn = driver.findElement(By.xpath(
				"/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div/div/form/div[8]/div[1]/select"));
		Select dropdownApp = new Select(dependsOn);
		dropdownApp.selectByVisibleText("datapod");

		
		WebElement filter = driver.findElement(By.xpath(
				"/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div/div/form/div[9]/div[1]/tags-input/div/div"));
		filter.click();
		
		WebElement clearFilter = driver.findElement(By.xpath(
				"/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div/div/form/div[9]/div[2]/span"));
		Thread.sleep(3000);
		clearFilter.click();
		filter.click();
		Thread.sleep(2000);
		WebElement testFilter=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div/div/form/div[9]/div[1]/tags-input/div/auto-complete/div"));
		testFilter.click();
		clearFilter.click();
		Thread.sleep(2000);
		filter.click();
		Thread.sleep(2000);
		WebElement filters1 =	driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div/div/form/div[9]/div[1]/tags-input/div/auto-complete/div/ul/li[6]/ti-autocomplete-match/ng-include/span"));
				filters1.click();
		clearFilter.click();
		WebElement nextPage = driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div/div/form/div[14]/div/button"));
		nextPage.click();
		Thread.sleep(2000);
		
		WebElement selectVizpod=driver.findElement(By.xpath("//div[@class='col-xs-12 sectionColumn']//span[contains(text(),'--Select Vizpod--')]"));
		selectVizpod.click();
		
		WebElement selectElement = driver.findElement(By.xpath("//ul[@class='select2-results__options']//li[contains(text(),'viz_trans_amount_by_country_bubble')]"));
		selectElement.click();
		Thread.sleep(1000);

	}

}
