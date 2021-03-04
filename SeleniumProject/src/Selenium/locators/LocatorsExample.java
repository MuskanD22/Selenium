package Selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExample {
	public static void main(String []args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		// 1,2 ,3 come under direct locators and they are used with static .when pages and their proprties are not changing
		//1. method id
		WebElement uid=driver.findElement(By.id("txtUsername"));
		// it is a method by which we can send any keys so that it can place at this id
		uid.sendKeys("Admin"); 
		//2. method name
		WebElement uname=driver.findElement(By.name("txtPassword"));
		uname.sendKeys("admin123");
	
		//3. method class(not recommended) many times classname wont be unique
		
		driver.findElement(By.className("textInputContainer")).click();
		// 4,5 come under indirect locators. used for dynamic webpages 
		//4. method XPath
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
	
		//5. method by cssSelector
		driver.findElement(By.cssSelector("#forgotPasswordLink > a")).click();;
	
		// 
		
		
	}
}
