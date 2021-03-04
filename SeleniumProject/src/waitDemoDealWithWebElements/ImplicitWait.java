package waitDemoDealWithWebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		/*this is method is used after the page is loaded
		 this method wait till specified time for the specfic element
		 if it is present within time its great otherwise its throws an exception ie. nosuchElementException
		and we called it global wait/smart wait and it is called for all web elements
		*/
		
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.id("Muskan"));
		driver.quit();
	}
}
