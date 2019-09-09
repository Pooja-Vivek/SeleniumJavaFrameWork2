package SeleniumGoogle;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsDemoWithTestNg {
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;

	WebDriver driver;



	@BeforeSuite
	public void setUp() {

		htmlReporter = new ExtentHtmlReporter("ExtentReport.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

	}

	@BeforeTest
	public void setUpTest() {

		System.setProperty("webdriver.chrome.driver", "/Users/vivekbelkuni/Documents/Selenium_new_project_pooja/SeleniuFramework/src/test/java/YoutubeTest/seleniumjavaframework/drivers/Chrome_Driver/chromedriver 211");

		driver = new ChromeDriver();

	}

	@Test
	public void test1() throws Exception {
		
		ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
		driver.navigate().to("https://www.google.com");

		// log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");
        
        // log with snapshot
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");
	}
	
	@Test
	public void test2() throws Exception {
		
		ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
		
 
		// log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");
        
        // log with snapshot
        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");
	}
	
@AfterTest
	public void tearDownTest() {

		//driver.close();
		//driver.quit();
		System.out.println("Test completed successfully");

 }

@AfterSuite
	public void tearDown() {
		// calling flush writes everything to the log file
		extent.flush();

	}

}
