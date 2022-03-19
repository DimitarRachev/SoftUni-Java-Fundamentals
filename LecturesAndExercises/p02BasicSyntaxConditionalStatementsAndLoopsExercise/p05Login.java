package LecturesAndExercises.p02BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class p05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        String pass = new StringBuilder(userName).reverse().toString();
        int counter = 0;
        String guess = scanner.nextLine();
        while (!guess.equals(pass)) {
            counter++;
            if (counter == 4) {
                System.out.printf("User %s blocked!", userName);
                return;
            }
            System.out.printf("Incorrect password. Try again.%n");
            guess = scanner.nextLine();

        }
        System.out.printf("User %s logged in.", userName);

    }
}
