package LecturesAndExercises.p27RegularExpressionsMoreExercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p2RageQuit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern pattern = Pattern.compile("(?<str>[^\\d]+)(?<n>\\d+)");
        Matcher matcher = pattern.matcher(scanner.nextLine());
        StringBuilder output = new StringBuilder();
        Set<Character> chars = new HashSet<>();
        while (matcher.find()) {

            String str = matcher.group("str").toUpperCase(Locale.ROOT);
            int n = Integer.parseInt(matcher.group("n"));
            if (n == 0) {
                continue;
            }
            while ( n-- > 0) {
                output.append(str);
            }
            for (char c : str.toCharArray()) {
                chars.add(c);
            }
        }

        System.out.println("Unique symbols used: " + chars.size());
        System.out.println(output);
    }
}
