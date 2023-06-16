package saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import project.Utility;

public class LoginPage {
    WebDriver driver ;
    WebElement Username ;
    WebElement Password ;
    WebElement Login ;
    WebElement ErrorMessage ;
    
    public LoginPage(WebDriver driver) {
    	this.driver = driver ;
    }

    public WebElement getUsername() {
	setUsername(Username);
	return Username;
    }

    public void setUsername(WebElement username) {
	Username = driver.findElement(By.cssSelector("input#user-name"));
    }

    public WebElement getPassword() {
	setPassword(Password);
	return Password;
    }

    public void setPassword(WebElement password) {
	Password = driver.findElement(By.cssSelector("input#password")) ;
    }

    public WebElement getLogin() {
	setLogin(Login);
	return Login;
    }

    public void setLogin(WebElement login) {
	Login = driver.findElement(By.cssSelector("input#login-button")) ;
    }

    public WebElement getErrorMessage() {
	setErrorMessage(ErrorMessage);
	return ErrorMessage;
    }

    public void setErrorMessage(WebElement errormessage) {
	ErrorMessage = driver.findElement(By.cssSelector("div.error-message-container")) ;
    }
    
    public void userLogin() {
    	getUsername().sendKeys(Utility.readProperty("username"));
    	Utility.waitCode();
    	getPassword().sendKeys(Utility.readProperty("password"));
    	Utility.waitCode();
    	getLogin().click();
    	Utility.waitCode();
    	
    }
}
