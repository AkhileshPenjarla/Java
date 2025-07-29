package day8;

import java.io.FileWriter;
public class Filehandling2_write {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter obj=new FileWriter("myfile.txt");
			obj.write("Akhilesh penjarla good morning");
			obj.close();
			System.out.println("Writtern successfully");
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
