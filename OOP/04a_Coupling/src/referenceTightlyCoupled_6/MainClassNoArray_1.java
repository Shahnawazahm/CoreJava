package referenceTightlyCoupled_6;
import java.util.*;
public class MainClassNoArray_1 {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Customer_2 ob = new Customer_2();
        
        System.out.println("Enter CustName:");
        ob.custName = s.nextLine();
        System.out.println("Enter CustId:");
        ob.custId = s.nextLine();
        System.out.println("Enter CustCity:");
        ob.custCity = s.nextLine();
        System.out.println("Enter CustMailId:");
        ob.ct.mailId = s.nextLine(); 
        //Customer object is calling Contact object ct, which is again calling its variable
        System.out.println("Enter CustPhNo:");
        ob.ct.phNo = s.nextLong();
        
        System.out.println("=====Customer Details====");
        System.out.println(ob.toString());
        s.close();

	}
}
