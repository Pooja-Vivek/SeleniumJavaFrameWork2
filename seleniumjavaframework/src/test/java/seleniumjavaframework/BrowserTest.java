package seleniumjavaframework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {
	
	public static void main(String[] args) throws InterruptedException {
		
	
		
		//System.setProperty("webdriver.gecko.driver","/Users/vivekbelkuni/Documents/Selenium_new_project_pooja/SeleniuFramework/src/test/java/YoutubeTest/selenium/drivers/geckodriver/geckodriver 3");
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "/Users/vivekbelkuni/Documents/Selenium_new_project_pooja/SeleniuFramework/src/test/java/YoutubeTest/seleniumjavaframework/drivers/Chrome_Driver/chromedriver 211");
		WebDriver driver = new ChromeDriver();
	       //goto browser
		
		  driver.get("https://www.youtube.com");		
		  //driver.get("https://www.google.com");
		  //driver.get("https://www.redpawns.com");
		
		
		   //driver.findElement(By.name("q")).sendKeys("pvb");
		
		  
		  //driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div[2]/div[1]/img"));
		//driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys("pvb");
		 //driver.findElement(By.name("search_query")).sendKeys("man vs wild narendra modi");
	    driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("man vs wild narendra modi");	
		  
		   WebElement textbox = driver.findElement(By.xpath("//input[@name='search_query']"));
		 // driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div[2]/div[1]/img"));
		
		textbox.sendKeys("man vs wild narendra modi");
		
		Thread.sleep(3000);
		
		  driver.close();
	
		
	}

}
