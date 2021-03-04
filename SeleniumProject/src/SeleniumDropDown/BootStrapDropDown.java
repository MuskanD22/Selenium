package SeleniumDropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.findElement(By.id("menu1")).click();
		
		List<WebElement> list=driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));
		for(WebElement ele:list) {
			String s=ele.getAttribute("innerHTML");
			if(s.contentEquals("JavaScript")) {
				ele.click();
				break;
			}
			System.out.println("Value from dropdown ------> "+s);
		}
		
	}
}
