package com.voya.training;

import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {
		String [] usernames= {"pri","jim","mala"};
		Scanner sc=new Scanner(System.in);
		boolean isPresent=false;
		System.out.println("enter the username");
		
		String uname=sc.next();
		
		
		
		
		//for(int i=0;i<usernames.length;i++) {
		//	System.out.println("enter username"+(i+1)+ ":");
			
		
		//System.out.println("usernames entered:");
       for(String username:usernames){
    	
          if(username.equalsIgnoreCase(uname)){
    	   System.out.println("name already exists");
    	   isPresent=true;
    	   break;
          }
       }
       
      if(!isPresent)
       {
    	   System.out.println("you are registered");
    	   }
         
	}
       

}
