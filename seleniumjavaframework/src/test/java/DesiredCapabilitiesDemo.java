import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesDemo {

	public static void main(String[] args) {
		DesiredCapabilities caps = new DesiredCapabilities();
		//caps.setAcceptInsecureCerts(unhandledPromptBehavior);
		caps.setBrowserName("webdriver.log.file");
		
		System.setProperty("webdriver.gecko.driver", "/Users/vivekbelkuni/Documents/Selenium_new_project_pooja/SeleniuFramework/src/test/java/YoutubeTest/seleniumjavaframework/drivers/geckodriver/geckodriver 3");
		WebDriver driver = new FirefoxDriver();



		driver.get("https://www.google.com");

		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys("purvi vivek");

		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]")).sendKeys(Keys.RETURN);

		driver.close();

		driver.quit();

	}

}

