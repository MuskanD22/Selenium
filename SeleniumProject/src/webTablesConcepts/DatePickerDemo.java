package webTablesConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DatePickerDemo {
	@Test
	public  void test() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\muskan.dureja\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("onward_cal")).click();
		// this is static approach to select one date i.e 26 feb 
		driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[6]/td[5]"));
		
		// and there is another approach in which we are doing it dynamically 
	}

}
