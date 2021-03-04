package autoIT;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class AuthnPopup{
	@Test
   public  void test() throws IOException {
      System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver32\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();

      driver.get("https://the-internet.herokuapp.com/basic_auth");
      Runtime.getRuntime().exec("D:\\Selenium\\AutoIT\\Authenication.exe");
       
      driver.quit();
   }
}
