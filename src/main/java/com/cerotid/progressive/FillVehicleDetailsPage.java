package com.cerotid.progressive;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.cerotid.helpers.ThreadService;

public class FillVehicleDetailsPage  extends ThreadService {

		
		private WebDriver  driver;
		
		By selectVehicleYear = By.xpath("//list-input[@id='VehiclesNew_embedded_questions_list_Year']//li");
		
		By selectVehicleMake = By.xpath("//list-input[@id='VehiclesNew_embedded_questions_list_Make']//li");
		
		By selectVehicleModel =By.xpath("//list-input[@id='VehiclesNew_embedded_questions_list_Model']//li");
		
		By choosePrimaryUse = By.xpath("//select[@id='VehiclesNew_embedded_questions_list_VehicleUse']");
		
		By chooseOwnOrLease = By.xpath("//select[@id='VehiclesNew_embedded_questions_list_OwnOrLease']");
		
		By chooseBlindSpotWarning = By.xpath("//input[@id='VehiclesNew_embedded_questions_list_BlindSpotWarning_N']");
		
		By chooseOwnPeriod = By.xpath("//select[@id='VehiclesNew_embedded_questions_list_LengthOfOwnership']");
		
		By clickOnDone = By.xpath("//div[@id='Edit_Button_On_0']//loading-button[@class='blue']");
		
		By continueToNextPage = By.xpath("//forward-navigation//button");
	
				
		
		public FillVehicleDetailsPage(WebDriver driver) {
			
			this.driver = driver;
			
			PageFactory.initElements(driver, this);
			
	 }
		
		public void Automate(String vehicleYear ,String vehicleMake ,String vehicleModel,String primaryUse,String ownOrLease,String vehiclePeriod, String blindSpotWarning) {
			
			
			Sleep(3500);
			selectVehicleYear(vehicleYear);
			
			Sleep(3500);
			selectVehileMake(vehicleMake);
			
			Sleep(2000);
			selectVehicleModel(vehicleModel);
			
			Sleep(2000);
			choosePrimaryUse(primaryUse);
			
			Sleep(3500);
			chooseOwnOrLease(ownOrLease);
			
			Sleep(3500);
			chooseOwnPeriod(vehiclePeriod);
			
			Sleep(2000);
			vechicleBlindSpotWarning(blindSpotWarning);
			
			Sleep(2500);
			clickOnDone();
			
			Sleep(2500);
			continueToNextPage();
		
			
	}
	
		private void selectVehicleYear(String vehicleYear) {
			
		
		  //WebElement vehicleYear = driver.findElement(By.xpath("//list-input[@id='VehiclesNew_embedded_questions_list_Year']"));
			
			List<WebElement> vehicleYearsList = driver.findElements(selectVehicleYear);
			
			String YearToChoose = vehicleYear;
			  
			  for (int i = 0; i < vehicleYearsList.size(); i++) {
				  
				  if (vehicleYearsList.get(i).getText().equals(YearToChoose)) {
					  
					  vehicleYearsList.get(i).click();
					  
						break;
						
				  }	
			}		
	}
		
	
		private void selectVehileMake(String vehicleMake) {
			
			//WebElement VehicleMake = driver.findElement(By.xpath("//list-input[@id='VehiclesNew_embedded_questions_list_Make']"));
					
			List<WebElement> vehicleMakeList = driver.findElements(selectVehicleMake);
	 		
			String MakeToChoose = vehicleMake;
			
			for (int i = 0; i < vehicleMakeList.size(); i++) {
				  
				  if (vehicleMakeList.get(i).getText().equals(MakeToChoose)) {
					  
					  vehicleMakeList.get(i).click();
					  
						break;
						
				}
			}				
	}
		
		private void selectVehicleModel(String vehicleModel) {
			
			//WebElement VehicleModel = driver.findElement(By.xpath("//list-input[@id='VehiclesNew_embedded_questions_list_Model']"));
			
			List<WebElement> vehicleModelList = driver.findElements(selectVehicleModel);
			
			String ModelToChoose = vehicleModel;
			
			for (int i = 0; i < vehicleModelList.size(); i++) {
				  
				  if (vehicleModelList.get(i).getText().equals(ModelToChoose)) {
					  
					  vehicleModelList.get(i).click();
					  
						break;
				  }
			}
		}
						
				
		private void choosePrimaryUse(String primaryUse) {
			
			WebElement primaryUseElement = driver.findElement(choosePrimaryUse);
			
			Select selectPrimaryUse = new Select(primaryUseElement);
			
			String choosePrimaryUse = primaryUse;
			
			selectPrimaryUse.selectByValue(choosePrimaryUse);
				
		}
	
		private void chooseOwnOrLease(String ownOrLease) {
			
			WebElement vechicleOwnOrLease = driver.findElement(chooseOwnOrLease);
			
			Select selectVechicleOwnOrLease = new Select(vechicleOwnOrLease);
			
			String chooseOwnOrLease = ownOrLease;
			
			selectVechicleOwnOrLease.selectByValue(chooseOwnOrLease);
			
		}
		
		private void chooseOwnPeriod(String vechiclePeriod) {
			
			WebElement vechicleOwnPeriod = driver.findElement(chooseOwnPeriod);
			
			Select selectVechicleOwnPeriod = new Select(vechicleOwnPeriod);
			
			String chooseVechicleOwnPeriod =vechiclePeriod;
			
			selectVechicleOwnPeriod.selectByValue(chooseVechicleOwnPeriod);
				
		
		}
		
		private void  vechicleBlindSpotWarning(String blindSpotWarning ) {
			
			WebElement blindSpotWarningElement = driver.findElement(chooseBlindSpotWarning);
			
			blindSpotWarningElement.sendKeys(blindSpotWarning);
			blindSpotWarningElement.sendKeys(Keys.ENTER);
			
		}
	
		private void clickOnDone() {
			
			WebElement chooseClick = driver.findElement(clickOnDone);
			
			chooseClick.click();
			
		}

		private void continueToNextPage() {
			
			WebElement chooseContinue = driver.findElement(continueToNextPage);
			
			chooseContinue.click();	
		}
	
}

			
		

	
	


