package LecturesAndExercises.p04DataTypesAndVariablesLab;

import java.util.Scanner;

public class p08LowerOrUpper {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char char1 = scanner.next().charAt(0);
        if  (97<= char1 && char1 <=122) {
            System.out.println("lower-case");
        } else if (65 <= char1 &&char1 <= 90) {
            System.out.println("upper-case");
        }
    }
}
