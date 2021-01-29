package com.cerotid.progressive;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.cerotid.helpers.GenderEnum;
import com.cerotid.helpers.ThreadService;

public class FillDriversPage extends ThreadService {
	

	    private WebDriver driver;
	    
       //Locating elements using xpath
		By selectGenderFemalePath = By.xpath("//input[@id='DriversAddPniDetails_embedded_questions_list_Gender_F']");

		By selectGenderMalePath = By.xpath("/input[@id='DriversAddPniDetails_embedded_questions_list_Gender_M']");

		By selectMaritalStatus = By.xpath("//select[@id='DriversAddPniDetails_embedded_questions_list_MaritalStatus']");

		By selectLevelOfEducation = By.xpath("//select[@id='DriversAddPniDetails_embedded_questions_list_HighestLevelOfEducation']");

		By selectEmployementStatus = By.xpath("//select[@id='DriversAddPniDetails_embedded_questions_list_EmploymentStatus']");

		By fillSSN = By.xpath("//input[@id='DriversAddPniDetails_embedded_questions_list_SocialSecurityNumber']");

		By selectPrimaryResidence = By.xpath("//select[@id='DriversAddPniDetails_embedded_questions_list_PrimaryResidence']");

		By latestMoved = By.xpath("//select[@id='DriversAddPniDetails_embedded_questions_list_HasPriorAddress']");

		By licenseStatus = By.xpath("//select[@id='DriversAddPniDetails_embedded_questions_list_LicenseStatus']");

		By licenseYear = By.xpath("//select[@id='DriversAddPniDetails_embedded_questions_list_DriverYearsLicensed']");

		By selectAccidentsClaimOrNot = By.xpath("//input[@id='DriversAddPniDetails_embedded_questions_list_HasAccidentsOrClaims_N']");

		By clickTicketsOrViolations = By.xpath("//input[@id='DriversAddPniDetails_embedded_questions_list_HasTicketsOrViolations_N']");

		By clickToNextPage = By.xpath("//forward-navigation//button");

		By clickToContinue = By.xpath("//loading-button[@data-automation-id='forwardNavigation']");

		By clickToContinueAgain = By.xpath("//loading-button[@class='blue']");
		

			public FillDriversPage(WebDriver driver) {
				
				this.driver = driver;
				
				PageFactory.initElements(driver, this);
				
				
		 }
			
			public void Automate(GenderEnum genderType,String maritalStatus,String education,String employementStatus,String SSN,String driverPrimaryResidence,String movedStatus,String driverLicenseStatus,String licensedYear, String accidentClaim, String violationTickets){
				
				Sleep(2500);
				selectGender(GenderEnum.FEMALE);
				
				Sleep(3500);
				selectMaritalStatus(maritalStatus);
				
				Sleep(3500);
				selectLevelOfEdu(education);
				
				Sleep(2000);
				selectEmployementStatus(employementStatus);
				
				Sleep(2500);
				fillSSN(SSN);
				
				Sleep(2500);
				selectPrimaryResidence(driverPrimaryResidence);
				
				Sleep(2500);
				latestMoved(movedStatus);
				
				Sleep(2000);
				licenseStatus (driverLicenseStatus);
				
				Sleep(3000);
				licenseYear(licensedYear);
				
				Sleep(3500);
				selectAccidentsClaimOrNot(accidentClaim);
				
				Sleep(2000);
				clickTicketsOrViolations(violationTickets);
				
				Sleep(2000);
				clickToContinueForNextPage();
				
				Sleep(2000);
				clickToContinue();	
				
				Sleep(2000);
				clickToContinueAgain();
				
		}
			
			private void selectGender(GenderEnum genderType) {
			
				
				if(genderType == GenderEnum.FEMALE) {
					
					
					// check female radio button
					WebElement genderButton = driver.findElement(selectGenderFemalePath);
					
					genderButton.sendKeys("Checked");
					genderButton.sendKeys(Keys.ENTER);
					
				}else {
					//check male radio button
				WebElement genderButton = driver.findElement(selectGenderMalePath);
				genderButton.sendKeys("Checked");
				genderButton.sendKeys(Keys.ENTER);
							
				}
				
			}
			
