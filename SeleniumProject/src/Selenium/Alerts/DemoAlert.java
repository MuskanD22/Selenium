package Selenium.Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoAlert {
	@Test
	public void handleAlert() throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver32\\chromedriver.exe");
	// load the browser
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	// load the site
	driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
	
	driver.findElement(By.xpath("//*[@id=\"alertBox\"]")).click();
	Thread.sleep(5000);
	// switchTo() will switch the access to alert box rather than parent window
	Alert alt=driver.switchTo().alert();
	
	//getText() is used to get the text from alert box;
	String actual_msg=driver.switchTo().alert().getText();
	
	System.out.println("Alert message is "+actual_msg);

	String expected_msg="I am an alert box!";
	// it used to match both these strings are equal or not
	Assert.assertEquals(actual_msg, expected_msg);
	
	// it will accept the alert button and press on ok button
	driver.switchTo().alert().accept();
	driver.quit();
}

}
