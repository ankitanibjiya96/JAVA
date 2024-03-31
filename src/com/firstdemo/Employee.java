package com.firstdemo;

public class Employee {

	void b1()
	{
		FirstDemo f5= new FirstDemo(); //access instance variable in instance method in another class
		System.out.println(f5.a);
		System.out.println(FirstDemo.b); //access static variable in instance method in another class
	}
	static void b2()
	{
		FirstDemo f5= new FirstDemo(); //access instance variable in static method in another class
		System.out.println(f5.a); //access static variable in static method in another class
	}
}
