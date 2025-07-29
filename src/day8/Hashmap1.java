package day8;

import java.util.HashMap;

public class Hashmap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> al=new HashMap<>();
		al.put("Akhilesh", 23);
		al.put("venkatesh", 33);
		al.put("Lokesh", 16);
		
		for(Integer i:al.values()) {
			System.out.println(i);
		}
		for(String k:al.keySet()) {
			System.out.println(k);
		}

	}

}
