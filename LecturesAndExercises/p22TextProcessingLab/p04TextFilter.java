package LecturesAndExercises.p22TextProcessingLab;

import java.util.Scanner;

public class p04TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] banned = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String s : banned) {
            StringBuilder replase = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                replase.append("*");
            }
            text = text.replace(s, replase.toString());
        }

        System.out.println(text);
    }
}
