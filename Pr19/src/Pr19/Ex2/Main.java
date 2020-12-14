package Pr19.Ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main extends Students{
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(5.0, "aaa"));
        students.add(new Student(4.6, "bbb"));
        students.add(new Student(3.5, "ccc"));
        students.add(new Student(3.8, "ddd"));


        Student[] st = students.toArray(new Student[0]);
        for (Student s: st) {
            System.out.println(s);
        }

        Scanner scanner = new Scanner(System.in);
        String fio = scanner.nextLine();
        try {
            if (Search(students, fio)) {
                System.out.println("Found");
            } else {
                throw (new Exception());
            }
        } catch (Exception e) {
            System.out.println("Not found");
        }
    }
}