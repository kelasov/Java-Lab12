package Pr16;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        System.out.println("5 карт первого игрока:");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <5 ; i++) {
            arr1.add(scanner.nextInt());
        }

        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        System.out.println("5 карт второго игрока:");
        for (int i = 0; i <5 ; i++) {
            arr2.add(scanner.nextInt());
        }

        int count = 0;
        boolean res = false;

        for (int i = 0; i < 106; i++) {
            if ((arr1.size() != 0) && (arr2.size() != 0)) {
                if (arr1.get(0) < arr2.get(0) || ((arr1.get(0) == 9) && (arr2.get(0) == 0)) ) {
                    arr2.add(arr1.get(0));
                    arr2.add(arr2.get(0));
                } else if (arr1.get(0) > arr2.get(0) || ((arr1.get(0) == 0) && (arr2.get(0) == 9))) {
                    arr1.add(arr1.get(0));
                    arr1.add(arr2.get(0));
                }
                arr1.remove(0);
                arr2.remove(0);
            }
            else if (arr1.size() == 0) {
                System.out.println("Second " + i);
                res = true;
                break;
            } else if (arr2.size() == 0) {
                System.out.println("First " + i);
                res = true;
                break;
            }
            count++;
        }
        if (res==false || count==106) System.out.println("Botva!");
    }
}
