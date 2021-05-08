package com.jbk.listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerDemo implements ITestListener 
{

	@Override
	public void onTestStart(ITestResult result)
	{
		System.out.println("Testcase with name : " + result.getName() + "is started");
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{	
		System.out.println("Testcase with name : " + result.getName() + "is passed");
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{	
		System.out.println("Testcase with name : " + result.getName() + "is failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{	
		System.out.println("Testcase with name : " + result.getName() + "is skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) 
	{	
		System.out.println(" Ready for Testcases to run....");
	}

	@Override
	public void onFinish(ITestContext context)
	{
		System.out.println(" All Tests are completed you will get result into console... ");
	}
	
}
