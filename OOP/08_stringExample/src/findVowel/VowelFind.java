package findVowel;
import java.util.Scanner;

public class VowelFind {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter any string: ");
		String st = (s.nextLine());
		st = st.toLowerCase();
		int len = st.length();
		int total=0;
		for(int i=0;i<len;i++ ) {
			if(st.charAt(i)=='a' || st.charAt(i)=='e' || st.charAt(i)=='i'
					|| st.charAt(i)=='o' || st.charAt(i)=='u') {
				total++;
			}
		}
		System.out.println("Total vowels in \""+st +"\" is: "+total);
		s.close();
	}

}
