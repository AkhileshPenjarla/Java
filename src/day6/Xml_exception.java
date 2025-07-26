package day6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Xml_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1=new File("C:\\Program Files\\Apache Software Foundation\\Tomcat 9.0\\webapps\\Project\\Hello.xml");
		try {
			BufferedReader br1=new BufferedReader(new FileReader(f1));
			String line=br1.readLine();
			while(line!=null) {
				System.out.println("File content "+line);
				line=br1.readLine();
			}
			br1.close();
		}
		catch(Exception e) {
			System.out.println("The exception is "+e);
		}
		finally {
			System.out.println("Finally block");
		}

	}

}
