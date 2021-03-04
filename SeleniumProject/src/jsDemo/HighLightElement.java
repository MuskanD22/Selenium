package jsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighLightElement {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		
		WebElement username=driver.findElement(By.id("email"));
		highlightclassHelper.highLightElement(driver,username);
		username.sendKeys("muskandureja@gmail.com");
		
		WebElement password=driver.findElement(By.id("pass"));
		highlightclassHelper.highLightElement(driver,password);
		password.sendKeys("muskandureja");
		
		WebElement loginbutton=driver.findElement(By.name("login"));
		highlightclassHelper.highLightElement(driver,loginbutton);
		loginbutton.click();
		
		
	}
}
