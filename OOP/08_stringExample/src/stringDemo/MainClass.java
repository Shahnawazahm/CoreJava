//Simple string explanation
package stringDemo;
public class MainClass {
	public static void main(String[] args) {
		String s1 = "seyed"; //string literal
		/*
		  We know String is a class and a class variable is an object reference.
		  So, when we create a string literal, we are actually creating an object. 
		 */
		System.out.println("String value is: "+s1);
		/*
		 As we know s1 contains an object reference, but if we run the code, we will get the output.
		 The reason is only because, internally string convert this object reference to string value.  
		 */
		System.out.println("Length is: "+s1.length());
		System.out.println("Char at 1 : "+s1.charAt(1));
		
	}
}
