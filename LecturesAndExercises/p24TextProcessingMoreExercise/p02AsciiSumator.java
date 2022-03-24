package LecturesAndExercises.p24TextProcessingMoreExercise;

import java.util.Scanner;

public class p02AsciiSumator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char a = scanner.nextLine().charAt(0);
        char b = scanner.nextLine().charAt(0);
        String text = scanner.nextLine();
        int sum = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) > Math.min(a, b) && text.charAt(i) < Math.max(a, b)) {
                sum += text.charAt(i);
            }
        }
        System.out.println(sum);
    }
}
