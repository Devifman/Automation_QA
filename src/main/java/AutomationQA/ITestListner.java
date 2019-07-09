package AutomationQA;

import org.testng.IAlterSuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class ITestListner implements ITestListener {

    int x = 1;

    public void onTestStart(ITestResult result) {
        System.out.println("Method is started");
        result.getTestClass();
    }


    public void onTestSuccess(ITestResult result) {
        System.out.println("Method test is successful");
        x++;
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("Method is failed");
        x++;
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("Test was skipped");
        x++;
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("Test was failed but within success percentage");

    }

    public void onStart(ITestContext result) {
        System.out.println("Test was started");
    }

    public void onFinish(ITestContext result) {
        System.out.println("Test was finished");
    }
}

