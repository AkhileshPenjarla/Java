package day2;

public class Controlflows {
	public static void main(String[] args) {
		int age=18;
		if(age>=18) {
			System.out.println("You are eligible for vote= "+age);
			
		}
		// switch state;
		switch(age) {
		case 1:
			System.out.println("He can vote");
			break;
		default :
			System.out.println("he can drive");
			break;
		}
	}

}
