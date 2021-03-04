package Selenium.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumWithChromeDriver {

		public static void main(String[] args) {
			//when we don't specify the path of drivers by using setProperty so it throws illegal state exception
			
			System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.seleniumhq.org/download/");
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			driver.quit();
		}
	}


