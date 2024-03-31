package com.firstdemo;

public class FirstDemo implements Cloneable{
	
	FirstDemo a1;
	String s1;
	
	int a=10;  //instance variable
	private int d=30;
	protected int e=5;
	public static int b=20; //static or global variable

	
 public static void main(String[] args) throws CloneNotSupportedException {
	
		/*
		 * int c=15; //local variable FirstDemo f1=new FirstDemo(); 
		 * FirstDemo f2=new FirstDemo(); 
		 * display();
		 */
	clonedemo();
	 
}
 static void clonedemo() throws CloneNotSupportedException
 {
	 FirstDemo f1 = new FirstDemo();
	 f1.setA(10);
	 f1.setD(30);
	 System.out.println("F1=="+ f1);
	 FirstDemo f2 = (FirstDemo) f1.clone();
	 System.out.println("F2=="+ f2);
 }
 
 static void display()
 {
  FirstDemo f7 = new FirstDemo();
  System.out.println(f7);
 }
 int addition() //Instance method
 {
	 System.out.println("Inside Instance method");
	 System.out.println(a); //access instance variable in instance method in same class
	 System.out.println(b); //access static variable in instance method in same class
	 return 1;	 
 }
 static void multiply() //Static method
 {
	 FirstDemo f3= new FirstDemo();
	 System.out.println("Inside static method");
	 System.out.println(f3.a); //access instance variable in static method in same class
	 System.out.println(b); //access static variable in static method in same class
 }
 {
	 System.out.println("Inside instance block"); //instance block
 }
 static
 {
	 System.out.println("Inside static block"); //static block
 }
@Override
public String toString() {
	return "FirstDemo [a1=" + a1 + ", s1=" + s1 + ", a=" + a + ", d=" + d + ", e=" + e + "]";
}
public FirstDemo getA1() {
	return a1;
}
public void setA1(FirstDemo a1) {
	this.a1 = a1;
}
public String getS1() {
	return s1;
}
public void setS1(String s1) {
	this.s1 = s1;
}
public int getA() {
	return a;
}
public void setA(int a) {
	this.a = a;
}
public int getD() {
	return d;
}
public void setD(int d) {
	this.d = d;
}
public int getE() {
	return e;
}
public void setE(int e) {
	this.e = e;
}
public static int getB() {
	return b;
}
public static void setB(int b) {
	FirstDemo.b = b;
}
@Override
protected Object clone() throws CloneNotSupportedException { //object clone concept
	// TODO Auto-generated method stub
	return super.clone();
}
}

class Student  //another class
{
void m1()  //Instance method 
{
	FirstDemo f4= new FirstDemo();
	System.out.println(f4.a); //access instance variable in instance method in another class
	System.out.println(FirstDemo.b); //access static variable in instance method in another class
}
static void m2() //Static method
{
	FirstDemo f4= new FirstDemo();
	System.out.println(f4.a); //access instance variable in static method in another class
	System.out.println(FirstDemo.b); //access static variable in static method in another class
	}
}
