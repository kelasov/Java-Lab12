package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите цену, название и описание");
        Scanner in = new Scanner(System.in);
        int quantity = in.nextInt();
        String name = in.next();
        String description = in.next();
        MenuItem menuItem = new MenuItem(quantity, name, description);
        System.out.println(menuItem.toString());
    }
}
