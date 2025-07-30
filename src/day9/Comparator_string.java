package day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
	int age;
	String name;
	
	Student(int age,String name){
		this.age=age;
		this.name=name;
	}
	public String toString() {
		return "Student[age=" +age+" ,name= "+name+"]";
	}
}
public class Comparator_string {

	public static void main(String[] args) {
		
		Comparator<Student> obj=new Comparator<>() {

			public int compare(Student i, Student j) {
				if(i.age>j.age)
					return 1;
				else
					return -1;
			}
			
		};
		List<Student> stud=new ArrayList<>();
		stud.add(new Student(23, "Akhilesh"));
		stud.add(new Student(21,"Ramesh"));
		stud.add(new Student(19,"Lokesh"));
		
		Collections.sort(stud,obj);
		for(Student i:stud) {
			System.out.println(i);
		}
		
		
	}

}
