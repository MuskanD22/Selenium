package actionsDemo;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links in google are:"+links.size());
		
		for(int i=0;i<links.size();i++) {
			WebElement ele=links.get(i);
			String url=ele.getAttribute("href");
			verifyLinkActive(url);
		}
		driver.quit();
		
	}
	public static void verifyLinkActive(String Linkurl) {
		try {
			
			URL url=new URL(Linkurl);
			HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
			
			httpURLConnect.connect();
			
			if(httpURLConnect.getResponseCode()==200) {
				System.out.println(Linkurl+":::::"+httpURLConnect.getResponseMessage());
			}
			if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND) {
				System.out.println(Linkurl+"::"+httpURLConnect.getResponseMessage()+"::"+HttpURLConnection.HTTP_NOT_FOUND);
			}
		}catch(Exception e) {
			
		}
	}
}
