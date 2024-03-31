package com.oopsconceptsdemo;

public class InterfaceDemo {

}

interface Demo //interface 1
{
	void display();
	void show();
}

interface Demo1 //interface 2
{
	void display();
	void show();
	void disp();
}

class A implements Demo,Demo1 //implements interface
{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		
	}
	
}

class B extends A implements Demo  //implements interface
{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
}