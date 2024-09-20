package com;

import java.util.Scanner;

public class Bank {
	 
	public void deposit()
	{
	   Scanner sc= new Scanner(System.in);
	     System.out.println("Please Enter amount");
	         int x  = sc.nextInt();
	         if(x>0)
	         {
	        	 System.out.println("Amount is valid in your bank");
	         }
	         else
	         {
	        	 throw new InvalidAmountNumbers("Please enter valid numbers of amount");
	         }
	         
	         
	         
	         
	}
  public static void main(String[] args) 
  {
	 Bank b = new Bank();
			b.deposit();
			
	  
	  
}
}
