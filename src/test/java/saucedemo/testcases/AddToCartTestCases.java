package saucedemo.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import project.Utility;
import saucedemo.pages.AddToCartPage;
import saucedemo.pages.ProductsPage;

public class AddToCartTestCases extends CartBaseTestCase {
    
	WebDriver driver ;
	ProductsPage productpage;
	AddToCartPage cartpage ;
	
	@Test
	public void addProductToCart() {
		productpage = new ProductsPage(driver);
		productpage.getAddToCart().click();
		System.out.println("Your product has been added to cart.");
		System.out.println("Count of cart icon is increased");
		productpage.getCartIcon().click();
		Utility.navigateToCartPage();
		if(productpage.getProductname().getText().equals("Sauce Labs Backpack")) {
            System.out.println("Product is displayed on cart page.");
		}
	}
	
	@Test
	public void removeProductFromCart() {
		productpage = new ProductsPage(driver);
		productpage.getRemove().click();
		System.out.println("Your product has been removed from cart.");
		System.out.println("Count of cart icon is decreased");
		productpage.getCartIcon().click();
		Utility.navigateToCartPage();
		if(!(productpage.getProductname().getText().equals("Sauce Labs Backpack"))) {
            System.out.println("Product is not displayed on cart page.");
		}
	}
}
