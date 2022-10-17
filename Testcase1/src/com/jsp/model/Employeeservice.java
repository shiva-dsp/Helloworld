package com.jsp.model;

import java.util.List;
import java.util.Scanner;



	@Service
	public class Employeeservice<Product> {
		
		Myrepo repo;
		public void displayData()
		{
			
			Scanner sc=new Scanner(System.in);
			String Employee ="Shiva";
			   displayData();
			   int sec=sc.nextInt();
			   if(sec<=1)
				   {
				   switch(sec) {
				   case 1:
				        System.out.println("Employee Id" + Employee);
					   int i=sc.nextInt();
				         if(i==1) 
				        	 {
				                 System.out.println("Employee" +i); 
				                 
				         }
				         else if(i==2) {
				        	 System.out.println("Employee" );
				         }
				         else if(i==3) {
				        	 System.out.println("Employee");
				         }
				   }
			   }
		}

	
}
