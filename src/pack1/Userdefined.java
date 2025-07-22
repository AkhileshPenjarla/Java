package pack1;
import java.util.Scanner;
public class Userdefined {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Name");
		String name=sc.nextLine();
		System.out.println("Enter your age");
		int age=sc.nextInt();
		System.out.println("Enter your height");
		double height=sc.nextDouble();
		
		System.out.println("Hello "+name);
		System.out.println("Age"+age);
		System.out.println("Height"+height);
	}

}
