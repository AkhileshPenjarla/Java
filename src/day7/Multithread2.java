package day7;

class mul3 implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Akhilesh");
			try {
				Thread.sleep(100);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
class mul4 implements Runnable{
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("Penjarla");
		}
	}
}
public class Multithread2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable obj=new mul3();
		Thread t1=new Thread(obj);
		t1.start();
		System.out.println(t1.getPriority());
		Runnable obj1=new mul4();
		Thread t2=new Thread(obj1);
		t2.start();
		System.out.println(t2.getPriority());
		

	}

}
