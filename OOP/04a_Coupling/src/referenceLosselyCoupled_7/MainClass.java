package referenceLosselyCoupled_7;
import java.util.*;
public class MainClass {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        StringBuffer sb = new StringBuffer(); //creating object of StringBuffer
        WriterClass wr = new WriterClass(sb); //supplying sb object to WriterClass
        ReaderClass rd = new ReaderClass(sb); //supplying sb object to ReaderClass
        wr.write(s);//Scanner Object_ref as parameter 
        rd.read();
        s.close();
	}
}