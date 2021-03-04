package SeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DebugSeleniumCode {
	WebDriver driver=null;
	
	public void test(){
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver32\\chromedriver.exe");
		// it is throwing null pointer exception because we decleared webDeriver as global as we in local     
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		String title=driver.getTitle();
		boolean value=title.contains("Log In");
		System.out.println("status value is "+value);
	
	}
	public static void main(String[] args) {
		DebugSeleniumCode d=new DebugSeleniumCode();
		d.test();
		d.test1();
	}
	public void test1() {
		driver.quit();
	}
}
