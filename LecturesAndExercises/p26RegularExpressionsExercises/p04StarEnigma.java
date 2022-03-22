package LecturesAndExercises.p26RegularExpressionsExercises;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p04StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> result = new LinkedHashMap<>();
        {
            List<String> temp = new ArrayList<>();
            List<String> temp1 = new ArrayList<>();
            result.put("A", temp);
            result.put("D", temp1);
        }
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            StringBuilder count = new StringBuilder();
            Pattern countPattern = Pattern.compile("[starSTAR]");
            Matcher countMatcher = countPattern.matcher(input);
            while (countMatcher.find()) {
                count.append(countMatcher.group());
            }
            int key = count.length();
            StringBuilder decryptedMassage = new StringBuilder();
            for (int j = 0; j < input.length(); j++) {
                decryptedMassage.append((char)(input.charAt(j) - key));
            }
            Pattern pattern = Pattern.compile("@(?<planet>[A-Za-z]+)[^@\\-!:>]*:(?<population>\\d+)[^@\\-!:>]*!(?<attackType>[AD])![^@\\-!:>]*->(?<soldiers>\\d+)");
            Matcher matcher = pattern.matcher(decryptedMassage.toString());
            while (matcher.find()){
                String planet = matcher.group("planet");
                String attackType = matcher.group("attackType");
                int population = Integer.parseInt(matcher.group("population"));
                int soldiers = Integer.parseInt(matcher.group("soldiers"));
                List<String> temp = result.get(attackType);
                temp.add(planet);
                result.put(attackType, temp);
            }
        }
        List<String> attacked = result.get("A");
        Collections.sort(attacked);
        List<String> destroyed = result.get("D");
        Collections.sort(destroyed);
        System.out.printf("Attacked planets: %d%n", attacked.size());
        for (String s : attacked) {
            System.out.printf("-> %s%n", s);
        }
        System.out.printf("Destroyed planets: %s%n", destroyed.size());
        for (String s : destroyed) {
            System.out.printf("-> %s%n", s);
        }


    }
}
