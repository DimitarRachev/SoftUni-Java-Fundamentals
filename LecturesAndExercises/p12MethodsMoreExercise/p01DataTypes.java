package LecturesAndExercises.p12MethodsMoreExercise;

import java.util.Scanner;

public class p01DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        switch (type) {
            case "int":
                newprint(Integer.parseInt(scanner.nextLine()));
                break;
            case "real":
                newprint(Double.parseDouble(scanner.nextLine()));
                break;
            case "string":
                newprint(scanner.nextLine());
                break;
        }
    }

    public static void newprint(int num) {
        num *= 2;
        System.out.println(num);
    }

    public static void newprint(double num) {
        num *= 1.5;
        System.out.printf("%.2f", num);
    }

    public static void newprint(String str) {
        System.out.printf("$%s$", str);
    }
}
