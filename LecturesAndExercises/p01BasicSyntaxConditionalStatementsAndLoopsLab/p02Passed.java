package LecturesAndExercises.p01BasicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class p02Passed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float num = Float.parseFloat(scanner.nextLine());
        if (num >= 3.0) {
            System.out.printf("Passed!");
        }



    }
}
