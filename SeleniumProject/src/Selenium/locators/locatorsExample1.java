package Selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsExample1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//6. method linkText
		//driver.findElement(By.linkText("Forgot your password?")).click();
		// 7.method
		//driver.findElement(By.partialLinkText("Forgot your ")).click();
		//8.method tagname
		//driver.findElements(By.tagName("img"));
		System.out.println(driver.findElements(By.tagName("img")).size());
		
	}

}
