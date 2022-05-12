package LecturesAndExercises.p10MethodsLab;

import java.util.Scanner;

public class p09GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        System.out.println(getMax(type, a, b));

    }

    public static String getMax(String type, String a, String b) {
        if (type.equals("int")) {
            int num1 = Integer.parseInt(a);
            int num2 = Integer.parseInt(b);
            if (num1 > num2) {
                return String.valueOf(num1) ;
            }else {
                return String.valueOf(num2);
            }
        } else if (type.equals("char")) {
            char first = a.charAt(0);
            char second = b.charAt(0);
            if (first > second) {
                return String.valueOf(first);
            } else {
                return String.valueOf(second);
            }
        } else if (type.equals("string")) {
            if (a.compareTo(b) > 0) {
                return a;
            } else {
                return b;
            }
        }
return a;

    }
}
