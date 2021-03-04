package autoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUpload {
	@Test
	public void test() throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\muskan.dureja\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("D:\\Selenium\\AutoIT\\FileUpload.html");
		
		driver.findElement(By.xpath("//*[@id=\"1\"]")).click();
		Runtime.getRuntime().exec("D:\\Selenium\\AutoIT\\FileUploadScript.exe");
		
	}
}
