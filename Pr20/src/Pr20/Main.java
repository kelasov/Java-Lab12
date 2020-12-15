package Pr20;

import java.sql.Array;

public class Main {
    public static void main(String[] args) {
        Integer[] num = {0, 1, 2, 3, 4, 5};
        Conversion<Integer> arr1 = new Conversion(num);
        arr1.showList();
        arr1.show();

        String[] str = {"zero", "one", "two", "three", "four", "five"};
        Conversion<String> arr2 = new Conversion(str);
        arr2.showList();
        arr2.show();
    }
}