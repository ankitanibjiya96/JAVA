package com.objectClassDemo;

public class ObjectClassDemo {
	
	public static void main(String[] args) {
		
		Student s1= new Student();
		s1.setStudentId(20);
		s1.setStudentName("Ankita");
		System.out.println(s1.getStudentName());
		Student s2 = new Student(5,"Mahi");
		Student s3 = new Student(3,"Asha");
	}

}

class Student
{
	int studentId;
	String studentName;
	
	Student() //No arg constructor                                  /*constructor overloading*/
	{}
	Student(int studentId)  //parameterized constructor
	{}
	Student(int a, int b, int c) //parameterized constructor
	{}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Student(int studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}	
}
