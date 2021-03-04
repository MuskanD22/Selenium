package SeleniumDropDown;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(5000);
		
		WebElement date_dropDown=driver.findElement(By.id("day"));
		Select date_dd=new Select(date_dropDown);
		
		List<WebElement>date=date_dd.getOptions();
		System.out.println("Total number of days is "+date.size());
		
		//Assert 
		Assert.assertEquals(date.size(),32);
		
		for(WebElement ele:date) {
			String dates=ele.getText();
			System.out.println("Dates are ------> "+dates);
		}
	}

}
