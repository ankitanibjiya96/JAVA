package com.objectClassDemo;

public class ConstructorChainingDemo {
	
	public static void main(String[] args) {
		B b1 = new B();
	}
}
class A 
{
	A()
	{
		this(20,30);
		System.out.println("Inside no arg constructor A");
	}
	A(int a, int b)
	{
		this("cde");
		System.out.println("Inside 2 param constructor A");
	}
	A(String s)
	{
		System.out.println("Inside 1 param constructor A");
	}	
}
class B extends A   //inheritance for calling parent class A constructor
{
	B()
	{
		this(10,20);   //calling same class constructor using this keyword
		System.out.println("Inside no arg constructor B");
	}
	B(int a, int b)
	{
		this("abc");  //calling same class constructor using this keyword
		System.out.println("Inside 2 param constructor B");
	}
	B(String s)
	{
		super(); //calling constructor of parent class i.e A
		System.out.println("Inside 1 param constructor B");
	}	
}