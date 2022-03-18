package LecturesAndExercises.p01.BasicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class p12EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for ( int a = 0;a < 10  ;a--) {
            int n = Integer.parseInt(scanner.nextLine());
            if (n % 2  == 0) {
                System.out.println("The number is: " + Math.abs(n));
                return;
            } else {
                System.out.println("Please write an even number.");
            }
        }


    }
}
