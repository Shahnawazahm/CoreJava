package referenceTightlyCoupled_6;

public class Customer_2 {
    public String custName,custId,custCity;
    public Contact_2 ct = new Contact_2(); //references concept
    public String toString() {
    	return custName+"\t"+custId+"\t"+custCity+"\t"+ct.mailId+
    			"\t"+ct.phNo;
    }
}

