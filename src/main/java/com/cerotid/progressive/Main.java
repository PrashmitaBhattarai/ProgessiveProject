package com.cerotid.progressive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.cerotid.helpers.GenderEnum;

     public class Main {

		
     public static void main(String[] args) {
		
		//Set the system path
	  System.setProperty("webdriver.chrome.driver", ".\\libs\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   
	   //Maximize the screen
		 driver.manage().window().maximize();
	   
	   HomePage homePage = new HomePage(driver);
	   homePage.Automate();
	   
	   EnterZipCode enterzipcode = new EnterZipCode(driver);
	   enterzipcode.Automate("80640");
	   
	   PersonalInformation personalInformation = new PersonalInformation(driver);
	   personalInformation.Automate("Prashmita","Bhattarai","I" ,"04/29/1994","9745 E 112Th Dr","Henderson","80640", true);
	   
	   FillVehicleDetailsPage fillVehicleDetails = new FillVehicleDetailsPage(driver);
	   fillVehicleDetails.Automate("2020","BMW","330","4TNC","2","B","Yes");
	   
	   FillDriversPage fillDriverDetails = new FillDriversPage(driver);
	   fillDriverDetails.Automate(GenderEnum.FEMALE,"Single","Currently in college","Student (full time)","345678123","Own home","No","Valid","3 years or more","No","No");
	  
	   AddFinalDetailsPage addFinalDetailsPage = new AddFinalDetailsPage(driver);
	   addFinalDetailsPage.Automate("Y","1 to 3 years","$50,000/$100,000","No","No","02/02/2021","karishma_bhattarai40@gmail.com","1","Yes,please","Mobile App");
	   
	}
}
	   
	   
	   
	   
	   
	   
	   
	   
	   

	   
		

