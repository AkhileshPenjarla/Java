package day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Java_collections {
	
	class department{
		private String name;
		private double sales;
		private double expensives;
		
		department(String name,double sales,double expensives){
			this.name=name;
			this.sales=sales;
			this.expensives=expensives;
		}
		
		public double profit() {
			return (sales-expensives);
		}
		
		public String getname() {
			return name;
		}
	}

	public static void main(String[] args) {
		List<department> al=new ArrayList<>();
		al.add(new Java_collections().new department("Akhilesh",50000.33,4000.00));
		al.add(new Java_collections().new department("Marketing",10000,4000));
		al.add(new Java_collections().new department("Research",15000,5000.00));
		
		for(department i:al) {
			System.out.println(i.getname()+"Profit: "+i.profit());
			
		}
		
		al.sort((d1,d2)-> Double.compare(d1.profit(),d2.profit()));
		System.out.println("Sorting is done ");
		
		for(department d: al) {
			System.out.println(d.getname()+"profit "+d.profit());
		}
		
	}

}
