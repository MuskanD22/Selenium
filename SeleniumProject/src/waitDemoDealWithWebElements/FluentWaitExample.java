package waitDemoDealWithWebElements;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWaitExample {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		driver.findElement(By.xpath("//*[@id=\"post-body-7708391096228750161\"]/button")).click();
	
		/*WebElement element =driver.findElement(By.xpath("//p[text()='WebDriver']"));
		boolean status=element.isDisplayed();
		if(status) {
			System.out.println("Element is displayed");
		}
		else {
			System.out.println("Element is not displayed");	
		}*/
		
		//by using fluent wait
		Wait<WebDriver>wait=new FluentWait<WebDriver>(driver)
				.withTimeout(30,TimeUnit.SECONDS)
				.pollingEvery(20,TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		
		WebElement element=wait.until(new Function<WebDriver,WebElement>(){
			public WebElement apply(WebDriver driver) {
				WebElement ele=driver.findElement(By.xpath(".//*[id='demo']"));
				String value=ele.getAttribute("innerHTML");
				if(value.equalsIgnoreCase("WebDriver")) {
					return ele;
				}
				else {
					System.out.println("Text which is coming on screen is "+value);
					return null;
				}
				}
		});
		System.out.println("Element is Displayed "+element.isDisplayed());
		
		
	
	}
}
