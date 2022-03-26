package LecturesAndExercises.p22TextProcessingLab;

import java.util.Scanner;

public class p02RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split(" ");
        StringBuilder output = new StringBuilder();
        for (String s : arr) {
            StringBuilder srt = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                srt.append(s);
            }
            output.append(srt);
        }
        System.out.println(output);
    }
}
