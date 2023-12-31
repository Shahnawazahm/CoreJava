package productInfo_3;
public class Products {
	public String code, name;
	public float price;
	public int qty;
	
	public Products(String code, String name, float price, int qty) {
		this.code = code;
		this.name = name;
		this.price = price;
		this.qty = qty;
		}
	public String toString() {
		/*this function we need to create with the same name, because internally it gets 
		 called without invoking. toString() is function which calls objects to get strings.
		*/
		return (code+"\t"+name+"\t"+price+"\t"+qty);
	}
}
