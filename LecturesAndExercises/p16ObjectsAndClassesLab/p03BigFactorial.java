package LecturesAndExercises.p16ObjectsAndClassesLab;

import java.math.BigInteger;
import java.util.Scanner;

public class p03BigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        BigInteger fact = new BigInteger(String.valueOf(n));
        for (int i = n; i > 1; i--) {
            BigInteger fact2 = new BigInteger(String.valueOf(i - 1));
            fact = fact.multiply(fact2);
        }
        System.out.println(fact);
    }

}
