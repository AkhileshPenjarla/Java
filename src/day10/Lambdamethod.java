package day10;

interface Strfun{
	String run(String str);
}

public class Lambdamethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Strfun exclaim=(s) -> s+"!!";
		Strfun query=(s) -> s+"??";
		askquery("HEllo",exclaim);
		askquery("hello", query);

	}
	public static void askquery(String str,Strfun format) {
		String result=format.run(str);
		System.out.println(result);
	}

}
