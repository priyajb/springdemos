package com.oops.basics;

public class EmpMain {
	public static void main(String[] args) {
		
		Employee employee=new Employee();
		employee.employeeName="raju";
		employee.employeeId=13;
		employee.salary=20000;
		
		System.out.println("Name " + employee.employeeName);
		System.out.println("Id"+ employee.employeeId);
		System.out.println("Salary"+employee.salary);
		
		Employee employee1=new Employee();
		employee1.employeeName="ram";
		employee1.employeeId=14;
		employee1.salary=20500;
			
		System.out.println("Name " + employee1.employeeName);
		System.out.println("Id"+ employee1.employeeId);
		System.out.println("Salary"+employee1.salary);
		}


}