			private void selectMaritalStatus(String maritalStatus) {
				
				WebElement maritalStatusElement = driver.findElement(selectMaritalStatus);
				
				Select selectMaritalStatus = new Select(maritalStatusElement);
				
				String choosemaritalStatus = maritalStatus;
				
			     selectMaritalStatus.selectByVisibleText(choosemaritalStatus);
			    	     
			
		}
			
			
			private void selectLevelOfEdu(String education) {
				
				WebElement levelOfEducation = driver.findElement(selectLevelOfEducation);
				
				Select selectLevelOfEducation = new Select(levelOfEducation);
				
				String chooseEducation = education;
				
				selectLevelOfEducation.selectByVisibleText(chooseEducation);
				
					
		}
			
			
			private void selectEmployementStatus(String employementStatus) {
				
				WebElement driverEmployementStatus = driver.findElement(selectEmployementStatus);
				
				Select selectEmployementStatus = new Select(driverEmployementStatus);
				
				String chooseStatus = employementStatus;
				
				selectEmployementStatus.selectByVisibleText(chooseStatus);
					
				
			}
			
			
			private void fillSSN(String SSN) {
				
				WebElement SSNElement = driver.findElement(fillSSN);
				SSNElement.sendKeys(SSN);
				SSNElement.sendKeys(Keys.ENTER);
				
			}
			
			
			private void selectPrimaryResidence(String driverPrimaryResidence) {
				
				WebElement primaryResidenceElement = driver.findElement(selectPrimaryResidence);
				
				Select driverResidence = new Select(primaryResidenceElement);
				
				String chooseResidence = driverPrimaryResidence;
				
				driverResidence.selectByVisibleText(chooseResidence);
				
				
			}
			
			private void latestMoved(String movedStatus) {
				
				WebElement driverLatestMoved = driver.findElement(latestMoved);
				
				Select driverMovedStatus = new Select(driverLatestMoved);
				
				String chooseStatus = movedStatus;
				
				driverMovedStatus.selectByVisibleText(chooseStatus);
				
				
			}
			
			private void licenseStatus(String driverLicenseStatus) {
				
				WebElement driverLicenseStatusElement = driver.findElement(licenseStatus);
				
				Select selectLicenseStatus = new Select(driverLicenseStatusElement);
				
				String chooseDriverLicenseStatus = driverLicenseStatus;
				
				selectLicenseStatus.selectByVisibleText(chooseDriverLicenseStatus);
				
				
			}
			
			private void licenseYear(String licensedYear) {
				
				WebElement driverLicenseYear = driver.findElement(licenseYear);
				
				Select selectYearLicensed = new Select(driverLicenseYear);
				
				String chooseLicensedYear = licensedYear;
				
				selectYearLicensed.selectByVisibleText(chooseLicensedYear);
					
			}
			
			
			private void selectAccidentsClaimOrNot(String accidentsClaim) {
				
				
				WebElement accidentsClaimOrNot = driver.findElement(selectAccidentsClaimOrNot);
				
				accidentsClaimOrNot.sendKeys("accidentsClaim");
				
				accidentsClaimOrNot.sendKeys(Keys.ENTER);
				
				
			}
			
			private void clickTicketsOrViolations(String violationTickets) {
				
				WebElement ticketsOrViolations = driver.findElement(clickTicketsOrViolations);

				ticketsOrViolations.sendKeys(violationTickets);
				
				ticketsOrViolations.sendKeys(Keys.ENTER);
				
	
			}
			
		    private void clickToContinueForNextPage() {
		    	
		    	WebElement continueForNextPage = driver.findElement(clickToNextPage);
		    	
		    	continueForNextPage.click();
		    	
		    	 
		    }
		    
		    
		    private void clickToContinue() {
		    	
		    	WebElement continueAgain = driver.findElement(clickToContinue);
		    	
		    	continueAgain.click();
		    	
		    	
		    }
		    
           private void clickToContinueAgain() {
		    	
		    	WebElement continueOnceAgain = driver.findElement(clickToContinueAgain);
		    	
		    	continueOnceAgain.click();
		    	
		    	
		    }
		    
		
		   
	}
