package Pr13;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        int i = 0;
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(5.0));
        students.add(new Student(3.9));
        students.add(new Student(4.7));
        students.add(new Student(3.2));
        students.add(new Student(4.4));
        students.add(new Student(3.8));
        students.add(new Student(4.0));

        Collections.sort(students, new SortingStudentsByGPA());
        for (Student s : students) {
            if (i == 0) System.out.println("первый список");
            System.out.println(s.toString()+" ");
            i++;
        }
        System.out.println("\n");

        ArrayList<Student> students1 = new ArrayList<>();
        students1.add(new Student(3.3));
        students1.add(new Student(3.6));
        students1.add(new Student(3.7));
        students1.add(new Student(4.5));
        students1.add(new Student(4.2));
        students1.add(new Student(4.8));
        students1.add(new Student(3.2));

        i=0;
        Collections.sort(students1, new SortingStudentsByGPA());
        for (Student s1 : students1) {
            if (i == 0) System.out.println("второй список");
            System.out.println(s1.toString()+" ");
            i++;
        }
        System.out.println("\n");

        i=0;
        students.addAll(students1);
        Collections.sort(students, new SortingStudentsByGPA());
        for (Student s : students) {
            if (i == 0) System.out.println("объединённый список");
            System.out.println(s.toString()+" ");
            i++;
        }
    }
}