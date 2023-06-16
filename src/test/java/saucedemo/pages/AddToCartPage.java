package saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCartPage {
    
    WebDriver driver ;
    WebElement Remove ;
    WebElement ContinueShopping ;
    WebElement Checkout ;
   
    
    public AddToCartPage(WebDriver driver) {
    	this.driver = driver ;
    }

    public WebElement getRemove() {
	setRemove(Remove);
	return Remove;
    }

    public void setRemove(WebElement remove) {
	Remove = driver.findElement(By.xpath("//button[text() ='Remove']")) ;
    }

    public WebElement getContinueShopping() {
	setContinueShopping(ContinueShopping);
	return ContinueShopping;
    }

    public void setContinueShopping(WebElement continueShopping) {
	ContinueShopping = driver.findElement(By.cssSelector("button#continue-shopping")) ;
    }

    public WebElement getCheckout() {
	setCheckout(Checkout);
	return Checkout;
    }

    public void setCheckout(WebElement checkout) {
	Checkout = driver.findElement(By.xpath("//button[text()='Checkout']")) ;
    }    
}
