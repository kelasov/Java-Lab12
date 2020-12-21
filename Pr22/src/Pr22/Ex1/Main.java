package Pr22.Ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student(scanner.nextLine());
        System.out.println("1 - короткий;\n2 - средний;\n3 - полный.");
        System.out.println(student.toString(scanner.nextLine()));
    }
}
