package SeleniumProject;

import org.apache.log4j.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogDemo {

	public static void main(String[] args) {
		Logger logger=Logger.getLogger("LogDemo");
		
		//PropertyConfigurator.configure("Log4j.properties");
		PropertyConfigurator.configure("log4j.properties");
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	    
	     logger.info("Chrome opened");
	     
	     driver.manage().window().maximize();
	     logger.info("Browser is maximized");
	     
	     driver.get("https://www.google.com");
	     logger.info("Google opened");
	     
	     driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("Selenium tutorials");
	     logger.info("Selenium tutorials entered in google");
	     
	     driver.quit();
	     
	     
	    
	}
}
