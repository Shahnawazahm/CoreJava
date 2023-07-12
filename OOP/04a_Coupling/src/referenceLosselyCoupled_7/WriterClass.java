package referenceLosselyCoupled_7;
import java.util.*;
public class WriterClass {
	 public StringBuffer sb=null;
	 public WriterClass(StringBuffer sb) {
		 this.sb=sb;
	 }
    public void write(Scanner s ) {
   	 System.out.println("Enter the number of Strings:");
   	 int n = Integer.parseInt(s.nextLine());
   	 for(int i=1;i<=n;i++)
   	 {
   		 System.out.println("Enter String:"+i);
   		 sb.append(s.nextLine()+" : ");
   		 System.out.println("String appended to buffer Successfully..");
   	 }//end of loop

    }
}
