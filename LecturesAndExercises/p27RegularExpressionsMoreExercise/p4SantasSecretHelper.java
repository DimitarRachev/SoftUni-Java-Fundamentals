package LecturesAndExercises.p27RegularExpressionsMoreExercise;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p4SantasSecretHelper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());

        StringBuilder output = new StringBuilder();
        String line;
        while (!"end".equals(line = scanner.nextLine())) {
            String input = decode(line, key);

            Pattern pattern = Pattern.compile("@(?<name>[A-Za-z]+)[^@!:>-]*(?<behavior>![G]!)");
            Matcher matcher = pattern.matcher(input);

            while (matcher.find()) {
                String name = matcher.group("name");
                String behavior = matcher.group("behavior");
                if (behavior.equals("!G!")) {
                    output.append(name).append(System.lineSeparator());
                }
            }
        }
        System.out.println(output);

    }

    private static String decode(String line, int n) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
            output.append((char)(line.charAt(i) - n));
        }
        return output.toString();
    }
}
