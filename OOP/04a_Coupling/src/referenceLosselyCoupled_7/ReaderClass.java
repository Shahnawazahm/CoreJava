package referenceLosselyCoupled_7;

public class ReaderClass {
	 public StringBuffer sb=null;
	 public ReaderClass(StringBuffer sb) {
		 this.sb=sb;
	 }
     public void read() {
    	 System.out.println("===Display from StringBuffer====");
    	 System.out.println(sb.toString());
     }
}

