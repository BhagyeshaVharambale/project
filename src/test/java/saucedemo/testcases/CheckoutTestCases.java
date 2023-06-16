package saucedemo.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import project.Utility;
import saucedemo.pages.AddToCartPage;
import saucedemo.pages.CheckoutPage;
import saucedemo.pages.PaymentPage;
import saucedemo.pages.ProductsPage;

public class CheckoutTestCases extends CheckoutBaseTestCases {
    
	WebDriver driver ;
	ProductsPage productpage ;
	AddToCartPage cartpage ;
	CheckoutPage checkoutpage ;
	PaymentPage paymentpage ;
	
	@Test
	public void successfulCheckout() {	
		productpage = new ProductsPage(driver);
		productpage.getAddToCart().click();
		System.out.println("Your product has been added to cart.");
		System.out.println("Count of cart icon is increased");
		productpage.getCartIcon().click();
		Utility.navigateToCartPage();
		if(productpage.getProductname().getText().equals("Sauce Labs Backpack")) {
                     System.out.println("Product is displayed on cart page.");
		}
		cartpage = new AddToCartPage(driver);
		cartpage.getCheckout().click();
		Utility.navigateToCheckoutPage();
		checkoutpage = new CheckoutPage(driver);
		checkoutpage.checkoutProcess();
		paymentpage = new PaymentPage(driver);
		paymentpage.getFinish().click();
		Utility.navigateToOrderPage();
		System.out.println("Your order is placed");
	}	
}
