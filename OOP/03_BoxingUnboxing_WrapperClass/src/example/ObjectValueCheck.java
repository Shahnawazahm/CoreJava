package example;

public class ObjectValueCheck {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Integer ob1 = 12;
        Integer ob2 = 12;        
        Integer ob3 = new Integer(13);
        Integer ob4 = new Integer(13);
        System.out.println(ob1==ob2); //true , same address..integer pool
        System.out.println(ob3==ob4); //false, another object created via new keyword

	}

}
