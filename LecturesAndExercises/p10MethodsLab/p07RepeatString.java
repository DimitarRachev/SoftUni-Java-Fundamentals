package LecturesAndExercises.p10MethodsLab;

import java.util.Scanner;

public class p07RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int n    = Integer.parseInt(scanner.nextLine());

    String result = repeatString(text, n);
        System.out.println(result);

    }

    public static String repeatString(String text, int num) {
        String result = "";
        for (int i = 0; i < num; i++) {
            result += text;
        }
        return result;
    }

}
