package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

//create a hash map that holds a list of department where each department contains a list of its employees Iterate through a hashmap and print the names of all employees along with their respective department
public class Test {
  public static void main(String[] args) 
  {
	
	///  List<Department> al = new ArrayList<>();
	           
	  Employee e1 = new Employee();
	         e1.setName("Shreya");
	         e1.setAddr("pune");
	         
	         Employee e2 = new Employee();
	         e2.setName("priya");
	         e2.setAddr("nagpur");
	         
	         Employee e3 = new Employee();
	         e3.setName("radha");
	         e3.setAddr("mumbai");
	         
	         Employee e4 = new Employee();
	         e4.setName("anu");
	         e4.setAddr("pune");
	         
	         Employee e5 = new Employee();
	         e5.setName("nisha");
	         e5.setAddr("nagpur");
	         
	         Employee e6 = new Employee();
	         e6.setName("nj");
	         e6.setAddr("banglore");
	         
	         
	         
	  List<Employee> decs = new ArrayList<>();
	          decs.add(e1);
	          decs.add(e2);
	          decs.add(e3);
	          
	   List<Employee> deit = new ArrayList<>();
	   deit.add(e4);
       deit.add(e5);
       deit.add(e6);
       
	   List<List<Employee>> department = new ArrayList<>();      
	           department.add(deit);
	                 
	           department.add(decs);
	  
	  
	  
	  Map<Integer,List<List<Employee>>> mp = new HashMap<>();
	     mp.put(1, department);
	     
	      Set<Integer> st = mp.keySet();
	             Iterator<Integer> itr = st.iterator();
	             
	          while(itr.hasNext())
	          {
	        	  Integer key = itr.next();
	        	  List<List<Employee>> list    = mp.get(key);
	          
	          
	       Iterator<List<Employee>> al = list.iterator();
	          while(al.hasNext())
	          {
	        	  List<Employee> li = al.next();
	        	  
	        	 Iterator<Employee> emp = li.iterator();
	        	  while(emp.hasNext())
	        	  {
	        	Employee employee	=  emp.next();
	        	 System.out.println("Name of Employee:  "+employee.getName()+"Address of Employee is::  "+employee.getAddr());
	        	  
	        	  }
	          }
	       
	       
	       
	          }
	       
	       
	       
	  
	    //  mp.forEach((x,y)->y.forEach((z)->z.forEach((m)->System.out.println("Name of Employee:  "+m.getName()+"Address of Employee is::  "+m.getAddr()))));
	  
}
}
