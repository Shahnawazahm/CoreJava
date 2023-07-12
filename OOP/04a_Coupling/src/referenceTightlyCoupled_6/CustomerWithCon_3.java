package referenceTightlyCoupled_6;

public class CustomerWithCon_3{
	public String custName,custId,custCity;
    public ContactWithCon_3 ct = new ContactWithCon_3();

    public CustomerWithCon_3(String custName, String custId, 
    		String custCity, String mailId, long phNo){
    	this.custName=custName;
    	this.custId=custId;
    	this.custCity=custCity;
    	this.ct.mailId=mailId;
    	this.ct.phNo=phNo;
	}

    public String toString() {
    	return custName+"\t"+custId+"\t"+custCity+"\t"+ct.mailId+
    			"\t"+ct.phNo;
    }
}

