package project;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerUse implements ITestListener{
	 public void onTestStart(ITestResult result) {
         System.out.println("Test Case Started " + result.getName());
	  }

	 
	  public void onTestSuccess(ITestResult result) {
        System.out.println("Test Case Success " + result.getName());
	  }

	  
	  public void onTestFailure(ITestResult result) {
        System.out.println("Test Case Failed " + result.getName());
	  }

	  public void onTestSkipped(ITestResult result) {
	    
	  }

	  
	  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	    
	  }

	  
	  public void onTestFailedWithTimeout(ITestResult result) {
	    
	  }

	  
	  public void onStart(ITestContext context) {
	    
	  }

	 
	  public void onFinish(ITestContext context) {
	    
    }
}
