package LecturesAndExercises.p10MethodsLab;

import java.util.Scanner;

public class p06CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lenght = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        System.out.println(getRectangleArea(lenght,width));

    }
    public static int getRectangleArea(int a, int b) {
        return (a * b);
    }
}
