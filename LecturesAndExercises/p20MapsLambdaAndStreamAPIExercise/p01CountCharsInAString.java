package LecturesAndExercises.p20MapsLambdaAndStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class p01CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                String tempString = String.valueOf(input.charAt(i));
                if (map.containsKey(tempString)) {
                    map.put(tempString, map.get(tempString) + 1);
                } else {
                    map.put(tempString, 1);
                }
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }


    }
}
