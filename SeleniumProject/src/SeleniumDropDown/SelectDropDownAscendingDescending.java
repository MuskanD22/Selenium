package SeleniumDropDown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownAscendingDescending {
	
	public static void main(String []args){
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:/seleniumpractise.blogspot.com/2019/01/dropdown-demo-for-selenium.html");
		
		Select tools=new Select(driver.findElement(By.id("tools")));
		
		List actualList =new ArrayList();
		List<WebElement> myTools=tools.getOptions();
		
		for(WebElement ele:myTools) {
			String data=ele.getText();
			actualList.add(data);
		}
		
		List temp=new ArrayList();
		
		temp.addAll(actualList);
		
		//Ascending 
		Collections.sort(temp);
		
		Assert.assertTrue(actualList.equals(temp));
	
		Select tool1=new Select(driver.findElement(By.id("tools1")));
		List actList1=new ArrayList();
		List<WebElement> myTool1=tool1.getOptions();
		
		for(WebElement ele:myTool1) {
			String s=ele.getText();
			actList1.add(s);
		}
		
		List temp1=new ArrayList();
		temp1.addAll(actList1);
		Collections.sort(temp1);
		
		Assert.assertTrue(actList1.equals(temp1));
	}
}
