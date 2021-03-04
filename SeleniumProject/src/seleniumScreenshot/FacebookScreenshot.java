package seleniumScreenshot;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import library.Utility;

public class FacebookScreenshot {
	@Test
	public void captureScreenshot() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://gmail.com");
		
		Utility.captureScreenshots(driver,"Browser started");
		
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("Muskan");
		
		Utility.captureScreenshots(driver,"Browser after sending keys");
		
		// in this we are converting the type of driver to TakesScreenshot
		/*TakesScreenshot sc=(TakesScreenshot)driver;
		File source=sc.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(source, new File("./Screenshots/facebook.png"));	
		System.out.println("Screenshot taken");
*/
	
	}
	
}
