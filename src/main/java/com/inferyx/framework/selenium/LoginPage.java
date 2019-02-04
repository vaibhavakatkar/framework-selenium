package com.inferyx.framework.selenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPage extends TestBase {
	// Login loginPage;
	ReadDataFromExcelSheet dataFromExcelSheet = new ReadDataFromExcelSheet();

	public LoginPage() {
		super();
	}

	public void setUp() {
		System.out.println("initilization");
		initialization();

	}

	@Test(priority = 1, description = "openBrowser")
	public void openBrowser() throws IOException {
		start = System.currentTimeMillis();

		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		driver = new ChromeDriver();
		// Open application
		finish = System.currentTimeMillis();
		totalTime = finish - start; 
		driver.get("http://localhost:8080/app/login.html");
		driver.manage().window().maximize();
		// Assert.assertEquals(driver.getTitle().toString(), "Inferyx | Login");
		if (driver.getTitle().isEmpty() || !driver.getTitle().equalsIgnoreCase("Inferyx | Login")) {
			dataFromExcelSheet.updateResult(1, 2, "Open Browser", "FAIL",totalTime);
		} else {
			dataFromExcelSheet.updateResult(1, 2, "Open Browser", "PASS",totalTime);
		}

	}

	@Test(priority = 2, description = "login check")
	public void login() throws IOException, InterruptedException {
		// initialize Chrome driver
		// Enter user id
		WebElement username = driver.findElement(By.xpath("/html/body/div[2]/form[1]/div[2]/input"));
		username.sendKeys(dataFromExcelSheet.getResult(getResult,"USER_NAME"));/*
		 * //wait 5 secs for userid to be entered
		 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 */
		// Enter Password
		WebElement password = driver.findElement(By.xpath("/html/body/div[2]/form[1]/div[3]/input"));
		password.sendKeys(dataFromExcelSheet.getResult(getResult,"PASSWORD"));
		// Submit button
		start = System.currentTimeMillis();
		username.submit();
		Thread.sleep(1000);
		try {
			/*
			 * WebElement nextResponse = driver .findElement(By.xpath(
			 * "//*[@id=\"myModal\"]/div/div/div[2]/form/div/div[2]/div[3]/button"));
			 * System.out.println(nextResponse.getText());
			 */
			Thread.sleep(1000);
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(1, 2, "Login_page", "PASS",totalTime);

		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(1, 2, "Login_page", "FAIL",totalTime);
		}
	}

	@Test(priority = 3, description = "appSelection")
	public void appSelection() throws IOException, InterruptedException {
		// for App selection
		Thread.sleep(1000);

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
			start = System.currentTimeMillis();
			driver.findElements(By.xpath("//*[@id=\"myModal\"]/div/div/div[2]/form/div/div[2]/div[3]/button")).get(0)
					.click();
			finish = System.currentTimeMillis();
			totalTime = finish - start; 
			WebElement nextResponse = driver
					.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[2]/form/div/div[2]/div[3]/button"));
			System.out.println(nextResponse.getText());
			dataFromExcelSheet.updateResult(1, 2, "Application_page", "PASS",totalTime);
			Thread.sleep(2000);

		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(1, 2, "Application_page", "FAIL",totalTime);
		}

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

}
