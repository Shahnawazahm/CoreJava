package example;

public class DisplayingFromObjects {

	@SuppressWarnings("removal") //used this to suppress/remove code needs to update warnings
	public static void main(String args[]) {
		
		//=========BOXING PROCESS=============//

		//Integer boxing
		Integer ob1 = new Integer(1); //con call with int parameter
		Integer ob2 = new Integer("1"); 
		//con call with int in string,  values should be always int as a string 
		
		//Float boxing
		Float ob3 = new Float(22.0F); // in float
		Float ob4 = new Float(222.33); //in double
		Float ob5 = new Float("22.4F"); //in String	
			
		//Character boxing
		Character ob6 = new Character('C');
		
		//Boolean boxing
		Boolean ob7 = new Boolean(true);
		Boolean ob8 = new Boolean("true"); //should be boolean value as a string
		
		//Printing values/
		System.out.println("=========DISPLAYING FROM OBJECTS ITSELF=========");
		System.out.println("ob1:"+ob1.toString());
		System.out.println("ob2:"+ob2.toString());
		System.out.println("ob3:"+ob3.toString());
		System.out.println("ob4:"+ob4.toString());
		System.out.println("ob5:"+ob5.toString());
		System.out.println("ob6:"+ob6.toString());
		System.out.println("ob7:"+ob7.toString());
		System.out.println("ob8:"+ob8.toString());
		
	}

}
