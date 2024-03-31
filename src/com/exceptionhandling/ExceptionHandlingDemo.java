package com.exceptionhandling;

public class ExceptionHandlingDemo {
	
public static void main(String[] args) {
		ExceptionDemo();
}

static void ExceptionDemo()
{
	System.out.println("In exception1");
	System.out.println("In exception2");
	System.out.println("In exception3");
	int a = 10/0;
	System.out.println("In exception4");
	System.out.println("In exception5");
	System.out.println("In exception6");
}
}
 