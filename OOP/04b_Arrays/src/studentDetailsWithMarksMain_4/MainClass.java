package studentDetailsWithMarksMain_4;
import java.util.*;

import checkBranch_4.CheckBranch;
import generateBranchByCode_4.GenerateBranchByCode;
import studentDetails_4.StudentDetails;
import studentResult_4.StudentResult;
public class MainClass {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number you want to add StudentDetails of:");
        int n = Integer.parseInt(s.nextLine());
        StudentDetails ob[] = new StudentDetails[n];
        
        for(int i=0;i<n;i++)
        {
        	System.out.println("****StudentDetails of Student-"+(i+1)+"*****");
        	ob[i] = new StudentDetails();
        	System.out.println("Enter the Name:");
        	ob[i].name = s.nextLine();
        	System.out.println("Enter the branch(options: CIVIL/EEE/MECH/ECE/CSE):");
        	ob[i].branch = s.nextLine().toUpperCase();
        	CheckBranch cb = new CheckBranch();
        	boolean k = cb.verify(ob[i].branch);
        	if(k) //when branch returned is a valid branch
        	{
        		System.out.println("Enter the rollNO :");
        		ob[i].rollNo = s.nextLine().toUpperCase();
        		if(ob[i].rollNo.length()==6) {
        			GenerateBranchByCode gc = new GenerateBranchByCode();
        			//205406
            		String gBr = gc.generate(ob[i].rollNo.substring(4,6)); 
            		if(gBr==null) {
            			System.out.println("RollNo holding invalid branch code..");
            			i--;
            		}else 
            		{
            			if(gBr.equals(ob[i].branch)) {
            				int j=1,totM=0;
            				boolean p=false;
//            				while(j<=2)
//            				{	
            					System.out.print("Enter subject 1 marks: ");
            					ob[i].sub1 = Integer.parseInt(s.nextLine());
            					
            					System.out.print("Enter subject 2 marks: ");
            					ob[i].sub2 = Integer.parseInt(s.nextLine());
            					
            					System.out.print("Enter subject 3 marks: ");
            					ob[i].sub3 = Integer.parseInt(s.nextLine());
            					if( (ob[i].sub1<0 || ob[i].sub1>100) 
            							|| (ob[i].sub2<0 || ob[i].sub2>100)
            							|| (ob[i].sub3<0 || ob[i].sub3>100) )
            					{
            						System.out.println("Invalid marks.."+j);
//            						continue;
            			//skip rest of the loop and continue executing this iteration again 
            					}
            					if( (ob[i].sub1>=0 && ob[i].sub1<=34)||
            							(ob[i].sub2>=0 && ob[i].sub2<=34)||
            							(ob[i].sub3>=0 && ob[i].sub3<=34))
            					{
            						p=true;
            					}
            					
//            					j++;
            					int sub1 = ob[i].sub1;
            					int sub2=ob[i].sub2;
            					int sub3= ob[i].sub3;
            				ob[i].totMarks=totM+sub1+sub2+sub3;
//            				}//end of loop
            				ob[i].per=(float) ob[i].totMarks/3;
            				
            				StudentResult sr = new StudentResult();
            				ob[i].result = sr.result(ob[i].per, p);
            			}else {
            				System.out.println("RollNo not matched with branch..");
            				i--;
            			}
            		}
        		}//end of if
        		else {
        			System.out.println("Invalid rollNo..");
        			i--;
        		}
        		
        	}//end of if
        	else
        	{
        		System.out.println("Invalid branch...");
        		i--;
        	}
        }//end of loop
        System.out.println("=====StudentDetails details=====");
		for(StudentDetails c : ob)
		{
			System.out.println(c.toString());
		}//end of loop
		
		Boolean val = false;
		String rollNoR="",rollNo; 
		int value=-1;
		
		for(int i=0; i<1;i++) {
			System.out.println("Enter the rollNo to display SubMarks:");
			rollNoR = s.nextLine().toUpperCase();
			if(rollNoR.length()==6) {
				GenerateBranchByCode gcR = new GenerateBranchByCode();
				String gBrR = gcR.generate(rollNoR.substring(4,6)); 
					if(gBrR==null) {
						System.out.println("RollNo holding invalid branch code..");
						i--;
						continue;
					}else {
						val = true;
					}			
			}else {
				System.out.println("Invalid rollno.");
				i--;
				continue;
			}
		}
			if(val) {
				for(int k=0;k<n;k++){ //get index of matching
					rollNo=ob[k].rollNo.toString();
					if(rollNo.equals(rollNoR)) {
						value = k;//store index here
					}
				}
			}
			if(value!=-1) {	
				System.out.println("Subject marks are: ");
				System.out.println("Sub 1: "+ob[value].sub1);
				System.out.println("Sub 2:"+ob[value].sub2);
				System.out.println("Sub 3: "+ob[value].sub3);
				//
			}else{
				System.out.println("No matches found with this rollno.  ");
			}
		s.close();
		}
	}

