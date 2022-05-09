package LecturesAndExercises.p11MethodsExercise;

import java.util.Scanner;

public class p06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(getMiddleCharecter(text));

    }
    public static String getMiddleCharecter(String text) {
        if (text.length() % 2 == 0) {
            String temp =  String.valueOf(text.charAt(text.length() / 2 -1)) + text.charAt(text.length() / 2);
        return temp;
        }

            return String.valueOf(text.charAt(text.length() / 2));

    }
}
