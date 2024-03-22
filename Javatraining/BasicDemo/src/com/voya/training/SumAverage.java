package com.voya.training;

import java.util.Scanner;

public class SumAverage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [] num=new int[3];
		int sum=0;
		System.out.println("enter the values");
		for(int i=0;i<3;i++)
		{
			num[i]=sc.nextInt();
		}
		for(int i=0;i<3;i++)
		{
			
			sum+=num[i];
			
		}
		System.out.println("sum is"+sum);
		System.out.println("average is"+sum/num.length);
		
	}

}
