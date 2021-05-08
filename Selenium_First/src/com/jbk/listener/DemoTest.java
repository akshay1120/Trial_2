package com.jbk.listener;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerDemo.class)

public class DemoTest 
{
	
	@Test
	public void test01() 
	{
		System.out.println("am in pass test");
	}
	
	@Test
	public void test02() 
	{
		System.out.println("am in fail test");
		Assert.assertEquals(true, false);
	}
	
	@Test
	public void test03() 
	{
		throw new SkipException("am in skip test");
	}
	
}
