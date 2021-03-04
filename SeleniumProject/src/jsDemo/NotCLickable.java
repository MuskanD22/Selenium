package jsDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import library.ClickElement;

public class NotCLickable {
	@Test
	public  void clickable() {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://login.yahoo.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//while working with it. it sometimes show not clickable exception so we can remove this exception by 
		//using different xpath , mouse hover or by using js executor's click()
		//1st method
		driver.findElement(By.xpath("//*[@id='persistent']")).click();
		/* 2nd method
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.id("persistent"))).click().build().perform();
	*/
		// now use the libary to solve the problem of overwriting 
		ClickElement.ClickById(driver, "persistent");
		driver.quit();
	}
}
