package LecturesAndExercises.p04DataTypesAndVariablesLab;

import java.util.Scanner;

public class p01ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double km = scanner.nextInt() / 1000.0;
        System.out.printf("%.2f", km);
    }
}
