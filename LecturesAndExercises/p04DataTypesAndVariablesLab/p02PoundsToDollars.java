package LecturesAndExercises.p04DataTypesAndVariablesLab;

import java.util.Scanner;

public class p02PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double km = scanner.nextDouble() * 1.36;
        System.out.printf("%.3f", km);
    }
}
