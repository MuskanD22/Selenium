package Selenium.Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class promptBoxAlert {
	@Test
	public void promptBox() {
		
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
	driver.findElement(By.xpath("//*[@id=\"promptBox\"]")).click();
	
	Alert alt=driver.switchTo().alert();
	// it give the text written on the PromptBox
	String str=alt.getText();
	String Expected="Please enter your name:";
	Assert.assertEquals(str, Expected);
	
	}

}
