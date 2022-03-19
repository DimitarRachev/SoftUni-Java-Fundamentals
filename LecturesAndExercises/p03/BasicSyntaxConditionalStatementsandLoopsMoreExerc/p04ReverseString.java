package LecturesAndExercises.p03.BasicSyntaxConditionalStatementsandLoopsMoreExerc;

import java.util.Scanner;

public class p04ReverseString {
    public class ReverseString {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String st = sc.nextLine();
            String reverse = new StringBuilder(st).reverse().toString();
            System.out.println(reverse);
        }
    }
}
