package com.cerotid.progressive;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.cerotid.helpers.ThreadService;

public class PersonalInformation extends ThreadService {
		
		private WebDriver driver;
		
		By enterFirstName = By.xpath("//input[@id='NameAndAddressEdit_embedded_questions_list_FirstName']");
		
		By enterMiddleName = By.xpath("//input[@id='NameAndAddressEdit_embedded_questions_list_MiddleInitial']");
		
		By enterLastName = By.xpath("//input[@id='NameAndAddressEdit_embedded_questions_list_LastName']");
		
		By enterSuffix = By.xpath("//select[@id='NameAndAddressEdit_embedded_questions_list_Suffix']");
		
		By enterDateOfBirth = By.xpath("//input[@id='NameAndAddressEdit_embedded_questions_list_DateOfBirth']");
				 
		By enterMailingAddress = By.xpath("//input[@id='NameAndAddressEdit_embedded_questions_list_MailingAddress']");
		
		By enterApartmentNumber = By.xpath("//input[@id='NameAndAddressEdit_embedded_questions_list_ApartmentUnit']");
		
		By enterCityName = By.xpath("//input[@id='NameAndAddressEdit_embedded_questions_list_City']");
		
		By enterZipCode = By.xpath("//input[@id='NameAndAddressEdit_embedded_questions_list_ZipCode']");
		
		By poBoxMilitary = By.xpath("//input[@id='NameAndAddressEdit_embedded_questions_list_MailingZipType']");
		
		By startMyQuote = By.xpath("//div[@class='forward-navigation-wrapper']//button");
		
		
		
		 public PersonalInformation(WebDriver driver) {
			 
				this. driver = driver;
				
				PageFactory.initElements(driver, this);
				
		 }
		  
		 public void Automate(String firstName,String lastName,String suffix, String DOB ,String mailingAddress ,String cityName,String zipCode,Boolean checkPoBox) {
			 
			 Sleep(4000);
			 enterFirstName(firstName);
			 
			 Sleep(3500);
			 enterLastName(lastName);
			 
			 Sleep(3000);
			 selectSuffix(suffix);
			  
			 Sleep(2500);
			 enterDateOfBirth(DOB);
			 
			 Sleep(2500);
			 enterMailingAddress(mailingAddress);
			
			 Sleep(3500);
			 enterCityName(cityName);
			 
			 Sleep(3000);
			 enterZipCode(zipCode);
			 
			 Sleep(2000);
			 poBoxMilitary(checkPoBox);
			 
			 Sleep(2000);
			 startMyQuote();
			 	 	 
		 }
		 
		 private void enterFirstName(String firstName) {
			 
			 WebElement firstNameElement = driver.findElement(enterFirstName);
			 firstNameElement.sendKeys(firstName);
			 firstNameElement.sendKeys(Keys.ENTER);
		 }
		 
		 private void enterLastName(String lastName) {
			 
			 WebElement lastNameElement = driver.findElement(enterLastName);
			 lastNameElement.sendKeys(lastName);
			 lastNameElement.sendKeys(Keys.ENTER);
		 }
		 
		 private void selectSuffix(String suffix) {
			 
			 WebElement suffixElement = driver.findElement(enterSuffix);
			 Select selectSuffix = new Select(suffixElement);
			 String chooseSuffix = suffix;
			 selectSuffix.selectByValue(chooseSuffix);
			 	 
		 }
		 
		 private void enterDateOfBirth (String DOB) {
			 
			 WebElement dateOfBirthElement = driver.findElement(enterDateOfBirth);
			 dateOfBirthElement.sendKeys(DOB);
			 dateOfBirthElement.sendKeys(Keys.ENTER);
		 }
		 
		 private void enterMailingAddress(String mailingAddress) {
			 
			 WebElement streetNumberAndName = driver.findElement(enterMailingAddress);
			 streetNumberAndName.sendKeys(Keys.ENTER);
			 Sleep(2000);
			 
			 streetNumberAndName.sendKeys(mailingAddress);
			 streetNumberAndName.sendKeys(Keys.ENTER);
			 
		 }
		 
		 private void enterCityName (String cityName) {
			 
			 WebElement cityNameElement = driver.findElement(enterCityName);
			 cityNameElement.sendKeys(Keys.ENTER);
			 cityNameElement.sendKeys(cityName);
			 cityNameElement.sendKeys(Keys.ENTER);
			 
		}
		 
		 private void enterZipCode(String zipCode) {
				
				WebElement zipCodeElement = driver.findElement(enterZipCode);
			    zipCodeElement.sendKeys(zipCode);
				zipCodeElement.sendKeys(Keys.ENTER);
				
			 }
		 
		private void poBoxMilitary (Boolean checkPoBox) {
			 //true
			 if(checkPoBox) {
				 WebElement selectPOBoxMilitary = driver.findElement(poBoxMilitary);
				 selectPOBoxMilitary.click();
			 }
			  
		 }
		 
		private void startMyQuote() {
			
			WebElement clickStartMyQuote = driver.findElement(startMyQuote);
			clickStartMyQuote.click();
		}
	}

			 
		 
		
	



