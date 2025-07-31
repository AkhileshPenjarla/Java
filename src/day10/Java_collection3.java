package day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Java_collection3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a=new ArrayList<>(List.of(4,5,3,3));
		a.add(9);
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);
		

	}

}
