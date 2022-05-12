package LecturesAndExercises.p10MethodsLab;

import java.util.Scanner;

public class p10MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Math.abs(Integer.parseInt(scanner.nextLine()));
        System.out.println(getMultipleOfEvenAndOddSum(num));

    }

    public static int getEvenSum(int num) {
        String number = String.valueOf(num);
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            int x = Integer.parseInt(String.valueOf(number.charAt(i)));
            if (x % 2 == 0) {
                sum += x;
            }
        }
        return sum;
    }

    public static int getOddSum(int num) {
        String number = String.valueOf(num);
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            int x = Integer.parseInt(String.valueOf(number.charAt(i)));
            if (x % 2 != 0) {
                sum += x;
            }
        }
        return sum;
    }

    public static int getMultipleOfEvenAndOddSum(int number) {
        return getEvenSum(number) * getOddSum(number);
    }
}
