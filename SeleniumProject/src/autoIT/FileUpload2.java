package autoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUpload2 {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("file:\\D:\\Selenium\\AutoIT\\FileUpload.html");
		//file:///D:/Selenium/AutoIT/FileUpload.html
		
		driver.findElement(By.xpath("//*[@type='file']")).click();
		//Runtime.getRuntime().exec("D:\\Selenium\\AutoIT\\FileUploadScript.exe");
		
		driver.quit();
	}
}
