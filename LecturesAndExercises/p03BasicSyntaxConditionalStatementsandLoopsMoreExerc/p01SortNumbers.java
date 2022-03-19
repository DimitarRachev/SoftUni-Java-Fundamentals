package LecturesAndExercises.p03BasicSyntaxConditionalStatementsandLoopsMoreExerc;

import java.util.Scanner;

public class p01SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int int1 = Integer.parseInt(scanner.nextLine());
        int int2 = Integer.parseInt(scanner.nextLine());
        int int3 = Integer.parseInt(scanner.nextLine());
        if (int3 >= int2) {
            if (int1 >= int3) {
                System.out.println(int1);
                System.out.println(int3);
                System.out.println(int2);
            } else if (int1 >= int2) {
                System.out.println(int3);
                System.out.println(int1);
                System.out.println(int2);
            } else {
                System.out.println(int3);
                System.out.println(int2);
                System.out.println(int1);
            }
        } else {
            if (int1 >= int2) {
                System.out.println(int1);
                System.out.println(int2);
                System.out.println(int3);
            } else if (int1 >= int3) {
                System.out.println(int2);
                System.out.println(int1);
                System.out.println(int3);
            } else {
                System.out.println(int2);
                System.out.println(int3);
                System.out.println(int1);
            }
        }


    }
}
