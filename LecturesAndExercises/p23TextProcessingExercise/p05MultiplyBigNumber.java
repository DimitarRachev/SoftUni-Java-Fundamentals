package LecturesAndExercises.p23TextProcessingExercise;

import java.util.Scanner;

public class p05MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine().replaceFirst("^0+", "");
        int second = Integer.parseInt(scanner.nextLine());

        int carry = 0;
        StringBuilder result = new StringBuilder();
        if (second == 0) {
            System.out.println("0");
            return;
        }

        for (int i = first.length() - 1; i >= 0; i--) {
            int current = Integer.parseInt((String.valueOf(first.charAt(i))));
            current = current * second + carry;
            carry = 0;
            if (i == 0) {
                result.insert(0, current);
            } else {
                carry = current / 10;
                current = current % 10;
                result.insert(0, current);
            }

        }
        System.out.println(result);
    }
}

