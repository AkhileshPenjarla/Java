package day6;

public class Factorial_trycatch {

	public static void main(String[] args) {
		int a=3;
		int fact=1;
		try {
			for(int i=1;i<=a;i++) {
				fact=fact*i;
			}
			System.out.println(fact);
		}
		catch(Exception e) {
			System.out.println("The exception is "+e);
			e.getStackTrace();
		}

	}

}
