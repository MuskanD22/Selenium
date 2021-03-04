package iFrameDemo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleMultipleWindows {
	@Test
	public void HandleWindows1() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.in/2017/07/multiple-window-examples.html");
		// this method gives the id
		String parent=driver.getWindowHandle();
		System.out.println("Parent window id is: "+parent);
		driver.findElement(By.xpath("//a[contains(@href,'http://www.google.com')]")).click();
		
		Set<String>windows=driver.getWindowHandles();
		
		int count=windows.size();
		System.out.println("Total number of windows is: "+count);
		
		for(String child:windows) {
		
			if(!parent.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				driver.findElement(By.name("q")).sendKeys("Selenium webDriver");
				Thread.sleep(2000);
				driver.close();
			}
		}
		driver.switchTo().window(parent);
	String title=driver.getTitle();
	System.out.println("Title of parent window is: "+title);
	}

}
