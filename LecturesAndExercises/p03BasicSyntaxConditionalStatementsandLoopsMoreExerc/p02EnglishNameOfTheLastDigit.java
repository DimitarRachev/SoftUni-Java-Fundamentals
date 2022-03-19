package LecturesAndExercises.p03BasicSyntaxConditionalStatementsandLoopsMoreExerc;

import java.util.Scanner;

public class p02EnglishNameOfTheLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int num = n % 10;
        if (num == 1) {
            System.out.printf("one");
        } else if (num == 2) {
            System.out.printf("two");
        }else if (num == 3) {
            System.out.printf("tree");
        }else if (num == 4) {
            System.out.printf("four");
        }else if (num == 5) {
            System.out.printf("five");
        }else if (num == 6) {
            System.out.printf("six");
        }else if (num == 7) {
            System.out.printf("seven");
        }else if (num == 8) {
            System.out.printf("eight");
        }else if (num == 9) {
            System.out.printf("nine");
        }else if (num == 0) {
            System.out.printf("zero");
        }


    }
}
