//BankAccount
class BankAccount {

static String bankName;
static String branchName;
static String ifsc;
 
 Long accHNum;
 String accHName;
 double balance;

 Address address;

 void deposit(double amt) throws IllegalArgumentException {
	 if(amt<=0)
		 throw new IllegalArgumentException("don't pass negative amount");
        
		 this.balance=this.balance+amt;
		 this.alert(amt,"credited to");
		 //System.out.println("Cash"+amt+" is credited from your account"+accHNum);
		 //System.out.println("Current balance in your account is"+balance);

 }

 double withdraw(double amt) throws IllegalArgumentException,IllegalStateException {
	  if(amt<=0)
		   throw new IllegalArgumentException("don't pass negative amount");

	   if(amt>this.balance)
		   throw new IllegalStateException("insufficent funds");
	   this.balance = this.balance-amt;
	   // System.out.println("Cash"+amt+" is debited in your account"+accHNum);
		 //System.out.println("Current balance in your account is"+balance);
		 this.alert(amt,"debited from");
	   return amt;
 }

private void alert(double amt, String action) {
	 System.out.println("Cash"+amt+" is"+action+"  your account"+this.accHNum);
		 System.out.println("Current balance in your account is"+this.balance);
	
}

public void currentBalance() {
	
	System.out.println(this.balance);
}


public void transferMoney(BankAccount destAcc, double amt)
	         throws IllegalArgumentException,IllegalStateException{
	

this.withdraw(amt);//balnce = balance-amt;
destAcc.deposit(amt);//destAcc.balance = destAcc.balance+amt;
System.out.println("Cash"+amt+" is transfered to "+destAcc.accHNum);
  }
static void bankName(){
	System.out.println("Bank Name:"+bankName);
}

static void branchName(){
	System.out.println("Branch Name:"+branchName);
}

static void ifsc(){
	System.out.println("ifsc:"+ifsc);
}
void display() {
System.out.println("Mr."+accHName+" Bank details are:");
System.out.println("Bank Name\t\t:"            +bankName);
System.out.println("Branch Name\t\t:"          +branchName);
System.out.println("ifsc\t\t\t:"               +ifsc);
System.out.println("Account Holder Number\t:"  +accHNum);
System.out.println("Account Holder Name\t:"    +accHName);
System.out.println("Balance\t\t:"              +balance);
System.out.println("House Number\t:"           +address.hoNum);
System.out.println("Street Number\t:"          +address.stNum);
System.out.println("City Name\t\t:"            +address.city);
}
}
