package LecturesAndExercises.p02BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class p07VendingMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String coin = scanner.nextLine();
        double availableMoney = 0;
        while (!coin.equals("Start")) {
            double coinDouble = Double.parseDouble(coin);
            if (coinDouble == 0.1 || coinDouble == 0.2 || coinDouble == 0.5 || coinDouble == 1 || coinDouble == 2) {
                availableMoney += coinDouble;
            } else {
                System.out.printf("Cannot accept %.2f%n", coinDouble);
            }
            coin = scanner.nextLine();
        }
        String purchase = scanner.nextLine();
        while (!purchase.equals("End")) {
            switch (purchase) {
                case "Nuts":
                    if (availableMoney >= 2) {
                        System.out.println("Purchased Nuts");
                        availableMoney -= 2;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    if (availableMoney >= 0.7) {
                        System.out.println("Purchased Water");
                        availableMoney -= 0.7;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    if (availableMoney >= 1.5) {
                        System.out.println("Purchased Crisps");
                        availableMoney -= 1.5;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    if (availableMoney >= 0.8) {
                        System.out.println("Purchased Soda");
                        availableMoney -= 0.8;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    if (availableMoney >= 1) {
                        System.out.println("Purchased Coke");
                        availableMoney -= 1;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.printf("Invalid product%n");
            }
            purchase = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", availableMoney);
    }
}
