package sumDigitsString;

public class SumOfDigitsString {
	public static void main(String[] args) {
		System.out.print("Enter the string:");
		java.util.Scanner s = new java.util.Scanner(System.in);
		String st = s.nextLine();
		int len = st.length();
		int total = 0;
		boolean val = false;
		for(int i=0;i<len;i++) {
//			int check = st.charAt(i);
//			System.out.println(check+" ....  "+st.charAt(i));
			if( (st.charAt(i)>='0') && (st.charAt(i)<='9')) {
				String cS= String.valueOf(st.charAt(i)); 
/*
 here we are converting char to string. Just because we can't convert it to integer,
 if we do we will get the ASCII code of the character. 
*/ 
				int k = Integer.parseInt(cS);//parsing string value to int 
				total = total+k; //incrementing total to add value at this place
				val = true;
			}
		}
		if(val) {
			System.out.println("Summation of total digits in string is:"+total);
		}else {
			System.out.println("No digits found within this string!");
		}		
		s.close();
	}
}