package utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNJListener implements ITestListener {
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("Executing Listeren - OnTestStart");
        System.out.println("Following test is executing now: " + iTestResult.getName());
    }

    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("Executing Listener - onTestSuccess");
        System.out.println("Following test is finished with success: " + iTestResult.getName());
    }

    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("Executing Listener - onTestFailure");
        System.out.println("Following test is finished with failure: " + iTestResult.getName());
    }

    public void onTestSkipped(ITestResult iTestResult) {

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {
        System.out.println("Executing Listener - onStart");
        System.out.println("Following test is started now: " + iTestContext.getName());
    }

    public void onFinish(ITestContext iTestContext) {
        System.out.println("Executing Listener - onFinish");
        System.out.println("Following test is finished now: " + iTestContext.getName());
    }
}
