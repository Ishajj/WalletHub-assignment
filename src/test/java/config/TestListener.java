//This file listens to the testng methods
package config;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

	//import com.aventstack.extentreports.Status;

	public class TestListener implements ITestListener {

		public void onStart(ITestContext context) {
			System.out.println("*** Test Suite " + context.getName() + " started ***");
		}

		public void onFinish(ITestContext context) {
			System.out.println(("*** Test Suite " + context.getName() + " ending ***"));
			//ExtentTestManager.endTest();
			//ExtentManager.getInstance().flush();
		}

		public void onTestStart(ITestResult result) {
			System.out.println(("*** Running test method " + result.getMethod().getMethodName() + "..."));
			// ExtentTestManager.startTest(result.getMethod().getMethodName());
		}

		public void onTestSuccess(ITestResult result) {
			System.out.println("*** Executed " + result.getMethod().getMethodName() + " test successfully...");
			//if(ExtentTestManager.getTest() != null) 
			//	ExtentTestManager.getTest().log(Status.PASS, "Test pa

}

		public void onTestFailure(ITestResult result) {
			// TODO Auto-generated method stub
			
		}

		public void onTestSkipped(ITestResult result) {
			// TODO Auto-generated method stub
			
		}

		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			// TODO Auto-generated method stub
			
		}
	}
