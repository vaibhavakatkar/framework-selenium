package com.inferyx.framework.dataVisualization.report;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.inferyx.framework.selenium.TestBase;

public class ReportActionExecute extends TestBase{
	@BeforeMethod
	public void setUp() throws InterruptedException {
		Thread.sleep(3000);
		start = System.currentTimeMillis();
		driver.findElement(By.cssSelector("button.btn.green.btn-xs.btn-outline.dropdown-toggle")).click();

		Thread.sleep(1000);
	}
	
	@Test(priority = 11, description = "Report Action Execute")
	public void reportEditAction() throws IOException, InterruptedException {
		try {
			WebElement actionExecute = driver.findElement(By.xpath("/html/body/ul/li[6]/a"));
			actionExecute.click();
			start = System.currentTimeMillis();
			Thread.sleep(1000);
			finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(4, 5, "Report Action Execute", "PASS", totalTime);
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(4, 5, "Report Action Execute", "FAIL", totalTime);
		}
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void AfterMethod() throws InterruptedException {
		Thread.sleep(1000);
		start = System.currentTimeMillis();
		WebElement actionExecute = driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[3]/div/div/div[2]/div[1]/div/div/div[3]/button[2]"));
		System.out.println("ss");
		actionExecute.click();

		WebElement runParamSelect = driver.findElement(By.xpath("//*[@id=\"attrFilter\"]/div/div/div[2]/div/div/form/div[2]/div[1]/div/span/span[1]/span"));
		runParamSelect.click();
		
		WebElement value=driver.findElement(By.xpath("//ul[@class='select2-results__options']//li[contains(text(),'101')]"));
		value.click();
		
		Thread.sleep(2000);
		WebElement runParams= driver.findElement(By.xpath("//*[@id=\"attrFilter\"]/div/div/div[2]/div/div/form/div[2]/div[2]/div/span/span[1]/span"));
		runParams.click();
		
		WebElement	selectValue=driver.findElement(By.xpath("//ul[@class='select2-results__options']//li[contains(text(),'101')]"));
		selectValue.click();
		
		WebElement submitBtn=driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[3]/div/div/div[2]/div[2]/div/div/div[3]/button[2]"));
		submitBtn.click();
	}
}
