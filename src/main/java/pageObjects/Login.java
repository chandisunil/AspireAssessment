package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	
	public WebDriver driver;
	
	By email=By.cssSelector("input#login");
	By pass=By.cssSelector("input#password");
	By login=By.xpath("//button[text()='Log in']");
	
	public Login(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getEmail() {
		return driver.findElement(email);
		
	}
	public WebElement getPass() {
		return driver.findElement(pass);
	}
	public WebElement getLogin() {
		return driver.findElement(login);
	}

}
