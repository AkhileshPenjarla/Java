package day8;

public class Throw_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		try {
			if(a<18) {	
			throw new ArithmeticException("U cannot divide by zero");
		}}catch(Exception e) {
			System.out.println(e);
		}

	}

}
