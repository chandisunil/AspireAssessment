package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class menuPage {
public WebDriver driver;
	
	By inventory=By.xpath("//div[text()='Inventory']");
	By manufacture=By.xpath("//div[text()='Manufacturing']");
	
	public menuPage(WebDriver driver) {
		this.driver=driver;
	}
	
}
