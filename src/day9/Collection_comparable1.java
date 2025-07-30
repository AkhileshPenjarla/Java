package day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collection_comparable1 {

	public static void main(String[] args) {
		
		Comparator<Integer> obj1=new Comparator<>() {		
			public int compare(Integer o1, Integer o2) {
				if(o1>o2) {
					return 1;
				}else {
					return -1;
				}
			}
		};
		List<Integer> obj=new ArrayList<>();
		obj.add(44);
		obj.add(7);
		obj.add(35);
		obj.add(8767);
		Collections.sort(obj,obj1);
		System.out.println(obj);

	}

}