package LecturesAndExercises.p04DataTypesAndVariablesLab;

import java.util.Scanner;

public class p12RefactorSpecialNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        //int tempNum = 0;
        //boolean isSpecial = false;
        for (int i = 1; i <= number; i++) {
            int sum = 0;
            int tempNum = i;
            while (tempNum > 0) {
                sum += tempNum % 10;
                tempNum = tempNum / 10;
            }
            boolean isSpecial = (sum == 5) || (sum == 7) || (sum == 11);
            if (isSpecial) {
                System.out.printf("%d -> True%n", i, isSpecial);
            } else {
                System.out.printf("%d -> False%n", i, isSpecial);
            }
            //sum = 0;
            //i = tempNum;
        }

    }
}
