package pOM.wordpress.Testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import library.QuickBrowserOpening;
import pOM.wordpress.pages.LoginPage;

public class VerifyWordpressLoginPage {
	
	public static void main(String[] args) {
		//we create a class in library so that we can use it anywhere
	WebDriver driver=QuickBrowserOpening.StartBrowser("Chrome", "http://demosite.center/wordpress/wp-login.php") ;
	LoginPage login=new LoginPage(driver);
	login.typeUserName();
	login.typePassWord();
	login.ClickOnLoginButton();
	}
}
