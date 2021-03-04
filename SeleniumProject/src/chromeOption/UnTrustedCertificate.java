package chromeOption;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class UnTrustedCertificate {
	@Test
	public void unTrustedCerti() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\muskan.dureja\\Downloads\\chromedriver_win32\\chromedriver.exe");

		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
		// as this class is not in used so we use it with chrome options class
		
		ChromeOptions option=new ChromeOptions();
		option.merge(caps);
		WebDriver driver=new ChromeDriver(option);
		
		driver.navigate().to("https://www.cacert.org");
	}
}
