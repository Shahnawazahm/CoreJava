package main;

import java.util.Scanner;
import greaterValue.Greater;
import smallerValue.Smaller;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Num1: ");
		int n1 = sc.nextInt();
		
		System.out.print("Enter Num2: ");
		int n2 = sc.nextInt();
		System.out.println("1: Greater value. \n2: Smaller value.\n--Enter your choice: ");
		int choice = sc.nextInt();
		if (n1!=n2) {
			switch(choice) {
				case 1:
					Greater gr = new Greater();
					gr.setV1(n1); gr.setV2(n2);
					System.out.println("Greater value is: "+(gr.compareGrt(gr.getV1(),gr.getV2())));
					break;
					
				case 2:
					Smaller sm = new Smaller();
					sm.setV1(n1); sm.setV2(n2);
					System.out.println("Smaller value is: "+(sm.compareSma(sm.getV1(),sm.getV2())));
					break;
					
				default:
					System.out.println("Enter either 1 or 2 only.");
			}
		}else {
			System.out.println("Values are equal!");
		}
		
		sc.close();
	}

}
