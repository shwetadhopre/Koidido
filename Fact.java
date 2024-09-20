package com;

public class Fact {
public static long  factorial(int n) 
	
	{
		int fact = 1;
		for(int i =1;i<n;i++)
		{
			fact *=i;
		}
	         
		return fact;	
		
		}
	public static void main(String[] args) {
		 int number =13;
		 long res = factorial(number);
		System.out.println(res);
		
	}
}
