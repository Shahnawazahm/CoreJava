package customerDetails;

public class CustomerDet {
	public String id; String name; String city;
	
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name= name;
	}
	public void setCity(String city){
		this.city = city;
	}

	public String getId(){
		return id;
	}
	public String getName() {
		return name;
	}
	public String getCity() {
		return city;
	}
}
