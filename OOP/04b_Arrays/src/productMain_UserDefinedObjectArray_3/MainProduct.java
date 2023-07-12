package productMain_UserDefinedObjectArray_3;
import java.util.*;
//importing productInfo package and all from util

//import bookInfo_2.BookDetails;
import productInfo_3.Products;

public class MainProduct {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of objects you want to create.");
        int limit = Integer.parseInt(s.nextLine()); //parsing as taking string value further
		
        Products pI[] = new Products [limit]; //pI is an array with Products data type
		System.out.println("========Enter the product details==========");
		
		for(int i=0;i<limit;i++) {
			/*
			 In the productInfo package we have a Products class which has a constructor
			 taking values, product code, product name, product price and product quantity.
			 Taking values (here we call objects) all at once of one product and storing to product array. 
			*/
			System.out.println("Enter product code for object "+(i+1)+": ");
			String pCode = s.nextLine();
			
//			System.out.println("Enter product name for object "+(i+1)+": ");
			String pName = s.nextLine();
			
			System.out.println("Enter product price for object "+(i+1)+": ");
			float pPrice = Float.parseFloat(s.nextLine());
			
			System.out.println("Enter product quantity for object "+(i+1)+": ");
			int pQuan = Integer.parseInt(s.nextLine());
			
			//product i details entered, now adding whole information to product array
			
			pI[i]= new Products (pCode, pName, pPrice, pQuan);
			
		}//object data entered.
		
		System.out.println("=========PRODUCT DATA=======");
		System.out.println("Via extended for");
		int j=0;
		for(Products p:pI) {
			System.out.println("Product details of object "+(j+1)+ " is: "+p);
			j++;
		}
//		System.out.println("via spliterator");
//		Spliterator<Products> sp = Arrays.spliterator(pI);
//	       sp.forEachRemaining((k)->
//	       {
//	    	   System.out.print(k.toString()+" ");
//	       });
		System.out.println("via forEach() but with stream()");
		Arrays.stream(pI).forEach(
				(k)->{
					System.out.print(k.toString()+" ");
				}
				);
	       s.close();
		
		s.close();

	}
}
 

