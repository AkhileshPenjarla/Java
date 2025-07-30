package day9;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student5 implements Serializable {
   
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

public class Serializationdemo {

    public static void main(String[] args) throws IOException {
        Student5 s1 = new Student5();
        s1.setAge(23);
        s1.setName("Akhilesh");

        FileOutputStream out = new FileOutputStream("myfile.txt");
        ObjectOutputStream output = new ObjectOutputStream(out);
        output.writeObject(s1);

        output.close();
        out.close();     
        System.out.println("Object serialized successfully.");
    }
}
