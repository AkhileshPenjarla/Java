package assignments;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
public class Hashmap_assess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> studentscores=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Choose an option");
			System.out.println("1. Add student");
			System.out.println("2. Get Student Score");
			System.out.println("3. Exit");
			
			int choice=sc.nextInt();
			
			switch(choice) {
			
			case 1:
				System.out.println("Enter the student's name");
				String name=sc.next();
				System.out.println("Enter the student's score: ");
				int score=sc.nextInt();
				studentscores.put(name, score);
				break;
				
			case 2:
				System.out.println("Enter the student name :");
				String studentname=sc.next();
				int studentscore=studentscores.get(studentname);
				System.out.println("Score for "+studentname +"is :"+studentscore);
				break;
				
			case 3:
				System.out.println("Exiting ");
				sc.close();
				break;
			}
		}

	}

}
