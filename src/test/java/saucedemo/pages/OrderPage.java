package saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import project.Utility;

public class OrderPage {
    
	WebDriver driver ;
	WebElement BackHome ;
	
	public OrderPage(WebDriver driver) {
    	this.driver = driver ;
    }

	public WebElement getBackHome() {
		setBackHome(BackHome);
		return BackHome;
	}

	public void setBackHome(WebElement backHome) {
		BackHome = driver.findElement(By.xpath("//button[contains(text(),'Back Home')]")) ;
	}
	
	public void clickOnBackHomeButton() {
		getBackHome().click();
        driver.navigate().to(Utility.readProperty("productsurl"));	
    }
	 
	
}
