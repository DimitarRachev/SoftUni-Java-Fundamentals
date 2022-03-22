package LecturesAndExercises.p26RegularExpressionsExercises;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p02Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] participants = scanner.nextLine().split(", ");
        Map<String, Integer> map = new LinkedHashMap<>();
        for (String s : participants) {
            map.put(s, 0);
        }

        String input;
        String regexName = "";
        String regexDistance = "";

        while (!"end of race".equals(input = scanner.nextLine())) {
            StringBuilder name = new StringBuilder();
            int distance = 0;
            Pattern namePattern = Pattern.compile("[A-Za-z]");
            Matcher nameMatcher = namePattern.matcher(input);
            while (nameMatcher.find()) {
                name.append(nameMatcher.group());
            }
            Pattern distancePatters = Pattern.compile("\\d");
            Matcher distanceMatcher = distancePatters.matcher(input);
            while (distanceMatcher.find()) {
                distance += Integer.parseInt(distanceMatcher.group());
            }
            if (map.containsKey(name.toString())) {
                map.put(name.toString(), map.get(name.toString()) + distance);
            }
        }
        Map<String, Integer> map1 = new LinkedHashMap<>();
        map.entrySet().stream().sorted((Map.Entry.comparingByValue(Comparator.reverseOrder()))).limit(3).forEach(x -> map1.put(x.getKey(), x.getValue()));
            int counter = 0;
        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            String[] pointer = {"1st place: ", "2nd place: ", "3rd place: "};
            System.out.printf("%s%s%n", pointer[counter], entry.getKey());
            counter++;
        }

    }
}
