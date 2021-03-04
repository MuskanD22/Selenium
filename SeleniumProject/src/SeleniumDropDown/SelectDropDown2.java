package SeleniumDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(5000);
		
		WebElement date_dropDown=driver.findElement(By.id("day"));
		Select date_dd=new Select(date_dropDown);
		
		WebElement selected_value=date_dd.getFirstSelectedOption();
		// it should return 10
		System.out.println("befor selection value is "+selected_value.getText());
		// it will select 4
		date_dd.selectByIndex(3);
		
		WebElement selected_value1=date_dd.getFirstSelectedOption();
		System.out.println("After selection value is "+selected_value1.getText());
		
		//Add assertion point here
		
	}

}
