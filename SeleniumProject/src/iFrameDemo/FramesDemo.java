package iFrameDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FramesDemo {
	@Test
	public void Iframesswitch() {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		int size=driver.findElements(By.tagName("iframe")).size();
		
		System.out.println("Total no. of iframes in this page is :"+size);
		// switchTo() method is used to switch on anything in this we are switching on frame 
		// we can find the different frames by using its id/name,using index, using webElement
		driver.switchTo().frame("a077aa5e");
		driver.findElement(By.xpath("/html/body/a")).click();
		// for coming on the pervious page or parent page we use following command
		driver.switchTo().defaultContent();
			
	}
	

}
