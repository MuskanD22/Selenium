package Selenium.Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ConfirmBoxAlerts {
	@Test
	public void ConfirmAlert() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
		driver.findElement(By.id("confirmBox")).click();
		
		Alert alt=driver.switchTo().alert();
		Thread.sleep(3000);
// in confirm Box alerts there are two options then we have a choose whether we have to accept 
// or wants to dismiss/cancel.
		alt.dismiss();
	}

}
