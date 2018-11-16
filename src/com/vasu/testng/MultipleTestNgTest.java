package com.vasu.testng;

import org.testng.annotations.Test;

public class MultipleTestNgTest
{
@Test(priority=1)
public void appLaunch()
{
	System.out.println("AppLaunch");
}
@Test(priority=2)
public void appLogin()
{
	System.out.println("AppLogin");
}
@Test(priority=3)
public void appClose()
{
	System.out.println("AppLogout");
}

}
