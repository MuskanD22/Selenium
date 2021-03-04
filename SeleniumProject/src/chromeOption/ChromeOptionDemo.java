package chromeOption;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.beans.DesignMode;

public class ChromeOptionDemo {
	
	public  static void main(String []args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\muskan.dureja\\Downloads\\chromedriver_win32\\chromedriver.exe");

		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setAcceptInsecureCerts(true);
		// it is a class in which we can do the changes in our chrome driver before opening the chrome driver 
		
		// we can add various things in this 
		ChromeOptions options=new ChromeOptions();
		// this method maximized the chrome browser
		options.addArguments("start-maximized");
		
		// it will open the chrome browser in incognito mode
		options.addArguments("--incognito");
		
		options.addArguments("--disable-infobars");
		// we can add the extensions in chrome driver
		//options.addExtensions();
		
		// as DesiredCapabilities is not used directly so we can use it by using merge()
		options.merge(caps);
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://cacert.com");
		
	
		driver.quit();
		
	}

}
