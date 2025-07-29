package day8;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(4);
		al.add(7);
		al.add(8);
		Iterator<Integer> all=al.iterator();
		while(all.hasNext()) {
			System.out.println(all.next());
		}

	}

}
