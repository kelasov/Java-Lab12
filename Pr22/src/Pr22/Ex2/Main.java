package Pr22.Ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Дату в виде <Число><Месяц><Год>:");
        Date date = new Date(scanner.nextLine());
        System.out.println(date.toString());
        System.out.println("Время в виде <Часы><Минуты>:");
        Calendar calendar = new Calendar(scanner.nextLine());
        System.out.println(calendar.toString());
    }
}