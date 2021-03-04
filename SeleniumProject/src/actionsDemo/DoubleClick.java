package actionsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	// this is another method to load the site on chrome driver
	driver.navigate().to("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	
	Actions act=new Actions(driver);
	act.doubleClick(driver.findElement(By.xpath("/html/body/div/section/div/div/div/ul[2]/li[2]/a"))).perform();
	
	System.out.println(driver.getCurrentUrl());
	driver.quit();
	}
}