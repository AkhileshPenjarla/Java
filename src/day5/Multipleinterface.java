package day5;

interface Multipleinterface1 {
	 static void add(int a,int b) {
		 System.out.println(a+b);
	 }
	 default void add(double a,double b) {
		 System.out.println(a+b);
	 } 
}


interface Multipleinterface2{
	 void add(boolean a);
	 final int a=45;
}


class task1 implements Multipleinterface1,Multipleinterface2{
	public void add(double a,double b) {
		System.out.println(a+b);
	}
	public void add(boolean a) {
		System.out.println(a);
	}
}

public class Multipleinterface {
	public static void main(String args[]) {
		
		Multipleinterface1.add(45, 56);
		
		task1 ts=new task1();
		ts.add(false);
		ts.add(4.3, 5.1);
		System.out.println(ts.a);
	}
}
