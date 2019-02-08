package com.inferyx.framework.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.inferyx.framework.selenium.TestBase;

public class DatapodPage extends TestBase {

	@FindBy(xpath = "/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div[2]/div/form/div[2]/div/input")
	WebElement name;

	@FindBy(xpath = "<div class=\"tags\" ng-class=\"{focused: hasFocus}\"><ul class=\"tag-list\"><!-- ngRepeat: tag in tagList.items track by track(tag) --></ul><input class=\"input ng-pristine ng-untouched ng-valid ng-empty\" autocomplete=\"off\" ng-model=\"newTag.text\" ng-model-options=\"{getterSetter: true}\" ng-keydown=\"eventHandlers.input.keydown($event)\" ng-focus=\"eventHandlers.input.focus($event)\" ng-blur=\"eventHandlers.input.blur($event)\" ng-paste=\"eventHandlers.input.paste($event)\" ng-trim=\"false\" ng-class=\"{'invalid-tag': newTag.invalid}\" ng-disabled=\"disabled\" ti-bind-attrs=\"{type: options.type, placeholder: options.placeholder, tabindex: options.tabindex, spellcheck: options.spellcheck}\" ti-autosize=\"\" type=\"text\" placeholder=\"\" spellcheck=\"true\"><span class=\"input\" style=\"display: none; visibility: hidden; width: auto; white-space: pre;\"></span></div>")
	WebElement tags;

	@FindBy(xpath = "/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div[2]/div/form/div[7]/div/textarea")
	WebElement desc;

	@FindBy(xpath = "/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div[2]/div/form/div[13]/div/input")
	WebElement saveBtn;

	// Initializing the Page Objects:
	public DatapodPage() {		
		PageFactory.initElements(driver, this);
	}



	public void selectDataSource(String name) {
		driver.findElement(By.xpath("//a[text()='" + name + "']//parent::td[@class='datalistrow']"
				+ "//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']")).click();
	}

	public void selectName(String name) {
		driver.findElement(By.xpath("//a[text()='" + name + "']//parent::td[@class='datalistrow']"
				+ "//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']")).click();
	}

	public void createNewDatapod(String name1, String tags1, String desc, String comp)
			throws IOException, InterruptedException {
		try {
			WebElement name = driver.findElement(By.xpath(
					"/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div[2]/div/form/div[2]/div/input"));
			name.sendKeys(name1);

			
			WebElement tags = driver.findElement(By.xpath(
					"/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div[2]/div/form/div[6]/div/tags-input/div/div"));
			
			tags.sendKeys("asdasd"+Keys.ENTER);
		
			// sWebElement tags = driver.findElement(By.xpath("<div class=\"tags\"
			// ng-class=\"{focused: hasFocus}\"><ul class=\"tag-list\"><!-- ngRepeat: tag in
			// tagList.items track by track(tag) --></ul><input class=\"input ng-pristine
			// ng-untouched ng-valid ng-empty\" autocomplete=\"off\"
			// ng-model=\"newTag.text\" ng-model-options=\"{getterSetter: true}\"
			// ng-keydown=\"eventHandlers.input.keydown($event)\"
			// ng-focus=\"eventHandlers.input.focus($event)\"
			// ng-blur=\"eventHandlers.input.blur($event)\"
			// ng-paste=\"eventHandlers.input.paste($event)\" ng-trim=\"false\"
			// ng-class=\"{'invalid-tag': newTag.invalid}\" ng-disabled=\"disabled\"
			// ti-bind-attrs=\"{type: options.type, placeholder: options.placeholder,
			// tabindex: options.tabindex, spellcheck: options.spellcheck}\"
			// ti-autosize=\"\" type=\"text\" placeholder=\"\" spellcheck=\"true\"><span
			// class=\"input\" style=\"display: none; visibility: hidden; width: auto;
			// white-space: pre;\"></span></div>"));

			Select select = new Select(driver.findElement(By.xpath(
					"/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div[2]/div/form/div[8]/div[1]/div/select")));
			select.selectByVisibleText("file");

			Select select1 = new Select(driver.findElement(By.xpath(
					"/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div[2]/div/form/div[8]/div[2]/div/select")));
			select1.selectByVisibleText("file_upload");

			WebElement descdriver = driver.findElement(By.xpath(
					"/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div[2]/div/form/div[7]/div/textarea"));
			descdriver.sendKeys(desc);
			Thread.sleep(3000);
			// add attribute
			WebElement attributeDetailsButton = driver.findElement(By.xpath(
					"/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div[2]/div/form/div[14]/button[2]"));
			attributeDetailsButton.click();
			Thread.sleep(3000);
			WebElement displayname = driver.findElement(By.xpath(
					"/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div[2]/div/form/div[15]/table/tbody/tr/td[6]/span/input"));
			displayname.sendKeys("displayname");

			WebElement Name = driver.findElement(By.xpath(
					"/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div[2]/div/form/div[15]/table/tbody/tr/td[7]/span/input"));
			Name.sendKeys("Name");

			Select selectType = new Select(driver.findElement(By.xpath(
					"/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div[2]/div/form/div[15]/table/tbody/tr/td[8]/span/select")));
			selectType.selectByVisibleText("string");

			Select UnitType = new Select(driver.findElement(By.xpath(
					"/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div[2]/div/form/div[15]/table/tbody/tr/td[10]/span/select")));
			UnitType.selectByVisibleText("* Text");

			WebElement attrdesc = driver.findElement(By.xpath(
					"/html/body/screenshot/div[4]/div[2]/div/div[4]/div/div[4]/div/div/div[2]/div[2]/div/form/div[15]/table/tbody/tr/td[11]/span/input"));
			attrdesc.sendKeys("attrdesc");

		} catch (NoSuchElementException e) {
			// dataFromExcelSheet.updateResult(updateResult, "Datapod", "FAIL", totalTime);
		}
	}

}
