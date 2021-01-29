package GoogleTest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.cerotid.google.GoogleHomePage;

public class GoogleHomePageTest {
	
			
			public WebDriver driver;
			
			//Set the system path
			
			@BeforeTest
			
			public void oneTimeSetUp() {
				
				System.setProperty("webdriver.chrome.driver", ".\\libs\\chromedriver.exe");
				   driver = new ChromeDriver();
				   
			}
			
			@Test()
			
			public void navigateToGoogleHomePage() {
				
				GoogleHomePage googlePage = new GoogleHomePage(driver);
				googlePage.Automate();
				
				
			}
			
			@AfterTest()
			public void afterTest() {
				
				 driver.close();
			}
}

	


