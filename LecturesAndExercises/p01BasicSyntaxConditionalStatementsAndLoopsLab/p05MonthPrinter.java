package LecturesAndExercises.p01.BasicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class p05MonthPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        if (n == 1) {
            System.out.printf("January");
        } else if (n == 2) {
            System.out.printf("February");
        } else if (n == 3) {
            System.out.printf("March");
        } else if (n == 4) {
            System.out.printf("April");
        } else if (n == 5) {
            System.out.printf("May");
        } else if (n == 6) {
            System.out.printf("June");
        } else if (n == 7) {
            System.out.printf("July");
        } else if (n == 8) {
            System.out.printf("August");
        } else if (n == 9) {
            System.out.printf("September");
        }else if (n == 10) {
            System.out.printf("October");
        } else if (n == 11) {
            System.out.printf("November");
        } else if (n == 12) {
            System.out.printf("December");
        } else {
            System.out.printf("Error!");
        }



    }
}
