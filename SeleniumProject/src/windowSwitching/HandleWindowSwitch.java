package windowSwitching;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleWindowSwitch {
	@Test
	public void test() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver32\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	    
	      driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
	      
	      // get window handle will handle the window
	      String parent_window=driver.getWindowHandle();
	      System.out.println("Before Title of Parent window"+driver.getTitle());
			
	      driver.findElement(By.xpath("//*[@id=\"initialView\"]/footer/ul/li[2]/a")).click();
		    
	      // and getWindowHandles gives the set of strings
	      Set<String> list=driver.getWindowHandles();
	     
	     Iterator<String> i=list.iterator(); 
	     
	     while(i.hasNext()) {
	    	 String child_window=i.next();
	    	 if(!parent_window.equalsIgnoreCase(child_window)) {
	    		 driver.switchTo().window(child_window);
	    		 Thread.sleep(50000);
	    		 System.out.println("Title of child window"+driver.getTitle());
	    		 driver.close();
	    	 }
	     }
	     driver.switchTo().window(parent_window);
		 System.out.println("Title of Parent window"+driver.getTitle());
		 
		 driver.quit();
	}
}
