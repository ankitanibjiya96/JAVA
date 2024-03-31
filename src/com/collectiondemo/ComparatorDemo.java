package com.collectiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
	
public static void main(String[] args) {
		DemoOfComparator();
}

static void DemoOfComparator()
{
	Student s1 = new Student(12, 50, "Akshita");
	Student s2 = new Student(25, 40, "Pranit");
	Student s3 = new Student(15, 35, "David");
	Student s4 = new Student(45, 60, "Mary");
	List<Student> l1 = new ArrayList<Student>();
	l1.add(s1);
	l1.add(s2);
	l1.add(s3);
	l1.add(s4);
	System.out.println("The elements of list L1 are:" + l1);
	Collections.sort(l1, new Student());
	System.out.println("The elements of list L1 after sorting are:" + l1);
	Collections.sort(l1, new SortByMark());
	System.out.println("The elements of list L1 after sorting by marks:" + l1);
	Comparator<Student> c1 = new Comparator<Student>() {   //method 3 : Anonynmous implementation of comparator interface
		
		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			return -(o1.getStudentName().compareTo(o2.getStudentName()));
		}
	};
	Collections.sort(l1, c1);
	System.out.println("The elements of list L1 after sorting by name:" + l1);
}
}

class Student implements Comparator<Student>  //Method 1: Implement in same class 
{
	int studentID, marks;
	String StudentName;
	
	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", marks=" + marks + ", StudentName=" + StudentName + "]\n";
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public Student(int studentID, int marks, String studentName) {
		super();
		this.studentID = studentID;
		this.marks = marks;
		StudentName = studentName;
	}
    public Student()   //no arg constructor for using comaparable interface
    { 
    	
    }
	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getStudentID() - o2.getStudentID();
	}	
}

class SortByMark implements Comparator<Student>   //second way of implementing comparator in another way
{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return -(o1.getMarks() - o2.getMarks());
	}
	
}