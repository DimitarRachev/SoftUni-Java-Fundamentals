package LecturesAndExercises.p02BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class p06StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int origNum = Integer.parseInt(scanner.nextLine());
        int num = origNum;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            num = num / 10;
            int factorial = 1;
            if (digit != 0 && digit != 1) {
                for (int i = digit; i >= 2; i--) {
                    factorial *= i;
                }
            }
            sum += factorial;
        }
        if (sum == origNum) {
            System.out.printf("yes");
        } else {
            System.out.printf("no");
        }

    }
}
