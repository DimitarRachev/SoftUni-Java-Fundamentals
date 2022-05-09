package LecturesAndExercises.p12MethodsMoreExercise;

import java.util.Scanner;

public class p02CenterPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());
        if (distanceToCenter(x1, y1) <= distanceToCenter(x2, y2)) {
            System.out.printf("(%d, %d)", x1, y1);
        } else {
            System.out.printf("(%d, %d)", x2, y2);
        }

    }
    public static double distanceToCenter(int x, int y) {
        double dist = 0;
        if (x == 0) {
            dist = Math.abs(y);
        } else if (y == 0) {
            dist = Math.abs(x);
        } else {
            dist = Math.pow(Math.abs(x), 2) + Math.pow(Math.abs(y), 2);
            dist = Math.sqrt(dist);
        }
        return dist;
    }
}
