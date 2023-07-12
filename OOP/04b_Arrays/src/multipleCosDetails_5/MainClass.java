package multipleCosDetails_5;
import java.util.*;

import cusPack_5.Customer;
public class MainClass {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("How many customer data you want to enter? ");
		int size = Integer.parseInt(s.nextLine());
		Customer ob[] = new Customer[size];
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter customer details at "+(i+1)+": ");
			// OR 	a[i] = new Integer(s.nextInt()); 
			
		    System.out.print("Enter CustName:");
		    String name = s.nextLine();
		    
		    System.out.print("Enter CustId:");
		    String id = s.nextLine();
		    
		    System.out.print("Enter CustCity:");
		    String city = s.nextLine();
		    
		    System.out.print("Enter CustMailId:");
		    String mailId = s.nextLine(); 
		    
		    //Customer object is calling Contact object ct, which is again calling its variable
		    System.out.print("Enter CustPhNo:");
		    double phNo =Double.parseDouble(s.nextLine());
		    
//		    ob[i].ct.phNo = s.nextLong();
			//creating new objects always when iterating to next value
		    ob[i] = new Customer(name, id, city, mailId, phNo);
		} //end of loop. Entering data to object
		
//		System.out.println("=====Customer Details====");
//		for(int i=0;i<size;i++) {
//			System.out.println(ob[i].toString());
//		}
        s.close();

	}
}
