package waitDemoDealWithWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	//	driver.get("http://learn-automation.com/explicit-wait-in-selenium-webdriver/");
		
		/*It is a concept of the dynamic wait which wait dynamically for specific conditions.
		  It can be implemented by WebDriverWait class.
		  Explicit wait can help us which will wait until specific page/page
		  title is not present it will keep waiting. 
		 
		 There are some elements on a web page which are hidden and it will be displayed 
		 only when specific conditions get true, so we have to wait until these elements are 
		 not visible. In this case, again explicit wait will help in which we can specify wait
		  till the element or elements are not visible.

		 */
	driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");
	driver.findElement(By.xpath("//*[@id=\"post-body-7708391096228750161\"]/button")).click();
	// we can write this or another on also
	//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	//2nd method
	
	WebDriverWait wait= new WebDriverWait(driver,30);
	// in this method we can giver our own conditions or can also call predefined methods
	// visibilityOfElementLocated will wait till the time the element is visible if it is 
	// visible in within that time its good otherwise it throws the exception
	
	WebElement element =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"demo\"]")));
	//WebElement element=driver.findElement(By.xpath("//*[@id=\"demo\"]"));
	
	boolean status=element.isDisplayed();
	if(status) {
		System.out.println("Element is displayed");
	}
	else {
		System.out.println("Element is not displayed");	
	}
	
	}
}
