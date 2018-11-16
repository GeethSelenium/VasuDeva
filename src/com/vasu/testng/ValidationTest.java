package com.vasu.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidationTest 
{
@Test
public void validation()
{
	String data="Vasu";
	String data1="Vasu";
	
	/*if (data.equals(data1))
	{
		System.out.println("Equal");
	}else
	{
		System.out.println("Not equal");
	}*/
	//Assert.assertEquals(data, data1);
	Assert.assertEquals(15, 15,"Both are not equal");
}
}
