package day4;
interface Wiprosystem1{
	 void deviceType();
	 void compilespeed();
}
class Desktop1 implements Wiprosystem1{
	public void deviceType() {
		System.out.println("Wipro provides device Desktop");
	}
	public void compilespeed() {
		System.out.println("Code is compiled Faster in Desktop");
	}
}
class Laptop1 implements Wiprosystem1{
	public void deviceType() {
		System.out.println("Wipro provides device Laptop");
	}
	public void compilespeed() {
		System.out.println("Code is compiled Slow in Laptop");
	}
}
public class Wiprosystem_interface {

	public static void main(String[] args) {
		Wiprosystem1 ws=new Desktop1();
		ws.deviceType();
		ws.compilespeed();
		
		Wiprosystem1 ws1=new Laptop1();
		ws1.deviceType();
		ws1.compilespeed();

	}

}
