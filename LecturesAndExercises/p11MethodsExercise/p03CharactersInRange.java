package LecturesAndExercises.p11MethodsExercise;

import java.util.Scanner;

public class p03CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char a = scanner.nextLine().charAt(0);
        char b = scanner.nextLine().charAt(0);
        printCharacterInRange(a, b);

    }

    public static void printCharacterInRange(char a, char b) {
        int start = Math.min(a, b);
        int end = Math.max(a, b);
        for (int i = start +1; i < end ; i++) {
            System.out.print((char)i + " ");
        }

    }

}
