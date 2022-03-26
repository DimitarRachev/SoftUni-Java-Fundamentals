package LecturesAndExercises.p22TextProcessingLab;

import java.util.Scanner;

public class p03Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        String line = scanner.nextLine();

        while (line.contains(word)) {
           line = line.replace(word, "");
        }

        System.out.printf(line);
    }

}
