import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;
import java.util.*;

public class StudentMain {
    public static void main(String[] args) {
        String name;
        int age;
        int id;
        List<Student> students = new ArrayList<>();
        Scanner iscan = new Scanner(System.in);
        System.out.println("enter the number of student: ");
        int noStudent = iscan.nextInt();
        for (int i = 0; i < noStudent; i++) {
            System.out.println("enter the name of the student: ");
            iscan.nextLine();
            name = iscan.next();
            System.out.println("enter the age of the student:");
            age = iscan.nextInt();
            System.out.println("enter the id of the student:");
            id = iscan.nextInt();
            students.add(new Student(name, age, id));
        }
        Collections.sort(students);
        System.out.println(students);
    }
}
