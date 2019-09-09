package SeleniumGoogle;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsBasicDemo {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("Extent.html");
        
     // create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter); 
        
    // creates a toggle for the given test, adds all log events under it    
        ExtentTest test1 = extent.createTest("Google Search Test One", "This is a test to validate google search functionality");

        System.setProperty("webdriver.chrome.driver", "/Users/vivekbelkuni/Documents/Selenium_new_project_pooja/SeleniuFramework/src/test/java/YoutubeTest/seleniumjavaframework/drivers/Chrome_Driver/chromedriver 211");
		
		 driver = new ChromeDriver(); 
		 
		 test1.log(Status.INFO, "Starting Test Case");
		 driver.get("https://google.com");
		 test1.pass("Navigated to google.com");
		 
		 driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys("vivek belkuni");
		 test1.pass("Enteres text in Searchbox");
		 
		 driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]")).sendKeys(Keys.RETURN);
		 test1.pass("Prssed keyboard enter key");
		 
		 driver.close();
		 driver.quit(); 
         test1.pass("Closed the browser");
         
         test1.info("Test Completed");
         
      // creates a toggle for the given test, adds all log events under it    
	        ExtentTest test2 = extent.createTest("Google Search Test Two", "This is a test to validate google search functionality");

	        System.setProperty("webdriver.chrome.driver", "/Users/vivekbelkuni/Documents/Selenium_new_project_pooja/SeleniuFramework/src/test/java/YoutubeTest/seleniumjavaframework/drivers/Chrome_Driver/chromedriver 211");
			
			 driver = new ChromeDriver(); 
			 
			 test2.log(Status.INFO, "Starting Test Case");
			 driver.get("https://google.com");
			 test2.pass("Navigated to google.com");
			 
			 driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys("vivek belkuni");
			 test2.pass("Enteres text in Searchbox");
			 
			 driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]")).sendKeys(Keys.RETURN);
			 test2.fail("Prssed keyboard enter key");
			 
			 driver.close();
			 driver.quit(); 
	         test2.pass("Closed the browser");
	         
	         test2.info("Test Completed");
	         
         
      // calling flush writes everything to the log file
         extent.flush();
		    
 
	}

}
