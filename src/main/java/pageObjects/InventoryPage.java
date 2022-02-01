package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPage {
	
public WebDriver driver;

	By inventory=By.xpath("//div[text()='Inventory']");
	By products=By.xpath("//span[text()='Products']");
	By productitem=By.xpath("//a[text()='Products']");
	By CreateItem=By.xpath("//button[@class='btn btn-primary o-kanban-button-new']");
	By productName=By.xpath("//input[@id='o_field_input_11']");
	By CostPrice=By.xpath("//input[@id='o_field_input_20']");
	By SaveProduct=By.xpath("//button[@class='btn btn-primary o_form_button_save']");
	By updateQuantity=By.xpath("//button[@name='action_update_quantity_on_hand']");
	By menu=By.xpath("//a[@class='fa o_menu_toggle fa-th']");
	By create=By.xpath("//button[@class='btn btn-primary o_list_button_add']");
	By quantity=By.xpath("//input[@name='inventory_quantity']");
	By saveQuantity=By.xpath("//button[@class='btn btn-primary o_list_button_save']");
	
	public InventoryPage(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement clickInventory(WebDriver driver) {
		return driver.findElement(inventory);
	}
	public WebElement clickProduct(WebDriver driver) {
		return driver.findElement(products);
	}
	public WebElement clickProductItem(WebDriver driver) {
		return driver.findElement(productitem);
	}
	public WebElement createItem(WebDriver driver) {
		return driver.findElement(CreateItem);
	}
	public WebElement enterProductName(WebDriver driver) {
		return driver.findElement(productName);
	}
	public WebElement costPrice(WebDriver driver) {
		driver.findElement(CostPrice).clear();
		return driver.findElement(CostPrice);
	}
	public WebElement productSave(WebDriver driver) {
		return driver.findElement(SaveProduct);
	}
	public WebElement menuClick(WebDriver driver) {
		return driver.findElement(menu);
	}
	public WebElement updateQuantity(WebDriver driver) {
		return driver.findElement(updateQuantity);
	}
	public WebElement createQuantity(WebDriver driver) {
		return driver.findElement(create);
	}
	public WebElement enterQuantity(WebDriver driver) {
		return driver.findElement(quantity);
	}
	public WebElement saveQuantity(WebDriver driver) {
		return driver.findElement(saveQuantity);
	}
	

}
