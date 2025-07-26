package assignments;

import java.util.Random;
public class Assess3 {
	public static void main(String[] args) {
		Random rr=new Random();
		long min=1000000000L;
		long max=9999999999L;
		long result=rr.nextLong(max-min)+min;
		System.out.println(result);
		

	}

}
