package com.inferyx.framework.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.inferyx.framework.selenium.TestBase;

public class DataProfilingRulePage extends TestBase{

public void createNewDatapod(String name, String desc, String source) throws InterruptedException {
	
	WebElement ruleName=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[1]/div/div[4]/div[2]/div/div/div[2]/div[1]/form/div/div/div[2]/div/input"));
	ruleName.sendKeys(name);
	Thread.sleep(1000);

	WebElement description=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[1]/div/div[4]/div[2]/div/div/div[2]/div[1]/form/div/div/div[7]/div/textarea"));
	description.sendKeys(desc);
	Thread.sleep(1000);

	WebElement continueBtn=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[1]/div/div[4]/div[2]/div/div/div[2]/div[1]/form/div/div/div[12]/div/button"));
	continueBtn.click();
	Thread.sleep(1000);
	
	WebElement selectSource =driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[1]/div/div[4]/div[2]/div/div/div[2]/div[2]/form/div[1]/div[1]/select"));
	Select dropdown = new Select(selectSource);
	dropdown.selectByVisibleText("datapod");
	
	WebElement selectAllAttr =driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[1]/div/div[4]/div[2]/div/div/div[2]/div[2]/form/div[2]/div[2]/span[2]"));
	selectAllAttr.click();
	
	WebElement clearAllAttr =driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[1]/div/div[4]/div[2]/div/div/div[2]/div[2]/form/div[2]/div[2]/span[1]"));
	clearAllAttr.click();
	
	WebElement attribute =driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[1]/div/div[4]/div[2]/div/div/div[2]/div[2]/form/div[2]/div[1]/tags-input/div/div"));
	attribute.click();
	Thread.sleep(1000);
	
	WebElement selectAttr =driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[1]/div/div[4]/div[2]/div/div/div[2]/div[2]/form/div[2]/div[1]/tags-input/div/auto-complete/div/ul/li[1]/ti-autocomplete-match/ng-include/span"));
	selectAttr.click();
	Thread.sleep(1000);
	
	WebElement sideClick = driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[1]/div/div[4]/div[2]/div/div/ul/li[2]/a"));
	sideClick.click();
	
	WebElement addFilter=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[1]/div/div[4]/div[2]/div/div/div[2]/div[2]/form/div[3]/div[1]/div[2]/div/div/button[2]"));
	addFilter.click();
	
	WebElement LhsTypeDropdown=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[1]/div/div[4]/div[2]/div/div/div[2]/div[2]/form/div[3]/div[2]/div/table/tbody/tr/td[3]/span/select"));
	LhsTypeDropdown.click();
	Thread.sleep(1000);

	WebElement selectLHSType=driver.findElement(By.xpath("//*[@id=\"submit_form2\"]/div[3]/div[2]/div/table/tbody/tr/td[3]/span/select/option[1]"));
	selectLHSType.click();
	Thread.sleep(1000);
	
	WebElement LhsAttribute=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[1]/div/div[4]/div[2]/div/div/div[2]/div[2]/form/div[3]/div[2]/div/table/tbody/tr/td[4]/div[1]/span/span/span[1]/span"));
	LhsAttribute.click();
	Thread.sleep(1000);
	
	WebElement selectLHSAttribute=driver.findElement(By.xpath("//*[@id=\"submit_form2\"]/div[3]/div[2]/div/table/tbody/tr/td[4]/div[1]/span/select/option[5]"));
	selectLHSAttribute.click();
	Thread.sleep(1000);

	WebElement selectOperator=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[1]/div/div[4]/div[2]/div/div/div[2]/div[2]/form/div[3]/div[2]/div/table/tbody/tr/td[5]/span/select"));
	selectOperator.click();
	Thread.sleep(1000);
	
	WebElement operator=driver.findElement(By.xpath("//*[@id=\"submit_form2\"]/div[3]/div[2]/div/table/tbody/tr/td[5]/span/select/option[4]"));	operator.click();
	
	WebElement rhsType=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[1]/div/div[4]/div[2]/div/div/div[2]/div[2]/form/div[3]/div[2]/div/table/tbody/tr/td[6]/span/select"));
	rhsType.click();
	
	WebElement selectrhsType=driver.findElement(By.xpath("//*[@id=\"submit_form2\"]/div[3]/div[2]/div/table/tbody/tr/td[6]/span/select/option[1]"));
	selectrhsType.click();

	WebElement RhsAttribute=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[1]/div/div[4]/div[2]/div/div/div[2]/div[2]/form/div[3]/div[2]/div/table/tbody/tr/td[7]/div/span/span/span[1]/span"));
	RhsAttribute.click();
	Thread.sleep(1000);
	
	WebElement selectRHSAttribute=driver.findElement(By.xpath("//*[@id=\"submit_form2\"]/div[3]/div[2]/div/table/tbody/tr/td[7]/div/span/span/span[1]/span"));
	selectRHSAttribute.click();
	Thread.sleep(1000);

	WebElement nextPage = driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[1]/div/div[4]/div[2]/div/div/div[2]/div[2]/form/div[4]/div/button"));
	nextPage.click();

	}
}
