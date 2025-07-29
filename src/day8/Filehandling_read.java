package day8;

import java.io.File;
import java.util.Scanner;
public class Filehandling_read {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File obj=new File("C:\\Program Files\\Apache Software Foundation\\Tomcat 9.0\\webapps\\Project\\Hello.txt");
			Scanner sc=new Scanner(obj);
			while(sc.hasNext()) {
				System.out.println(sc.next());
			}
		sc.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		

	}

}
