package Selenium.demo;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class verifyApplictionTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://learn-automation.com/");
		String title=driver.getTitle();
		
		System.out.println("Title is: "+title);
		String excepted_title="Selenium WebDriver tutorial Step by Step";
		
		Assert.assertEquals(title, excepted_title);
		
		System.out.println("Test Completed");
		driver.quit();
	}

}
