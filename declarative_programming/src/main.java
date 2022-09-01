import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class main {

    public static void main(String[] args) {
        // Student objects
        Student s1 = new Student("Liev", 24, Student.Gender.MALE);
        Student s2 = new Student("Anya", 24, Student.Gender.FEMALE);
        Student s3 = new Student("Grigory", 24, Student.Gender.MALE);
        Student s4 = new Student("Katerina", 24, Student.Gender.FEMALE);

        ArrayList<Student> students =  new ArrayList<>();

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);


        // Female list
        students.stream().filter(student -> student.gender.equals(Student.Gender.FEMALE)).collect(Collectors.toList()).forEach(System.out::println);

        // Male List
        students.stream().filter(student -> student.gender.equals(Student.Gender.MALE)).collect(Collectors.toList()).forEach(System.out::println);

        // Students to Persons
        students.stream().map(student -> new Person(student.name, student.age)).collect(Collectors.toList()).forEach(System.out::println);

    }
}
