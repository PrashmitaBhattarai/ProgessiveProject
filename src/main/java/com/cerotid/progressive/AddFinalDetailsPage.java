package com.cerotid.progressive;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.cerotid.helpers.ThreadService;

public class AddFinalDetailsPage  extends ThreadService {
	

		private WebDriver  driver;
		
		By haveAutoInsurance = By.xpath("//input[@id='FinalDetailsEdit_embedded_questions_list_InsuranceToday_Y']");
		
		By timeWithCurrentCompany =By.xpath("//select[@id='FinalDetailsEdit_embedded_questions_list_RecentAutoInsuranceCompanyPeriod']");
		
		By bodilyInjuryLimits =By.xpath("//select[@id='FinalDetailsEdit_embedded_questions_list_BodilyInjuryLimits']");
		
		By nonAutoPolicyWithProgressive = By.xpath("//input[@id='FinalDetailsEdit_embedded_questions_list_OtherPolicies_N']");
		
		By AutoPolicyWithProgressiveBefore =By.xpath("//input[@id='FinalDetailsEdit_embedded_questions_list_PriorProgressive_N']");
		
		By policyStartDate = By.xpath("//input[@id='FinalDetailsEdit_embedded_questions_list_AdvancedShopperPolicyEffectiveDate']");
		
		By policyHolderEmailAddress = By.xpath("//input[@id='FinalDetailsEdit_embedded_questions_list_PrimaryEmailAddress']");
		
		By policyHolderFamilySize =By.xpath("//select[@id='FinalDetailsEdit_embedded_questions_list_TotalResidents']");
		
		By chooseContinue = By. xpath("//forward-navigation//button");
		
		By enrollSnapShot = By. xpath("//input[@id='SnapshotEnrollment40Edit_embedded_questions_list_SnapshotPolicyEnrollment_Y']");
		
		By snapShotEnrollmentOption = By.xpath("//input[@id='SnapshotEnrollment40Edit_embedded_questions_list_SnapshotEnrollmentExperience_M']");
		
		By chooseContinueForNextPage =By.xpath("//forward-navigation//button");
		
		By clickNoThanksJustAuto = By.xpath("//div[@id='Div1']//loading-button");

		
	  public AddFinalDetailsPage(WebDriver driver) {
			
			this.driver = driver;
			
			PageFactory.initElements(driver, this);
			
	       }
	  

	   public void Automate(String autoInsurance,String insuredTimeWithCompany,String bodyInjuryLimit,String nonAutoPolicy, String PolicyWithProgressiveEarlier,String startDate,String emailAddress,String familySize,String snapEnroll,String snapShotOption) {
		
		Sleep(3000);
		haveAutoInsurance(autoInsurance);
		
		Sleep(3000);
		timeWithCurrentCompany(insuredTimeWithCompany);
		
		Sleep(3500);
		bodilyInjuryLimits(bodyInjuryLimit);
		
		Sleep(2500);
		nonAutoPolicyWithProgressive(nonAutoPolicy);
		
		Sleep(2000);
		AutoPolicyWithProgressiveBefore(PolicyWithProgressiveEarlier);
	
		Sleep(2000);
		policyStartDate(startDate);
		
		Sleep(3500);
		PolicyHolderEmailAddress(emailAddress);
		
		Sleep(3500);
		policyHolderFamilySize(familySize);
		
		Sleep(2500);
		chooseContinue();
		
		Sleep(2500);
		enrollSnapShot(snapEnroll);
		
		Sleep(2000);
		snapShotEnrollmentOption(snapShotOption);
	
		Sleep(3000);
		chooseContinueForNextPage();
		
		Sleep(3000);
		clickNoThanksJustAuto();	
		
	  }

	   private void haveAutoInsurance(String autoInsurance ) {
		   
		   WebElement autoInsuranceElement = driver.findElement(haveAutoInsurance);
		   
		   autoInsuranceElement.sendKeys(autoInsurance);
		   
		   autoInsuranceElement.click();
		  	   
	}
	   
