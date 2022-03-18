package LecturesAndExercises.p01.BasicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class p01StudentInformation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());
        double grade = Double.parseDouble(sc.nextLine());
        System.out.printf("Name: %s, Age: %d, Grade: %.2f", name, age, grade);

    }
}
