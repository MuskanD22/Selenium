package DDT;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import library.ExcelDataConfig;
import library.QuickBrowserOpening;


public class TestDDTUsingExcel {
	WebDriver driver;
	Workbook wb;
	ExcelDataConfig config;
	/*@BeforeTest
	public void setup() {
		 driver=QuickBrowserOpening.StartBrowser("Chrome", "http://demosite.center/wordpress/wp-login.php") ;
		 
	}*/
	@Test(dataProvider="testdata")
	public void TestWordpress(String uname, String pass) throws InterruptedException {
		driver=QuickBrowserOpening.StartBrowser("Chrome", "http://demosite.center/wordpress/wp-login.php") ;
		 
		driver.findElement(By.id("user_login")).sendKeys(uname);
		driver.findElement(By.id("user_pass")).sendKeys(pass);
		driver.findElement(By.id("wp-submit")).click();
		Thread.sleep(5000);
		Assert.assertTrue(driver.getTitle().contains("Dashboard"));
		
	}
	
	@DataProvider(name="testdata")
	public Object[][] TestDataFeed(){
		int rows_count=0;
		config=new ExcelDataConfig("D:\\Reports\\muskan.xlsx");
			
		rows_count=config.getRowCount(0);	
		
		Object [][] data=new Object[rows_count][2];
		
		for(int i=0;i<rows_count;i++) {
			data[i][0]=config.getData(0, i, 0);
			data[i][1]=config.getData(0, i, 1);
	}
	return data;
}
	
}
