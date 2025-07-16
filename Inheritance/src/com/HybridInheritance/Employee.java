package com.HybridInheritance;

public class Employee extends Person {

	int empid = 4654;
	String position = "Manager";
	float salary = 54587;
	
	public void EmployeeDetails()
	{
		System.out.println("EmpDetails="+empid+" "+"Position="+position+" "+"Salary="+salary);
	}

}
