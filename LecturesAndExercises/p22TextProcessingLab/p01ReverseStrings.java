package LecturesAndExercises.p22TextProcessingLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p01ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;
        while (!"end".equals(input = scanner.nextLine())) {
            char[] arr = input.toCharArray();
            List<Character> list = new ArrayList<>();
            for (int i = arr.length -1; i >= 0 ; i--) {
                list.add(arr[i]);
            }
            String output = list.toString().replaceAll("[\\[\\] ,]", "");
            System.out.printf("%s = %s%n", input, output);
        }

    }
}
