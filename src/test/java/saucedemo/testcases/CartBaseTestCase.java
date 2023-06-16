package saucedemo.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import project.Utility;

public class CartBaseTestCase  {
    
	WebDriver driver ;
	
	@Test
	public void initialiseDriver() {
		Utility.getDriver();
		driver.get(Utility.readProperty("productsurl"));
		driver.manage().window().maximize();
	}
	
	@AfterMethod(alwaysRun = true)
	public void tearDown(ITestResult result) {
		if(ITestResult.FAILURE == result.getStatus()) {
			Utility.takeSnapshot(driver, result.getName());
		}
		driver.quit();
	}
}
