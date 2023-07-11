//Bank.java
 import java.util.Scanner;
class Bank {
	public static void main(String[] args) {
		Scanner scn = new  Scanner(System.in);
		//here System.in is an objecrt representing Console(KB) from reading values
		
		//reading values from keyboard
		System.out.print("Enter Bank Name:");
		BankAccount.bankName = scn.nextLine(); 
		         
	    System.out.print("Enter Branch Name:");
		BankAccount.branchName =scn.next(); scn.nextLine(); 
		         
		System.out.print("Enter IFSC Code:");
		BankAccount.ifsc = scn.next();

        //ceating instance for different customer objects
        System.out.println("How many Accounts do you want to open:");
		int noOfAccounts = scn.nextInt();
        BankAccount[] acc = new BankAccount[noOfAccounts];
		
		for(int index =0; index<noOfAccounts; index++){
            System.out.println("\n Enter Customer "+ (index+1) +" details");
		acc[index] = new BankAccount();//SW

		//Reading SW values from keyboard, initializing acc1 instance fields initialization with HK object values
		System.out.print("Enter Account Number:");
		acc[index].accHNum           = scn.nextLong();
		System.out.print("Enter Account Holder Name:"); scn.nextLine();
		acc[index].accHName          = scn.nextLine();
		System.out.print("Enter Balance:");
		acc[index].balance           = scn.nextDouble(); scn.nextLine();
		System.out.println("Enter Customer "+(index+1)+" Address details:");
        acc[index].address            = new Address();

		System.out.print("Enter House Number:");
	    acc[index].address.hoNum     = scn.nextLine();

		System.out.print("Enter Street Number:");
	    acc[index].address.stNum     = scn.nextInt(); scn.nextLine();

		System.out.print("Enter City Name:");
		acc[index].address.city      = scn.nextLine();
        }//for close
		
      System.out.println("print All account details");
	  for(int index=0 ; index<noOfAccounts; index++){
	  System.out.println("acc"+(index+1) +"deatils");
	  acc[index].display();
	  System.out.println();
	  }


 //performing Business opertion on acc1        
/*acc1.deposit(5000);
double amt = acc1.withdraw(20000);
acc1.currentBalance();
acc1.transferMoney(acc2, 5000);
 acc1.display();
 acc2.display();
 acc3.display();
*/
	}
}