package LecturesAndExercises.p02BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class p09Orders {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double total = 0;
        int orders = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= orders ; i++) {
            double price = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsules = Integer.parseInt(scanner.nextLine());
            double subtotal = days * capsules * price;
            total += subtotal;
            System.out.printf("The price for the coffee is: $%.2f%n",subtotal);
        }
        System.out.printf("Total: $%.2f", total);

    }
}
