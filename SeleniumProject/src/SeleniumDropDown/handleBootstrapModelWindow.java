package SeleniumDropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleBootstrapModelWindow {

	public static void main(String []args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.in/2016/11/handle-bootstrap-model-dialog-in.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[text()='Click here to Login']")).click();
		
		driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[2]/input[1]")).sendKeys("Mukesh");
	
	}

}
