package com.polymorphismdemo;

public class MethodOverridingDemo {

	public static void main(String[] args) {
		A a1 = new A(); // Compile-Time Polymorphism
		a1.Add();
		A a2 = new B(); // Runtime Time polymorphism
		a2.Add();
		a2.m1(5);
		A a3 = new C();
		a3.Add();
		a3.m1(10);
	}
}

class A {
	protected void Add() {
		System.out.println("Inside add A method");
	}

	int m1(int a) {
		System.out.println("Inside method m1");
		return 0;
	}

	Integer m2(Integer b) {
		System.out.println("Inside method m2");
		return b;
	}

	Number m3(Number a) {
		System.out.println("Inside method m3");
		return a;
	}

	A m4(A a) {
		System.out.println("Inside method m4");
		return a;
	}
}

class B extends A {
	protected void Add() {
		System.out.println("Inside add B method");
	}

	int m5(int c) {
		System.out.println("Inside method m5 B");
		return c;
	}
}

class C extends B {
	  public void Add() 
	  { 
		  System.out.println("Inside add C method");
	  }
	  int m1(int a) 
	  { 
		  System.out.println("Inside m1 method of class C"); 
		  return a;
	  }
	  int m6(int d)
	  {
		System.out.println("Inside m6 method");
		return d;
	  }
}