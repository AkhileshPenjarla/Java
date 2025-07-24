package day4;

abstract class Realestate{
	abstract void home();	
	abstract void apartment();
}

class Varadhi extends Realestate{
	void home() {
		int food=10000;
		double rent=14000.00;
		int expensives = 20000;
		double total=(double)(food+rent+expensives);
		System.out.println("The total cost of varadhi home is: "+total);
	}
	void apartment() {
		int food=40000;
		double rent=50000;
		int expensives=60000;
		double total=(double)(food+rent+expensives);
		System.out.println("The total cost of varadhi apartment is "+total);
	}
}

class Akhilesh extends Realestate{
	void home() {
		int food=14000;
		double rent=24000.00;
		int expensives = 60000;
		double total=(double)(food+rent+expensives);
		System.out.println("The total cost of Akhilesh home is"+total);
	}
	void apartment() {
		int food=50000;
		double rent=60000;
		int expensives=70000;
		double total=(double)(food+rent+expensives);
		System.out.println("The total cost of Akhilesh Apartment is"+total);
	}
}
public class Propertycalc {

	public static void main(String[] args) {
		Realestate rs=new Varadhi();
		rs.home();
		rs.apartment();
		
		Realestate rs1=new Akhilesh();
		rs1.home();
		rs1.apartment();

	}

}
