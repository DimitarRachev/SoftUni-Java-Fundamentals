package LecturesAndExercises.p12MethodsMoreExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p04TribonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nums = Integer.parseInt(scanner.nextLine());
        List<Integer> tribonacci = new ArrayList<>();
        tribonacci.add(1);
        tribonacci.add(1);
        tribonacci.add(2);
        int index = 2;
        for (int i = index; i < nums - 1 ; i++) {
            int tmp = tribonacci.get(i) + tribonacci.get(i - 1) + tribonacci.get(i -2);
           tribonacci.add(tmp);
        }

        for (int i = 0; i < nums; i++) {
            System.out.print(tribonacci.get(i) + " ");
        }

    }

}
