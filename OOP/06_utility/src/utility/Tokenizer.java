package utility;
import java.util.*;
public class Tokenizer {
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.print("Enter any string: ");
			String str = s.nextLine();
			System.out.println("Enter delimeter (by which character to break/tokenize string)");
			String del = s.nextLine();
			
			StringTokenizer sOb= new StringTokenizer(str,del);
			System.out.println("Number of tokens generated :" +sOb.countTokens());
			System.out.println("======TOKENS========");
			while(sOb.hasMoreTokens()) { //hasMoreTokens() generate boolean value
				String tk = sOb.nextToken();
				System.out.println(tk);
			}
			s.close();
		}

	}
