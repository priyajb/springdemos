package com.voya.training;

public class Greatest {

	public static void main(String[] args) {
		int [] numbers= {12,23,45,67,13,45};
		int big=numbers[0];
		
		for(int i=1;i<numbers.length;i++)
		{
			
			if(numbers[i]>big)
			{
				big=numbers[i];
			}
		}
		System.out.println(big);
		
		

	}

}
