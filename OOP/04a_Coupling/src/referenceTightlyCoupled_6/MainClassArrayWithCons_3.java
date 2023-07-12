package referenceTightlyCoupled_6;
import java.util.Scanner;

public class MainClassArrayWithCons_3 {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 System.out.print("Enter no. of customer details:");
		 int size = Integer.parseInt(s.nextLine());
		 CustomerWithCon_3 ob[] = new CustomerWithCon_3[size];
	     
	     for(int i =0;i<size;i++) {
	    	 System.out.println("Enter customer details of "+(i+1));
	    	 System.out.print("Enter CustName:");
		     String custName = s.nextLine();
		     
		     System.out.print("Enter CustId:");
		     String custId = s.nextLine();
		     
		     System.out.print("Enter CustCity:");
		     String custCity = s.nextLine();
		     
		     System.out.print("Enter CustMailId:");
		     String mailId = s.nextLine(); 
		     //Customer object is calling Contact object ct, which is again calling its variable
		     System.out.print("Enter CustPhNo:");
		     Long phNo = Long.parseLong(s.nextLine());
		      ob[i] = new CustomerWithCon_3(custName, custId, custCity, mailId, phNo);
		      
	     }
	        
	        
	        System.out.println("=====Customer Details====");
	        for(CustomerWithCon_3 j:ob) {
	        	System.out.println(j.toString());
	        }
	        s.close();

	}

}
