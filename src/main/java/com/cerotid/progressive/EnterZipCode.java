package com.cerotid.progressive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.cerotid.helpers.ThreadService;



public class EnterZipCode extends ThreadService {
	
    private WebDriver driver;
    
  //Locating Elements using the object by xpath
  	By enterZipCodeInputPath = By.xpath("//input[@id='zipCode_overlay']");
  	By getQuoteButtonPath = By.xpath("//input[@id='qsButton_overlay']");
  	
  	
     public EnterZipCode(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	public void Automate(String zipCode) {
		
		Sleep(2000);
		enterZipCode(zipCode);
		
		
		Sleep(3000);
		getQuote();
		
	}
	
	private void enterZipCode(String zipCode) {
		
		WebElement zipCodeElement = driver.findElement(enterZipCodeInputPath);
		
		zipCodeElement.sendKeys(zipCode);
		//zipCodeElement.sendKeys(Keys.ENTER);
		
	 }
	
	
	private void getQuote() {
		
		WebElement getQuote = driver.findElement(getQuoteButtonPath);
		getQuote.click();
	}

}
