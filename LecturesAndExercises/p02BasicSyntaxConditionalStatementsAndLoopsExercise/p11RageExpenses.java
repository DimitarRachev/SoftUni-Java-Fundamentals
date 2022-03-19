package LecturesAndExercises.p02BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class p11RageExpenses {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int lostGames = Integer.parseInt(scanner.nextLine());
        float headsetPrice = Float.parseFloat(scanner.nextLine());
        float mousePrice = Float.parseFloat(scanner.nextLine());
        float keyboardPrice = Float.parseFloat(scanner.nextLine());
        float displayPrice = Float.parseFloat(scanner.nextLine());
        boolean isKeyboardTrashed = false;
        float total = 0;
        for (int i = 1; i <= lostGames; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                if (isKeyboardTrashed) {
                    total += displayPrice + keyboardPrice + mousePrice + headsetPrice;
                    isKeyboardTrashed = false;
                } else {
                    isKeyboardTrashed = true;
                    total += keyboardPrice + mousePrice + headsetPrice;
                }
            } else if ( i % 3 == 0) {
                total += mousePrice;
            } else if (i % 2 == 0) {
                total += headsetPrice;
            }
        }
        System.out.printf("Rage expenses: %.2f lv.", total);

    }
}
