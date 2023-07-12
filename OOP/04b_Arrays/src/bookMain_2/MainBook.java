package bookMain_2;
import java.util.*;

import bookInfo_2.BookDetails;
public class MainBook {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number of book details you want to enter: ");
		int limit = Integer.parseInt(s.nextLine());
		BookDetails bD[] = new BookDetails [limit];
		System.out.println("=======ENTER BOOK DETAILS========");
		for(int i=0;i<limit;i++) {
			System.out.println("Enter "+(i+1)+" book deails:");
			System.out.print("Book name:");
			String bN = s.nextLine();
			
			System.out.print("Book code:");
			String bC = s.nextLine();
			
			System.out.print("Book Author:");
			String bA = s.nextLine();
			
			System.out.print("Book price:");
			float fP = Float.parseFloat(s.nextLine());
			
			System.out.print("Book quantity:");
			int bQ = Integer.parseInt(s.nextLine());
			
			bD[i]= new BookDetails(bN,bC,bA,fP,bQ); //storing all objects to no. of books
		}//book details 
		
		System.out.println("\nEntererd book details (via extended for):");
		for(BookDetails bObj:bD) {
			System.out.print(bObj);
		}
		
		System.out.println("\nEntererd book details (via spliterator):");
		Spliterator<BookDetails> sp = Arrays.spliterator(bD);
	       sp.forEachRemaining((k)->
	       {
	    	   System.out.print(k.toString()+" ");
	       });
	       s.close();

	}
}
