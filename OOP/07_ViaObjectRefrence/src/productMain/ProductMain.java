package productMain;
import java.util.Scanner;
import productInfo.Product;
public class ProductMain {

	public static void main(String[] args) {
	       Scanner s= new Scanner(System.in);
		   Product ob = new Product();
	       System.out.println("Enter the ProdCode:");
		   ob.code = s.nextLine(); //assigning via object reference
		   System.out.println("Enter the ProdName:");
		   ob.name = s.nextLine(); //assigning value via object reference
		   ob.getProduct();
		   s.close();
	}

}
