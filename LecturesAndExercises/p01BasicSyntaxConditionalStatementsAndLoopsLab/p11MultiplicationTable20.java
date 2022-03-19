package LecturesAndExercises.p01BasicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class p11MultiplicationTable20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        if (b <= 10) {
            for (int i = b; i < 11; i++) {
                System.out.printf("%d X %d = %d%n", a, i, a * i);
            }
        } else {
            System.out.printf("%d X %d = %d", a, b, a * b);
        }


    }
}
