package day11;

public class Palindrome_int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1221;
		int b=a;
		int rev=0;
		while(a!=0) {
			int c=a%10;
			rev=rev*10+c;
			a=a/10;
		}
		if(b==rev) {
			System.out.println("Palindrome");
		}else {
			System.out.println("not Palindrome");
		}

	}

}
