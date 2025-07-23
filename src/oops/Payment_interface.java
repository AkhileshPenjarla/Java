package oops;

interface payment{
	void makepayment();
}

abstract class paymentsystem implements payment{
	double amount;
	paymentsystem(double amount){
		this.amount=amount;
	}
	void successfulpayment() {
		System.out.println("amount successful "+amount);
	}
}

class creditcard extends paymentsystem{

	creditcard(double amount) {
		super(amount);
	}

	public void makepayment() {
		System.out.println("creditcard payment is done ");
		successfulpayment();
	}
}

 class netbanking extends paymentsystem{

	netbanking(double amount) {
		super(amount);
	}

	
	public void makepayment() {
		System.out.println("Net Banking is done");	
		successfulpayment();
	}
}


public class Payment_interface {
	public static void main(String[] args) {
		paymentsystem cc=new creditcard(4000);
		cc.makepayment();
		
		paymentsystem nb=new netbanking(65000);
		nb.makepayment();

	}

}
