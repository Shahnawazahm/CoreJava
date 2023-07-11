package example;

public class AutoBoxingUnboxing {

	public static void main(String[] args) {
		//AUTO BOXING PROCESS
		Integer obA = 1; //Integer wrapper class literal process
		Float obB = 22.0F; //Float wrapper class literal process
		Character obC = 'C'; //Character wrapper class literal process
		Boolean obD = true; //Boolean wrapper class literal process
		 
		//AutoUnBoxing process
		int i = obA; //primitive data type variable i holding wrapper class object
		float f = obB;
		char chA = obC;
		boolean b = obD;
		
		System.out.println("=====DISPLAYING VALUES VIA AUTOUNBOXING====");
		System.out.println("i:"+i);
		System.out.println("f:"+f);
		System.out.println("ch:"+chA);
		System.out.println("b:"+b);

	}

}
