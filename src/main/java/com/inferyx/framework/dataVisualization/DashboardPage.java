package com.inferyx.framework.dataVisualization;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

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
		System.out.println("dfjkhkj");
		clearFilter.click();
		//Thread.sleep(2000);
		WebElement nextPage = driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div/div/form/div[14]/div/button"));
		nextPage.click();
		Thread.sleep(2000);
		//*[@id="select2-nlzt-container"]
		//WebElement selectVizpod = driver.findElement(By.xpath("//div[contains(@id='select2')]"));
		WebElement cls=driver.findElement(By.xpath("//div[contains text(),(@id='select2')"));
		System.out.println("ddkv");
		cls.click();
		System.out.println("ddkv");
		
		//selectVizpod.click();
		System.out.println("sds");
		Thread.sleep(1000);

	/*	List<WebElement>list= (List<WebElement>) driver.findElement(By.xpath("//*[starts-with(@id,'select2-')]/a")); 
		System.out.println(list.size());*/
		
		
		//driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("viz_cust_and_acct_by_country_barline");
		/*driver.findElement(By.xpath("//*[@id=\\\"select2-acfz-container\\\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\\\"select2-acfz-container\\\"]")).click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div/form/div[3]/div/div[1]/div/div[2]/div/span[2]/span/span[1]/span"))).click();
*/
		//vizpodName.click();
		Thread.sleep(1000);

	}

}
