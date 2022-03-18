package LecturesAndExercises.p02.BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class p01Ages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());

        if (age <= 2) {
            System.out.printf("baby");
        } else if (age <= 13) {
            System.out.printf("child");
        } else if (age <= 19) {
            System.out.printf("teenager");
        } else if (age <= 65) {
            System.out.printf("adult");
        } else {
            System.out.printf("elder");
        }
    }
}
