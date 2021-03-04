package actionsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemo {

	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		
		WebElement element=driver.findElement(By.xpath("//button[text()='Automation Tools']"));
		Actions act=new Actions(driver);
		
		act.moveToElement(element).perform();

		List<WebElement> links=driver.findElements(By.xpath("//div[@class='dropdown-content']//a"));
		int total=links.size();
		System.out.println("Total number of links in dropDown "+total);
		
		for(int i=0;i<total;i++) {
			WebElement ele=links.get(i);
			String text=ele.getAttribute("innerHTML");
			boolean status=ele.isEnabled();
			System.out.println("Links name is "+text+" and link status is "+status);
			if(text.equalsIgnoreCase("Testing")) {
				ele.click();
				break;
			}
			
		}
		driver.quit();
		}
}
