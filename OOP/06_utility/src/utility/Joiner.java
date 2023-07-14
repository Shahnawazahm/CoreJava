package utility;
import java.util.*;
public class Joiner {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    StringJoiner sj1 = new StringJoiner("/"); //joining strings by '/'
	    sj1.setEmptyValue("User Joining details not Avaialable....\n\n");
	    System.out.println(sj1.toString());
	    System.out.println("****Update Joining details*****");
	    System.out.println("Enter the date:");
	    sj1.add(s.nextLine());
	    System.out.println("Enter the Month:");
	    sj1.add(s.nextLine());
	    System.out.println("Enter the Year:");
	    sj1.add(s.nextLine());
	    System.out.println("User DOJ : "+sj1);
	    StringJoiner sj2 = new StringJoiner("-"); //joining strings by '-'
	    sj2.setEmptyValue("\nUser Address not Available...\n\n");
	    System.out.println(sj2.toString());
	    System.out.println("====Update User Address===");
	    System.out.println("Enter User City:");
	    sj2.add(s.nextLine());
	    System.out.println("Enter User State:");
	    sj2.add(s.nextLine());
	    System.out.println("Enter User PinCode:");
	    sj2.add(s.nextLine());
	    System.out.println("User Address : "+sj2);
	    System.out.println("*****After merging*****");
	    sj1.merge(sj2);
	    System.out.println("User details :\n DOJ and Address:  "+sj1);
	    System.out.println("length : "+sj1.length());
	    s.close();
	}

}
