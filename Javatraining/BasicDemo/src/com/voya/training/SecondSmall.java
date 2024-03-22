package com.voya.training;

public class SecondSmall {

	public static void main(String[] args) {
		int[] num= {3,5,7,33,2,1};
		int fsmall=num[0];
		int ssmall=num[1];
		
		for(int number:num)
		{
			if(number<fsmall)
			{
				ssmall=fsmall;
				fsmall=number;
			}
			else if(number<ssmall && number!=fsmall)
			{
				ssmall=number;
			}
		}
		System.out.println(fsmall);
		System.out.println(ssmall);

	}

}
