package oops;

public class Bankaccount {
	private String Accountholdername;
	private double Balance;
	
	Bankaccount(String Accountholdername,double Balance){
		this.Accountholdername=Accountholdername;
		this.Balance=Balance;
	}
	public void deposit(double amount) {
		Balance+=amount;
		System.out.println("The Balance is: "+Balance);
			
	}
	public void withdraw(double amount) {
		if(amount>Balance) {
			System.out.println("Insufficient Balance");
		}else {
			Balance-=amount;
			System.out.println("Withrawn Remaining amount is :"+Balance);
		}
	}
	public void displayDetails() {
		System.out.println("Account holdername "+Accountholdername);
		System.out.println("The total amount is :"+Balance);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bankaccount ba=new Bankaccount("Akhi",1000);
		ba.deposit(2000);
		ba.withdraw(500);
		ba.displayDetails();

	}

}
