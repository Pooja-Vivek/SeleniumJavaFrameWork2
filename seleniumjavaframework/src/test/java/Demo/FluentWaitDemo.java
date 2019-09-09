package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWaitDemo {

	public static void main(String[] args) throws Exception {
		test();

	}

	public static void test() throws Exception {

		String projectPath = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/Chrome_Driver/chromedriver 211");

		WebDriver driver = new ChromeDriver();


		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("selenium");
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.RETURN);

		//driver.findElement(By.linkText("ABCD Canada | Home - Deepening Community")).click();





		// Waiting 30 seconds for an element to be present on the page, checking
		// for its presence once every 5 seconds.
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(2, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);

		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {

				WebElement linkelement = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[3]/div/div[3]/div/div/div[1]/a/h3/div"));
				if(linkelement.isEnabled()) {
					System.out.println("Element Found");
				}

				return linkelement;

			}
		});

		element.click();

		Thread.sleep(3000);
		//driver.close();
		//driver.quit();
	}

}
