package com.voya.training;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		String[] usernames= {"priya","jimmy","mala","jaya"};
		Scanner sc =new Scanner(System.in);
		System.out.println("enter username to login");

		boolean flag=false;
		
		String uname=sc.next();
		
       for(String username:usernames){
    	
          if(username.equalsIgnoreCase(uname)){
    	   System.out.println("you are logged in successfully");
    	   flag=true;
    	   break;
          }
       }
       
      if(!flag)
       {
    	   System.out.println("invalid username");
    	   }
         
	}
	
       
	}



