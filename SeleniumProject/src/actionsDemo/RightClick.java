package actionsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		Actions act=new Actions(driver);
		act.contextClick(driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"))).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Copy']")).click();
		Thread.sleep(3000);
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
		driver.quit();
	}

}
