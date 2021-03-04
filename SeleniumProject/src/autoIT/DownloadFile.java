package autoIT;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DownloadFile {
	@Test
	public  void test() throws IOException {
	      System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver32\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      
	      // it will run the script
	      Runtime.getRuntime().exec("D:\\Selenium\\AutoIT\\Download.exe");
	}
}
