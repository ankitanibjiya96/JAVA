package com.polymorphismdemo;

public class PolyMorphism {
	
public static void main(String[] args) {
	
	/*
	 * int a = 10; long b =a; //implicit casting
	 * System.out.println("Value of b in implicit casting: " + b);
	 * 
	 * float c = 20.5f; int d = (int) c; //explicit casting
	 * System.out.println("Value of d in explicit casting: " + d);
	 */
	byte a = 2;
	m1(a);  // it
		
}

static void m1()   //method overloading example
{
	System.out.println("Inside method m1 with no arguments");
}

/*
 * static String m1(int a) {
 * System.out.println("Inside method m1 with one parameter"); return null; }
 */
/*
 * static String m1(float a) { System.out.
 * println("Inside method m1 with one parameter and different datatype"); return
 * null; }
 */
static String m1(int a, float b)
{
	System.out.println("Inside method m1 with 2 parameters");
	return null;
}
static String m1(float b,int a)
{
	System.out.println("Inside method m1 with 2 parameters but sequence is changed");
	return null;
}
static String m1(Integer a)
{
	System.out.println("Inside Wrapper Integer");
	return null;
}

/*
 * static String m1(Number a) {
 * System.out.println("Inside Parent class Number"); return null; }
 */
static String m1(Object a)
{
	System.out.println("Inside Object class");
	return null;
}
}
