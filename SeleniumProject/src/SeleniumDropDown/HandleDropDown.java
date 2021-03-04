package SeleniumDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(5000);
		WebElement date=driver.findElement(By.id("day"));
		Select dd=new Select(date);
		 
		//1st method selectByIndex()
		dd.selectByValue("11");;
		
		WebElement month_dropDown=driver.findElement(By.id("month"));
		Select month_dd=new Select(month_dropDown);
		//2nd method selectByValue
		month_dd.selectByIndex(4);;
		
		WebElement year=driver.findElement(By.id("year"));
		Select y=new Select(year);
		//3rd method selectByVisible
		y.selectByVisibleText("1999");
		
		
		
	}

}
