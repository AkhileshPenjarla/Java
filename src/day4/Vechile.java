package day4;

abstract class Vechile1{
	abstract void speed();
	
	abstract void brand();
}

class Car extends Vechile1{
	void speed() {
		System.out.println("car speed is 40kmp ");
	}
	void brand() {
		System.out.println(" Brand name is Fortuner");
	}
}
public class Vechile {

	public static void main(String[] args) {
		Vechile1 vr=new Car();
		vr.speed();
		vr.brand();

	}

}
