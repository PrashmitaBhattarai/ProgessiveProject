  package com.cerotid.google;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cerotid.helpers.ThreadService;

public class GoogleHomePage extends ThreadService {
		
	   // creating an instance of the webdriver.
		public WebDriver driver;
		
		//Locating Elements using xpath
		By goggleSearch = By.xpath("//input[@name='q']");
		
		
		//Constructor to create an object of the class in the page 
		 public GoogleHomePage(WebDriver driver) {
				
				this.driver = driver;
		
		 }
		 
		 public void Automate() {
			 
			//Navigate to the progressive insurance page
				driver.get("https://google.com");
				
			//Maximize the screen	
				driver.manage().window().maximize();
				
				Sleep(2000);
				
				googleSearch();
		 }
		 
		 public void googleSearch() {
			 
			 WebElement searchField  = driver.findElement(goggleSearch);
			 
			  searchField.sendKeys("TestNG");
			 
			 searchField.sendKeys(Keys.ENTER);
			 	 
		 }

	}

