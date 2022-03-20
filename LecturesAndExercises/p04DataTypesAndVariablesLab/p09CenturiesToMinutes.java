package LecturesAndExercises.p04DataTypesAndVariablesLab;

import java.util.Scanner;

public class p09CenturiesToMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int centuries = Integer.parseInt(scanner.nextLine());
        double years = centuries * 100;
        System.out.printf("%d centuries = %.0f years = %.0f days = %.0f hours = %.0f minutes",centuries, years, years * 365.2422, years * 365.2422 * 24, years * 365.2422 * 24 * 60);

    }
}
