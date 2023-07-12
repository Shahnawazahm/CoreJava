package cusPack_5;
import conPack_5.Contact;

public class Customer {

    public String custName,custId,custCity;
    public Customer(String custName, String custId, String custCity, String mailId,
    	double phNo) {
    	this.custName=custName;
    	this.custId=custId;
    	this.custCity=custCity;
    }
    public Contact ct = new Contact();
    public String toString() {
    	return custName+"\t"+custId+"\t"+custCity+"\t"+ct.mailId+
    			"\t"+ct.phNo;
    }
}

