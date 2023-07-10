package p2;
import p1.*;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num1: ");
		int n1 = sc.nextInt();
		System.out.println("Enter Num2: ");
		int n2 = sc.nextInt();
		
		System.out.println("=====Enter your choice===== \n"
				+ "1: Division. \n2: Multiplication."
				+ "\n3: Addition. \n4: Subtraction. \n5: Modulo Division");
		int choice = sc.nextInt();
		switch(choice) {
			case 1: //Division case
				Division dv = new Division();
				dv.setN1(n1);
				dv.setN2(n2);
				System.out.println("Division is: "+dv.division(dv.getN1(),dv.getN2()));
				break;
				
			case 2: //Multiplication case
				Multiplication ml = new Multiplication();
				ml.setN1(n1);
				ml.setN2(n2);
				System.out.println("Multiplication is: "+ml.multiplication(ml.getN1(),ml.getN2()));
				break;
			
			case 3:	//Addition case
				Addition ad = new Addition();
				ad.setN1(n1);
				ad.setN2(n2);
				System.out.println("Addition is: "+ad.addition(ad.getN1(),ad.getN2()));
				break;
			
			case 4: //Subtraction case
				Subtraction sb = new Subtraction();
				sb.setN1(n1);
				sb.setN2(n2);
				System.out.println("Subtraction is: "+sb.subtraction(sb.getN1(),sb.getN2()));
				break;
			
			case 5:	//Modulo Division
				ModuloDivision md = new ModuloDivision();
				md.setN1(n1);
				md.setN2(n2);
				System.out.println("ModuloDivision is: "+md.moduloDivision(md.getN1(),md.getN2()));
				break;
			
			default:
				System.out.println("Valid values are 1-5");
		}
		sc.close();
	}
}
