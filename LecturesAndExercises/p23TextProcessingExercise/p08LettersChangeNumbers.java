package LecturesAndExercises.p23TextProcessingExercise;

import java.util.Scanner;

public class p08LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        double sum = 0;
        for (int i = 0; i < input.length; i++) {
            double num = Double.parseDouble(input[i].substring(1, input[i].length() - 1));
            char first = input[i].charAt(0);
            char last = input[i].charAt(input[i].length() - 1);
            if (first >= 65 && first <= 90) {
                int position = first - 64;
                num = num / position;
            } else if (first >= 97 && first <= 122) {
                int position = first - 96;
                num = num * position;
            }
            if (last >= 65 && last <= 90) {
                int position = last - 64;
                num -= position;
            } else if (last >= 97 && last <= 122) {
                int position = last - 96;
                num += position;
            }
            sum += num;
        }

        System.out.printf("%.2f", sum);
    }
}
