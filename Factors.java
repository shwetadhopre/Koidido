package com;

import java.util.Scanner;

//write a program to print all factors of a number other than 1 and the number itself test case 1: input 28 output factors of 28 (excluding 1 and 28) are 2 4 7 14

public class Factors {
  
	
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
		 int number =28;
		 long res = factorial(number);
		System.out.println(res);
		
	}
	}
	
	
	
	

