package LecturesAndExercises.p10MethodsLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p04Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> command = new ArrayList<>();
        command.add(scanner.nextLine());
        command.add(scanner.nextLine());
        command.add(scanner.nextLine());
        switch (command.get(0)) {
            case "add":
                add(Integer.parseInt(command.get(1)), Integer.parseInt(command.get(2)));
                break;
            case "multiply":
                multiply(Integer.parseInt(command.get(1)), Integer.parseInt(command.get(2)));
                break;
            case "subtract":
                subtract(Integer.parseInt(command.get(1)), Integer.parseInt(command.get(2)));
                break;
            case "divide":
                divide(Integer.parseInt(command.get(1)), Integer.parseInt(command.get(2)));
                break;
        }

    }

    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void multiply(int a, int b) {
        System.out.println(a * b);
    }

    public static void subtract(int a, int b) {
        System.out.println(a - b);
    }

    public static void divide(int a, int b) {
        System.out.println(a / b);
    }
}
