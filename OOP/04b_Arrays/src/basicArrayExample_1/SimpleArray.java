package basicArrayExample_1;
import java.util.*;
public class SimpleArray {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the maximum size of objects you want to hold within"
				+ " the array:");
		int size = s.nextInt();
		Integer a[] = new Integer[size]; 
//		creating Integer array object (not element in OOP, remember)
		
		for(int i=0;i<size;i++) {
			System.out.print("Enter object data at "+(i+1)+": ");
			a[i] = new Integer(s.nextInt()); 
			//creating new objects always when iterating to next value
		} //end of loop. Entering object data finished
		s.close();
		//old for loop
		System.out.println("Printing via simple for loop");
		for(int i=0;i<size;i++) {
			System.out.println("Object entered at "+(i+1)+": "+a[i]);
		}//reading objects
		
		//extended loop
		System.out.println("Printing via extended for loop");
		int j =0;
		for(Integer k:a) {	 //when length is not known	
			System.out.println("Object entered at "+(j+1)+": "+k);
			j++;
		}
		
		//spl iterator
		System.out.println("Printing via spl_iterator for loop");
		Spliterator<Integer> sp = Arrays.spliterator(a);
		sp.forEachRemaining(  (k)->
				{
					System.out.println(k.toString());
				}
				);
		s.close();
	}

}
