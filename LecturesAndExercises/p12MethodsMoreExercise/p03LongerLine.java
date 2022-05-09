package LecturesAndExercises.p12MethodsMoreExercise;

import java.util.Scanner;

public class p03LongerLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());
        int x3 = Integer.parseInt(scanner.nextLine());
        int y3 = Integer.parseInt(scanner.nextLine());
        int x4 = Integer.parseInt(scanner.nextLine());
        int y4 = Integer.parseInt(scanner.nextLine());
        if (longiness(x1, y1, x2, y2) >= longiness(x3, y3, x4, y4)) {
            if (distanceToPoint(x1, y1) <= distanceToPoint(x2, y2)) {
                System.out.printf("(%d, %d)(%d, %d)", x1, y1, x2, y2);
            } else {
                System.out.printf("(%d, %d)(%d, %d)", x2, y2, x1, y1);
            }
        } else {
            if (distanceToPoint(x3, y3) <= distanceToPoint(x4, y4)) {
                System.out.printf("(%d, %d)(%d, %d)", x3, y3, x4, y4);
            } else {
                System.out.printf("(%d, %d)(%d, %d)", x4, y4, x3, y3);
            }
        }


    }

    public static double longiness(int x1, int y1, int x2, int y2) {
        double distance = 0;
        if (x1 == x2) {
            distance = calculateCatheter(y1, y2);
        } else if (y1 == y2) {
            distance = calculateCatheter(x1, x2);
        } else {
            int x = calculateCatheter(x1, x2);
            int y = calculateCatheter(y1, y2);
            distance = Math.pow(x, 2) + Math.pow(y, 2);
            distance = Math.sqrt(distance);
        }
        return distance;
    }

    public static boolean areSameSign(int x, int y) {
        if ((x > 0 && y > 0) || (x < 0 && y < 0)) {
            return true;
        }
        return false;
    }

    public static int calculateCatheter(int x, int y) {
        int dist = 0;
        if (x == 0) {
            dist = Math.abs(y);
        } else if (y == 0) {
            dist = Math.abs(x);
        } else if (areSameSign(x, y)) {
            dist = Math.abs(Math.abs(x) - Math.abs(y));
        } else {
            dist = Math.abs(x) + Math.abs(y);
        }
        return dist;
    }

    public static double distanceToPoint(int x, int y) {
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
