package example;

public class DisplayingViaUnboxing {
	@SuppressWarnings("removal") //used this to suppress/remove code needs to update warnings
	public static void main(String args[]) {
//=========BOXING PROCESS=============//

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
		
		//===========UNBOXING PROCESS============
		
		int i1 = ob1.intValue();
		int i2 = Integer.parseInt(ob2.toString());
		float f1 = ob3.floatValue();
		double d = ob4.doubleValue();
		float f3 = Float.parseFloat(ob5.toString());
		char ch = ob6.charValue();
		boolean b1 = ob7.booleanValue();
		boolean b2 = Boolean.parseBoolean(ob8.toString());
		
		System.out.println("=====DISPLAYING VALUES VIA UNBOXING PROCESS====");
		System.out.println("i1:"+i1);
		System.out.println("i2:"+i2);
		System.out.println("f1:"+f1);
		System.out.println("d:"+d);
		System.out.println("f3:"+f3);
		System.out.println("ch:"+ch);
		System.out.println("b1:"+b1);
		System.out.println("b2:"+b2);

	}
}
