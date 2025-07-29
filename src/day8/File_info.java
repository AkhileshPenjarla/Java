package day8;

import java.io.File;
public class File_info {

	public static void main(String[] args) {
		File obj=new File("myfile.txt");
		if(obj.exists()) {
			System.out.println(obj.getAbsolutePath());
			System.out.println(obj.canRead());
			System.out.println(obj.canWrite());
			System.out.println(obj.length());
		}

	}

}
