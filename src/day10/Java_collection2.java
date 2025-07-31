package day10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Java_collection2 {

	public static void main(String[] args) {
		ArrayList<String> courses=new ArrayList<>();
		courses.add("Maths");
		courses.add("Physics");
		courses.add("Java");
		for(String i:courses) {
			System.out.println(i);
		}
		
		Set<Integer> c=new HashSet<>();
		c.add(4838);
		c.add(123);
		c.add(789);
		for(Integer i:c) {
			System.out.println(i);
		}
		
		Map<String,Integer> hm=new HashMap<>();
		hm.put("Maths", 4838);
		hm.put("Physics", 123);
		hm.put("Java", 789);
		for(String key:hm.keySet()) {
			System.out.println(key+"= "+hm.get(key));
		}

	}

}
