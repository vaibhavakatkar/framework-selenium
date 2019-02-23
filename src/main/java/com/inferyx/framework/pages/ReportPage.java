package com.inferyx.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.inferyx.framework.selenium.TestBase;

public class ReportPage extends TestBase{
 
public void createReport(String name, String desc, String source, String sourceName, String title, String header,
		String footer) throws InterruptedException {

	WebElement reportName = driver.findElement(By.xpath(
			"/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div[1]/form/div[1]/div[2]/div[2]/div/div/div[2]/div/input"));
	reportName.sendKeys(name);
	Thread.sleep(1000);
	
	WebElement reportDesc = driver.findElement(By.xpath(
			"/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div[1]/form/div[1]/div[2]/div[2]/div/div/div[7]/div/textarea"));
	reportDesc.sendKeys(desc);
	Thread.sleep(1000);
	
	WebElement selectSource = driver.findElement(By.xpath(
			"/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div[1]/form/div[1]/div[2]/div[2]/div/div/div[8]/div[1]/select"));
	Select dropdown = new Select(selectSource);
	dropdown.selectByVisibleText("datapod");

	
	WebElement reportTitle = driver.findElement(By.xpath(
			"/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div[1]/form/div[1]/div[2]/div[2]/div/div/div[13]/div/input"));
	reportTitle.sendKeys(title);
	Thread.sleep(1000);
	
	WebElement reportHeader = driver.findElement(By.xpath(
			"/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div[1]/form/div[1]/div[2]/div[2]/div/div/div[14]/div/input"));
	reportHeader.sendKeys(header);
	Thread.sleep(2000);
	
	WebElement reportHeaderAlign = driver.findElement(By.xpath(
			"/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div[1]/form/div[1]/div[2]/div[2]/div/div/div[15]/div/select"));
	reportHeaderAlign.click();
	Thread.sleep(1000);
	
	WebElement selectHeaderAlign = driver.findElement(By.xpath(
			"/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div[1]/form/div[1]/div[2]/div[2]/div/div/div[15]/div/select/option[3]"));
	selectHeaderAlign.click();
	Thread.sleep(1000);
	
	WebElement reportFooter = driver.findElement(By.xpath(
			"/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div[1]/form/div[1]/div[2]/div[2]/div/div/div[16]/div/input"));
	reportFooter.sendKeys(footer);
	Thread.sleep(1000);
	
	WebElement reportFooterAlign = driver.findElement(By.xpath(
			"/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div[1]/form/div[1]/div[2]/div[2]/div/div/div[17]/div/select"));
	reportFooterAlign.click();
	Thread.sleep(1000);
	
	WebElement selectFooterAlign = driver.findElement(By.xpath(
			"/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div[1]/form/div[1]/div[2]/div[2]/div/div/div[17]/div/select/option[2]"));
	selectFooterAlign.click();
	Thread.sleep(1000);
	
	WebElement filter = driver.findElement(By.xpath(
			"/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div[1]/form/div[1]/div[2]/div[2]/div/div/div[19]/div[1]/tags-input/div/div"));
	filter.click();
	Thread.sleep(1000);
	
	WebElement selectFilterFirst = driver.findElement(By.xpath(
			"//ng-include[@class='ng-scope']//span[contains(text(),'account.account_status_id')]"));
	selectFilterFirst.click();
	Thread.sleep(1000);
	
	WebElement selectFilterSecond = driver.findElement(By.xpath(
			"//ng-include[@class='ng-scope']//span[contains(text(),'account.account_status_id')]"));
	selectFilterSecond.click();
	Thread.sleep(1000);
	
	WebElement selectFilterThird = driver.findElement(By.xpath(
			"//ng-include[@class='ng-scope']//span[contains(text(),'account.product_type_id')]"));
	selectFilterThird.click();
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div[1]/form/div[1]/div[2]/div[2]/div/div/div[19]/label")).click();
	
	WebElement sourceAttribute = driver.findElement(By.xpath(
			"/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div[1]/form/div[2]/div[2]/div[2]/div/div/table/tbody/tr/td[4]/span/select"));
	sourceAttribute.click();
	Thread.sleep(1000);
	
	WebElement selectSourceAttribute = driver.findElement(By.xpath(
			"/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div[1]/form/div[2]/div[2]/div[2]/div/div/table/tbody/tr/td[4]/span/select/option[2]"));
	selectSourceAttribute.click();
	Thread.sleep(1000);
	
	WebElement nameOfSource = driver.findElement(By.xpath(
			"/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div[1]/form/div[2]/div[2]/div[2]/div/div/table/tbody/tr/td[5]/div/span/span/span[1]/span"));
	nameOfSource.click();
	Thread.sleep(1000);
	
	WebElement selectnameOfSource = driver.findElement(By.xpath(
			"//ul[@class='select2-results__options']//li[contains(text(),'account.account_type_id')]"));
	selectnameOfSource.click();
	Thread.sleep(1000);
	
	WebElement addSourceAttribute = driver.findElement(By.xpath(
			"/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div[1]/form/div[2]/div[2]/div[1]/button[2]"));
	addSourceAttribute.click();
	Thread.sleep(1000);
	
	WebElement sourceType = driver.findElement(By.xpath(
			"/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div[1]/form/div[2]/div[2]/div[2]/div/div/table/tbody/tr/td[4]/span/select"));
	sourceType.click();
	Thread.sleep(1000);
	
	WebElement selectsourceType = driver.findElement(By.xpath(
			"/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div[1]/form/div[2]/div[2]/div[2]/div/div/table/tbody[2]/tr/td[4]/span/select/option[5]"));
	selectsourceType.click();
	Thread.sleep(1000);
	
	WebElement functionName=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div[1]/form/div[2]/div[2]/div[2]/div/div/table/tbody[2]/tr/td[5]/div/span/span/span[1]/span"));
	functionName.click();
	Thread.sleep(1000);
	
	WebElement functionNameSelect=driver.findElement(By.xpath("//ul[@class='select2-results__options']//li[contains(text(),'current_date')]"));
	functionNameSelect.click();
	Thread.sleep(1000);
	
	WebElement checkSourceAttribute = driver.findElement(By.xpath(
			"/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div[1]/form/div[2]/div[2]/div[2]/div/div/table/tbody[2]/tr/td[1]/span/input"));
	checkSourceAttribute.click();
	Thread.sleep(1000);
	
	WebElement removeSourceAttribute = driver.findElement(By.xpath(
			"/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div[1]/form/div[2]/div[2]/div[1]/button[1]"));
	removeSourceAttribute.click();
	Thread.sleep(1000);
	
	WebElement autoMap = driver.findElement(By.xpath(
			"/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div[1]/form/div[2]/div[1]/div[2]/a/span"));
	autoMap.click();
	Thread.sleep(1000);
	
	}
}
