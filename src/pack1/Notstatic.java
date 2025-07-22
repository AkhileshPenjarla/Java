package pack1;

class counter{
	int count=0;
	public void increment() {
		count++;
	}
	public int getcount() {
		return count;
	}
}
public class Notstatic {
public static void main(String args[]) {
counter inc=new counter();
counter inc1=new counter();
inc1.increment();
inc.increment();
System.out.println(inc.getcount());
System.out.println(inc1.getcount());
}
}
