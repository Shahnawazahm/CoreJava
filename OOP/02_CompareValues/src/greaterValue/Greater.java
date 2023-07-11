package greaterValue;

public class Greater {
	public int v1; int v2;
	
	public void setV1(int v1) {
		this.v1 = v1;
	}
	public void setV2(int v2) {
		this.v2 = v2;
	}
	
	public int getV1() {
		return v1;
	}
	public int getV2() {
		return v2;
	}
	public int compareGrt(int n1, int n2) {
		
		if(n1>n2) {
			return n1;
		}else {
			return n2;
		}
	}
}
