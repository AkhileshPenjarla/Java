package day4;

class Realeestate{
	void home(int rent,int expensives) {
		int total=rent+expensives;
		System.out.println(total);
	}
	
	void home(double rent,int expensives) {
		double total=rent+expensives;
		System.out.println(total);
	}
}
public class Property_overloading {

	public static void main(String[] args) {
		Realeestate rs=new Realeestate();
		rs.home(23000, 50000);
		rs.home(2000.00, 5000);
		

	}

}
