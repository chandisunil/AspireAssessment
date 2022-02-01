package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ManufacturingPage {
	
	public WebDriver driver;

	By manufacture=By.xpath("//div[text()='Manufacturing']");
	By CreateItem=By.xpath("//button[@class='btn btn-primary o_list_button_add']");
	By searchProduct=By.xpath("//input[@id='o_field_input_205']");
	By saveProduct=By.xpath("//button[@class='btn btn-primary o_form_button_save']");
	By confirm=By.xpath("//button[@name='action_confirm']");
	By markAsDone=By.xpath("//button[@class='btn btn-primary']");
	By okpopup=By.xpath("//span[text()='Ok']");
	By process=By.xpath("//button[@name='process']");
	
	public ManufacturingPage(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement clickManufacturing(WebDriver driver) {
		return driver.findElement(manufacture);
	}
	public WebElement createItem(WebDriver driver) {
		return driver.findElement(CreateItem);
	}
	public WebElement searchProductName(WebDriver driver) {
		return driver.findElement(searchProduct);
	}
	public WebElement confirmProduct(WebDriver driver) {
		return driver.findElement(confirm);
	}
	public WebElement saveProduct(WebDriver driver) {
		return driver.findElement(saveProduct);
	}
	public WebElement markasdone(WebDriver driver) {
		return driver.findElement(markAsDone);
	}
	public WebElement okPopup(WebDriver driver) {
		return driver.findElement(okpopup);
	}
	public WebElement processProduct(WebDriver driver) {
		return driver.findElement(process);
	}

}
