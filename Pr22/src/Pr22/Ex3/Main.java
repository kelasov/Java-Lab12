package Pr22.Ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Job job = new Job();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фамилию:");
        String name = scanner.nextLine();
        System.out.println("Ваша фамилия: " + name);
        job.getStart();
        System.out.println("Введите номер задания:");
        String numb = scanner.nextLine();
        job.getFinish();
    }
}
