package mainPackage; //this is main package, which contains psvm function
import customerContact.CustomerCon;//this is imported user package
import customerDetails.CustomerDet; // //

import java.util.Scanner; //importing Scanner class
public class MainClass { //this is mainClass which gets executed first. 

	public static void main(String[] args) { 
		Scanner so = new Scanner(System.in); //Creating Scanner object
		
		System.out.println("Enter customer ID: ");//taking values from user
		String id = so.nextLine(); //storing values 
		
		System.out.println("Enter customer name: ");
		String name = so.nextLine();
		
		System.out.println("Enter customer city: ");
		String city = so.nextLine();
		
		System.out.println("Enter customer mail: ");
		String mail = so.nextLine();
		
		System.out.println("Enter customer phone number: ");
		long phone = Long.parseLong(so.nextLine());
		so.close(); //closing scanner object. Recommended!

		CustomerCon objCC = new CustomerCon(); //creating obj of other package which was imported at beginning.
		CustomerDet objCD = new CustomerDet(); // //
		
		objCD.setId(id); //Setting name by setters
		objCD.setName(name);
		objCD.setCity(city);
		
		objCC.setMailid(mail);
		objCC.setPhone(phone);
		
		System.out.println("Customer details are: ");
		
		System.out.println("Customer ID: "+ objCD.getId()); //Getting name by getters
		System.out.println("Customer Name: "+ objCD.getName());
		System.out.println("Customer City: "+ objCD.getCity());
		System.out.println("Customer Mail: "+ objCC.getMailid());
		System.out.println("Customer Phone: "+ objCC.getPhone());
	
	}
}
