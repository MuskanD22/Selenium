package openRepository;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoOR {
	@Test
	public void TestOrangeLoginPage() throws Exception {
		//Specify the file location I used . operation here because
		//we have object repository inside project directory only

		File src=new File("C:\\Users\\muskan.dureja\\eclipse-workspace\\SeleniumProject\\src\\openRepository\\Object_Repo.properties");

		// Create  FileInputStream object
		FileInputStream fis=new FileInputStream(src);
		//Create Properties class object to read properties file
		Properties pro=new Properties();
		
		// Load file so we can use into our script
		pro.load(fis);
		
		String chromepath=pro.getProperty("chromeDriver");
		
		System.setProperty("webdriver.chrome.driver",chromepath );
		WebDriver driver=new ChromeDriver();
		
		String URL=pro.getProperty("URL");
		driver.get(URL);
		
		String username=pro.getProperty("orange.username.xpath");
		driver.findElement(By.xpath(username)).sendKeys("admin");

		String password=pro.getProperty("orange.password.xpath");
		driver.findElement(By.xpath(password)).sendKeys("admin123");

		String loginButton=pro.getProperty("orange.login.xpath");
		driver.findElement(By.xpath(loginButton)).click();
		
	}
}
