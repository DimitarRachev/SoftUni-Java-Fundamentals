package LecturesAndExercises.p01.BasicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class p09SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int counter = 0, sum = 0;
        for (int i = 1; i <2 * n + 2 ; i++) {

            if (i % 2 != 0) {
                counter++;
                if (counter > n) {
                    break;
                }
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("Sum: " + sum);


    }
}
