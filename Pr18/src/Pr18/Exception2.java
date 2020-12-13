package Pr18;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        try {
            if (2.0 / i != Double.POSITIVE_INFINITY)
                System.out.println(2.0 / i);
            else
                System.out.println("Бесконечность");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println("Делить на 0 нельзя");
        }
        finally {
            System.out.println("Всё");
        }
    }
}