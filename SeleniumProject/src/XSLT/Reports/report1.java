package XSLT.Reports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import library.Utility;


public class report1 {
	
	ExtentReports report;
	 ExtentTest logger;
	WebDriver driver;
	@BeforeTest
	public  void StartTest() {
	
		report=new ExtentReports("D:\\ReportData\\report1.html",true);
		System.out.println("Pass");
		logger=report.startTest("report1");
		
	}
	@Test
	public void Verifytitle() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		logger.log(LogStatus.INFO, "Browser Started");
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");

		logger.log(LogStatus.INFO, "Application is uploaded");
		
		String title=driver.getTitle();
		if(driver.getTitle().equalsIgnoreCase("OrangeHRM")) {
			logger.log(LogStatus.PASS, "Navigate to site");
		}
		else {
			logger.log(LogStatus.FAIL, "Test Failed");

		}
	}
	
	@AfterClass
	public void tearDown() {
		
		report.endTest(logger);
		report.flush();
		}
	
}
