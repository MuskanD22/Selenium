package seleniumVerification;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyErrorMessage2 {

	public void myTest() {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button")).click();
		
		//we can do it by using getAttribute()
		String actual=driver.findElement(By.className("o6cuMc")).getAttribute("innerHTML");
		String Expected_error="Enter an email or phone number";
	
		// type1
		Assert.assertEquals(actual, Expected_error);
	
		// type2
		Assert.assertTrue(actual.contains("Enter an email or phone number"));
		System.out.println("Test Completed");
	}
}
