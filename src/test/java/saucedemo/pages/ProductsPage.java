package saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage {
   
	WebDriver driver ;
	WebElement CartIcon ;
	WebElement AddToCart ;
	WebElement Remove ;
	WebElement ProductName ;

	public ProductsPage(WebDriver driver) {
		this.driver = driver ;
	}

	public WebElement getCartIcon() {
		setCartIcon(CartIcon);
		return CartIcon;
	}

	public void setCartIcon(WebElement cartIcon) {
		CartIcon = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
	}
	
	public WebElement getAddToCart() {
		setAddToCart(AddToCart);
		return AddToCart;
	}

	public void setAddToCart(WebElement addToCart) {
		AddToCart =  driver.findElement(By.xpath("(//button[text()='Add to cart'])[1]"));
	}
	
	public WebElement getRemove() {
		setRemove(Remove);
		return Remove;
	}

	public void setRemove(WebElement remove) {
		Remove = driver.findElement(By.xpath("//button[text()='Remove']"));
	}
	
	public WebElement getProductname() {
		setProductname(ProductName);
		return ProductName;
	}

	public void setProductname(WebElement productname) {
		ProductName = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
	}
	
}
