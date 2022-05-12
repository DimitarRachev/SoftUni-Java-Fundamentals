package LecturesAndExercises.p10MethodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class p11MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int b = Integer.parseInt(scanner.nextLine());
        DecimalFormat df = new DecimalFormat("0.#####");
        System.out.println(df.format(mathOperator(a, operator, b)));


    }
    public static double mathOperator(int a, String operator, int b) {
        switch ( operator) {
            case "*":
                return a*b;

            case "/":
                return a/b;

            case "+":
                return a+b;

            case "-":
                return a-b;

        }
        return 0;
    }
}
