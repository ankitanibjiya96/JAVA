package com.exceptionhandling;

public class ExceptionHandlingDemo{
	
public static void main(String[] args) throws CustomCheckedException {
		//ExceptionDemo();
	// int b = m1();
	 //System.out.println(b);
	//CustomChecked();
	MultipleTryCatchDemo();
}

static void ExceptionDemo()
{
	System.out.println("In exception1");
	System.out.println("In exception2");
	System.out.println("In exception3");
	try {
		int a = 10/0;
	}catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}finally {
		
	}
	System.out.println("In exception4");
	System.out.println("In exception5");
	System.out.println("In exception6");
}

static void checkedExceptionDemo()
{
	ExceptionHandlingDemo e1 = new ExceptionHandlingDemo();
	//ExceptionHandlingDemo e2 = (ExceptionHandlingDemo) e1.clone();
}

@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

static int m1()
{
	try {
		System.out.println("Inside try block");          //deemed concept
	//	int a= 10/0;
		return 1;
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("Inside catch block");
		return 2;
	} finally { 
		System.out.println("Inside finally block"); 
		return 3; 
	}
}	
static void MultipleTryCatchDemo()
{
	try {
		System.out.println("Inside try block");
		//int c = 8/0;
		//String s = null;
		//s.length();
		String s1 = "123abc";
		Integer.parseInt(s1);
	}catch (ArithmeticException e) {
		e.printStackTrace();
	}catch (NullPointerException e) {
		e.printStackTrace();
	}catch (Exception e) {     //always to be witten in last
		e.printStackTrace();
	}
}
static void ThrowDemo() throws ClassNotFoundException, ArithmeticException
{
	//throw new ArithmeticException();
	throw new ClassNotFoundException();
}
static void CustomChecked() throws CustomCheckedException
{
	throw new CustomCheckedException("Hello");
}
}

class CustomCheckedException extends Exception         //custom checked exception
{
	public CustomCheckedException(String str) {
		// TODO Auto-generated constructor stub
		super(str);
	}
}

