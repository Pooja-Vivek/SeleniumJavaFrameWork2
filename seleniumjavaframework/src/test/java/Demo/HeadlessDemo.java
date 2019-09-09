package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessDemo {
	
	public static void main(String[] args) {
		test();
	}
	
	public static void test() {
		
		String projectPath = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/Chrome_Driver/chromedriver 211");

		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("headless");
		options.addArguments("mac-size=1440,900");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("vivek belkuni");
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.RETURN);
		
		driver.close();
		driver.quit();
		
		System.out.println("Completed");

	}

}
