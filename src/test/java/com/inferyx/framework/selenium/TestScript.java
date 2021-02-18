/*package com.inferyx.framework.selenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestScript {
	String excellocation = "/home/ubuntu/selenium/testReport.xlsx";
	String sheetName = "Sheet1";
	ReadDataFromExcelSheet dataFromExcelSheet = new ReadDataFromExcelSheet();
	WebDriver driver;
     
	public static void main(String[] args) throws IOException {
		TestScript testScript=new TestScript();
		testScript.openBrowser();
		testScript.login();
	}
	
	public void openBrowser() throws IOException {
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		driver = new ChromeDriver();
		// Open application
		driver.get("http://localhost:8080/app/login.html");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		if (driver.getTitle().isEmpty() || !driver.getTitle().equalsIgnoreCase("Inferyx | Login")) {
			dataFromExcelSheet.updateResult(excellocation, sheetName, "Open Browser", "FAIL", fis);
		} else {
			dataFromExcelSheet.updateResult(excellocation, sheetName, "Open Browser", "PASS", fis);
		}

	}
	public void login() {
		// initialize Chrome driver
		       // Enter user id
				WebElement username = driver.findElement(By.xpath("/html/body/div[2]/form[1]/div[2]/input"));
				username.sendKeys("ypalrecha");
				
				 * //wait 5 secs for userid to be entered
				 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				 
				// Enter Password
				WebElement password = driver.findElement(By.xpath("/html/body/div[2]/form[1]/div[3]/input"));
				password.sendKeys("ypalrecha");
				// Submit button
				username.submit();			

				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

				// for App selection
				WebElement appSelection = driver
						.findElement(By.xpath("//*[@id=\'myModal\']/div/div/div[2]/form/div/div[2]/div[1]/select"));
				Select dropdownApp = new Select(appSelection);
				dropdownApp.selectByVisibleText("Enterprise Data Warehouse");

				// for role selection
				WebElement roleSelection = driver
						.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[2]/form/div/div[2]/div[2]/select"));
				Select role = new Select(roleSelection);
				role.selectByVisibleText("admin");

				driver.findElements(By.xpath("//*[@id=\"myModal\"]/div/div/div[2]/form/div/div[2]/div[3]/button")).get(0).click();

		
	}

}*/