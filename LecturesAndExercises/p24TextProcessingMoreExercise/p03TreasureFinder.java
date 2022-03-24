package LecturesAndExercises.p24TextProcessingMoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class p03TreasureFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] keys = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        String text;

        while (!"find".equals(text = scanner.nextLine())) {
            StringBuilder result = new StringBuilder();
            int j = 0;
            for (int i = 0; i < text.length(); i++) {
                if (j == keys.length) {
                    j = 0;
                }
              result.append((char)(text.charAt(i) - keys[j]));
              j++;
            }

            String item = result.substring(result.indexOf("&") + 1, result.lastIndexOf("&"));
            String location = result.substring(result.indexOf("<") + 1, result.indexOf(">"));
            System.out.printf("Found %s at %s%n", item, location);

        }

    }
}
