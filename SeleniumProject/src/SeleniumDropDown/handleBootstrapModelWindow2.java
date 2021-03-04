package SeleniumDropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleBootstrapModelWindow2 {

	public static void main(String []args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/bus-tickets");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// when we give xpath and it is matching with 2 then it take the 1st on 
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/header/div[1]/div/nav[2]/a[4]/i[2]")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"authMobile\"]")).sendKeys("9588709030");
	
	}

}
/* in model window we have to handle the pop ups and windows so if the window is opening in new tab 
  then we have to handle it seperately and if coding of window is written in iframe tag so we have to firstly
  switch to take frame then only we can perform task on that window 

*/