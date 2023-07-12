package referenceTightlyCoupled_6;

import java.util.Scanner;

public class MainClassArray_2 {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 System.out.print("Enter no. of customer details:");
		 int size = Integer.parseInt(s.nextLine());
	     Customer_2 ob[] = new Customer_2[size];
	     
	     for(int i =0;i<size;i++) {
	    	 ob[i] = new Customer_2();
	    	 System.out.println("Enter customer details of "+(i+1));
	    	 System.out.println("Enter CustName:");
		     ob[i].custName = s.nextLine();
		     System.out.println("Enter CustId:");
		     ob[i].custId = s.nextLine();
		     System.out.println("Enter CustCity:");
		     ob[i].custCity = s.nextLine();
		     System.out.println("Enter CustMailId:");
		     ob[i].ct.mailId = s.nextLine(); 
		     //Customer object is calling Contact object ct, which is again calling its variable
		     System.out.println("Enter CustPhNo:");
		     ob[i].ct.phNo = Long.parseLong(s.nextLine());
	     }
	        
	        
	        System.out.println("=====Customer Details====");
	        for(Customer_2 j:ob) {
	        	System.out.println(j.toString());
	        }
	        s.close();

	}

}
