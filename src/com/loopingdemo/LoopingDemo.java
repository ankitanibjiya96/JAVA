package com.loopingdemo;

import java.util.Arrays;
import java.util.Scanner;

public class LoopingDemo {
	
	public static void main(String[] args) {
		//forLoop();
		//whileLoop();
		//doWhileLoop();
		//forEachLoopDemo();
		continueDemo();
	}

	static void forLoop()
	{
		int a[] = new int[3]; //method1: declaring array
		a[0]=10;
		a[1]=25;
		a[2]=15;
		//to get data of array elements from memory location we use toString method of Array class
		System.out.println("Elements of a: " + Arrays.toString(a));
		int b[]= {5, 10 ,15}; //method2: value assigned at the time of declaration
		int s1 = 0;
		for(int i=0; i<a.length; i++) //for loop
		{	
			s1 = s1 + a[i];
		}
		System.out.println("The sum of elements is: " + s1);	
		int a1;
		int a2;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a1: ");
		a1 = s.nextInt();
		System.out.println("Enter a2: ");
		a2 = s.nextInt();
		for(int i=a1; i<=a2; i++)
		{
			if(i%2==0)
				System.out.println("Even Number: " + i);			
		}	
	}
	static void whileLoop()
	{
		int a[] = new int[3]; //method1: declaring array
		a[0]=10;
		a[1]=25;
		a[2]=15;
		//to get data of array elements from memory location we use toString method of Array class
		System.out.println("Elements of a: " + Arrays.toString(a));
		int b[]= {5, 10 ,15}; //method2: value assigned at the time of declaration
		int s1 = 0;
		int i=0;
		while(i<a.length)   //while loop
		{	
			s1 = s1 + a[i];
			i++;
		}
		System.out.println("The sum of elements is: " + s1);	
		int a1;
		int a2;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a1: ");
		a1 = s.nextInt();
		System.out.println("Enter a2: ");
		a2 = s.nextInt();
		int j=a1;
		while(j<=a2)
		{
			if(j%2==0) {
				System.out.println("Even Number: " + j);
			}
			j++;
		}	
	}
	static void doWhileLoop()
	{
		int a[] = new int[3]; //method1: declaring array
		a[0]=10;
		a[1]=25;
		a[2]=15;
		//to get data of array elements from memory location we use toString method of Array class
		System.out.println("Elements of a: " + Arrays.toString(a)); 
		int b[]= {5, 10 ,15}; //method2: value assigned at the time of declaration
		int s1 = 0;
		int i=0;
		do   //do while loop
		{
			s1 = s1 + a[i];
			i++;
		}while(i<a.length);
		System.out.println("The sum of elements is: " + s1);	
		int a1;
		int a2;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a1: ");
		a1 = s.nextInt();
		System.out.println("Enter a2: ");
		a2 = s.nextInt();
		int j=a1;
		do
		{
			if(j%2==0) {
				System.out.println("Even Number: " + j);
			}
			j++;
		}while(j<=a2);
	}
	static void forEachLoopDemo()
	{
		int a[] = new int[3]; //method1: declaring array
		a[0]=10;
		a[1]=25;
		a[2]=15;
		//to get data of array elements from memory location we use toString method of Array class
		System.out.println("Elements of a: " + Arrays.toString(a));
		int b[]= {5, 10 ,15}; //method2: value assigned at the time of declaration
		int s1 = 0;
		for(int i: a) //for each loop: We use when there is group of data i.e to read data in forward direction
		{
			s1 = s1 + i;
		}
		System.out.println("The sum of elements is: " + s1);	
	}
	static void continueDemo()
	{
		for(int i=1; i<=10;i++)
		{
			if(i==5)
				continue;
			System.out.println(i);
		}
		
	}
}
