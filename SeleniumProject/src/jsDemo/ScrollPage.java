package jsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class ScrollPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		// JavascriptExecutor is an interface by which we can execute the js in selenium and we are typecast the driver into JavascriptExecutor
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
	// firstly we find that element
		WebElement element=driver.findElement(By.xpath("//*[@id=\"mCSB_2_container\"]/p[3]"));
		
	//now execute query which actually will scroll until that element is not appeared on page.
		js.executeScript("arguments[0].scrollIntoView(true)",element);
		
		System.out.println(element.getText());
	}

}
