package Selenium.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrower {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "D:\\Selenium\\IEBrower\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("http://facebook.com");
		
		driver.getTitle();
	}
// challenges with IE Brower in selenium
	// 1. zooming Setting
//	2. Protracted mode setting
	//3. xPath changes in IE brower
	//4.sendKeys performance
	
}
