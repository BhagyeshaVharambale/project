package saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import project.Utility;

public class CheckoutPage {
    
	 WebDriver driver ;
	 WebElement FirstName ;
	 WebElement LastName ;
	 WebElement ZipPostalCode ;
	 WebElement Continue ;
	 WebElement Cancel ;
	
	 public CheckoutPage(WebDriver driver) {
		 this.driver = driver ;
	 }
	 
	 public WebElement getFirstName() {
		 setFirstName(FirstName) ;
		 return FirstName;
	 }
	 
	 public void setFirstName(WebElement firstName) {
		 FirstName = driver.findElement(By.cssSelector("input#first-name")) ;
	 }
	
	 public WebElement getLastName() {
		 setLastName(LastName) ;
		 return LastName;
	 }
	
	 public void setLastName(WebElement lastName) {
		 LastName = driver.findElement(By.cssSelector("input#last-name")) ;
	 }
	
	 public WebElement getZipPostalCode() {
		 setZipPostalCode(ZipPostalCode) ;
		 return ZipPostalCode;
	 }
	
	 public void setZipPostalCode(WebElement zipPostalCode) {
		 ZipPostalCode = driver.findElement(By.cssSelector("input#postal-code"));
	 }
	
	 public WebElement getContinue() {
		 setContinue(Continue);
		 return Continue;
	 }
	 
	 public void setContinue(WebElement continue1) {
		 Continue = driver.findElement(By.cssSelector("input#continue")) ;
	 }
	
	 public WebElement getCancel() {
		 setCancel(Cancel) ;
		 return Cancel;
	 }
	
	 
	 public void setCancel(WebElement cancel) {
		Cancel = driver.findElement(By.cssSelector("button#cancel")) ;
	 }
	 
	 public void checkoutProcess() {
		 getFirstName().sendKeys(Utility.readProperty("firstname"));
		 getLastName().sendKeys(Utility.readProperty("lastname"));
	         getZipPostalCode().sendKeys(Utility.readProperty("zip/postalcode"));
	         getContinue().click();
	         Utility.waitCode();
	         Utility.navigateToPaymentPage();
		 System.out.println("Payment Information , Shipping Information and Total Price will be displayed");		 
         }
}
