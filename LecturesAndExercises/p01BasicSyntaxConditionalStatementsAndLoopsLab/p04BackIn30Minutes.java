package LecturesAndExercises.p01BasicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class p04BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        m += 30;
        if (m >= 60) {
            m= m - 60;
            h++;
        }
        if (h == 24) {
            h=0;
        }
        if (m > 9) {
            System.out.printf("%d:%d", h, m);
        } else {
            System.out.printf("%d:0%d", h , m);
        }

    }
}
