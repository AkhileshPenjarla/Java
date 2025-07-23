package oops;

abstract class Abstractclass1 {
	double amount;
	Abstractclass1(double amount){
		this.amount=amount;
	}
	
	abstract void makepayments();
	
	 void showpayment() {
		System.out.println("payment Successful "+amount);
	}
}

class creditcardpayment extends Abstractclass1{
	creditcardpayment(double amount) {
		super(amount);
		
	}
	void makepayments() {
		System.out.println("credit card payment is done ");
	}
}
public class Abstractclass{
public static void main(String args[]) {
	creditcardpayment cr=new creditcardpayment(1500.00);
	cr.showpayment();
	cr.makepayments();
		
	
}
}
