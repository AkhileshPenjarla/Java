package day6;

public class Array_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		try {
			for(int i=0;i<6;i++) {
				System.out.println(arr[i]);
			}
		}
		catch(Exception e) {
			System.out.println("The exception is "+e);
		}
		finally {
			System.out.println("The block of code is executed");
		}

	}

}
