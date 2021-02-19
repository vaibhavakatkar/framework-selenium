package com.inferyx.framework.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.inferyx.framework.util.TestUtil;
import com.inferyx.framework.util.WebEventListener;

public class TestBase {

	public static WebDriver driver;
	public static WebElement webElement;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	public static String updateResult = "Framework_Selenium_Result";
	public static String getResult = "Framework_selenium_input";
	public long totalTime = 0;
	public long finish = 0;
	public long start = 0;
	public static ReadDataFromExcelSheet dataFromExcelSheet;
	public static 	File newFile ;

 
	public WebElement getHtmlElementByXpath(String xpath) {
		return driver.findElement(By.xpath(xpath));
	}
	/*public WebElement getHtmlElementByid(String id) {
		return driver.findElement(By.id(id));
	}*/
	
	public TestBase() {
		try {
			prop = new Properties();
			dataFromExcelSheet = new ReadDataFromExcelSheet();
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "/src/main/java/com/inferyx/framework/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void setFileName() throws IOException {
		dataFromExcelSheet = new ReadDataFromExcelSheet();
		
		newFile = (File) dataFromExcelSheet.getWorkbook();

	}

	public static void initialization() throws IOException {
		String browserName = prop.getProperty("browser");
		dataFromExcelSheet = new ReadDataFromExcelSheet();
		
		
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
			ChromeOptions options = new ChromeOptions();
			/*Map<String, Object> chromePrefs = new HashMap<>();

			String downloadFilepath = "/home/ubuntu/Downloads";
			chromePrefs.put("profile.default_content_settings.popups", 2);
		    chromePrefs.put("download.default_directory", downloadFilepath);
		    chromePrefs.put("profile.content_settings.exceptions.automatic_downloads.*.setting", 1 );
		    chromePrefs.put("download.prompt_for_download", false);
			options.setExperimentalOption("prefs", chromePrefs);
			
			options.addArguments("--disable-popup-blocking");*/
			DesiredCapabilities cap = DesiredCapabilities.chrome();
			cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			cap.setCapability(ChromeOptions.CAPABILITY, options);
			driver = new ChromeDriver(cap);		
		} else if (browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver");
			driver = new FirefoxDriver();
		}

		e_driver = new EventFiringWebDriver(driver);
		// Now create object of EventListerHandler to register it with
		// EventFiringWebDriver
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

		driver.get(prop.getProperty("url"));

	}
	
}
