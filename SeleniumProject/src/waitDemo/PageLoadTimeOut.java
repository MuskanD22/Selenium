package waitDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeOut {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Timeouts time=driver.manage().timeouts();
		
		// page load is a method in which driver wait for the given time if in this time site is
		//loaded so its fine other it throws an exception ie. timeoutException
		time.pageLoadTimeout(1, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	
	System.out.println(driver.getTitle());
	}

}
