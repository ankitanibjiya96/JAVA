package com.oopsconceptsdemo;

public class InheritanceDemo {
	public static void main(String[] args) {
		PerEmp e = new PerEmp(1, "Anushree", 1234 , 234.8); //creating new object
		System.out.println(e);
	}

}
class Employee  //parent class
{
	int empID;
	String empName;
	int empMob;
	
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
	public int getEmpMob() {
		return empMob;
	}
	public void setEmpMob(int empMob) {
		this.empMob = empMob;
	}
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", empMob=" + empMob + "]";
	}
	public Employee(int empID, String empName, int empMob) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empMob = empMob;
	}	
	
}

class PerEmp extends Employee //child class
{
	double bonus;

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "PerEmp [bonus=" + bonus + ", empID=" + empID + ", empName=" + empName + ", empMob=" + empMob + "]";
	}

	public PerEmp(int empID, String empName, int empMob, double bonus) {
		super(empID, empName, empMob);
		this.bonus = bonus;
	}	
}