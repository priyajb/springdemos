package com.voya.training;

public class SecondLarge {

	public static void main(String[] args) {
		int[] num= {3,5,7,33,2,1};
		int flarge=num[0];
		int slarge=num[1];
		
		for(int number:num)
		{
			if(number<flarge)
			{
				slarge=flarge;
				flarge=number;
			}
			else if(number<slarge && number!=flarge)
			{
				slarge=number;
			}
		}
		System.out.println(flarge);
		System.out.println(slarge);
	}

}
