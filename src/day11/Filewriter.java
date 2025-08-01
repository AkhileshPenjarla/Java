package day11;

import java.io.FileWriter;
public class Filewriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileWriter fl=new FileWriter("C:\\Program Files\\Apache Software Foundation\\Tomcat 9.0\\webapps\\Project\\file2.txt");
		fl.write("Hii Penjarla Akhilesh ");
		fl.close();
		System.out.println("Writtenr successfully");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Error executed");
		}

	}

}
