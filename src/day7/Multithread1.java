package day7;

class mul1 extends Thread{
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("Akhilesh");
			try {
				Thread.sleep(100);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
class mul2 extends Thread{
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("Penjarla");
		}
	}
}
public class Multithread1 {

	public static void main(String[] args) {
		mul1 obj=new mul1();
		obj.start();
		System.out.println(obj.getPriority());
		mul2 obj1=new mul2();
		obj1.start();
		

	}

}
