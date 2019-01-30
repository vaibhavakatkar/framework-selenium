package com.inferyx.framework.selenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.openqa.selenium.NoSuchElementException;

public class Login {
	String excellocation = "/home/rohini007/Selenium/test.xlsx";
	String sheetName = "Sheet1";
	ReadDataFromExcelSheet dataFromExcelSheet = new ReadDataFromExcelSheet();
	WebDriver driver;

	@Test(priority = 1, description = "openBrowser")
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
	public void login() throws IOException, InterruptedException {
		// initialize Chrome driver
		// Enter user id
		WebElement username = driver.findElement(By.xpath("/html/body/div[2]/form[1]/div[2]/input"));
		username.sendKeys("ypalrecha");
		/*
		 * //wait 5 secs for userid to be entered
		 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 */
		// Enter Password
		WebElement password = driver.findElement(By.xpath("/html/body/div[2]/form[1]/div[3]/input"));
		password.sendKeys("ypalrecha");
		// Submit button
		username.submit();
		try {
			Thread.sleep(2000);
			WebElement nextResponse = driver
					.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[2]/form/div/div[2]/div[3]/button"));
			System.out.println(nextResponse.getText());

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
	}

	@Test(priority = 4, description = "List ALL")
	public void AllListPages() throws IOException, InterruptedException {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(8000);

		// Data Discovery
		try {
			WebElement dataDiscovery = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[2]/a/span[1]"));
			dataDiscovery.click();
			// driver.findElement(By.className("title ng-binding")).click();
			// driver.findElement(By.id(id)).click();
			dataFromExcelSheet.updateResult(excellocation, sheetName, "Data Discovery", "PASS");
			System.out.println(driver.getTitle() + dataDiscovery.getText());
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(excellocation, sheetName, "Data Discovery", "FAIL");
		}
		// Data Visualization
		try {
			WebElement dataVisualization = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[3]/a/span[1]"));
			dataVisualization.click();
			System.out.println(driver.getTitle() + dataVisualization.getText());
			dataFromExcelSheet.updateResult(excellocation, sheetName, "Data Visualization", "PASS");
			Thread.sleep(1000);
			// Dashboard
			try {
				WebElement dashboard = driver
						.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[3]/ul/li[1]/a/span[1]"));
				dashboard.click();
				dataFromExcelSheet.updateResult(excellocation, sheetName, "Dashboard", "PASS");
			} catch (NoSuchElementException e) {
				dataFromExcelSheet.updateResult(excellocation, sheetName, "Dashboard", "FAIL");
			}
			Thread.sleep(1000);
			//Vizpod
			try {
				WebElement vizpod = driver
						.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[3]/ul/li[2]/a"));
				vizpod.click();
				dataFromExcelSheet.updateResult(excellocation, sheetName, "Vizpod", "PASS");
			} catch (NoSuchElementException e) {
				dataFromExcelSheet.updateResult(excellocation, sheetName, "Vizpod", "FAIL");
			}
			Thread.sleep(1000);
			//Report
			try {
				WebElement report = driver
						.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[3]/ul/li[3]/a/span[1]"));
				report.click();
				dataFromExcelSheet.updateResult(excellocation, sheetName, "Report", "PASS");
			} catch (NoSuchElementException e) {
				dataFromExcelSheet.updateResult(excellocation, sheetName, "Report", "FAIL");
			}

		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(excellocation, sheetName, "Data Visualization", "FAIL");

		}
		// Data Ingest
		try {
			WebElement dataIngest = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[4]/a/span[1]"));
			dataIngest.click();
			Thread.sleep(1000); // driver.findElement(By.className("title ng-binding")).click();
			// driver.findElement(By.id(id)).click();
			dataFromExcelSheet.updateResult(excellocation, sheetName, "Data Ingest", "PASS");
			System.out.println(driver.getTitle() + dataIngest.getText());
			Thread.sleep(1000);
			//Rule
			try {
				WebElement rule = driver
						.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[4]/ul/li[1]/a/span[1]"));
				rule.click();
				dataFromExcelSheet.updateResult(excellocation, sheetName, "Rule", "PASS");
			} catch (NoSuchElementException e) {
				dataFromExcelSheet.updateResult(excellocation, sheetName, "Rule", "FAIL");
			}
			Thread.sleep(1000);
			//Rule Group
			try {
				WebElement group = driver
						.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[4]/ul/li[2]/a/span[1]"));
				group.click();
				dataFromExcelSheet.updateResult(excellocation, sheetName, "Rule Group", "PASS");
			} catch (NoSuchElementException e) {
				dataFromExcelSheet.updateResult(excellocation, sheetName, "Rule Group", "FAIL");
			}
			Thread.sleep(1000);
			//Result
			try {
				WebElement result = driver
						.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[4]/ul/li[3]/a/span[1]"));
				result.click();
				dataFromExcelSheet.updateResult(excellocation, sheetName, "Result", "PASS");
			} catch (NoSuchElementException e) {
				dataFromExcelSheet.updateResult(excellocation, sheetName, "Result", "FAIL");
			}
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(excellocation, sheetName, "Data Ingest", "FAIL");
		}
		//Data Profile
		try {
			WebElement dataProfile = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[5]/a/span[1]"));
			dataProfile.click();
			Thread.sleep(1000); // driver.findElement(By.className("title ng-binding")).click();
			// driver.findElement(By.id(id)).click();
			dataFromExcelSheet.updateResult(excellocation, sheetName, "Data Profile", "PASS");
			System.out.println(driver.getTitle() + dataProfile.getText());
			Thread.sleep(1000);
			//Rule
			try {
				WebElement rule = driver
						.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[5]/ul/li[1]/a/span[1]"));
				rule.click();
				dataFromExcelSheet.updateResult(excellocation, sheetName, "Rule", "PASS");
			} catch (NoSuchElementException e) {
				dataFromExcelSheet.updateResult(excellocation, sheetName, "Rule", "FAIL");
			}
			Thread.sleep(1000);
			//Group
			try {
				WebElement group = driver
						.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[5]/ul/li[2]/a/span[1]"));
				group.click();
				dataFromExcelSheet.updateResult(excellocation, sheetName, "Group", "PASS");
			} catch (NoSuchElementException e) {
				dataFromExcelSheet.updateResult(excellocation, sheetName, "Group", "FAIL");
			}
			Thread.sleep(1000);
			//Result
			try {
				WebElement result = driver
						.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[5]/ul/li[3]/a/span[1]"));
				result.click();
				dataFromExcelSheet.updateResult(excellocation, sheetName, "Result", "PASS");
			} catch (NoSuchElementException e) {
				dataFromExcelSheet.updateResult(excellocation, sheetName, "Result", "FAIL");
			}
			//Compare Result
			try {
				WebElement compResult = driver
						.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[5]/ul/li[4]/a/span[1]"));
				compResult.click();
				dataFromExcelSheet.updateResult(excellocation, sheetName, "Compare Result", "PASS");
			} catch (NoSuchElementException e) {
				dataFromExcelSheet.updateResult(excellocation, sheetName, "Compare Result", "FAIL");
			}
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(excellocation, sheetName, "Data Profile", "FAIL");
		}
		//Data Quality
		try {
			WebElement dataQuality = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[6]/a/span[1]"));
			dataQuality.click();
			Thread.sleep(1000); // driver.findElement(By.className("title ng-binding")).click();
			// driver.findElement(By.id(id)).click();
			dataFromExcelSheet.updateResult(excellocation, sheetName, "Data Quality", "PASS");
			System.out.println(driver.getTitle() + dataQuality.getText());
			Thread.sleep(1000);
			//Rule
			try {
				WebElement rule = driver
						.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[6]/ul/li[1]/a/span[1]"));
				rule.click();
				dataFromExcelSheet.updateResult(excellocation, sheetName, "Rule", "PASS");
			} catch (NoSuchElementException e) {
				dataFromExcelSheet.updateResult(excellocation, sheetName, "Rule", "FAIL");
			}Thread.sleep(1000);
			//Group
			try {
				WebElement group = driver
						.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[6]/ul/li[2]/a/span[1]"));
				group.click();
				dataFromExcelSheet.updateResult(excellocation, sheetName, "Group", "PASS");
			} catch (NoSuchElementException e) {
				dataFromExcelSheet.updateResult(excellocation, sheetName, "Group", "FAIL");
			}
			Thread.sleep(1000);
			//Result
			try {
				WebElement result = driver
						.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[6]/ul/li[3]/a/span[1]"));
				result.click();
				dataFromExcelSheet.updateResult(excellocation, sheetName, "Result", "PASS");
			} catch (NoSuchElementException e) {
				dataFromExcelSheet.updateResult(excellocation, sheetName, "Result", "FAIL");
			}
			Thread.sleep(1000);
			//Compare Result
			try {
				WebElement compResult = driver
						.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[6]/ul/li[4]/a/span[1]"));
				compResult.click();
				dataFromExcelSheet.updateResult(excellocation, sheetName, "Compare Result", "PASS");
			} catch (NoSuchElementException e) {
				dataFromExcelSheet.updateResult(excellocation, sheetName, "Compare Result", "FAIL");
			}
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(excellocation, sheetName, "Data Quality", "FAIL");
		}
		//Data Preparation
		try {
			WebElement dataPreparation = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[7]/a/span[1]"));
			dataPreparation.click();
			Thread.sleep(1000); // driver.findElement(By.className("title ng-binding")).click();
			// driver.findElement(By.id(id)).click();
			dataFromExcelSheet.updateResult(excellocation, sheetName, "Data Preparation", "PASS");
			System.out.println(driver.getTitle() + dataPreparation.getText());
			Thread.sleep(1000);
			//Datapod
			try {
				WebElement datapod = driver
						.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[7]/ul/li[1]/a/span[1]"));
				datapod.click();
				dataFromExcelSheet.updateResult(excellocation, sheetName, "Datapod", "PASS");
			} catch (NoSuchElementException e) {
				dataFromExcelSheet.updateResult(excellocation, sheetName, "Datapod", "FAIL");
			}
			Thread.sleep(1000);
			//Dataset
			try {
				WebElement dataset = driver
						.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[7]/ul/li[2]/a/span[1]"));
				dataset.click();
				dataFromExcelSheet.updateResult(excellocation, sheetName, "Dataset", "PASS");
			} catch (NoSuchElementException e) {
				dataFromExcelSheet.updateResult(excellocation, sheetName, "Dataset", "FAIL");
			}
			Thread.sleep(1000);
			//Expression
			try {
				WebElement expression = driver
						.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[7]/ul/li[3]/a/span[1]"));
				expression.click();
				dataFromExcelSheet.updateResult(excellocation, sheetName, "Expression", "PASS");
			} catch (NoSuchElementException e) {
				dataFromExcelSheet.updateResult(excellocation, sheetName, "Expression", "FAIL");
			}
			Thread.sleep(1000);
			//Formula
			try {
				WebElement formula = driver
						.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[7]/ul/li[4]/a/span[1]"));
				formula.click();
				dataFromExcelSheet.updateResult(excellocation, sheetName, "Formula", "PASS");
			} catch (NoSuchElementException e) {
				dataFromExcelSheet.updateResult(excellocation, sheetName, "Formula", "FAIL");
			}
			Thread.sleep(1000);
			//Function
			try {
				WebElement function = driver
						.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[7]/ul/li[5]/a/span[1]"));
				function.click();
				dataFromExcelSheet.updateResult(excellocation, sheetName, "Function", "PASS");
			} catch (NoSuchElementException e) {
				dataFromExcelSheet.updateResult(excellocation, sheetName, "Function", "FAIL");
			}
			Thread.sleep(1000);
			//Map
			try {
				WebElement map = driver
						.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[7]/ul/li[6]/a/span[1]"));
				map.click();
				dataFromExcelSheet.updateResult(excellocation, sheetName, "Map", "PASS");
			} catch (NoSuchElementException e) {
				dataFromExcelSheet.updateResult(excellocation, sheetName, "Map", "FAIL");
			}
			Thread.sleep(1000);
			//Relation
			try {
				WebElement relation = driver
						.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[7]/ul/li[7]/a/span[1]"));
				relation.click();
				dataFromExcelSheet.updateResult(excellocation, sheetName, "Relation", "PASS");
			} catch (NoSuchElementException e) {
				dataFromExcelSheet.updateResult(excellocation, sheetName, "Relation", "FAIL");
			}
			Thread.sleep(1000);
			//Result
			try {
				WebElement result = driver
						.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[7]/ul/li[8]/a/span[1]"));
				result.click();
				dataFromExcelSheet.updateResult(excellocation, sheetName, "Result", "PASS");
			} catch (NoSuchElementException e) {
				dataFromExcelSheet.updateResult(excellocation, sheetName, "Result", "FAIL");
			}
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(excellocation, sheetName, "Data Preparation", "FAIL");
		}
		//Data Recon
		try {
			WebElement dataRecon = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[8]/a/span[1]"));
			dataRecon.click();
			Thread.sleep(1000); // driver.findElement(By.className("title ng-binding")).click();
			// driver.findElement(By.id(id)).click();
			dataFromExcelSheet.updateResult(excellocation, sheetName, "Data Renconciliation", "PASS");
			System.out.println(driver.getTitle() + dataRecon.getText());
			Thread.sleep(1000);
			//Rule
			try {
				WebElement rule = driver
						.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[8]/ul/li[1]/a/span[1]"));
				rule.click();
				dataFromExcelSheet.updateResult(excellocation, sheetName, "Rule", "PASS");
			} catch (NoSuchElementException e) {
				dataFromExcelSheet.updateResult(excellocation, sheetName, "Rule", "FAIL");
			}
			Thread.sleep(1000);
			//Rule Group
			try {
				WebElement group = driver
						.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[8]/ul/li[2]/a/span[1]"));
				group.click();
				dataFromExcelSheet.updateResult(excellocation, sheetName, "Rule Group", "PASS");
			} catch (NoSuchElementException e) {
				dataFromExcelSheet.updateResult(excellocation, sheetName, "Rule Grou", "FAIL");
			}
			Thread.sleep(1000);
			//Result
			try {
				WebElement result = driver
						.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[8]/ul/li[3]/a/span[1]"));
				result.click();
				dataFromExcelSheet.updateResult(excellocation, sheetName, "Result", "PASS");
			} catch (NoSuchElementException e) {
				dataFromExcelSheet.updateResult(excellocation, sheetName, "Result", "FAIL");
			}
			Thread.sleep(1000);
			//Compare Result
			try {
				WebElement compResult = driver
						.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[8]/ul/li[4]/a/span[1]"));
				compResult.click();
				dataFromExcelSheet.updateResult(excellocation, sheetName, "Compare Result", "PASS");
			} catch (NoSuchElementException e) {
				dataFromExcelSheet.updateResult(excellocation, sheetName, "Compare Result", "FAIL");
			}
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(excellocation, sheetName, "Data Renconciliation", "FAIL");
		}
		//Business Rule
		try {
			WebElement businessRule = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[9]/a/span[1]"));
			businessRule.click();
			Thread.sleep(1000); // driver.findElement(By.className("title ng-binding")).click();
			// driver.findElement(By.id(id)).click();
			dataFromExcelSheet.updateResult(excellocation, sheetName, "Business Rule", "PASS");
			System.out.println(driver.getTitle() + businessRule.getText());
			Thread.sleep(1000);
			//Rule
			try {
				WebElement rule = driver
						.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[9]/ul/li[1]/a/span[1]"));
				rule.click();
				dataFromExcelSheet.updateResult(excellocation, sheetName, "Rule", "PASS");
			} catch (NoSuchElementException e) {
				dataFromExcelSheet.updateResult(excellocation, sheetName, "Rule", "FAIL");
			}
			Thread.sleep(1000);
			//Rule Group
			try {
				WebElement group = driver
						.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[9]/ul/li[2]/a/span[1]"));
				group.click();
				dataFromExcelSheet.updateResult(excellocation, sheetName, "Rule Group", "PASS");
			} catch (NoSuchElementException e) {
				dataFromExcelSheet.updateResult(excellocation, sheetName, "Rule Group", "FAIL");
			}
			Thread.sleep(1000);
			//Result
			try {
				WebElement result = driver
						.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[9]/ul/li[4]/a/span[1]"));
				result.click();
				dataFromExcelSheet.updateResult(excellocation, sheetName, "Result", "PASS");
			} catch (NoSuchElementException e) {
				dataFromExcelSheet.updateResult(excellocation, sheetName, "Result", "FAIL");
			}
			Thread.sleep(1000);
			//Parameter List
			try {
				WebElement paramList = driver
						.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[9]/ul/li[3]/a/span[1]"));
				paramList.click();
				dataFromExcelSheet.updateResult(excellocation, sheetName, "Parameter List", "PASS");
			} catch (NoSuchElementException e) {
				dataFromExcelSheet.updateResult(excellocation, sheetName, "Parameter List", "FAIL");
			}
			Thread.sleep(1000);
			//Compare Result
			try {
				WebElement compResult = driver
						.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[9]/ul/li[5]/a/span[1]"));
				compResult.click();
				dataFromExcelSheet.updateResult(excellocation, sheetName, "Compare Result", "PASS");
			} catch (NoSuchElementException e) {
				dataFromExcelSheet.updateResult(excellocation, sheetName, "Compare Result", "FAIL");
			}
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(excellocation, sheetName, "Business Rule", "FAIL");
		}
		//Data Science
		try {
			WebElement dataScience = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[10]/a/span[1]"));
			dataScience.click();
			Thread.sleep(1000); // driver.findElement(By.className("title ng-binding")).click();
			// driver.findElement(By.id(id)).click();
			dataFromExcelSheet.updateResult(excellocation, sheetName, "Data Science", "PASS");
			System.out.println(driver.getTitle() + dataScience.getText());
			Thread.sleep(1000);
							//Algorithm
							try {
								WebElement algo = driver
										.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[10]/ul/li[1]/a/span[1]"));
								algo.click();
								dataFromExcelSheet.updateResult(excellocation, sheetName, "Algorithm", "PASS");
							} catch (NoSuchElementException e) {
								dataFromExcelSheet.updateResult(excellocation, sheetName, "Algorithm", "FAIL");
							}
							Thread.sleep(1000);
							//Distribution
							try {
								WebElement dist = driver
										.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[10]/ul/li[2]/a/span[1]"));
								dist.click();
								dataFromExcelSheet.updateResult(excellocation, sheetName, "Distribution", "PASS");
							} catch (NoSuchElementException e) {
								dataFromExcelSheet.updateResult(excellocation, sheetName, "Distribution", "FAIL");
							}
							Thread.sleep(1000);
							//Model
							try {
								WebElement model = driver
										.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[10]/ul/li[3]/a/span[1]"));
								model.click();
								dataFromExcelSheet.updateResult(excellocation, sheetName, "Model", "PASS");
							} catch (NoSuchElementException e) {
								dataFromExcelSheet.updateResult(excellocation, sheetName, "Model", "FAIL");
							}
							Thread.sleep(1000);
							//Parameter List
							try {
								WebElement paramList = driver
										.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[10]/ul/li[4]/a/span[1]"));
								paramList.click();
								dataFromExcelSheet.updateResult(excellocation, sheetName, "Parameter List", "PASS");
							} catch (NoSuchElementException e) {
								dataFromExcelSheet.updateResult(excellocation, sheetName, "Parameter List", "FAIL");
							}
							Thread.sleep(1000);
							//Parameter Set
							try {
								WebElement paramSet = driver
										.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[10]/ul/li[5]/a/span[1]"));
								paramSet.click();
								dataFromExcelSheet.updateResult(excellocation, sheetName, "Parameter Set", "PASS");
							} catch (NoSuchElementException e) {
								dataFromExcelSheet.updateResult(excellocation, sheetName, "Parameter Set", "FAIL");
							}
							Thread.sleep(1000);
							//Operator
							try {
								WebElement operator = driver
										.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[10]/ul/li[6]/a/span[1]"));
								operator.click();
								dataFromExcelSheet.updateResult(excellocation, sheetName, "Operator", "PASS");
							} catch (NoSuchElementException e) {
								dataFromExcelSheet.updateResult(excellocation, sheetName, "Operator", "FAIL");
							}
							Thread.sleep(1000);
							//Training
							try {
								WebElement training = driver
										.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[10]/ul/li[7]/a/span[1]"));
								training.click();
								dataFromExcelSheet.updateResult(excellocation, sheetName, "Training", "PASS");
							} catch (NoSuchElementException e) {
								dataFromExcelSheet.updateResult(excellocation, sheetName, "Training", "FAIL");
							}
							Thread.sleep(1000);
							//Prediction
							try {
								WebElement prediction = driver
										.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[10]/ul/li[8]/a/span[1]"));
								prediction.click();
								dataFromExcelSheet.updateResult(excellocation, sheetName, "Prediction", "PASS");
							} catch (NoSuchElementException e) {
								dataFromExcelSheet.updateResult(excellocation, sheetName, "Prediction", "FAIL");
							}
							Thread.sleep(1000);
							//Simulation
							try {
								WebElement simulation = driver
										.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[10]/ul/li[9]/a/span[1]"));
								simulation.click();
								dataFromExcelSheet.updateResult(excellocation, sheetName, "Simulation", "PASS");
							} catch (NoSuchElementException e) {
								dataFromExcelSheet.updateResult(excellocation, sheetName, "Simulation", "FAIL");
							}
							Thread.sleep(1000);
							//Model Deploy
							try {
								WebElement modelDeploy = driver
										.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[10]/ul/li[10]/a/span[1]"));
								modelDeploy.click();
								dataFromExcelSheet.updateResult(excellocation, sheetName, "Model Deploy", "PASS");
							} catch (NoSuchElementException e) {
								dataFromExcelSheet.updateResult(excellocation, sheetName, "Model Deploy", "FAIL");
							}
							Thread.sleep(1000);
							//what-If-Analysis
							try {
								WebElement whatIf = driver
										.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[10]/ul/li[11]/a/span[1]"));
								whatIf.click();
								dataFromExcelSheet.updateResult(excellocation, sheetName, "what-If-Analysis", "PASS");
							} catch (NoSuchElementException e) {
								dataFromExcelSheet.updateResult(excellocation, sheetName, "what-If-Analysis", "FAIL");
							}
							Thread.sleep(1000);
							//Result
							try {
								WebElement result = driver
										.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[10]/ul/li[12]/a/span[1]"));
								result.click();
								dataFromExcelSheet.updateResult(excellocation, sheetName, "Result", "PASS");
							} catch (NoSuchElementException e) {
								dataFromExcelSheet.updateResult(excellocation, sheetName, "Result", "FAIL");
							}
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(excellocation, sheetName, "Business Rule", "FAIL");
		}
		try {
			WebElement graph = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[11]/a/span[1]"));
			graph.click();
			Thread.sleep(1000); // driver.findElement(By.className("title ng-binding")).click();
			// driver.findElement(By.id(id)).click();
			dataFromExcelSheet.updateResult(excellocation, sheetName, "Graph Analysis", "PASS");
			System.out.println(driver.getTitle() + graph.getText());
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(excellocation, sheetName, "Graph Analysis", "FAIL");
		}
		try {
			WebElement pipeline = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[12]/a/span[1]"));
			pipeline.click();
			Thread.sleep(1000); // driver.findElement(By.className("title ng-binding")).click();
			// driver.findElement(By.id(id)).click();
			dataFromExcelSheet.updateResult(excellocation, sheetName, "Pipeline", "PASS");
			System.out.println(driver.getTitle() + pipeline.getText());
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(excellocation, sheetName, "Pipeline", "FAIL");
		}
		try {
			WebElement batch = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[13]/a/span[1]"));
			batch.click();
			Thread.sleep(1000); // driver.findElement(By.className("title ng-binding")).click();
			// driver.findElement(By.id(id)).click();
			dataFromExcelSheet.updateResult(excellocation, sheetName, "Batch Scheduler", "PASS");
			System.out.println(driver.getTitle() + batch.getText());
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(excellocation, sheetName, "Batch Scheduler", "FAIL");
		}
		try {
			WebElement admin = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[14]/a/span[1]"));
			admin.click();
			Thread.sleep(1000); // driver.findElement(By.className("title ng-binding")).click();
			// driver.findElement(By.id(id)).click();
			dataFromExcelSheet.updateResult(excellocation, sheetName, "Admin", "PASS");
			System.out.println(driver.getTitle() + admin.getText());
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(excellocation, sheetName, "Admin", "FAIL");
		}
		try {
			WebElement jobMonitoring = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[15]/a/span[1]"));
			jobMonitoring.click();
			Thread.sleep(3000); // driver.findElement(By.className("title ng-binding")).click();
			// driver.findElement(By.id(id)).click();
			dataFromExcelSheet.updateResult(excellocation, sheetName, "Job Monitoring", "PASS");
			System.out.println(driver.getTitle() + jobMonitoring.getText());
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(excellocation, sheetName, "Job Monitoring", "FAIL");
		}
		try {
			WebElement systemMonitoring = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[16]/a/span[1]"));
			systemMonitoring.click();
			Thread.sleep(3000); // driver.findElement(By.className("title ng-binding")).click();
			// driver.findElement(By.id(id)).click();
			dataFromExcelSheet.updateResult(excellocation, sheetName, "System Monitoring", "PASS");
			System.out.println(driver.getTitle() + systemMonitoring.getText());
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(excellocation, sheetName, "System Monitoring", "FAIL");
		}
		try {
			WebElement metadata = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[17]/a/span[1]"));
			metadata.click();
			Thread.sleep(5000); // driver.findElement(By.className("title ng-binding")).click();
			// driver.findElement(By.id(id)).click();
			dataFromExcelSheet.updateResult(excellocation, sheetName, "Metadata Navigator", "PASS");
			System.out.println(driver.getTitle() + metadata.getText());
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(excellocation, sheetName, "Metadata Navigator", "FAIL");
		}

	}
}
