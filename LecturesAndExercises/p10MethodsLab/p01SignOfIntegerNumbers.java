package LecturesAndExercises.p10MethodsLab;

import java.util.Scanner;

public class p01SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        printSign(num);
    }
    public static void printSign(int number)    {
        if (number > 0) {
            System.out.printf("The number %d is positive.", number);
        } else if (number < 0) {
            System.out.printf("The number %d is negative.", number);

        } else  {
            System.out.println("The number 0 is zero.");
        }
    }
}
