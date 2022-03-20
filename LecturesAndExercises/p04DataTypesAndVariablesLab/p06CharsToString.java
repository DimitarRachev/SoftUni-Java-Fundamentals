package LecturesAndExercises.p04DataTypesAndVariablesLab;

import java.util.Scanner;

public class p06CharsToString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String result = "";
        for (int i = 0; i < 3; i++) {
            String temp = scanner.nextLine();
            result += temp;
        }
        System.out.println(result);
    }
}
