package com.cerotid.progressive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.cerotid.helpers.ThreadService;

public class HomePage extends ThreadService {
		
	    private WebDriver driver;
	    
	    //Locating Elements using by xpath
	  	By autoLinkPath = By.xpath("//div[@id='site']//a[@data-tracking-label='auto_section']");
	    
		public HomePage(WebDriver driver) {
			
			this.driver = driver;
			
			PageFactory.initElements(driver, this);
		}
		
		public void Automate() {
			
			//Navigate to the progressive  home page
			driver.get("https://www.progressive.com/");
			
			//Maximize the screen 
			driver.manage().window().maximize();
			
			Sleep(2500);
			clickAuto();		
			
		}

		private  void clickAuto() {
			
			WebElement autoLinkElement = driver.findElement(autoLinkPath);
			autoLinkElement.click();

		}
	}

