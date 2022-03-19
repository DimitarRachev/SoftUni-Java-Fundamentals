package LecturesAndExercises.p03.BasicSyntaxConditionalStatementsandLoopsMoreExerc;

import java.util.Scanner;

public class p03GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float budget = Float.parseFloat(scanner.nextLine());
        String game = scanner.nextLine();
        float total = 0;
        while (!game.equals("Game Time")) {
            float price = 0;
            switch (game) {
                case "OutFall 4":
                case "RoverWatch Origins Edition":
                    price += 39.99;
                    break;
                case "CS: OG":
                    price += 15.99;
                    break;
                case "Zplinter Zell":
                    price += 19.99;
                    break;
                case "Honored 2":
                    price += 59.99;
                    break;
                case "RoverWatch":
                    price += 29.99;
                    break;
                default:
                    System.out.println("Not Found");
                    game = scanner.nextLine();
                    continue;
            }
            if (price + total > budget) {
                System.out.println("Too Expensive");
                game = scanner.nextLine();
                continue;
            }
            total += price;
            System.out.printf("Bought %s%n", game);
            game = scanner.nextLine();
        }
        if (total - budget == 0) {
            System.out.println("Out of money!");
        } else  {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", total, budget - total);
        }

    }

}
