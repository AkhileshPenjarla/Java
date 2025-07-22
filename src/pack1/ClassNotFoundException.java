package pack1;

public class ClassNotFoundException {
	public int add(int a,int b) {
		return a+b;
	}

	public static void main(String[] args) {
		ClassNotFoundException cs=new ClassNotFoundException();
		System.out.println(cs.add(4, 5));
	}

}
