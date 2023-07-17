package asciiValues;
public class ASCII_Values {
	public static void main(String[] args) {
		System.out.println("0-9 from ASCII numbers are: ");
		for(int i = 48; i<=57;i++) {
			System.out.print((char)i+" "); //typeCasting
		}
		
		System.out.println("\nA-Z from ASCII numbers are: ");
		for(int i = 65; i<=90;i++) {
			System.out.print((char)i+" "); //typeCasting
		}
		
		System.out.println("\na-z from ASCII numbers are: ");
		for(int i = 97; i<=122;i++) {
			System.out.print((char)i+" "); //typeCasting
		}
	}
}