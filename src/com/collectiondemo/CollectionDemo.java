package com.collectiondemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionDemo {
	
public static void main(String[] args) {
	CollectionMethodsDemo();	
	}

static void CollectionMethodsDemo()
{
	List l1 = new ArrayList(); //heterogeneous type of data is stored
	l1.add(10);
	l1.add('a');
	l1.add("ankita");
	l1.add(3.2f);
	l1.add(10.0);
	System.out.println("The elements of list are \nl1: " + l1);
	List<Integer> l2 = new ArrayList<Integer>(); //generic type of list i.e Integer
	l2.add(10);
	l2.add(20);
	System.out.println("The elements of list are \nl2: " + l2);
	List<Integer> l3 = new ArrayList<Integer>();
	l3.addAll(l2);
	System.out.println("The elements of list are \nl3: " + l3);
	System.out.println("Size of list l3 is:" + l3.size());
	System.out.println("Contains: " + l3.contains(10));
	
	//code for returnAll and removeAll methods
	List<Integer> l4 = new ArrayList<Integer>();
	l4.add(30);
	l4.add(20);
	List<Integer> l5 = new ArrayList<Integer>();
	l5.add(10);
	l5.add(30);
	//l4.removeAll(l5); //removes all the common elements from l4 and not l5
	l4.retainAll(l5); //removes all the other elements and not common elements from l4 and not l5
	System.out.println("The elements of list are \nl4: " + l4);
	System.out.println("The elements of list are \nl5: " + l5);
}
}

