package actionsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardEvent1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/key_presses?");
		Actions act=new Actions(driver);
	
		act.sendKeys(Keys.ENTER).perform();
		if(driver.findElement(By.id("result")).getText().contains("ENTER")) {
			System.out.println("key Pressed..");
		}
		else {
			System.out.println("Wrong key Pressed..");
		}
		driver.quit();
		
	}

}
