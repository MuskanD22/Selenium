package SeleniumDropDown;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleRadioButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
		
		// for radio buttons
		List<WebElement> radio=driver.findElements(By.xpath("//input[@name='lang' and @type='radio']"));
		for(int i=0;i<radio.size();i++) {
			WebElement local_radio=radio.get(i);
			String value=local_radio.getAttribute("value");
			System.out.println("Values from radio button are::::::::::::"+value);
			if(value.equalsIgnoreCase("Java")) {
				local_radio.click();
			}
		}
		
		// for check box
		List<WebElement> list=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(int i=0;i<list.size();i++) {
			WebElement ele=list.get(i);
			String id=ele.getAttribute("id");
			if(id.equalsIgnoreCase("code")) {
				ele.click();
				break;
			}
		}
	}

}
