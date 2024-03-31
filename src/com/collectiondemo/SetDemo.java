package com.collectiondemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SetDemo {
	
public static void main(String[] args) {
		SetCollectionDemo();
}

static void SetCollectionDemo()
{
	List<Integer> l1 = new LinkedList<Integer>();
	l1.add(20);
	l1.add(10);
	l1.add(50);
	l1.add(20);
	System.out.println("The elements of list l1 are: " + l1);
	
	Set<Integer> s1 = new HashSet<Integer>();
	s1.add(20);
	s1.add(30);
	s1.add(50);
	s1.add(30);
	s1.add(50);
	System.out.println("The elements of set s1 are: " + s1);
	
	Set<Integer> s2 = new LinkedHashSet<Integer>();
	s2.add(50);
	s2.add(20);
	s2.add(30);
	s2.add(30);
	s2.add(50);
	System.out.println("The elements of set s2 are: " + s2);
}

}
