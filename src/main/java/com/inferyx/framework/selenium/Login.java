package com.inferyx.framework.selenium;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.openqa.selenium.NoSuchElementException;

public class Login extends TestBase{
	//String excellocation = "test.xlsx";
	String excellocation =System.getProperty("user.dir")+"/src/main/resources/test.xlsx";
	String sheetName = "Sheet1";
	ReadDataFromExcelSheet dataFromExcelSheet = new ReadDataFromExcelSheet();
	
	/*@Test(priority = 1, description = "openBrowser")
	public void openBrowser() throws IOException {
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		driver = new ChromeDriver();
		// Open application
		driver.get("http://localhost:8080/app/login.html");
		driver.manage().window().maximize();
		// Assert.assertEquals(driver.getTitle().toString(), "Inferyx | Login");
		if (driver.getTitle().isEmpty() || !driver.getTitle().equalsIgnoreCase("Inferyx | Login")) {
			dataFromExcelSheet.updateResult(excellocation, sheetName, "Open Browser", "FAIL");
		} else {
			dataFromExcelSheet.updateResult(excellocation, sheetName, "Open Browser", "PASS");
		}

	}

	@Test(priority = 2, description = "login check")
	public void login() throws IOException {
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
		try {
			
			 * WebElement nextResponse = driver .findElement(By.xpath(
			 * "//*[@id=\"myModal\"]/div/div/div[2]/form/div/div[2]/div[3]/button"));
			 * System.out.println(nextResponse.getText());
			 
			dataFromExcelSheet.updateResult(excellocation, sheetName, "Login_page", "PASS");

		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(excellocation, sheetName, "Login_page", "FAIL");
		}
	}

	@Test(priority = 3, description = "appSelection")
	public void appSelection() throws IOException {
		// for App selection

		try {
			WebElement appSelection = driver
					.findElement(By.xpath("//*[@id=\'myModal\']/div/div/div[2]/form/div/div[2]/div[1]/select"));
			Select dropdownApp = new Select(appSelection);
			dropdownApp.selectByVisibleText("Enterprise Data Warehouse");

			// for role selection
			WebElement roleSelection = driver
					.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[2]/form/div/div[2]/div[2]/select"));
			Select role = new Select(roleSelection);
			role.selectByVisibleText("admin");
			driver.findElements(By.xpath("//*[@id=\"myModal\"]/div/div/div[2]/form/div/div[2]/div[3]/button")).get(0)
					.click();
			WebElement nextResponse = driver
					.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[2]/form/div/div[2]/div[3]/button"));
			System.out.println(nextResponse.getText());

			dataFromExcelSheet.updateResult(excellocation, sheetName, "Application_page", "PASS");

		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(excellocation, sheetName, "Application_page", "FAIL");
		}

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}*/

	@Test(priority = 5, description = "List ALL")
	public void AllListPages() throws IOException, InterruptedException {

	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(8000);

		// Data Discovery
		try {
			WebElement dd = driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[2]/a/span[1]"));
			dd.click();
			// driver.findElement(By.className("title ng-binding")).click();
			// driver.findElement(By.id(id)).click();
			dataFromExcelSheet.updateResult(excellocation, sheetName, "Data Discovery", "PASS");
			System.out.println(driver.getTitle());
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(excellocation, sheetName, "Data Discovery", "FAIL");
		}
		// Data Visualization
		try {
			WebElement dv = driver.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[3]/a/span[1]"));
			dv.click();
			System.out.println(driver.getTitle() + dv.getText());
			dataFromExcelSheet.updateResult(excellocation, sheetName, "Data Visualization", "PASS");
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(excellocation, sheetName, "Data Visualization", "FAIL");
		}

	}
}
