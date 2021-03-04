package hiddenElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenWebElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
		// while dealing with web Element if it is hidden the it throws element not interactable exception and if value of x and y coordinates is 0 then the element is hidden 
		
		// driver.findElement(By.id("male")).click();   // not going to run and throw exception
		 
		// 2nd method to check whether the element is hidden or not 
		 
	   /*int x=driver.findElement(By.id("male")).getLocation().getX();
		 int y=driver.findElement(By.id("male")).getLocation().getY();
		
		 System.out.println("Value of x:"+x);
		 System.out.println("Value of y:"+y);
		 */
		
		List<WebElement> radio=driver.findElements(By.id("male"));
		int count =radio.size();
		System.out.println("Total number of elements those id i.e male is: "+count);
		
		for(int i=0;i<count;i++) {
			WebElement ele=radio.get(i);
			int x=ele.getLocation().getX();
			if(x!=0) {
				ele.click();
				break;
			}
			
		}
		
	}

}
