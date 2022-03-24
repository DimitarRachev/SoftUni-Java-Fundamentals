package LecturesAndExercises.p23TextProcessingExercise;

import java.util.Scanner;

public class p02CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
String input = scanner.nextLine();
        String str1 = input.split("\\s+")[0];
        String str2 = input.split("\\s+")[1];
        int sum = 0;

        for (int i = 0; i < Math.min(str1.length(), str2.length()); i++) {
            sum += str1.charAt(i) * str2.charAt(i);
        }
        if (str1.length() > str2.length()) {
            for (int i = Math.min(str2.length(), str1.length()); i < str1.length(); i++) {
                sum += str1.charAt(i);
            }
        } else if (str1.length() < str2.length()) {
            for (int i = Math.min(str2.length(), str1.length()); i < str2.length(); i++) {
                sum += str2.charAt(i);
            }
        }
        System.out.println(sum);
    }
}
