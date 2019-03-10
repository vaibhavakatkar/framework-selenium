package com.inferyx.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.inferyx.framework.selenium.TestBase;

public class ReportPage extends TestBase{
 
public void createReport(String name, String desc, String source, String sourceName, String title, String header,
		String footer) throws InterruptedException {

	WebElement reportName = driver.findElement(By.xpath(
			"/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[1]/div/div[4]/div[2]/div/div/div[2]/div[1]/form/div/div[2]/div/input"));
	reportName.sendKeys(name);
	Thread.sleep(1000);
	
	WebElement reportDesc = driver.findElement(By.xpath(
			"/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[1]/div/div[4]/div[2]/div/div/div[2]/div[1]/form/div/div[7]/div/textarea"));
	reportDesc.sendKeys(desc);
	Thread.sleep(1000);
	
	getHtmlElementByXpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[1]/div/div[4]/div[2]/div/div/div[2]/div[1]/form/div/div[12]/div/button").click();
	Thread.sleep(2000);
	
	WebElement selectSource = driver.findElement(By.xpath(
			"/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[1]/div/div[4]/div[2]/div/div/div[2]/div[2]/form/div[1]/div[1]/select"));
	Select dropdown = new Select(selectSource);
	dropdown.selectByVisibleText("datapod");

	
	WebElement reportTitle = driver.findElement(By.xpath(
			"/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[1]/div/div[4]/div[2]/div/div/div[2]/div[2]/form/div[3]/div/input"));
	reportTitle.sendKeys(title);
	Thread.sleep(1000);
	
	WebElement reportHeader = driver.findElement(By.xpath(
			"/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[1]/div/div[4]/div[2]/div/div/div[2]/div[2]/form/div[4]/div/input"));
	reportHeader.sendKeys(header);
	Thread.sleep(2000);
	
	/*WebElement selectHeaderAlign = driver.findElement(By.xpath(
			"/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[1]/div/div[4]/div[2]/div/div/div[2]/div[2]/form/div[5]/div/select"));
	selectHeaderAlign.click();
	Thread.sleep(1000);
	
	WebElement headerAlignValue = driver.findElement(By.xpath(
			"//*[@id=\"submit_form2\"]/div[5]/div/select/option[1]"));
	headerAlignValue.click();
	Thread.sleep(1000);*/
	
	WebElement reportFooter = driver.findElement(By.xpath(
			"/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[1]/div/div[4]/div[2]/div/div/div[2]/div[2]/form/div[6]/div/input"));
	reportFooter.sendKeys(footer);
	Thread.sleep(1000);
	
	/*WebElement selectFooterAlign = driver.findElement(By.xpath(
			"/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[1]/div/div[4]/div[2]/div/div/div[2]/div[2]/form/div[5]/div/select"));
	selectFooterAlign.click();
	Thread.sleep(1000);
	
	WebElement valueFooterAlign = driver.findElement(By.xpath(
			"//*[@id=\"submit_form2\"]/div[7]/div/select/option[2]"));
	valueFooterAlign.click();
	Thread.sleep(1000);*/
	
	/*WebElement filter = driver.findElement(By.xpath(
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
	Thread.sleep(1000);*/
	
	//driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div[1]/form/div[1]/div[2]/div[2]/div/div/div[19]/label")).click();
	
	getHtmlElementByXpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[1]/div/div[4]/div[2]/div/div/div[2]/div[2]/form/div[9]/div[2]/div[1]/button[2]").click();
	Thread.sleep(2000);
	
	
	WebElement selectLHSType = driver.findElement(By.xpath(
			"//*[@id=\"submit_form2\"]/div[9]/div[2]/div[2]/table/tbody/tr/td[3]/span/select"));
	selectLHSType.click();
	Thread.sleep(1000);
	
	WebElement selectLHSTypeValue = driver.findElement(By.xpath(
			"//*[@id=\"submit_form2\"]/div[9]/div[2]/div[2]/table/tbody/tr/td[3]/span/select/option[1]"));
	selectLHSTypeValue.click();
	Thread.sleep(1000);
	
	WebElement selectLHSAttribute = driver.findElement(By.xpath(
			"//*[@id=\"submit_form2\"]/div[9]/div[2]/div[2]/table/tbody/tr/td[4]/div/span/span/span[1]/span"));
	selectLHSAttribute.click();
	Thread.sleep(1000);
	
	WebElement selectLHSAttributeValue = driver.findElement(By.xpath(
			"//ul[@class='select2-results__options']//li[contains(text(),'account.account_type_id')]"));
	selectLHSAttributeValue.click();
	Thread.sleep(1000);
	
	WebElement selectOperator = driver.findElement(By.xpath(
			"//*[@id=\"submit_form2\"]/div[9]/div[2]/div[2]/table/tbody/tr/td[5]/span/select"));
	selectOperator.click();
	Thread.sleep(1000);
	
	WebElement operatorValue = driver.findElement(By.xpath(
			"//*[@id=\"submit_form2\"]/div[9]/div[2]/div[2]/table/tbody/tr/td[5]/span/select/option[4]"));
	operatorValue.click();
	Thread.sleep(1000);
	
	WebElement selectRHSType = driver.findElement(By.xpath(
			"//*[@id=\"submit_form2\"]/div[9]/div[2]/div[2]/table/tbody/tr/td[6]/span/select"));
	selectRHSType.click();
	Thread.sleep(1000);
	
	WebElement selectRHSTypeValue = driver.findElement(By.xpath(
			"//*[@id=\"submit_form2\"]/div[9]/div[2]/div[2]/table/tbody/tr/td[6]/span/select/option[1]"));
	selectRHSTypeValue.click();
	Thread.sleep(1000);
	
	getHtmlElementByXpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[1]/div/div[4]/div[2]/div/div/div[2]/div[2]/form/div[10]/div/button").click();
	Thread.sleep(2000);
	
	/*WebElement selectsourceType = driver.findElement(By.xpath(
			"/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div[1]/form/div[2]/div[2]/div[2]/div/div/table/tbody[2]/tr/td[4]/span/select/option[5]"));
	selectsourceType.click();
	Thread.sleep(1000);
	*/
	
	//source attribute
	getHtmlElementByXpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[1]/div/div[4]/div[2]/div/div/div[2]/div[3]/form/div[1]/div/div[2]/div[2]/div/div[2]/div/button[2]").click();
	Thread.sleep(2000);
	
	WebElement selectSourceType=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[1]/div/div[4]/div[2]/div/div/div[2]/div[3]/form/div[1]/div/div[2]/div[3]/div/table/tbody/tr/td[4]/span/select"));
	selectSourceType.click();
	Thread.sleep(1000);
	
	WebElement sourceTypeValue=driver.findElement(By.xpath("//*[@id=\"0\"]/td[4]/span/select/option[5]"));
	sourceTypeValue.click();
	Thread.sleep(1000);
	
	WebElement selectSourceName = driver.findElement(By.xpath(
			"//*[@id=\"0\"]/td[5]/div/span/div/span/span[1]/span"));
	selectSourceName.click();
	Thread.sleep(1000);
	
	WebElement selectSourceNameValue = driver.findElement(By.xpath(
			"//ul[@class='select2-results__options']//li[contains(text(),'current_date')]"));
	selectSourceNameValue.click();
	Thread.sleep(1000);
	
	WebElement sourceAttrName= driver.findElement(By.xpath(
			"/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[1]/div/div[4]/div[2]/div/div/div[2]/div[3]/form/div[1]/div/div[2]/div[3]/div/table/tbody/tr/td[3]/span/input"));
	sourceAttrName.sendKeys("test");
	Thread.sleep(1000);
	
	//Report Attr Page
	getHtmlElementByXpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[1]/div/div[4]/div[2]/div/div/div[2]/div[3]/form/div[2]/div/button").click();
	Thread.sleep(2000);
	
	/*WebElement removeSourceAttribute = driver.findElement(By.xpath(
			"/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div[1]/form/div[2]/div[2]/div[1]/button[1]"));
	removeSourceAttribute.click();
	Thread.sleep(1000);*/
	
	/*WebElement autoMap = driver.findElement(By.xpath(
			"/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div[1]/form/div[2]/div[1]/div[2]/a/span"));
	autoMap.click();
	Thread.sleep(1000);
	*/
	}
}
