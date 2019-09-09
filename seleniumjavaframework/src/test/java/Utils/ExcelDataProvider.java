package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {

	WebDriver driver = null;

	@BeforeTest
	public void setUpTest() { 

		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/Chrome_Driver/chromedriver 211");
		driver = new ChromeDriver();
	}

	@Test(dataProvider="test1data")
	public void test1(String username, String password) throws InterruptedException {
		System.out.println(username+"|"+password);

		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.findElement(By.name("txtUsername")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		Thread.sleep(2000);

	}



	@DataProvider(name = "test1data")
	public Object[][] getData() {

		String projectPath = System.getProperty("user.dir");
		String excelpath = projectPath+"/excel/data.xlsx";

		Object data[ ][ ] = testData(excelpath, "Sheet1");
		return data;
	} 

	public Object[ ][ ] testData(String excelpath, String Sheetname) {

		ExcelUtils excel = new ExcelUtils(excelpath, Sheetname);

		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();

		Object data[ ][ ] = new Object[rowCount-1][colCount];

		for(int i=1; i<rowCount; i++) {
			for(int j=0; j<colCount; j++) {

				String cellData = excel.getCellDataString(i, j);
				//System.out.print(cellData+" | ");
				data[i-1][j] = cellData;
			}

			//System.out.println();
		}

		return data;
	}

}

