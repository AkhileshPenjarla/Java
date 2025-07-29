package day8;
import java.io.File;
public class Filehandling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		File obj=new File("myfile.txt");
		if(obj.createNewFile()) {
			System.out.println("File is created "+obj.getName());
			
		}else {
			System.out.println("File already exists");
			System.out.println(obj.getPath());
			System.out.println(obj.getAbsolutePath());
		}
		
		}catch(Exception e) {
			e.getStackTrace();
			System.out.println("An error occourred");
		}
	}

}
