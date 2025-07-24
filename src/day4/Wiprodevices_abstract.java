package day4;

abstract class Wiprosystem{
	abstract void deviceType();
	abstract void compilespeed();
}
class Desktop extends Wiprosystem{
	void deviceType() {
		System.out.println("Wipro provides device Desktop");
	}
	void compilespeed() {
		System.out.println("Code is compiled Faster in Desktop");
	}
}
class Laptop extends Wiprosystem{
	void deviceType() {
		System.out.println("Wipro provides device Laptop");
	}
	void compilespeed() {
		System.out.println("Code is compiled Slow in Laptop");
	}
}
public class Wiprodevices_abstract {

	public static void main(String[] args) {
		Wiprosystem ws=new Desktop();
		ws.deviceType();
		ws.compilespeed();
		
		Wiprosystem ws1=new Laptop();
		ws1.deviceType();
		ws1.compilespeed();

	}

}
