package iFrameDemo;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleMultipleWindows2 {
	@Test
	public void HandleWindows1() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		// this method gives the id
		String parent=driver.getWindowHandle();
		System.out.println("Parent window id is: "+parent);
		
		Set<String>windows=driver.getWindowHandles();
		// it will create a arraylist and the copy all the set values in it
		ArrayList<String>tabs=new ArrayList<>(windows); 
		// it will switch the tab no.1
		driver.switchTo().window(tabs.get(1));
		driver.close();
		
		driver.switchTo().window(tabs.get(2));
		driver.close();
		
		driver.switchTo().window(tabs.get(0));
		System.out.println("Title of parent window is :"+driver.getTitle());
	}

}
