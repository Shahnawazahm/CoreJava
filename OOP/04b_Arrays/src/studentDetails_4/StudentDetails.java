package studentDetails_4;

public class StudentDetails {
	   public String name,branch,rollNo,result;
	   public int totMarks, sub1,sub2, sub3;
	   public float per;
	   
	   public String toString() {
		   return name+"\t"+branch+"\t"+rollNo+"\t"+totMarks+"\t"+per+"\t"+
	              result;
	   }
	   
	}
