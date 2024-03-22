package com.voya.training;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
	}

}
