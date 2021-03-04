package library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickElement {
	public static void ClickById(WebDriver ldriver,String lId) {
		Actions act =new Actions(ldriver);
		act.moveToElement(ldriver.findElement(By.id(lId))).click().build().perform();
	}
}
