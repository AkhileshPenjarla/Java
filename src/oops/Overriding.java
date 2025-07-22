package oops;
public class Overriding {
class calculator{
	public void add(int a,int b) {
		System.out.println(a+b);
	}
}
class calculator1 extends calculator{
	public void add(int a,int b) {
		System.out.println(a+b);
	}
}

	public static void main(String args[]) {
		Overriding cs=new Overriding();
		calculator cs1= cs.new calculator1();
		cs1.add(4, 8);
	}
}
