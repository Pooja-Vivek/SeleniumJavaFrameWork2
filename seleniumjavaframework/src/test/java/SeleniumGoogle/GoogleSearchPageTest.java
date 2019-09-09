package SeleniumGoogle;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObject;

public class GoogleSearchPageTest {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		googleSearchTest(); 
		
	}
			
	public static void googleSearchTest() {
		
System.setProperty("webdriver.chrome.driver", "/Users/vivekbelkuni/Documents/Selenium_new_project_pooja/SeleniuFramework/src/test/java/YoutubeTest/seleniumjavaframework/drivers/Chrome_Driver/chromedriver 211");
				
		 driver = new ChromeDriver();
		 
		 GoogleSearchPageObject searchPageObj = new GoogleSearchPageObject(driver);
		 
		 driver.get("https://www.google.com");
		 
         searchPageObj.setTextInSearchBox("abcd");
		 
		 searchPageObj.clickSearchButton();
		 
         driver.close();
		
	}
    
   
   

}
