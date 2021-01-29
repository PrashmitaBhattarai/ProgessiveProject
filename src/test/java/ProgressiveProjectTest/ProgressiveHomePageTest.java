package ProgressiveProjectTest;


import org.testng.annotations.Test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.cerotid.helpers.GenderEnum;
import com.cerotid.helpers.PropertyExtension;
import com.cerotid.helpers.ScreenshotUtility;
import com.cerotid.progressive.AddFinalDetailsPage;
import com.cerotid.progressive.EnterZipCode;
import com.cerotid.progressive.FillDriversPage;
import com.cerotid.progressive.FillVehicleDetailsPage;
import com.cerotid.progressive.HomePage;
import com.cerotid.progressive.PersonalInformation;

public class ProgressiveHomePageTest {
	
		
		 WebDriver driver;
		 
		 ExtentReports extentReports;
		 PropertyExtension properties;
		 
		 ScreenshotUtility utility;
		
		

	   @BeforeTest
		public void setUpTest() {
		
		    extentReports  = new ExtentReports();
		    
		  //Html file will be generated
		    ExtentHtmlReporter  spark = new ExtentHtmlReporter("index.html");  
			spark.config().setTheme(Theme.DARK);
			spark.config().setDocumentTitle("ProgressiveReport");
			extentReports.attachReporter(spark);
			
			properties = new PropertyExtension();
			 utility = new ScreenshotUtility();
			 
			
			if(properties.isChrome()) {
				 System.setProperty("webdriver.chrome.driver", ".\\libs\\chromedriver.exe");
				   driver  = new ChromeDriver();
				   
			}else {
				 System.setProperty("webdriver.gecko.driver", ".\\libs\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
	   }
		
	    @Test()
	    public void AutoQuoteTest() {

	    	 ExtentTest quoteTest = extentReports.createTest("Progressive Auto Quote Test");
	          
	          try {
	        	  quoteTest.info("Starting HomePage");
	              HomePage homePage = new HomePage(driver);
	        	  homePage.Automate();
	        	  quoteTest.log(Status.PASS, "Home Page Test Pass");
	        	  
	        	  
				} catch (Exception e) {
					quoteTest.log(Status.FAIL, "Home Page Test Failed");
				}
	    	  
	    	  try {
	    		  
	    		  quoteTest.info("Starting Zipcode Test");
	        	  EnterZipCode zipCode = new EnterZipCode(driver);
	        	  zipCode.Automate("80640");
	        	  quoteTest.log(Status.PASS, "ZipCode Test Pass");
				
			} catch (Exception e) {
				quoteTest.log(Status.FAIL, "ZipCode Test Failed");
				
			}
	    	 
	    	  
	       	  try {
	       		 quoteTest.info("Starting PersonalInformation Test");
	          	  PersonalInformation personalInformation = new PersonalInformation(driver);
	    	      personalInformation.Automate("Prashmita","Bhattarai","I" ,"04/29/1994","9745 E 112Th Dr","Henderson","80640", true);
	    	      quoteTest.log(Status.PASS, "PersonalInfromation Test Pass");
				
			} catch (Exception e) {
				 quoteTest.log(Status.FAIL, "PersonalInfromation Test Failed");
				
			}
	 	      
	 	      try {
	 	    	 quoteTest.info("Starting FillVechicleDetailsPage Test");
	 	 	      FillVehicleDetailsPage fillVehicleDetailsPage = new FillVehicleDetailsPage(driver);
	 	 		  fillVehicleDetailsPage.Automate("2020","BMW","330","4TNC","2","B","Yes");
	 	 		  quoteTest.log(Status.PASS, "FillVehicleDetailsPage Test Pass");
	 	 		  
				
			} catch (Exception e) {
				quoteTest.log(Status.FAIL, "FillVehicleDetailsPage Test Failed");
				
			}
	 	      
	 	     
	 		  try {
	 			 quoteTest.info("Starting FillDriversPage Test"); 
	 	 		  FillDriversPage fillDriverDetailsPage = new FillDriversPage(driver);
	 	 		  fillDriverDetailsPage.Automate(GenderEnum.FEMALE,"Single","Currently in college","Student (full time)","345678123","Own home","No","Valid","3 years or more","No","No");
	 	 		  quoteTest.log(Status.PASS, "FillDriversPage Test Pass"); 
	 	 		  	
			} catch (Exception e) {
				quoteTest.log(Status.FAIL, "FillDriversPage Test Failed"); 
				
			}
	 		  
	 		  
	 		  try {
	 			 quoteTest.info("Starting AddFinalDetailsPage Test");
	 	 		  AddFinalDetailsPage addFinalDetailsPage = new AddFinalDetailsPage(driver);
	 	 		  addFinalDetailsPage.Automate("Y","1 to 3 years","$50,000/$100,000","No","No","02/02/2021","karishma_bhattarai40@gmail.com","1","Yes,please","Mobile App");
	 	 		   quoteTest.log(Status.PASS, "AddFinalDetailsPage Test Page Pass");
	 	 	      
	 			  
			} catch (Exception e) {
				quoteTest.log(Status.FAIL, "AddFinalDetailsPage Test Page Failed");
		 	      
				
			}
	 		 	  
	 }

	    @AfterTest()
	    public void Aftertest() {
		   
		   driver.close();
		   extentReports.flush();
	    }
}
	   	 
	    

	


