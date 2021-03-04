package pOM.wordpress.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageWithPageFactory {
	WebDriver driver;
	public  LoginPageWithPageFactory(WebDriver driver) {
		this.driver=driver;
	}
	/*Selenium has built in class called PageFactory, which mainly serve Page Object model purpose, which allows you to store 
	elements in cache lookup.
	The only difference, which you will get without PageFactory and with PageFactory,is just initElement statement
	*/
	//we use annotations @FindBy to find WebElement. We use initElements method to initialize web elements
	@FindBy(id="user_login") WebElement username;
	// how i
	@FindBy(how=How.ID,using="user_pass") WebElement password;
	
	@FindBy(how=How.XPATH,using=".//*[@id='wp-submit']") WebElement submit_button;
	
	public void login_wordpress(String uid, String pass) {
		username.sendKeys(uid);
		password.sendKeys(pass);
		submit_button.click();
	}
}
