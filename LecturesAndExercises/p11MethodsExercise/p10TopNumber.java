package LecturesAndExercises.p11MethodsExercise;

import java.util.Scanner;

public class p10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= num ; i++) {
            if (isSumDivisibleBy8(i) && haveOddDigit(i)) {
                System.out.println(i);
            }
        }

    }
    public static boolean isSumDivisibleBy8(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        if (sum % 8 == 0) {
            return true;
        }
        return false;
    }

    public static boolean haveOddDigit(int num) {
        while (num > 0) {
           int lastDigit = num % 10;
            if (lastDigit % 2 != 0) {
                return true;
            }
            num = num / 10;
        }
        return false;
    }

}
