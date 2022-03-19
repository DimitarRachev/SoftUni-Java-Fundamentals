package LecturesAndExercises.p03.BasicSyntaxConditionalStatementsandLoopsMoreExerc;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double budget = Double.parseDouble(sc.nextLine());
        String input = sc.nextLine();
        double priceOfAGame = 0;
        double spentMoneyOnGames = 0;
        while (!input.equals("Game Time")) {
            if (input.equals("OutFall 4")) {
                priceOfAGame = 39.99;
            } else if (input.equals("CS: OG")) {
                priceOfAGame = 15.99;
            } else if (input.equals("Honored 2")) {
                priceOfAGame = 59.99;
            } else if (input.equals("Zplinter Zell")) {
                priceOfAGame = 19.99;
            } else if (input.equals("RoverWatch")) {
                priceOfAGame = 29.99;
            } else if (input.equals("RoverWatch Origins Edition")) {
                priceOfAGame = 39.99;
            } else {
                System.out.println("Not Found");
                input = sc.nextLine();
                continue;
            }
            if (budget < priceOfAGame) {
                System.out.println("Too Expensive");
                input = sc.nextLine();
                continue;
            }

            budget -= priceOfAGame;
            spentMoneyOnGames += priceOfAGame;
            if (budget == 0) {
                System.out.println("Bought" + " " + input);
                System.out.println("Out of money!");
                return;
            }
            System.out.println("Bought" + " " + input);
            input = sc.nextLine();
        }

        System.out.printf("Total spent: $%.2f. Remaining: $%.2f", spentMoneyOnGames, budget);
    }
}
