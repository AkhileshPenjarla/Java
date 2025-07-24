package day4;
interface Calculator{
	double operation(double a, double b);
}

interface Multiplication{
	double multiply(double a,double b);
}
public class Lambdacalci {

	public static void main(String[] args) {
		Calculator addition = (a,b) -> a+b;
		Calculator subtraction = (a,b) -> a-b;
		System.out.println("Addition is:" + addition.operation(5, 7));
		System.out.println("Subtraction is:" + subtraction.operation(7, 5));
		Multiplication multi = (a,b) -> a*b;
		System.out.println("Multiplication is:" + multi.multiply(7, 5));
	}

}
