package LecturesAndExercises.p11MethodsExercise;

import java.util.Scanner;

public class p04PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pass = scanner.nextLine();
        if (!isLengthOK(pass)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!haveOnlyLettersAndChars(pass)) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!have2Digits(pass)) {
            System.out.println("Password must have at least 2 digits");
        }
        if (isLengthOK(pass) && have2Digits(pass) && haveOnlyLettersAndChars(pass)) {
            System.out.println("Password is valid");
        }
    }

    public static boolean isLengthOK(String text) {
        if (text.length() >= 6 && text.length() <= 10) {
            return true;
        }
        return false;
    }

    public static boolean haveOnlyLettersAndChars(String text) {
        for (int i = 0; i < text.length(); i++) {
            if ((text.charAt(i) >= 48 && text.charAt(i) <= 57) || (text.charAt(i) >= 65 && text.charAt(i) <= 90) || (text.charAt(i) >= 97 && text.charAt(i) <= 122)) {

            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean have2Digits(String text) {
        boolean have1digit = false;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) >= 48 && text.charAt(i) <= 57 && !have1digit) {
                have1digit = true;
            continue;
            }
            if (text.charAt(i) >= 48 && text.charAt(i) <= 57 && have1digit) {
                return true;
            }
        }

        return false;
    }

}
