package Pr25.Ex2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//((9+3)+3
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = input;
        Pattern pattern = Pattern.compile("\\([\\d+/*-]*\\)");
        Matcher matchers = pattern.matcher(input);
        do {
            input = matchers.replaceAll("");
            matchers = pattern.matcher(input);
        }
        while (matchers.find());
        if (input.matches("[\\d+/*-]*"))
            System.out.println("Пример правильный " + output);
        else System.out.println("Пример неправильный");
    }
}