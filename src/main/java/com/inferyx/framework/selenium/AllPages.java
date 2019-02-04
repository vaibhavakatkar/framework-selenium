package com.inferyx.framework.selenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.NoSuchElementException;

public class AllPages extends TestBase{
	//String excellocation = "test.xlsx";
	String excellocation =System.getProperty("user.dir")+"/src/main/resources/test.xlsx";

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

	@Test(priority = 4, description = "Lisfilingt ALL")
	public void AllListPages() throws IOException, InterruptedException {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(8000);
		long totalTime = 0;
		// Data Discovery
		try {
			WebElement dataDiscovery = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[2]/a/span[1]"));
			long start = System.currentTimeMillis();
			Thread.sleep(1000);
			dataDiscovery.click();			
			long finish = System.currentTimeMillis();
			totalTime = finish - start; 
			
			dataFromExcelSheet.updateResult(updateResult, "Data Discovery", "PASS", totalTime);
			System.out.println(driver.getTitle() + dataDiscovery.getText());
			Thread.sleep(1000);
			// account datapod
			try {
				WebElement accountData = driver
						.findElement(By.xpath("/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[2]/div/div/div[2]/div[1]/div[1]/div/a/div/div[1]"));
				long start11 = System.currentTimeMillis();
				Thread.sleep(1000);
				accountData.click();
				long finish11 = System.currentTimeMillis();
				totalTime = finish11 - start11; 
				dataFromExcelSheet.updateResult(4,5,"Account Card", "PASS",totalTime);
			} catch (NoSuchElementException e) {
				dataFromExcelSheet.updateResult(updateResult, "Account Card", "FAIL", totalTime);
			}
		
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(updateResult, "Data Discovery", "FAIL", totalTime);
		}
		// Data Visualization
		try {
			WebElement dataVisualization = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[3]/a/span[1]"));
			long start = System.currentTimeMillis();
			Thread.sleep(1000);
			dataVisualization.click();
			System.out.println(driver.getTitle() + dataVisualization.getText());
			long finish = System.currentTimeMillis();
			totalTime = finish - start; 
			dataFromExcelSheet.updateResult(updateResult, "Data Visualization", "PASS", totalTime);
			Thread.sleep(1000);
					// Dashboard
					try {
						WebElement dashboard = driver
								.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[3]/ul/li[1]/a/span[1]"));
						long start11 = System.currentTimeMillis();
						Thread.sleep(1000);
						dashboard.click();
						long finish11 = System.currentTimeMillis();
						totalTime = finish11 - start11; 
						dataFromExcelSheet.updateResult(updateResult, "Dashboard", "PASS", totalTime);
					} catch (NoSuchElementException e) {
						dataFromExcelSheet.updateResult(updateResult, "Dashboard", "FAIL", totalTime);
					}
					Thread.sleep(1000);
					//Vizpod
					try {
						WebElement vizpod = driver
								.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[3]/ul/li[2]/a"));
						long start1 = System.currentTimeMillis();
						vizpod.click();
						Thread.sleep(1000);
						long finish1 = System.currentTimeMillis();
						totalTime = finish1 - start1; 
						dataFromExcelSheet.updateResult(updateResult, "Vizpod", "PASS", totalTime);
					} catch (NoSuchElementException e) {
						dataFromExcelSheet.updateResult(updateResult, "Vizpod", "FAIL", totalTime);
					}
					Thread.sleep(1000);
					//Report
					try {
						WebElement report = driver
								.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[3]/ul/li[3]/a/span[1]"));
						long start1 = System.currentTimeMillis();
						Thread.sleep(1000);
						report.click();
						long finish1 = System.currentTimeMillis();
						totalTime = finish1 - start1;
						dataFromExcelSheet.updateResult(updateResult, "Report", "PASS", totalTime);
					} catch (NoSuchElementException e) {
						dataFromExcelSheet.updateResult(updateResult, "Report", "FAIL", totalTime);
					}

		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(updateResult, "Data Visualization", "FAIL", totalTime);

		}
		// Data Ingest
		try {
			WebElement dataIngest = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[4]/a/span[1]"));
			long start = System.currentTimeMillis();
			Thread.sleep(1000); 
			dataIngest.click();
			long finish = System.currentTimeMillis();
			totalTime = finish - start;
			dataFromExcelSheet.updateResult(updateResult, "Data Ingest", "PASS", totalTime);
			System.out.println(driver.getTitle() + dataIngest.getText());
			Thread.sleep(1000);
					//Rule
					try {
						WebElement rule = driver
								.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[4]/ul/li[1]/a/span[1]"));
						long start1 = System.currentTimeMillis();
						Thread.sleep(1000); 
						rule.click();
						long finish1 = System.currentTimeMillis();
						totalTime = finish1 - start1;
						dataFromExcelSheet.updateResult(updateResult, "Rule", "PASS", totalTime);
					} catch (NoSuchElementException e) {
						dataFromExcelSheet.updateResult(updateResult, "Rule", "FAIL", totalTime);
					}
					Thread.sleep(1000);
					//Rule Group
					try {
						WebElement group = driver
								.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[4]/ul/li[2]/a/span[1]"));
						long start1 = System.currentTimeMillis();
						Thread.sleep(1000); 
						group.click();
						long finish1 = System.currentTimeMillis();
						totalTime = finish1 - start1;
						dataFromExcelSheet.updateResult(updateResult, "Rule Group", "PASS", totalTime);
					} catch (NoSuchElementException e) {
						dataFromExcelSheet.updateResult(updateResult, "Rule Group", "FAIL", totalTime);
					}
					Thread.sleep(1000);
					//Result
					try {
						WebElement result = driver
								.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[4]/ul/li[3]/a/span[1]"));
						long start1 = System.currentTimeMillis();
						Thread.sleep(1000); 
						result.click();
						long finish1 = System.currentTimeMillis();
						totalTime = finish1 - start1;
						dataFromExcelSheet.updateResult(updateResult, "Result", "PASS", totalTime);
					} catch (NoSuchElementException e) {
						dataFromExcelSheet.updateResult(updateResult, "Result", "FAIL", totalTime);
					}
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(updateResult, "Data Ingest", "FAIL", 0);
		}
		//Data Profile
		try {
			WebElement dataProfile = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[5]/a/span[1]"));
			long start1 = System.currentTimeMillis();
			Thread.sleep(1000); 
			dataProfile.click();
			long finish1 = System.currentTimeMillis();
			totalTime = finish1 - start1;
			dataFromExcelSheet.updateResult(updateResult, "Data Profile", "PASS", totalTime);
			System.out.println(driver.getTitle() + dataProfile.getText());
			Thread.sleep(1000);
						//Rule
						try {
							WebElement rule = driver
									.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[5]/ul/li[1]/a/span[1]"));
							long start11 = System.currentTimeMillis();
							Thread.sleep(1000); 
							rule.click();
							long finish11 = System.currentTimeMillis();
							totalTime = finish11 - start11;
							dataFromExcelSheet.updateResult(updateResult, "Rule", "PASS", totalTime);
						} catch (NoSuchElementException e) {
							dataFromExcelSheet.updateResult(updateResult, "Rule", "FAIL", totalTime);
						}
						Thread.sleep(1000);
						//Group
						try {
							WebElement group = driver
									.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[5]/ul/li[2]/a/span[1]"));
							long start11 = System.currentTimeMillis();
							Thread.sleep(1000); 
							group.click();
							long finish11 = System.currentTimeMillis();
							totalTime = finish11 - start11;
							dataFromExcelSheet.updateResult(updateResult, "Rule Group", "PASS", totalTime);
						} catch (NoSuchElementException e) {
							dataFromExcelSheet.updateResult(updateResult, "Rule Group", "FAIL", totalTime);
						}
						Thread.sleep(1000);
						//Result
						try {
							WebElement result = driver
									.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[5]/ul/li[3]/a/span[1]"));
							long start11 = System.currentTimeMillis();
							Thread.sleep(1000); 
							result.click();
							long finish11 = System.currentTimeMillis();
							totalTime = finish11 - start11;
							dataFromExcelSheet.updateResult(updateResult, "Result", "PASS", totalTime);
						} catch (NoSuchElementException e) {
							dataFromExcelSheet.updateResult(updateResult, "Result", "FAIL", totalTime);
						}
						//Compare Result
						try {
							WebElement compResult = driver
									.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[5]/ul/li[4]/a/span[1]"));
							long start11 = System.currentTimeMillis();
							Thread.sleep(1000);
							compResult.click();
							long finish11 = System.currentTimeMillis();
							totalTime = finish11 - start11;
							dataFromExcelSheet.updateResult(updateResult, "Compare Result", "PASS", totalTime);
						} catch (NoSuchElementException e) {
							dataFromExcelSheet.updateResult(updateResult, "Compare Result", "FAIL", totalTime);
						}
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(updateResult, "Data Profile", "FAIL", 0);
		}
		//Data Quality
		try {
			WebElement dataQuality = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[6]/a/span[1]"));
			long start11 = System.currentTimeMillis();
			Thread.sleep(1000); 
			dataQuality.click();
			long finish11 = System.currentTimeMillis();
			totalTime = finish11 - start11;
			dataFromExcelSheet.updateResult(updateResult, "Data Quality", "PASS", totalTime);
			System.out.println(driver.getTitle() + dataQuality.getText());
			Thread.sleep(1000);
					//Rule
					try {
						WebElement rule = driver
								.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[6]/ul/li[1]/a/span[1]"));
						long start111 = System.currentTimeMillis();
						Thread.sleep(1000);
						rule.click();
						long finish111 = System.currentTimeMillis();
						totalTime = finish111 - start111;
						dataFromExcelSheet.updateResult(updateResult, "Rule", "PASS", totalTime);
					} catch (NoSuchElementException e) {
						dataFromExcelSheet.updateResult(updateResult, "Rule", "FAIL", totalTime);
					}
					Thread.sleep(1000);
					//Group
					try {
						WebElement group = driver
								.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[6]/ul/li[2]/a/span[1]"));
						long start111 = System.currentTimeMillis();
						Thread.sleep(1000);
						group.click();
						long finish111 = System.currentTimeMillis();
						totalTime = finish111 - start111;
						dataFromExcelSheet.updateResult(updateResult, "Rule Group" + "", "PASS", totalTime);
					} catch (NoSuchElementException e) {
						dataFromExcelSheet.updateResult(updateResult, "Rule Group", "FAIL", totalTime);
					}
					Thread.sleep(1000);
					//Result
					try {
						WebElement result = driver
								.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[6]/ul/li[3]/a/span[1]"));
						long start111 = System.currentTimeMillis();
						Thread.sleep(1000);
						result.click();
						long finish111 = System.currentTimeMillis();
						totalTime = finish111 - start111;
						dataFromExcelSheet.updateResult(updateResult, "Result", "PASS", totalTime);
					} catch (NoSuchElementException e) {
						dataFromExcelSheet.updateResult(updateResult, "Result", "FAIL", totalTime);
					}
					Thread.sleep(1000);
					//Compare Result
					try {
						WebElement compResult = driver
								.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[6]/ul/li[4]/a/span[1]"));
						long start111 = System.currentTimeMillis();
						Thread.sleep(1000);
						compResult.click();
						long finish111 = System.currentTimeMillis();
						totalTime = finish111 - start111;
						dataFromExcelSheet.updateResult(updateResult, "Compare Result", "PASS", totalTime);
					} catch (NoSuchElementException e) {
						dataFromExcelSheet.updateResult(updateResult, "Compare Result", "FAIL", totalTime);
					}
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(updateResult, "Data Quality", "FAIL", totalTime);
		}
		//Data Preparation
		try {
			WebElement dataPreparation = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[7]/a/span[1]"));
			long start111 = System.currentTimeMillis();
			Thread.sleep(1000); 
			dataPreparation.click();
			long finish111 = System.currentTimeMillis();
			totalTime = finish111 - start111;
			dataFromExcelSheet.updateResult(updateResult, "Data Preparation", "PASS", totalTime);
			System.out.println(driver.getTitle() + dataPreparation.getText());
			Thread.sleep(1000);
					//Datapod
					try {
						WebElement datapod = driver
								.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[7]/ul/li[1]/a/span[1]"));
						long start1111 = System.currentTimeMillis();
						Thread.sleep(1000);
						datapod.click();
						long finish1111 = System.currentTimeMillis();
						totalTime = finish1111 - start1111;
						dataFromExcelSheet.updateResult(updateResult, "Datapod", "PASS", totalTime);
					} catch (NoSuchElementException e) {
						dataFromExcelSheet.updateResult(updateResult, "Datapod", "FAIL", totalTime);
					}
					Thread.sleep(1000);
					//Dataset
					try {
						WebElement dataset = driver
								.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[7]/ul/li[2]/a/span[1]"));
						long start1111 = System.currentTimeMillis();
						Thread.sleep(1000);
						dataset.click();
						long finish1111 = System.currentTimeMillis();
						totalTime = finish1111 - start1111;
						dataFromExcelSheet.updateResult(updateResult, "Dataset", "PASS", totalTime);
					} catch (NoSuchElementException e) {
						dataFromExcelSheet.updateResult(updateResult, "Dataset", "FAIL", totalTime);
					}
					Thread.sleep(1000);
					//Expression
					try {
						WebElement expression = driver
								.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[7]/ul/li[3]/a/span[1]"));
						long start1111 = System.currentTimeMillis();
						Thread.sleep(1000);
						expression.click();
						long finish1111 = System.currentTimeMillis();
						totalTime = finish1111 - start1111;
						dataFromExcelSheet.updateResult(updateResult, "Expression", "PASS", totalTime);
					} catch (NoSuchElementException e) {
						dataFromExcelSheet.updateResult(updateResult, "Expression", "FAIL", totalTime);
					}
					Thread.sleep(1000);
					//Formula
					try {
						WebElement formula = driver
								.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[7]/ul/li[4]/a/span[1]"));
						long start1111 = System.currentTimeMillis();
						Thread.sleep(1000);
						formula.click();
						long finish1111 = System.currentTimeMillis();
						totalTime = finish1111 - start1111;
						dataFromExcelSheet.updateResult(updateResult, "Formula", "PASS", totalTime);
					} catch (NoSuchElementException e) {
						dataFromExcelSheet.updateResult(updateResult, "Formula", "FAIL", totalTime);
					}
					Thread.sleep(1000);
					//Function
					try {
						WebElement function = driver
								.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[7]/ul/li[5]/a/span[1]"));
						long start1111 = System.currentTimeMillis();
						Thread.sleep(1000);
						function.click();
						long finish1111 = System.currentTimeMillis();
						totalTime = finish1111 - start1111;
						dataFromExcelSheet.updateResult(updateResult, "Function", "PASS", totalTime);
					} catch (NoSuchElementException e) {
						dataFromExcelSheet.updateResult(updateResult, "Function", "FAIL", totalTime);
					}
					Thread.sleep(6000);
					//Map
					try {
						WebElement map = driver
								.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[7]/ul/li[6]/a/span[1]"));
						long start1111 = System.currentTimeMillis();
						Thread.sleep(1000);
						map.click();
						long finish1111 = System.currentTimeMillis();
						totalTime = finish1111 - start1111;
						dataFromExcelSheet.updateResult(updateResult, "Map", "PASS", totalTime);
					} catch (NoSuchElementException e) {
						dataFromExcelSheet.updateResult(updateResult, "Map", "FAIL", totalTime);
					}
					Thread.sleep(8000);
					//Relation
					try {
						WebElement relation = driver
								.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[7]/ul/li[7]/a/span[1]"));
						long start1111 = System.currentTimeMillis();
						Thread.sleep(1000);
						relation.click();
						long finish1111 = System.currentTimeMillis();
						totalTime = finish1111 - start1111;
						dataFromExcelSheet.updateResult(updateResult, "Relation", "PASS", totalTime);
					} catch (NoSuchElementException e) {
						dataFromExcelSheet.updateResult(updateResult, "Relation", "FAIL", totalTime);
					}
					Thread.sleep(3000);
					//Result
					try {
						WebElement result = driver
								.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[7]/ul/li[8]/a/span[1]"));
						long start1111 = System.currentTimeMillis();
						Thread.sleep(1000);
						result.click();
						long finish1111 = System.currentTimeMillis();
						totalTime = finish1111 - start1111;
						dataFromExcelSheet.updateResult(updateResult, "Result", "PASS", totalTime);
					} catch (NoSuchElementException e) {
						dataFromExcelSheet.updateResult(updateResult, "Result", "FAIL", totalTime);
					}
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(updateResult, "Data Preparation", "FAIL", totalTime);
		}
		Thread.sleep(6000);
		//Data Recon
		try {
			WebElement dataRecon = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[8]/a/span[1]"));
			long start1111 = System.currentTimeMillis();
			Thread.sleep(1000);
			dataRecon.click();
			long finish1111 = System.currentTimeMillis();
			totalTime = finish1111 - start1111;
			Thread.sleep(2000);
			dataFromExcelSheet.updateResult(updateResult, "Data Renconciliation", "PASS", totalTime);
			System.out.println(driver.getTitle() + dataRecon.getText());
			Thread.sleep(2000);
					//Rule
					try {
						WebElement rule = driver
								.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[8]/ul/li[1]/a/span[1]"));
						long start11111 = System.currentTimeMillis();
						Thread.sleep(1000);
						rule.click();
						long finish11111 = System.currentTimeMillis();
						totalTime = finish11111 - start11111;
						dataFromExcelSheet.updateResult(updateResult, "Rule", "PASS", totalTime);
					} catch (NoSuchElementException e) {
						dataFromExcelSheet.updateResult(updateResult, "Rule", "FAIL", totalTime);
					}
					Thread.sleep(2000);
					//Rule Group
					try {
						WebElement group = driver
								.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[8]/ul/li[2]/a/span[1]"));
						long start11111 = System.currentTimeMillis();
						Thread.sleep(1000);
						group.click();
						long finish11111 = System.currentTimeMillis();
						totalTime = finish11111 - start11111;
						dataFromExcelSheet.updateResult(updateResult, "Rule Group", "PASS", totalTime);
					} catch (NoSuchElementException e) {
						dataFromExcelSheet.updateResult(updateResult, "Rule Group", "FAIL", totalTime);
					}
					Thread.sleep(2000);
					//Result
					try {
						WebElement result = driver
								.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[8]/ul/li[3]/a/span[1]"));
						long start11111 = System.currentTimeMillis();
						Thread.sleep(1000);
						result.click();
						long finish11111 = System.currentTimeMillis();
						totalTime = finish11111 - start11111;
						dataFromExcelSheet.updateResult(updateResult, "Result", "PASS", totalTime);
					} catch (NoSuchElementException e) {
						dataFromExcelSheet.updateResult(updateResult, "Result", "FAIL", totalTime);
					}
					Thread.sleep(2000);
					//Compare Result
					try {
						WebElement compResult = driver
								.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[8]/ul/li[4]/a/span[1]"));
						long start11111 = System.currentTimeMillis();
						Thread.sleep(1000);
						compResult.click();
						long finish11111 = System.currentTimeMillis();
						totalTime = finish11111 - start11111;
						dataFromExcelSheet.updateResult(updateResult, "Compare Result", "PASS", totalTime);
					} catch (NoSuchElementException e) {
						dataFromExcelSheet.updateResult(updateResult, "Compare Result", "FAIL", totalTime);
					}
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(updateResult, "Data Renconciliation", "FAIL", totalTime);
		}
		//Business Rule
		try {
			WebElement businessRule = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[9]/a/span[1]"));
			long start11111 = System.currentTimeMillis();
			Thread.sleep(1000);
			businessRule.click();
			long finish11111 = System.currentTimeMillis();
			totalTime = finish11111 - start11111;
			dataFromExcelSheet.updateResult(updateResult, "Business Rule", "PASS", totalTime);
			System.out.println(driver.getTitle() + businessRule.getText());
			Thread.sleep(2000);
					//Rule
					try {
						WebElement rule = driver
								.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[9]/ul/li[1]/a/span[1]"));
						long start111111 = System.currentTimeMillis();
						Thread.sleep(1000);
						rule.click();
						long finish111111 = System.currentTimeMillis();
						totalTime = finish111111 - start111111;
						dataFromExcelSheet.updateResult(updateResult, "Rule", "PASS", totalTime);
					} catch (NoSuchElementException e) {
						dataFromExcelSheet.updateResult(updateResult, "Rule", "FAIL", totalTime);
					}
					Thread.sleep(2000);
					//Rule Group
					try {
						WebElement group = driver
								.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[9]/ul/li[2]/a/span[1]"));
						long start111111 = System.currentTimeMillis();
						Thread.sleep(1000);
						group.click();
						long finish111111 = System.currentTimeMillis();
						totalTime = finish111111 - start111111;
						dataFromExcelSheet.updateResult(updateResult, "Rule Group", "PASS", totalTime);
					} catch (NoSuchElementException e) {
						dataFromExcelSheet.updateResult(updateResult, "Rule Group", "FAIL", totalTime);
					}
					Thread.sleep(2000);
					//Parameter List
					try {
						WebElement paramList = driver
								.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[9]/ul/li[3]/a/span[1]"));
						long start111111 = System.currentTimeMillis();
						Thread.sleep(1000);
						paramList.click();
						long finish111111 = System.currentTimeMillis();
						totalTime = finish111111 - start111111;
						dataFromExcelSheet.updateResult(updateResult, "Parameter List", "PASS", totalTime);
					} catch (NoSuchElementException e) {
						dataFromExcelSheet.updateResult(updateResult, "Parameter List", "FAIL", totalTime);
					}
					Thread.sleep(2000);
					//Result
					try {
						WebElement result = driver
								.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[9]/ul/li[4]/a/span[1]"));
						long start111111 = System.currentTimeMillis();
						Thread.sleep(1000);
						result.click();
						long finish111111 = System.currentTimeMillis();
						totalTime = finish111111 - start111111;
						dataFromExcelSheet.updateResult(updateResult, "Result", "PASS", totalTime);
					} catch (NoSuchElementException e) {
						dataFromExcelSheet.updateResult(updateResult, "Result", "FAIL", totalTime);
					}	
					Thread.sleep(2000);
					//Compare Result
					try {
						WebElement compResult = driver
								.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[9]/ul/li[5]/a/span[1]"));
						long start111111 = System.currentTimeMillis();
						Thread.sleep(1000);
						compResult.click();
						long finish111111 = System.currentTimeMillis();
						totalTime = finish111111 - start111111;
						dataFromExcelSheet.updateResult(updateResult, "Compare Result", "PASS", totalTime);
					} catch (NoSuchElementException e) {
						dataFromExcelSheet.updateResult(updateResult, "Compare Result", "FAIL", totalTime);
					}
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(updateResult, "Business Rule", "FAIL", 0);
		}
		Thread.sleep(3000);
		//Data Science
		try {
			WebElement dataScience = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[10]/a/span[1]"));
			long start111111 = System.currentTimeMillis();
			Thread.sleep(1000);
			dataScience.click();
			long finish111111 = System.currentTimeMillis();
			totalTime = finish111111 - start111111;
			Thread.sleep(2000); // driver.findElement(By.className("title ng-binding")).click();
			// driver.findElement(By.id(id)).click();
			dataFromExcelSheet.updateResult(updateResult, "Data Science", "PASS", totalTime);
			System.out.println(driver.getTitle() + dataScience.getText());
			Thread.sleep(2000);
							//Algorithm
							try {
								WebElement algo = driver
										.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[10]/ul/li[1]/a/span[1]"));
								long start1111111 = System.currentTimeMillis();
								Thread.sleep(1000);
								algo.click();
								long finish1111111 = System.currentTimeMillis();
								totalTime = finish1111111 - start1111111;
								dataFromExcelSheet.updateResult(updateResult, "Algorithm", "PASS", totalTime);
							} catch (NoSuchElementException e) {
								dataFromExcelSheet.updateResult(updateResult, "Algorithm", "FAIL", totalTime);
							}
							Thread.sleep(2000);
							//Distribution
							try {
								WebElement dist = driver
										.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[10]/ul/li[2]/a/span[1]"));
								long start1111111 = System.currentTimeMillis();
								Thread.sleep(1000);
								dist.click();
								long finish1111111 = System.currentTimeMillis();
								totalTime = finish1111111 - start1111111;
								dataFromExcelSheet.updateResult(updateResult, "Distribution", "PASS", totalTime);
							} catch (NoSuchElementException e) {
								dataFromExcelSheet.updateResult(updateResult, "Distribution", "FAIL", totalTime);
							}
							Thread.sleep(2000);
							//Model
							try {
								WebElement model = driver
										.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[10]/ul/li[3]/a/span[1]"));
								long start1111111 = System.currentTimeMillis();
								Thread.sleep(1000);
								model.click();
								long finish1111111 = System.currentTimeMillis();
								totalTime = finish1111111 - start1111111;
								dataFromExcelSheet.updateResult(updateResult, "Model", "PASS", totalTime);
							} catch (NoSuchElementException e) {
								dataFromExcelSheet.updateResult(updateResult, "Model", "FAIL", totalTime);
							}
							Thread.sleep(2000);
							//Parameter List
							try {
								WebElement paramList = driver
										.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[10]/ul/li[4]/a/span[1]"));
								long start1111111 = System.currentTimeMillis();
								Thread.sleep(1000);
								paramList.click();
								long finish1111111 = System.currentTimeMillis();
								totalTime = finish1111111 - start1111111;
								dataFromExcelSheet.updateResult(updateResult, "Parameter List", "PASS", totalTime);
							} catch (NoSuchElementException e) {
								dataFromExcelSheet.updateResult(updateResult, "Parameter List", "FAIL", totalTime);
							}
							Thread.sleep(2000);
							//Parameter Set
							try {
								WebElement paramSet = driver
										.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[10]/ul/li[5]/a/span[1]"));
								long start1111111 = System.currentTimeMillis();
								Thread.sleep(1000);
								paramSet.click();
								long finish1111111 = System.currentTimeMillis();
								totalTime = finish1111111 - start1111111;
								dataFromExcelSheet.updateResult(updateResult, "Parameter Set", "PASS", totalTime);
							} catch (NoSuchElementException e) {
								dataFromExcelSheet.updateResult(updateResult, "Parameter Set", "FAIL", totalTime);
							}
							Thread.sleep(2000);
							//Operator
							try {
								WebElement operator = driver
										.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[10]/ul/li[6]/a/span[1]"));
								long start1111111 = System.currentTimeMillis();
								Thread.sleep(1000);
								operator.click();
								long finish1111111 = System.currentTimeMillis();
								totalTime = finish1111111 - start1111111;
								dataFromExcelSheet.updateResult(updateResult, "Operator", "PASS", totalTime);
							} catch (NoSuchElementException e) {
								dataFromExcelSheet.updateResult(updateResult, "Operator", "FAIL", totalTime);
							}
							Thread.sleep(2000);
							//Training
							try {
								WebElement training = driver
										.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[10]/ul/li[7]/a/span[1]"));
								long start1111111 = System.currentTimeMillis();
								Thread.sleep(1000);
								training.click();
								long finish1111111 = System.currentTimeMillis();
								totalTime = finish1111111 - start1111111;
								dataFromExcelSheet.updateResult(updateResult, "Training", "PASS", totalTime);
							} catch (NoSuchElementException e) {
								dataFromExcelSheet.updateResult(updateResult, "Training", "FAIL", totalTime);
							}
							Thread.sleep(2000);
							//Prediction
							try {
								WebElement prediction = driver
										.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[10]/ul/li[8]/a/span[1]"));
								long start1111111 = System.currentTimeMillis();
								Thread.sleep(1000);
								prediction.click();
								long finish1111111 = System.currentTimeMillis();
								totalTime = finish1111111 - start1111111;
								dataFromExcelSheet.updateResult(updateResult, "Prediction", "PASS", totalTime);
							} catch (NoSuchElementException e) {
								dataFromExcelSheet.updateResult(updateResult, "Prediction", "FAIL", totalTime);
							}
							Thread.sleep(2000);
							//Simulation
							try {
								WebElement simulation = driver
										.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[10]/ul/li[9]/a/span[1]"));
								long start1111111 = System.currentTimeMillis();
								Thread.sleep(1000);
								simulation.click();
								long finish1111111 = System.currentTimeMillis();
								totalTime = finish1111111 - start1111111;
								dataFromExcelSheet.updateResult(updateResult, "Simulation", "PASS", totalTime);
							} catch (NoSuchElementException e) {
								dataFromExcelSheet.updateResult(updateResult, "Simulation", "FAIL", totalTime);
							}
							Thread.sleep(2000);
							//Model Deploy
							try {
								WebElement modelDeploy = driver
										.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[10]/ul/li[10]/a/span[1]"));
								long start1111111 = System.currentTimeMillis();
								Thread.sleep(1000);
								modelDeploy.click();
								long finish1111111 = System.currentTimeMillis();
								totalTime = finish1111111 - start1111111;
								dataFromExcelSheet.updateResult(updateResult, "Model Deploy", "PASS", totalTime);
							} catch (NoSuchElementException e) {
								dataFromExcelSheet.updateResult(updateResult, "Model Deploy", "FAIL", totalTime);
							}
							Thread.sleep(2000);
							//what-If-Analysis
							try {
								WebElement whatIf = driver
										.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[10]/ul/li[11]/a/span[1]"));
								long start1111111 = System.currentTimeMillis();
								Thread.sleep(1000);
								whatIf.click();
								long finish1111111 = System.currentTimeMillis();
								totalTime = finish1111111 - start1111111;
								dataFromExcelSheet.updateResult(updateResult, "what-If-Analysis", "PASS", totalTime);
							} catch (NoSuchElementException e) {
								dataFromExcelSheet.updateResult(updateResult, "what-If-Analysis", "FAIL", totalTime);
							}
							Thread.sleep(2000);
							//Result
							try {
								WebElement result = driver
										.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[10]/ul/li[12]/a/span[1]"));
								long start1111111 = System.currentTimeMillis();
								Thread.sleep(1000);
								result.click();
								long finish1111111 = System.currentTimeMillis();
								totalTime = finish1111111 - start1111111;
								dataFromExcelSheet.updateResult(updateResult, "Result", "PASS", totalTime);
							} catch (NoSuchElementException e) {
								dataFromExcelSheet.updateResult(updateResult, "Result", "FAIL", totalTime);
							}
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(updateResult, "Data Science", "FAIL", totalTime);
		}
		//Graph Analysis
		try {
			WebElement graph = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[11]/a/span[1]"));
			long start1111111 = System.currentTimeMillis();
			Thread.sleep(1000);
			graph.click();
			long finish1111111 = System.currentTimeMillis();
			totalTime = finish1111111 - start1111111;
			dataFromExcelSheet.updateResult(updateResult, "Graph Analysis", "PASS", totalTime);
			System.out.println(driver.getTitle() + graph.getText());
			Thread.sleep(1000);
					//Create New
					try {
						WebElement create = driver
								.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[11]/ul/li[1]/a/span[1]"));
						long start11111111 = System.currentTimeMillis();
						Thread.sleep(1000);
						create.click();
						long finish11111111 = System.currentTimeMillis();
						totalTime = finish11111111 - start11111111;
						dataFromExcelSheet.updateResult(updateResult, "Create New", "PASS", totalTime);
					} catch (NoSuchElementException e) {
						dataFromExcelSheet.updateResult(updateResult, "Create New", "FAIL", totalTime);
					}
					Thread.sleep(2000);
					//List
					try {
						WebElement list = driver
								.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[11]/ul/li[2]/a/span[1]"));
						long start11111111 = System.currentTimeMillis();
						Thread.sleep(1000);
						list.click();
						long finish11111111 = System.currentTimeMillis();
						totalTime = finish11111111 - start11111111;
						dataFromExcelSheet.updateResult(updateResult, "List", "PASS", totalTime);
					} catch (NoSuchElementException e) {
						dataFromExcelSheet.updateResult(updateResult, "List", "FAIL", totalTime);
					}
					Thread.sleep(2000);
					//Result
					try {
						WebElement result = driver
								.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[11]/ul/li[3]/a/span[1]"));
						long start11111111 = System.currentTimeMillis();
						Thread.sleep(1000);
						result.click();
						long finish11111111 = System.currentTimeMillis();
						totalTime = finish11111111 - start11111111;
						dataFromExcelSheet.updateResult(updateResult, "Result", "PASS", totalTime);
					} catch (NoSuchElementException e) {
						dataFromExcelSheet.updateResult(updateResult, "Result", "FAIL", totalTime);
					}
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(updateResult, "Graph Analysis", "FAIL", totalTime);
		}
		Thread.sleep(3000);
		//Pipeline
		try {
			WebElement pipeline = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[12]/a/span[1]"));
			long start11111111 = System.currentTimeMillis();
			Thread.sleep(1000); 
			pipeline.click();
			long finish11111111 = System.currentTimeMillis();
			totalTime = finish11111111 - start11111111;
			dataFromExcelSheet.updateResult(updateResult, "Pipeline", "PASS", totalTime);
			System.out.println(driver.getTitle() + pipeline.getText());
			Thread.sleep(2000);
					//Create New
					try {
						WebElement create = driver
								.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[12]/ul/li[1]/a/span[1]"));
						long start111111111 = System.currentTimeMillis();
						Thread.sleep(1000);
						create.click();
						long finish111111111 = System.currentTimeMillis();
						totalTime = finish111111111 - start111111111;
						dataFromExcelSheet.updateResult(updateResult, "Create New", "PASS", totalTime);
					} catch (NoSuchElementException e) {
						dataFromExcelSheet.updateResult(updateResult, "Create New", "FAIL", totalTime);
					}
					Thread.sleep(2000);
					//List
					try {
						WebElement list = driver
								.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[12]/ul/li[2]/a/span[1]"));
						long start111111111 = System.currentTimeMillis();
						Thread.sleep(1000);
						list.click();
						long finish111111111 = System.currentTimeMillis();
						totalTime = finish111111111 - start111111111;
						dataFromExcelSheet.updateResult(updateResult, "List", "PASS", totalTime);
					} catch (NoSuchElementException e) {
						dataFromExcelSheet.updateResult(updateResult, "List", "FAIL", totalTime);
					}
					Thread.sleep(2000);
					//Parameter List
					try {
						WebElement parameterList = driver
								.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[12]/ul/li[3]/a/span[1]"));
						long start111111111 = System.currentTimeMillis();
						Thread.sleep(1000);
						parameterList.click();
						long finish111111111 = System.currentTimeMillis();
						totalTime = finish111111111 - start111111111;
						dataFromExcelSheet.updateResult(updateResult, "Parameter List", "PASS", totalTime);
					} catch (NoSuchElementException e) {
						dataFromExcelSheet.updateResult(updateResult, "Parameter List", "FAIL", totalTime);
					}
					Thread.sleep(2000);
					//Result
					try {
						WebElement result = driver
								.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[12]/ul/li[4]/a/span[1]"));
						long start111111111 = System.currentTimeMillis();
						Thread.sleep(1000);
						result.click();
						long finish111111111 = System.currentTimeMillis();
						totalTime = finish111111111 - start111111111;
						dataFromExcelSheet.updateResult(updateResult, "Result", "PASS", totalTime);
					} catch (NoSuchElementException e) {
						dataFromExcelSheet.updateResult(updateResult, "Result", "FAIL", totalTime);
					}
			
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(updateResult, "Pipeline", "FAIL", totalTime);
		}
		Thread.sleep(6000);
		//Batch Scheduler
		try {
			WebElement batch = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[13]/a/span[1]"));
			long start111111111 = System.currentTimeMillis();

			batch.click();
			long finish111111111 = System.currentTimeMillis();
			totalTime = finish111111111 - start111111111;
			Thread.sleep(1000);
			dataFromExcelSheet.updateResult(updateResult, "Batch Scheduler", "PASS", totalTime);
			System.out.println(driver.getTitle() + batch.getText());
			Thread.sleep(2000);
					//Create New
					try {
						WebElement create = driver
								.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[13]/ul/li[1]/a/span[1]"));
						long start1111111111 = System.currentTimeMillis();
						Thread.sleep(1000);
						create.click();
						long finish1111111111 = System.currentTimeMillis();
						totalTime = finish1111111111 - start1111111111;
						dataFromExcelSheet.updateResult(updateResult, "Create New", "PASS", totalTime);
					} catch (NoSuchElementException e) {
						dataFromExcelSheet.updateResult(updateResult, "Create New", "FAIL", totalTime);
					}
					Thread.sleep(2000);
					//List
					try {
						WebElement list = driver
								.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[13]/ul/li[1]/a/span[1]"));
						long start1111111111 = System.currentTimeMillis();
						Thread.sleep(1000);
						list.click();
						long finish1111111111 = System.currentTimeMillis();
						totalTime = finish1111111111 - start1111111111;
						dataFromExcelSheet.updateResult(updateResult, "List", "PASS", totalTime);
					} catch (NoSuchElementException e) {
						dataFromExcelSheet.updateResult(updateResult, "List", "FAIL", totalTime);
					}
					Thread.sleep(2000);
					//Result
					try {
						WebElement result = driver
								.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[13]/ul/li[3]/a/span[1]"));
						long start1111111111 = System.currentTimeMillis();
						Thread.sleep(1000);
						result.click();
						long finish1111111111 = System.currentTimeMillis();
						totalTime = finish1111111111 - start1111111111;
						dataFromExcelSheet.updateResult(updateResult, "Result", "PASS", totalTime);
					} catch (NoSuchElementException e) {
						dataFromExcelSheet.updateResult(updateResult, "Result", "FAIL", totalTime);
					}
			
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(updateResult, "Batch Scheduler", "FAIL", totalTime);
		}
		Thread.sleep(3000);
		//Admin
		try {
			WebElement admin = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[14]/a/span[1]"));
			long start1111111111 = System.currentTimeMillis();
			Thread.sleep(1000); 
			admin.click();
			long finish1111111111 = System.currentTimeMillis();
			totalTime = finish1111111111 - start1111111111;
			dataFromExcelSheet.updateResult(updateResult, "Admin", "PASS", totalTime);
			System.out.println(driver.getTitle() + admin.getText());
			Thread.sleep(2000);
			//Activity
			try {
				WebElement activity = driver
						.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[14]/ul/li[1]/a/span[1]"));
				long start11111111111 = System.currentTimeMillis();
				Thread.sleep(1000); 
				activity.click();
				long finish11111111111 = System.currentTimeMillis();
				totalTime = finish11111111111 - start11111111111;
				dataFromExcelSheet.updateResult(updateResult, "Activity", "PASS", totalTime);
			} catch (NoSuchElementException e) {
				dataFromExcelSheet.updateResult(updateResult, "Activity", "FAIL", totalTime);
			}
			Thread.sleep(2000);
			//Application
			try {
				WebElement application = driver
						.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[14]/ul/li[2]/a/span[1]"));
				long start11111111111 = System.currentTimeMillis();
				Thread.sleep(1000);
				application.click();
				long finish11111111111 = System.currentTimeMillis();
				totalTime = finish11111111111 - start11111111111;
				dataFromExcelSheet.updateResult(updateResult, "Application", "PASS", totalTime);
			} catch (NoSuchElementException e) {
				dataFromExcelSheet.updateResult(updateResult, "Application", "FAIL", totalTime);
			}
			Thread.sleep(2000);
			//Datasource
			try {
				WebElement datasource = driver
						.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[14]/ul/li[3]/a/span[1]"));
				long start11111111111 = System.currentTimeMillis();
				Thread.sleep(1000);
				datasource.click();
				long finish11111111111 = System.currentTimeMillis();
				totalTime = finish11111111111 - start11111111111;
				dataFromExcelSheet.updateResult(updateResult, "Datasource", "PASS", totalTime);
			} catch (NoSuchElementException e) {
				dataFromExcelSheet.updateResult(updateResult, "Datasource", "FAIL", totalTime);
			}
			Thread.sleep(2000);
			//Datastore
			try {
				WebElement datastore = driver
						.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[14]/ul/li[4]/a/span[1]"));
				long start11111111111 = System.currentTimeMillis();
				Thread.sleep(1000);
				datastore.click();
				long finish11111111111 = System.currentTimeMillis();
				totalTime = finish11111111111 - start11111111111;
				dataFromExcelSheet.updateResult(updateResult, "Datastore", "PASS", totalTime);
			} catch (NoSuchElementException e) {
				dataFromExcelSheet.updateResult(updateResult, "Datastore", "FAIL", totalTime);
			}
			Thread.sleep(2000);
			//Group
			try {
				WebElement group = driver
						.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[14]/ul/li[5]/a/span[1]"));
				long start11111111111 = System.currentTimeMillis();
				Thread.sleep(1000);
				group.click();
				long finish11111111111 = System.currentTimeMillis();
				totalTime = finish11111111111 - start11111111111;
				dataFromExcelSheet.updateResult(updateResult, "Group", "PASS", totalTime);
			} catch (NoSuchElementException e) {
				dataFromExcelSheet.updateResult(updateResult, "Group", "FAIL", totalTime);
			}
			Thread.sleep(2000);
			//Organization
			try {
				WebElement organization = driver
						.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[14]/ul/li[6]/a/span[1]"));
				long start11111111111 = System.currentTimeMillis();
				Thread.sleep(1000);
				organization.click();
				long finish11111111111 = System.currentTimeMillis();
				totalTime = finish11111111111 - start11111111111;
				dataFromExcelSheet.updateResult(updateResult, "Organization", "PASS", totalTime);
			} catch (NoSuchElementException e) {
				dataFromExcelSheet.updateResult(updateResult, "Organization", "FAIL", totalTime);
			}
			Thread.sleep(2000);
			//Privilege
			try {
				WebElement privilege = driver
						.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[14]/ul/li[7]/a/span[1]"));
				long start11111111111 = System.currentTimeMillis();
				Thread.sleep(1000);
				privilege.click();
				long finish11111111111 = System.currentTimeMillis();
				totalTime = finish11111111111 - start11111111111;
				dataFromExcelSheet.updateResult(updateResult, "Privilege", "PASS", totalTime);
			} catch (NoSuchElementException e) {
				dataFromExcelSheet.updateResult(updateResult, "Privilege", "FAIL", totalTime);
			}
			Thread.sleep(2000);
			//Role
			try {
				WebElement role = driver
						.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[14]/ul/li[8]/a/span[1]"));
				long start11111111111 = System.currentTimeMillis();
				Thread.sleep(1000);
				role.click();
				long finish11111111111 = System.currentTimeMillis();
				totalTime = finish11111111111 - start11111111111;
				dataFromExcelSheet.updateResult(updateResult, "Role", "PASS", totalTime);
			} catch (NoSuchElementException e) {
				dataFromExcelSheet.updateResult(updateResult, "Role", "FAIL", totalTime);
			}
			Thread.sleep(2000);
			//Session
			try {
				WebElement session = driver
						.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[14]/ul/li[9]/a/span[1]"));
				long start11111111111 = System.currentTimeMillis();
				Thread.sleep(1000);
				session.click();
				long finish11111111111 = System.currentTimeMillis();
				totalTime = finish11111111111 - start11111111111;
				dataFromExcelSheet.updateResult(updateResult, "Session", "PASS", totalTime);
			} catch (NoSuchElementException e) {
				dataFromExcelSheet.updateResult(updateResult, "Session", "FAIL", totalTime);
			}
			Thread.sleep(2000);
			//User
			try {
				WebElement user = driver
						.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[14]/ul/li[10]/a/span[1]"));
				long start11111111111 = System.currentTimeMillis();
				Thread.sleep(1000);
				user.click();
				long finish11111111111 = System.currentTimeMillis();
				totalTime = finish11111111111 - start11111111111;
				dataFromExcelSheet.updateResult(updateResult, "User", "PASS", totalTime);
			} catch (NoSuchElementException e) {
				dataFromExcelSheet.updateResult(updateResult, "User", "FAIL", totalTime);
			}
			Thread.sleep(2000);
			//Register Source
			try {
				WebElement registerSource = driver
						.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[14]/ul/li[11]/a/span"));
				long start11111111111 = System.currentTimeMillis();
				Thread.sleep(1000);
				registerSource.click();
				long finish11111111111 = System.currentTimeMillis();
				totalTime = finish11111111111 - start11111111111;
				dataFromExcelSheet.updateResult(updateResult, "Register Source", "PASS", totalTime);
			} catch (NoSuchElementException e) {
				dataFromExcelSheet.updateResult(updateResult, "Register Source", "FAIL", totalTime);
			}
			Thread.sleep(2000);
			//Migration Assist
			try {
				WebElement migrationAssist = driver
						.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[14]/ul/li[12]/a/span"));
				long start11111111111 = System.currentTimeMillis();
				Thread.sleep(1000);
				migrationAssist.click();
				long finish11111111111 = System.currentTimeMillis();
				totalTime = finish11111111111 - start11111111111;
				dataFromExcelSheet.updateResult(updateResult, "Migration Assist", "PASS", totalTime);
			} catch (NoSuchElementException e) {
				dataFromExcelSheet.updateResult(updateResult, "Migration Assist", "FAIL", totalTime);
			}
			Thread.sleep(2000);
			//Setting
			try {
				WebElement setting = driver
						.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[14]/ul/li[13]/a/span"));
				long start11111111111 = System.currentTimeMillis();
				Thread.sleep(1000);
				setting.click();
				long finish11111111111 = System.currentTimeMillis();
				totalTime = finish11111111111 - start11111111111;
				dataFromExcelSheet.updateResult(updateResult, "Setting", "PASS", totalTime);
			} catch (NoSuchElementException e) {
				dataFromExcelSheet.updateResult(updateResult, "Setting", "FAIL", totalTime);
			}
			Thread.sleep(2000);
			//File Manager
			try {
				WebElement fileManager = driver
						.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[14]/ul/li[14]/a/span"));
				long start11111111111 = System.currentTimeMillis();
				Thread.sleep(1000);
				fileManager.click();
				long finish11111111111 = System.currentTimeMillis();
				totalTime = finish11111111111 - start11111111111;
				dataFromExcelSheet.updateResult(updateResult, "File Manager", "PASS", totalTime);
			} catch (NoSuchElementException e) {
				dataFromExcelSheet.updateResult(updateResult, "File Manager", "FAIL", totalTime);
			}
			
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(updateResult, "Admin", "FAIL", totalTime);
		}
		Thread.sleep(3000);
		try {
			WebElement jobMonitoring = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[15]/a/span[1]"));
			long start11111111111 = System.currentTimeMillis();
			Thread.sleep(1000);
			jobMonitoring.click();
			Thread.sleep(3000); 
			long finish11111111111 = System.currentTimeMillis();
			totalTime = finish11111111111 - start11111111111;
			dataFromExcelSheet.updateResult(updateResult, "Job Monitoring", "PASS", totalTime);
			System.out.println(driver.getTitle() + jobMonitoring.getText());
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(updateResult, "Job Monitoring", "FAIL", totalTime);
		}
		try {
			WebElement systemMonitoring = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[16]/a/span[1]"));
			long start11111111111 = System.currentTimeMillis();
			Thread.sleep(1000); 
			systemMonitoring.click();
			Thread.sleep(3000); 
			long finish11111111111 = System.currentTimeMillis();
			totalTime = finish11111111111 - start11111111111;
			dataFromExcelSheet.updateResult(updateResult, "System Monitoring", "PASS", totalTime);
			System.out.println(driver.getTitle() + systemMonitoring.getText());
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(updateResult, "System Monitoring", "FAIL", totalTime);
		}
		try {
			WebElement metadata = driver
					.findElement(By.xpath("/html/body/screenshot/div[4]/div[1]/div/ul/li[17]/a/span[1]"));
			long start11111111111 = System.currentTimeMillis();
			Thread.sleep(1000); 
			metadata.click();
			Thread.sleep(5000); 
			long finish11111111111 = System.currentTimeMillis();
			totalTime = finish11111111111 - start11111111111;
			dataFromExcelSheet.updateResult(updateResult, "Metadata Navigator", "PASS", totalTime);
			System.out.println(driver.getTitle() + metadata.getText());
		} catch (NoSuchElementException e) {
			dataFromExcelSheet.updateResult(updateResult, "Metadata Navigator", "FAIL", totalTime);
		}

	}
}
