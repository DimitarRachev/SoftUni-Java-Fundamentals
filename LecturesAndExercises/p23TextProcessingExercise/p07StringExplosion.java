package LecturesAndExercises.p23TextProcessingExercise;

import java.util.Scanner;

public class p07StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder input = new StringBuilder(scanner.nextLine());
        int power = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '>') {
                power += Integer.parseInt(String.valueOf(input.charAt(i + 1)));
            } else if (input.charAt(i) != '>' && power > 0) {
                input.deleteCharAt(i);
                i--;
                power--;
            }
        }

        System.out.println(input);
    }
}
