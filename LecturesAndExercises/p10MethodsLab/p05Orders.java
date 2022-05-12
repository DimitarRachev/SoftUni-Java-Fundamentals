package LecturesAndExercises.p10MethodsLab;

import java.util.Scanner;

public class p05Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String order = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        orderCalculator(order, quantity);

    }

    public static void orderCalculator(String order, int quantity) {
        double price = 0;
        switch (order) {
            case "coffee":
                price = 1.5;
                break;
            case "water":
                price = 1;
                break;
            case "coke":
                price = 1.4;
                break;
            case "snacks":
                price = 2;
                break;
        }

        System.out.printf("%.2f", price * quantity);
    }
}
