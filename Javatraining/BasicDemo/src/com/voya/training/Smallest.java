package com.voya.training;

public class Smallest {

	public static void main(String[] args) {

		int [] numbers= {12,23,45,67,13,45};
		int small=numbers[0];
		
		for(int i=1;i<numbers.length;i++)
		{
			
			if(numbers[i]<small)
			{
				small=numbers[i];
			}
		}
		System.out.println(small);
		
		

	}


	}


