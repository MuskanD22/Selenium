package jsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://login.yahoo.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement email=driver.findElement(By.name("username"));
		// it will send the keys in the username box 
		//there are two methods for passing the value one is without arguments other is with arguments
		//js.executeScript("arguments[0].value='muskandureja.com'",email);
		
		// with args
		js.executeScript("arguments[0].value=arguments[1]",email,"muskandureja.com");
		Thread.sleep(3000);
		
		// js click() forcefully click the checkbox whether it is visible or not or width/height greater then 0 or not
		
		// there are two methods to use click() given by JS is if xpath is given then use below method
		
		WebElement checkbox=driver.findElement(By.xpath("//input[@id='persistent']"));
		js.executeScript("arguments[0].click()",checkbox);
		
		// otherwise use this method
		//js.executeScript("document.getElementById('persistent').click()");
		driver.quit();
	}

}