	   private void timeWithCurrentCompany(String insuredTimeWithCompany) {
		   
		   WebElement autoInsuredTime = driver.findElement(timeWithCurrentCompany);
		   
		   Select currentCompany = new Select(autoInsuredTime);
		   
		   String chooseAutoInsuredTime = insuredTimeWithCompany;
		   
		   currentCompany.selectByVisibleText(chooseAutoInsuredTime);	   
		   
	   }
	   
	   private void bodilyInjuryLimits(String bodyInjuryLimit) {
		   
		   WebElement injuryLimit = driver.findElement(bodilyInjuryLimits);
		   
		   Select selectInjuryLimit = new Select(injuryLimit);
		   
		   String chooseBodilyInjuryLimit =bodyInjuryLimit;
		   
		   selectInjuryLimit.selectByVisibleText(chooseBodilyInjuryLimit);
		   
	   }
	   
	   private void nonAutoPolicyWithProgressive(String nonAutoPolicy) {
		   
		   WebElement hasNoneAutoPolicy = driver.findElement(nonAutoPolicyWithProgressive);
		   
		   hasNoneAutoPolicy.sendKeys(nonAutoPolicy);
		   
		   hasNoneAutoPolicy.click();
		      
	   }
	   
	   private void AutoPolicyWithProgressiveBefore (String PolicyWithProgressiveEarlier) {
		   
		   WebElement AutoPolicyWithProgressiveEarlier = driver.findElement(AutoPolicyWithProgressiveBefore);
		   
		   AutoPolicyWithProgressiveEarlier.sendKeys(PolicyWithProgressiveEarlier);
		   
		   AutoPolicyWithProgressiveEarlier.click();
		   
	   }
	     
	   private void policyStartDate (String startDate) {
		   
		   WebElement startDateWithProgressive = driver.findElement(policyStartDate);
		   
		   startDateWithProgressive.sendKeys(startDate);
		   
		   startDateWithProgressive.sendKeys(Keys.ENTER);
		   
	   }
	   
	   private void PolicyHolderEmailAddress(String emailAddress) {
		   
		   WebElement emailAddressElement = driver.findElement(policyHolderEmailAddress);
		   
		   emailAddressElement.sendKeys(emailAddress);
		   
		   emailAddressElement.sendKeys(Keys.ENTER);
		  	   
	 }
	   
	   private void policyHolderFamilySize(String familySize) {
		   
		   WebElement holderFamilySize = driver.findElement(policyHolderFamilySize);
		   
		   Select selectFamilySize = new Select(holderFamilySize);
		   
		   String chooseHolderFamilySize =familySize;
		   
		   selectFamilySize.selectByValue(chooseHolderFamilySize);
		   	   
	   }
	  
	   
	   private void chooseContinue() {
		   
		   WebElement continueToNextPage = driver.findElement(chooseContinue);
		   
		   continueToNextPage.click();
		   	   
	   }
	     
	   public void enrollSnapShot(String snapEnroll) {
	   	
	   	WebElement snapEnrollment = driver.findElement(enrollSnapShot);
	   	
	   	snapEnrollment.sendKeys(snapEnroll);
	   	
	   	snapEnrollment.click();
	    	
	   }
	   
	   
	   private void snapShotEnrollmentOption(String snapShotOption) {
		   	
		   	WebElement chooseenrollmentOption = driver.findElement(snapShotEnrollmentOption);
		   	
		   	chooseenrollmentOption.sendKeys(snapShotOption);
		   	
		   	chooseenrollmentOption.click();
		   	
	   }
	   
	   private void chooseContinueForNextPage() {
		   	
		   	WebElement continueForNextPage =driver.findElement(chooseContinueForNextPage);
		   
		   	continueForNextPage.click();
		   	
		   }
	   
	   
	   private void clickNoThanksJustAuto() {
		   
		   WebElement noThanksJustAuto= driver.findElement(clickNoThanksJustAuto);
		   
		   noThanksJustAuto.click();
	   }

	}


