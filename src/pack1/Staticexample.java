package pack1;
 class static1 {
	public static int add(int a,int b) {
		return a+b;
	}
}

public class Staticexample {
	public static void main(String args[]) {
		int sum=static1.add(23, 234);
		System.out.println(sum);
		
	}

}
