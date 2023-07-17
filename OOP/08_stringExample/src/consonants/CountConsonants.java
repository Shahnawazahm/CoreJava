//count consonants, alphabets and vowels
package consonants;
public class CountConsonants {

	public static void main(String[] args) {
		System.out.println("Enter any string:");
		java.util.Scanner s = new java.util.Scanner(System.in);
		String st = s.nextLine();
		st = st.toLowerCase();
		int len = st.length();
		
		StringBuffer vowAll = new StringBuffer(); //storing all vowels
		StringBuffer numAll = new StringBuffer(); //storing all numbers
		StringBuffer conAll = new StringBuffer(); //storing all consonants
		
		for (int i=0; i<len;i++) { 
			char check =  st.charAt(i);
			//when vowel are found
//			System.out.print("Char: "+check);
			if(st.charAt(i)=='a' || st.charAt(i)=='e' || st.charAt(i)=='i'
					|| st.charAt(i)=='o' || st.charAt(i)=='u') {
				//totalVow++;
				vowAll.append(check+" ");
			}else //when no.'s are found 
				if( check>=48 && (check<=57)) { //numbers
				  numAll.append(check+ "");
			}else //when consonants  are found
				if(check>=97 && check<=122){ //lower case keys
				//totalCon++;
					conAll.append(check+" ");
			}
		}
	
		System.out.println("Numbers found: "+numAll);
		System.out.println("Consonents found: "+conAll);
		System.out.println("Vowels found: "+vowAll);
		s.close();
	}
}