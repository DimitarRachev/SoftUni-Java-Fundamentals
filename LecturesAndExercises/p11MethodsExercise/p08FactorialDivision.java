package LecturesAndExercises.p11MethodsExercise;

import java.util.Scanner;

public class p08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // while (true) {
            int a = Integer.parseInt(scanner.nextLine());
            int b = Integer.parseInt(scanner.nextLine());
            double result =  getFactorial(a) * 1.0 / getFactorial(b);
            System.out.printf("%.2f", result);
     //   }
    }

    public static long getFactorial(int a) {
        long factorial = 1;
      //  a = Math.abs(a);  // -> no effect


        if (a > 0) {
            for (int i = a; i >= 1; i--) {
                factorial = factorial * i;
            }
        }

        return factorial;
    }
}
