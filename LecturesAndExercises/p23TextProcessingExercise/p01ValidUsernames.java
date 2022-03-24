package LecturesAndExercises.p23TextProcessingExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p01ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(", ");
        for (String s : line) {
            if (isValid(s)) {
                System.out.println(s);
            }
        }


    }

    private static boolean isValid(String s) {
        if (s.length() < 3 || s.length() > 16 ) {
            return false;
        }
for (int i=0; i < s.length(); i++)
    if ((s.charAt(i) < 65 || s.charAt(i) > 90) && (s.charAt(i) < 97 || s.charAt(i) > 122 ) && (s.charAt(i) < 48 || s.charAt(i) > 57) && s.charAt(i) != 45 && s.charAt(i) != 95) {
        return false;
    }
        return true;
    }
}
