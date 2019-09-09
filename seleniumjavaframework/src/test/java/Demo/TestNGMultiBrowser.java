package Demo;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class TestNGMultiBrowser {

	WebDriver driver = null;
	String projectPath = System.getProperty("user.dir");

	@Parameters("browserName")
	@BeforeTest
	public void setup(String browserName) {
		System.out.println("Browser name is : "+browserName);
		System.out.println("Thread id : "+Thread.currentThread().getId());

		if(browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/Chrome_Driver/chromedriver 211");
			driver = new ChromeDriver();

		} else if(browserName.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver",projectPath+"/drivers/geckodriver/geckodriver 3");
			driver = new FirefoxDriver();

		}

	}

	@Test
	public void test2() throws Exception {
		driver.get("https://www.google.com");
		Thread.sleep(4000);


	}

	@AfterTest
	public void teardown() {
		driver.close();
		System.out.println("Test Completed Successfully");
	}

}
