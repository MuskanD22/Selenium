package seleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestChromeOnGrid {
	@Test
	public void Test1() throws MalformedURLException {
		DesiredCapabilities caps=DesiredCapabilities.chrome();
		caps.setPlatform(Platform.WINDOWS);
	//	caps.setPlatform(Platform.WINDOWS);
		
		URL url=new URL("https://localhost:4444/wd/hub");
		WebDriver driver=new RemoteWebDriver(url,caps);
		
		driver.get("http://learn-automation.com");
		System.out.println("Title is "+driver.getTitle());
		
		driver.quit();
	}
}
