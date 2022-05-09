package LecturesAndExercises.p11MethodsExercise;

import java.util.Scanner;

public class p09PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        while (!command.equals("END")) {
            System.out.println(isPalindrome(command));
            command = scanner.nextLine();
        }
    }

    public static boolean isPalindrome(String num) {
        //String temp = String.valueOf(num);
        boolean isPalindrome = true;
        for (int i = 0; i < num.length() / 2; i++) {
            if (num.charAt(i) != num.charAt(num.length() - 1 - i)) {
                isPalindrome = false;
            }
        }
        return isPalindrome;

    }
}
