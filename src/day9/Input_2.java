package day9;

import java.io.BufferedReader;
import java.io.IOException;
//import java.io.Exception;
import java.io.InputStreamReader;

public class Input_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Enter a number ");
		InputStreamReader in1=new InputStreamReader(null);
		BufferedReader br=new BufferedReader(in1);
		int a=Integer.parseInt(br.readLine());
		System.out.println(a);
		br.close();
		in1.close();
		
		
		
		

	}

}
