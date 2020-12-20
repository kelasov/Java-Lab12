package Pr25.Ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String regex = "^(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[0-9]{1,2})(\\.(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[0-9]{1,2})){3}$";
        Scanner scanner = new Scanner(System.in);
        String IP = scanner.nextLine();
        if (IP.matches(regex))
            System.out.println("IP адресс верный");
        else
            System.out.println("IP адресс неверный");
    }
}