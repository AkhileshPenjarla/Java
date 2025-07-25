package day4;
import java.util.Scanner;
import java.util.Arrays;
public class Sortingnames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String[] names=new String[3];
		
		System.out.println("Enter your names");
		
		for(int i=0;i<names.length;i++) {
			names[i]=sc.next();
		}
		Arrays.sort(names);
		System.out.println("The Sorted names is :");
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
	}

}
