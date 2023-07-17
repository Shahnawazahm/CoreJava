package reverseOfString;

import java.util.Scanner;
public class StringReverse {
	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.print("Enter any string value:");
			String st = s.nextLine();
			int len = st.length();
			System.out.print("Reverse of "+st+" is: ");
			for(int i=len-1;i>=0;i--) {
				char ch = st.charAt(i);
				System.out.print(ch);
			}
			s.close();
		}
}