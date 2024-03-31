package com.statementinjava;

import java.util.Scanner;

public class ConditionalStatementInJava {
	
	public static void main(String[] args) {
		//ifDemo();
		//ifElseDemo();
		//ifElseIf();
		switchDemo();
	}
	static void ifDemo()
	{
		int age;
		Scanner s = new Scanner(System.in); //for taking input from user we use Scanner class
		System.out.println("Enter age");
		age = s.nextInt();
		if(age > 19)	// if statement
		 System.out.println("You are eligible for working"); 
		 System.out.println("You are not eligible for working");
	}
	static void ifElseDemo()
	{
		int age;
		Scanner s = new Scanner(System.in); //for taking input from user we use Scanner class
		System.out.println("Enter age");
		age = s.nextInt();
		if(age > 19){   // if else statement
		 System.out.println("You are eligible for working");
		}else
		 System.out.println("You are not eligible for working");
		
		int a;
		int b;
		System.out.println("Enter a");
		a= s.nextInt();
		System.out.println("Enter b");
		b = s.nextInt();
		if(a > b)
			System.out.println("A is greater than b " + a);
		else
			System.out.println("B is greater than a " + b);
	}
	static void ifElseIf() 
	{
		int a;
		int b;
		int c;
		Scanner s = new Scanner(System.in); //for taking input from user we use Scanner class
		System.out.println("Enter a");
		a= s.nextInt();
		System.out.println("Enter b");
		b = s.nextInt();
		System.out.println("Enter c");
		c= s.nextInt();
		if(a > b && a > c) // if else if statement
			System.out.println("A is greater: " + a);
		else if(b > a && b > c)
			System.out.println("B is greater: " + b);
		else if (c > a && c > b)
			System.out.println("C is greater: " + c);
		else 
			System.out.println("All number are equal");
	}
	static void switchDemo()
	{
		int a;
		int b;
		int ch;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a: ");
		a= s.nextInt();
		System.out.println("Enter b: ");
		b= s.nextInt();
		System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n");
		System.out.println("Enter choice: ");
		ch= s.nextInt();
		switch(ch)
		{
		case 2 : System.out.println("Subtraction = " + (a-b));
				 break;
		case 1 : System.out.println("Addition = " + (a+b));
		         break;
		case 3 : System.out.println("Multiplication = " + (a*b));
				 break;
		case 4 : System.out.println("Division = " + (a/b));
				 break;
		default : System.out.println("Invalid choice");
		}
	}
}

