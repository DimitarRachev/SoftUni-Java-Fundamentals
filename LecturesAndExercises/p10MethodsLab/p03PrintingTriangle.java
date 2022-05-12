package LecturesAndExercises.p10MethodsLab;

import java.util.Scanner;

public class p03PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        printUpperTriangle(n);
        printLowerTriangle(n);

    }
    public static void printLine(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void printUpperTriangle(int number) {
        for (int i = 1; i <= number; i++) {
            printLine(i);
        }
    }
    public static void printLowerTriangle(int number) {
        for (int i = number - 1; i > 0 ; i--) {
            printLine(i);
        }
    }
}
