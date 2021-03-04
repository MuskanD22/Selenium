package DDT.Assignment;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import library.ExcelDataConfig;
import library.QuickBrowserOpening;
import library.Utility;
import library.WriteToExcel;

public class TestOrangeHRM {
	
	/*********Web Elements*********/
	 
	WebDriver driver;
	Workbook wb;
	ExcelDataConfig config;
	WriteToExcel el;
	int i=0;
	
	@Test(dataProvider="data")
	public void TestLogin(String uname, String pass) throws InterruptedException, IOException {
		
		driver=QuickBrowserOpening.StartBrowser("Chrome", "https://opensource-demo.orangehrmlive.com/") ;
		 
        //Identify the WebElements for the OrangeHRM  
		driver.findElement(By.id("txtUsername")).sendKeys(uname);
		driver.findElement(By.id("txtPassword")).sendKeys(pass);
		
		// capture screenshots
		Utility.captureScreenshots(driver,"LoginAttempt"+i);
		
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(5000);
		
		String URL=driver.getCurrentUrl();
		
		if(URL.equals("https://opensource-demo.orangehrmlive.com/index.php/dashboard")) {
			
			System.out.println("Login Successful when username is "+uname+" and password is this "+pass);
			Utility.captureScreenshots(driver,"ValidLogin"+i);
		}
		
		else{
			Utility.captureScreenshots(driver,"InvalidLogin"+i);
			
			System.out.println("Invalid Login when username is "+uname+" and password is this "+pass);

			Assert.assertTrue(URL.contains("dashboard"));
		}
		
		}
	
	
	@DataProvider(name="data")
	public Object[][] TestDataFeed(){
		int rows_count=0;
		config=new ExcelDataConfig("D:\\Reports\\muskan.xlsx");
			
		rows_count=config.getRowCount(0);	
		
		Object [][] data=new Object[rows_count][2];
		
		for(int i=1;i<rows_count;i++) {
			data[i][0]=config.getData(0, i, 0);
			data[i][1]=config.getData(0, i, 1);
			
		}
		return data;
	}
	@AfterMethod
	public void tearDown() {
		
		i++;
	//Quit the driver
		driver.quit();
	}
}
