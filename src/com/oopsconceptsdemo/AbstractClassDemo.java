package com.oopsconceptsdemo;

public class AbstractClassDemo {

public static void main(String[] args) {
		
	}

}
abstract class AA  //mandatory to write abstract keyword if abstract method is present in class
{
	void disp()  //non-abstract method
	{
		
	}
	abstract void show();
}

class BB extends AA
{

	@Override
	void show() {
		// TODO Auto-generated method stub
		
	}
	
}