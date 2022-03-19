package LecturesAndExercises.p03BasicSyntaxConditionalStatementsandLoopsMoreExerc;

import java.util.Scanner;

public class p05Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int letters = Integer.parseInt(scanner.nextLine());

        for (int i=1;i<=letters;i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num == 0) {
                System.out.printf(" ");

            } else if (num == 1) {

            } else {
                int counter = 0;
                int mainDigit = num % 10;
                while (num > 0) {
                    num = num / 10;
                    counter++;
                }
                int offset = (mainDigit - 2) * 3;
                if (mainDigit == 8 || mainDigit == 9) {
                    offset += 1;
                }
                int index = offset + counter - 1;
                char letter = (char) (97 + index);
                System.out.printf("%s", letter);
            }

        }


    }
}
