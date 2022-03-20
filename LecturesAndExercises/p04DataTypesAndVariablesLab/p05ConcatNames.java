package LecturesAndExercises.p04DataTypesAndVariablesLab;

import java.util.Scanner;

public class p05ConcatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       String name1 = scanner.nextLine();
       String name2 = scanner.nextLine();
       String delimiter = scanner.nextLine();
        System.out.println(name1+delimiter+name2);
    }
}
