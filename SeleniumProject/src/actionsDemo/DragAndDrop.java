package actionsDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
		Thread.sleep(5000);
		Actions act=new Actions(driver);
		WebElement source=driver.findElement(By.xpath("//span[text()='Learning DHTMLX Suite UI']"));
		
		WebElement dest=driver.findElement(By.xpath("//li[text()='Zend Framework in Action']"));
		// in this method we are showing the work of dragAndDrop() it will perform the following functions in on go
		// and if we are performing the functions of actions class and we are using more then 3 fuction so we have to use build method 
		act.clickAndHold(source).pause(Duration.ofSeconds(2)).moveToElement(dest).release().build().perform();
		driver.quit();
	}
}