package waitDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetScriptTimeoutDemo {

	public static void main(String []args) {

		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		driver.get("http://learn-automation.com/launch-chrome-browser-using-selenium-webdriver/");
	}
}
