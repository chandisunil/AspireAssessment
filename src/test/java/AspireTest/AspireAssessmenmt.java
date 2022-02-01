package AspireTest;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import org.testng.annotations.Test;

import Aspire.base;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.InventoryPage;
import pageObjects.Login;
import pageObjects.ManufacturingPage;
import pageObjects.ManufacturingPage;

public class AspireAssessmenmt extends base {
	WebDriver driver;
	static ExtentReports report;
	static ExtentTest logger;
	public static Logger log=LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void startTest() throws IOException {
		report = new ExtentReports(
				"C:\\Users\\sunil\\eclipse-workspace\\Aspire\\ExtentReport\\AspireAssessment.html");
		logger = report.startTest("AspireAssessment");
		driver=initializeDriver();
		log.info("Successfully opened browser");
		driver.get(prop.getProperty("url"));
		log.info("opened our login page");

	}
	
	@Test(dataProvider="getData")
	
	
	public void basePageNavigation(String Email,String Password) throws IOException {
		
		Login lo=new Login(driver);
		lo.getEmail().sendKeys(Email);
		log.info("Entered Valid Email");
		lo.getPass().sendKeys(Password);
		log.info("Enter Valid Password");
		lo.getLogin().click();
		log.info("User Successfully Login");
		
	}
	
	@DataProvider
	public Object[][] getData(){
		Object[][] data=new Object[1][2];
		data[0][0]="user@aspireapp.com";
		data[0][1]="@sp1r3app";
		return data;
	}
	@Test
	public void inventoryPage() throws InterruptedException {
		InventoryPage io=new InventoryPage(driver);
		io.clickInventory(driver).click();
		log.info("Click on Inventory Button");
		io.clickProduct(driver).click();
		log.info("Click Product");
		io.clickProductItem(driver).click();
		log.info("Click on product Items");
		io.createItem(driver).click();
		log.info("Create New Product");
		io.enterProductName(driver).sendKeys("SampleTestSunilTest");
		io.costPrice(driver).clear();
		io.costPrice(driver).sendKeys("10");
		io.productSave(driver).click();
		log.info("Save Product Successfully");
		Thread.sleep(3000);
		io.updateQuantity(driver).click();
		log.info("Click on Update Quantity");
		io.createQuantity(driver).click();
		log.info("Click on Create Update");
		io.enterQuantity(driver).clear();
		io.enterQuantity(driver).sendKeys("15");
		io.saveQuantity(driver).click();
		log.info("Saved Quantity Successfully");
		io.menuClick(driver).click();
		log.info("Go Back To Menu Page");
		
	}
	@Test
	public void manufacturingPage() throws InterruptedException {
		ManufacturingPage mf=new ManufacturingPage(driver);
		mf.clickManufacturing(driver).click();
		log.info("Click on Manufacturing Button");
		mf.createItem(driver).click();
		mf.searchProductName(driver).sendKeys("SampleTestSunilTest");
		Thread.sleep(2000);
		mf.saveProduct(driver).click();
		mf.confirmProduct(driver).click();
		Thread.sleep(2000);
		mf.confirmProduct(driver).click();
		Thread.sleep(2000);
		mf.markasdone(driver).click();
		Thread.sleep(2000);
		mf.okPopup(driver).click();
		Thread.sleep(2000);
		mf.processProduct(driver).click();
		log.info("Done the Product Successfully");
		
		
		
		
	}
	@AfterTest
	public void close() {
		report.endTest(logger);
		report.flush();
		
	}
	
	
	
	

}
