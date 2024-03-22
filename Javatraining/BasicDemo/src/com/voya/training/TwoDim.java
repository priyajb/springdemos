package com.voya.training;

public class TwoDim {

	public static void main(String[] args) {
		int[] [] marks=new int[3][2];
		System.out.println(marks[0][0]);
		System.out.println(marks.length);
		
		marks[0][0]=90;
		marks[0][1]=80;
		marks[1][0]=89;
		marks[1][1]=90;
		marks[2][0]=80;
		marks[2][1]=40;
		
		for(int i=0;i<marks.length;i++)
		{
			for(int j=0;j<marks[i].length;j++)
			{
	
			System.out.print(marks[i][j]+" ");
		}
	System.out.println();
	}
/*for(int[] one :marks)
{
	for(int num:one) {
		System.out.println(num);
	}
}*/
	}
}
