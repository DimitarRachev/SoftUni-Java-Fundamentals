package LecturesAndExercises.p11MethodsExercise;

import java.util.Scanner;

public class p01SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        printSmallest(a, b, c);

    }

    public static void printSmallest(int a, int b, int c) {
        if (a > b) {
            if (b > c) {
                System.out.println(c);
            } else {
                System.out.println(b);
            }
        } else {
            if (a > c) {
                System.out.println(c);
            } else {
                System.out.println(a);
            }
        }


    }
}
