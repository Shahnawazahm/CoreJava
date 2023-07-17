package palindrome;
import java.util.Scanner;
public class PlandromeString {
	public static void main(String[] args) {
		boolean check = false;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter any string to check whether it is palindrome or not:");
		String st = s.nextLine();
		int len = st.length();
		int j=0;
		for(int i=len-1;i>=0;i--) {
			if(st.charAt(j)==st.charAt(i)) {
				check = true;
				j++;
			}else {
				check=false;
				break;
			}
		}
		if(check) {
			System.out.println("String is palindrome.");
		}else {
			System.out.println("String is not palindrome!");
		}
		s.close();
		
		
		
	}
}
