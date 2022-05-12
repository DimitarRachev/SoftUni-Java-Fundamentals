package LecturesAndExercises.p09ArraysMoreExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class p01EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            int sum = 0;
            for (int j = 0; j < name.length(); j++) {
                char x = name.charAt(j);
                if (x == 'a' || x == 'e'  || x == 'u' || x == 'i' || x == 'o' || x == 'A' || x == 'E'  || x == 'U' || x == 'O' || x == 'I' ) {
                    sum += x * name.length();
                } else {
                    sum += x / name.length();
                }
            }
            list.add(sum);
        }
        Collections.sort(list);
        for (Integer integer : list) {
            System.out.println(integer);
        }

    }
}
