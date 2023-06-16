package saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import project.Utility;

public class PaymentPage {
    
	WebDriver driver ;
	WebElement Finish ;
	WebElement Cancel ;

	public PaymentPage(WebDriver driver) {
    	this.driver = driver ;
    }

	public WebElement getFinish() {
		setFinish(Finish);
		return Finish;
	}

	public void setFinish(WebElement finish) {
		Finish = driver.findElement(By.cssSelector("button#finish")) ;
	}

	public WebElement getCancel() {
		setCancel(Cancel);
		return Cancel;
	}

	public void setCancel(WebElement cancel) {
		Cancel = driver.findElement(By.cssSelector("button#cancel")) ;
	}
	
	public void clickOnFinishButton() {
		getFinish().click();
        driver.navigate().to(Utility.readProperty("orderurl"));;
    }

	 public void clickOnCancelButton() {
		getCancel().click();
        driver.navigate().to(Utility.readProperty("productsurl"));       
	 }
	 	
}
