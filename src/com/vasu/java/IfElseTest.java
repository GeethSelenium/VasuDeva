package com.vasu.java;

import java.util.Scanner;

public class IfElseTest {

	public static void main(String[] args) 
	{
		// to check given no is even / odd
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//int n=48;
		
		if (n%2==0) 
		{
			System.out.println("Even Number");
		}else
		{
			System.out.println("Odd Number");
		}

	}

}
