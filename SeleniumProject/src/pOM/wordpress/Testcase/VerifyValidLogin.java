package pOM.wordpress.Testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import library.QuickBrowserOpening;
import pOM.wordpress.pages.LoginPageWithPageFactory;

public class VerifyValidLogin {
	
	public void checkValidLogin() {
		// this will launch and specified the url
		WebDriver driver=QuickBrowserOpening.StartBrowser("Chrome","http://demosite.center/wordpress/wp-login.php");
		
		// created page Object using Page Factory 
		LoginPageWithPageFactory login_page= PageFactory.initElements(driver, LoginPageWithPageFactory.class);
		
		login_page.login_wordpress("admin", "demo123");
		driver.quit();
	}
}
