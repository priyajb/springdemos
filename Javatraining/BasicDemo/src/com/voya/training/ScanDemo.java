package com.voya.training;

import java.util.Scanner;

public class ScanDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name");
		String name=sc.nextLine();
		System.out.println(name);
		
		System.out.println("enter your id");
		int empId=sc.nextInt();
		System.out.println(empId);
		
		
		System.out.println("enter your age");
		String age=sc.next();
		System.out.println(age);
		
		System.out.println("enter your city");
		String city=sc.next();
		System.out.println(city);
		
		System.out.println("enter your salary");
		double salary=sc.nextDouble();
		System.out.println(salary);
		
		
	}

}
