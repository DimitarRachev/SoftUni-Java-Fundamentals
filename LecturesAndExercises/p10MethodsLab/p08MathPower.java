package LecturesAndExercises.p10MethodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class p08MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine());
        double power = Double.parseDouble(scanner.nextLine());
        DecimalFormat df = new DecimalFormat("0.####");
        System.out.println(df.format(mathPower(n, power)));

    }

    public static double mathPower(double num, double power) {
        double result = 1;
        for (int i = 0; i < power; i++) {
            result = result * num;
        }
        return (result);
    }
}
