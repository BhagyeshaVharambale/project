package project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public  class Utility {
	static WebDriver driver ;
	
	public static WebDriver getDriver() {
	    System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");	
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
		return driver;
    }
	
	public static String readProperty(String key) {
   	    FileInputStream fstream = null ; 
	   	File f = new File("src/test/resources/data.properties");
	   	try {
	   	   fstream = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}	
	   	Properties p = new Properties();
	    try {
			p.load(fstream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	        return p.getProperty(key);
    }
	
	public static void takeSnapshot(WebDriver driver , String name) {
   	 TakesScreenshot screenshot = (TakesScreenshot)driver;
   	 File file = screenshot.getScreenshotAs(OutputType.FILE);
   	 try {
			FileUtils.copyFile(file, new File("src/test/resources/screenshots/" + name + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
	
	public static void waitCode() {
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 }
	
	public static void navigateToProductsPage() {
		driver.navigate().to("https://www.saucedemo.com/inventory.html");
	}
	
	public static void navigateToCartPage() {
		driver.navigate().to("https://www.saucedemo.com/cart.html");
	}
	
	public static void navigateToCheckoutPage() {
		driver.navigate().to("https://www.saucedemo.com/checkout-step-one.html");
	}
	
	public static void navigateToPaymentPage() {
		driver.navigate().to("https://www.saucedemo.com/checkout-step-two.html");
	}
	
	public static void navigateToOrderPage() {
		driver.navigate().to("https://www.saucedemo.com/checkout-complete.html");
	}
	
}
