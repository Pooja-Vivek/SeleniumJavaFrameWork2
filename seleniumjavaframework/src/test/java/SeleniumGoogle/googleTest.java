package SeleniumGoogle;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class googleTest {

	public static void main(String[] args) throws InterruptedException {

		googleSearch();

	}

	public static void googleSearch() throws InterruptedException {

		//System.setProperty("webdriver.chrome.driver", "/Users/vivekbelkuni/Documents/Selenium_new_project_pooja/SeleniuFramework/src/test/java/YoutubeTest/seleniumjavaframework/drivers/Chrome_Driver/chromedriver 211");

		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver",projectPath+"/drivers/geckodriver/geckodriver 3");

		//WebDriver driver = new ChromeDriver();

		WebDriver driver = new FirefoxDriver();

		driver.navigate().to("https://www.google.com");

		//driver.findElement(By.name("q")).sendKeys("vivek belkuni");

		//driver.findElement(By.cssSelector("body.hp.vasq.big:nth-child(2) div.ctr-p:nth-child(4) div.jhp.big:nth-child(5) form.tsf.nj:nth-child(3) div.A8SBwf div.RNNXgb:nth-child(2) div.SDkEP div.a4bIc > input.gLFyf.gsfi:nth-child(3)"));

		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys("vivek belkuni");

		//driver.findElement(By.name("btnK")).click();

		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]")).sendKeys(Keys.RETURN);

		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);

		Thread.sleep(2000);

		driver.close();

		System.out.println("Test completed successfully");
	}

}
