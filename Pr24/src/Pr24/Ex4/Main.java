package Pr24.Ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Phone phoneNumber = new Phone(scanner.nextLine());
        phoneNumber.Return();
        System.out.println(phoneNumber.toString());
    }
}