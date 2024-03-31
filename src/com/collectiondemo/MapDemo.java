package com.collectiondemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MapDemo {

public static void main(String[] args) {
		//show();
	// TreeDemo();
	ComparableDemo();
	}

static void show()
{
	Employee e1 = new Employee(1, "Anushka", 10000);
	Employee e2 = new Employee(2, "Mahima" , 50000);
	Employee e3 = new Employee(3, "Pranit" , 20000);
	Employee e4 = new Employee(1, "Anushka", 10000);
	Employee e5 = new Employee(1, "Ankita", 10000);
	Map<Employee, String> m1 = new HashMap<Employee, String>();
	m1.put(e1, "A");
	m1.put(e2, "B");
	m1.put(e3, "C");
	m1.put(e4, "D");
	m1.put(e5, "J");
	
	Map<Integer, String> m2 = new HashMap<Integer, String>();
	m2.put(1, "E");
	m2.put(2, "F");
	m2.put(1, "G");
	m2.put(4, "H");
	m2.put(1, "I");
	
	System.out.println("The elements of Map m1 are: " + m1);
	System.out.println("The elements of Map m2 are: " + m2);
}

static void TreeDemo()
{
	Set<Integer> t1 = new TreeSet<Integer>();  //generic set
	t1.add(10);
	t1.add(20);
	t1.add(30);
	System.out.println("The elements of Treeset t1 are:" + t1);
	
	Set t2 = new TreeSet(); 
	t2.add(10);
	t2.add(22); //value depends on datatype of first element
	t2.add(20);
	System.out.println("The elements of Treeset t2 are:" + t2);
	
	Map<Integer, String> m3 = new TreeMap<Integer, String>(); //generic map
	m3.put(10, "a");
	m3.put(20, "b");
	m3.put(30, "c");
	System.out.println("The elements of TreeMap m3 are:" + m3);
	
	Map m4 = new TreeMap();
	m4.put(44, "d");
	m4.put(33, "e"); //value of key depends on datatype of first element
	m4.put(25, 10);
	System.out.println("The elements of TreeMap m4 are:" + m4);
}

static void ComparableDemo()
{
	int a[] = {32,12,65,45,90};
	int temp = 0;
	/*
	 * for(int i=0; i<a.length; i++) { for(int j=i+1; j<a.length; j++) {
	 * if(a[i]>a[j]) { temp = a[i]; a[i] = a[j]; a[j] = temp; } } }
	 */
	//System.out.println("The elements of array in ascending order are:" + Arrays.toString(a));
	
	//code for system defined data type
	List<Integer> l1 = new ArrayList<Integer>();
	for(int i : a) {
	l1.add(i);
	}
	System.out.println("Elements of array before sorting are:" + l1);
	Collections.sort(l1);
	System.out.println("Elements of array after sorting are:" + l1);
	
	//code for user defined data type i.e class Employee
	Employee e1 = new Employee(102, "A", 100000);
	Employee e2 = new Employee(101, "B", 50000);
	Employee e3 = new Employee(98, "C", 20000);
	Employee e4 = new Employee(120, "D", 40000);
	List<Employee> l2 = new ArrayList<Employee>();
	l2.add(e1);
	l2.add(e2);
	l2.add(e3);
	l2.add(e4);
	System.out.println("List of employee is:" + l2);
	Collections.sort(l2);
	System.out.println("List of employee after sorting is:" + l2);
}
}

class Employee implements Comparable<Employee>
{
	int empID;
	String empName;
	double salary;
	
	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", salary=" + salary + "]\n";
	}

	public Employee(int empID, String empName, double salary) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.salary = salary;
	}
	/*
	 * @Override public int hashCode() { return Objects.hash(empName); }
	 */

	/*
	 * @Override public boolean equals(Object obj) { if (this == obj) return true;
	 * if (obj == null) return false; if (getClass() != obj.getClass()) return
	 * false; Employee other = (Employee) obj; return Objects.equals(empName,
	 * other.empName); }
	 */
	

	
	  @Override 
	  public int hashCode() 
	  { 
		  return Objects.hash(empID); 
	  }
	 

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empID == other.empID;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		//return this.getEmpID() - o.getEmpID();  //ascending order sorting on empID
		//return -(this.getEmpID() - o.getEmpID());  //descending order sorting on empID
		//return (int) (this.getSalary() - o.getSalary()); //ascending order sorting on employee salary
		return (int) -((this.getSalary() - o.getSalary())); //descending order sorting on employee salary
	}
}