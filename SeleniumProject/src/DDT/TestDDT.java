package DDT;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import library.QuickBrowserOpening;


public class TestDDT {
	WebDriver driver;
	@Test(dataProvider="testdata")
	public void TestWordpress(String uname, String pass) throws InterruptedException {
		 driver=QuickBrowserOpening.StartBrowser("Chrome", "http://demosite.center/wordpress/wp-login.php") ;
		
		driver.findElement(By.id("user_login")).sendKeys(uname);
		driver.findElement(By.id("user_pass")).sendKeys(pass);
		driver.findElement(By.id("wp-submit")).click();
		Thread.sleep(5000);
		Assert.assertTrue(driver.getTitle().contains("Dashboard"));
		
	}
	@AfterMethod
	public void CloseDriver() {
		driver.quit();
	}
	
	@DataProvider(name="testdata")
	//this is DataProvider which actually feed data to our test cases here I have taken 2 D //array with 2 rows and 2 column it means. It will run our test case two times because we //have taken 2 rows. While first iteration this will pass username and password to test //case and in second iteration perform the same for second rows

	public Object[][] TestDataFeed(){
		//Create object array with 2 rows and 2 column- first parameter is row and second is //column

		Object [][] wordpress=new Object[3][2];
		// Enter data to row 0 column 0

		wordpress[0][0]="admin2";
		
		// Enter data to row 0 column 1

		wordpress[0][1]="demo1";
		
		wordpress[1][0]="admin";
		wordpress[1][1]="demo123";
		
		wordpress[2][0]="admin1";
		wordpress[2][1]="demo12";
		
		return wordpress;
		
	}
}
