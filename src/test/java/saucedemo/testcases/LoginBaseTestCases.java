package saucedemo.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import project.Utility;

public class LoginBaseTestCases {
     
WebDriver driver;
	
	@BeforeMethod(alwaysRun = true)
	public WebDriver initialiseDriver() {
		this.driver = Utility.getDriver();
		driver.get(Utility.readProperty("url"));
		driver.manage().window();
		return driver;
	}
	
	
	@AfterMethod(alwaysRun = true)
	public void tearDown(ITestResult result) {
		if(ITestResult.FAILURE == result.getStatus()) {
			Utility.takeSnapshot(driver, result.getName());
		}
		driver.quit();
	}
}
