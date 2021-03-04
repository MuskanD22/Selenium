package webTablesConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DynamicDatePicker {
	@Test
	public void Test() throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\muskan.dureja\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("onward_cal")).click();

		List<WebElement> dates=driver.findElements(By.id("rb-calendar_onward_cal"));
		
		for(int i=0;i<dates.size();i++) {
			String date=dates.get(i).getText();
			
			if(date.equalsIgnoreCase("26")) {
				dates.get(i).click();
				break;
			}
		}
		driver.quit();
	}
}
