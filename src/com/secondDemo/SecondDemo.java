package com.secondDemo;

import com.firstdemo.FirstDemo;

public class SecondDemo extends FirstDemo { /*Protected access modifier concept: 
												Created child reference*/
	void m3()
	{
		SecondDemo f6 = new SecondDemo(); //access instance variable in instance method in another class
		System.out.println(f6.e); 
		System.out.println(SecondDemo.b);//access static variable in instance method in another class
	}
	
	static void m4()
	{
		SecondDemo f6 = new SecondDemo(); //access instance variable in static method in another class
		System.out.println(f6.e); 
		System.out.println(SecondDemo.b);//access static variable in static method in another class
	}
	

}
