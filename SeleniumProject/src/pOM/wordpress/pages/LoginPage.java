package pOM.wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	By username=By.id("user_login");
	By password=By.xpath("//*[@id=\"user_pass\"]");
	By login_button=By.cssSelector("#wp-submit");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void typeUserName() {
		driver.findElement(username).sendKeys("admin");
	}
	
	public void typePassWord() {
		driver.findElement(password).sendKeys("demo123");
	}
	public void ClickOnLoginButton() {
		driver.findElement(login_button).click();
	}
	
}
