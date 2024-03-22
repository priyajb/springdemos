package com.voya.training;

import java.util.Scanner;

public class Sqrt {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int [] num=new int[3];
		int [] square=new int[num.length];
		
		System.out.println("enter the values for nums array:");
		for(int i=0;i<num.length;i++)
		{
			num[i]=sc.nextInt();
		}
		for(int i=0;i<num.length;i++)
		{
			square[i]=num[i]*num[i];
			
		}
		
		System.out.println("sqaure root of the given values");
		for(int i:square)
		{
			System.out.println(i);
		}
		
	}

}
