package LecturesAndExercises.p23TextProcessingExercise;

import java.util.Scanner;

public class p04CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            result.append((char)(input.charAt(i) + 3));
        }
        System.out.println(result);
    }
}
