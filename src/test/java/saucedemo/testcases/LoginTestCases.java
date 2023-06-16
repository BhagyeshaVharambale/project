package saucedemo.testcases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import project.Utility;
import saucedemo.pages.LoginPage;

public class LoginTestCases extends LoginBaseTestCases {
      
	LoginPage loginpage ;
	
	@Test(enabled = false)
	public void successfulLoginForSpecifiedData() {
		loginpage = new LoginPage(driver);
        loginpage.userLogin();
        String text = Utility.readProperty("username");
        if((text.equals("standard_user")) || (text.equals("locked_out_user")) || (text.equals("problem_user")) || (text.equals("performance_glitch_user"))) {
        	System.out.println("Login Successful");		
            Utility.navigateToProductsPage(); 
        }       	
	}
	
	
	@Test
	public void unsuccessfulLoginForOtherData() {
		loginpage = new LoginPage(driver);
		loginpage.userLogin();
        String text = Utility.readProperty("username");
		assertTrue(text!="standard_user");
		System.out.println("username and password do not match any user in this system.");
	}	
}
