package LecturesAndExercises.p11MethodsExercise;

import java.util.Scanner;

public class p02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        printVowelsCount(text);
    }

    public static void printVowelsCount(String text) {
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'u' || text.charAt(i) == 'o' || text.charAt(i) == 'i' || text.charAt(i) == 'y' || text.charAt(i) == 'A' || text.charAt(i) == 'E' || text.charAt(i) == 'U' || text.charAt(i) == 'O' || text.charAt(i) == 'I' || text.charAt(i) == 'Y') {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
