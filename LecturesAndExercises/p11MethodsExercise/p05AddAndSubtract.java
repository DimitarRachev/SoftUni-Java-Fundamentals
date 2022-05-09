package LecturesAndExercises.p11MethodsExercise;

import java.util.Scanner;

public class p05AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        System.out.println(substract(getSum(a, b), c));
    }
    public static int getSum(int a, int b) {
        return a + b;
    }
    public static int substract(int a, int b) {
        return a - b;
    }
}
