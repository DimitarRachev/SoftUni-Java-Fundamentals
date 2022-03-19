package LecturesAndExercises.p01.BasicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class p07TheatrePromotion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        int price = 0;
        switch (day) {
            case "Weekday":
                if (age >= 0 && age <= 18) {
                    System.out.printf("12$");
                } else if (age > 18 && age <= 64) {
                    System.out.printf("18$");
                } else if (age > 64 && age <= 122) {
                    System.out.printf("12$");
                } else {
                    System.out.printf("Error!");
                }
                break;
            case "Weekend":
                if (age >= 0 && age <= 18) {
                    System.out.printf("15$");
                } else if (age > 18 && age <= 64) {
                    System.out.printf("20$");
                } else if (age > 64 && age <= 122) {
                    System.out.printf("15$");
                } else {
                    System.out.printf("Error!");
                }
                break;
            case "Holiday":
                if (age >= 0 && age <= 18) {
                    System.out.printf("5$");
                } else if (age > 18 && age <= 64) {
                    System.out.printf("12$");
                } else if (age > 64 && age <= 122) {
                    System.out.printf("10$");
                } else {
                    System.out.printf("Error!");
                }
                break;
        }

    }
}
