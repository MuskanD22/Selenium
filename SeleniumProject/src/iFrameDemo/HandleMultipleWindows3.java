package iFrameDemo;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleMultipleWindows3 {
	@Test
	public void HandleWindows1() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		// this method gives the id
		String parent=driver.getWindowHandle();
		System.out.println("Parent window id is: "+parent);
		
		Set<String>windows=driver.getWindowHandles();
		
		int count=windows.size();
		System.out.println("Total number of windows is: "+count);
		
		for(String child:windows) {
		
			if(!parent.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				System.out.println("Child Window  title is: "+driver.getTitle());
				Thread.sleep(2000);
				driver.close();
			}
		}
		driver.switchTo().window(parent);
	String title=driver.getTitle();
	System.out.println("Title of parent window is: "+title);
	}

}
