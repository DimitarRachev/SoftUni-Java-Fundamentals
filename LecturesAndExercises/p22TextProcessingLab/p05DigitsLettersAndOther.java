package LecturesAndExercises.p22TextProcessingLab;

import java.util.Scanner;

public class p05DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        String text = line.replaceAll("[\\W0-9_]", "");
        String nums = line.replaceAll("[\\WA-Za-z_]", "");
        String symbols = line.replaceAll("[A-Za-z0-9]", "");

        System.out.println(nums);
        System.out.println(text);
        System.out.println(symbols);

    }
}
