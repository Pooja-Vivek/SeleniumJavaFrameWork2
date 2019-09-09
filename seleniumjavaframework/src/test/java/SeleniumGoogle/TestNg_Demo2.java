package SeleniumGoogle;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNg_Demo2 {

	WebDriver driver = null;

	@BeforeTest
	public void setUpTest() {

		System.setProperty("webdriver.chrome.driver", "/Users/vivekbelkuni/Documents/Selenium_new_project_pooja/SeleniuFramework/src/test/java/YoutubeTest/seleniumjavaframework/drivers/Chrome_Driver/chromedriver 211");

		driver = new ChromeDriver();

	}

	@Test
	public void googleSearch2() {

		//goto browser

		driver.navigate().to("https://www.google.com");

		//driver.findElement(By.name("q")).sendKeys("vivek belkuni");

		//driver.findElement(By.cssSelector("body.hp.vasq.big:nth-child(2) div.ctr-p:nth-child(4) div.jhp.big:nth-child(5) form.tsf.nj:nth-child(3) div.A8SBwf div.RNNXgb:nth-child(2) div.SDkEP div.a4bIc > input.gLFyf.gsfi:nth-child(3)"));

		//Enter text in search textbox

		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys("vivek belkuni");

		//driver.findElement(By.name("btnK")).click();

		//click on search button

		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]")).sendKeys(Keys.RETURN);

		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);

	}

	@Test
	public void googleSearch3() {

		//goto browser

		driver.navigate().to("https://www.google.com");

		//driver.findElement(By.name("q")).sendKeys("vivek belkuni");

		//driver.findElement(By.cssSelector("body.hp.vasq.big:nth-child(2) div.ctr-p:nth-child(4) div.jhp.big:nth-child(5) form.tsf.nj:nth-child(3) div.A8SBwf div.RNNXgb:nth-child(2) div.SDkEP div.a4bIc > input.gLFyf.gsfi:nth-child(3)"));

		//Enter text in search textbox

		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys("vivek belkuni");

		//driver.findElement(By.name("btnK")).click();

		//click on search button

		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]")).sendKeys(Keys.RETURN);

		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);

	}




	@AfterTest
	public void tearDownTest() {

		driver.close();
		driver.quit();
		System.out.println("Test completed successfully");


	}
}


