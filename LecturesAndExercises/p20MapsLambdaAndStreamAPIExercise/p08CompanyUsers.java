package LecturesAndExercises.p20MapsLambdaAndStreamAPIExercise;

import java.util.*;

public class p08CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> map = new LinkedHashMap<>();
        String input;

        while (!"End".equals(input = scanner.nextLine())) {
            String company = input.split(" -> ")[0];
            String employee = input.split(" -> ")[1];

            populateMap(map, company, employee);
        }
        printMap(map);

    }

    private static void printMap(Map<String, List<String>> map) {
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            List<String> tmp = entry.getValue();
            for (String s : tmp) {
                System.out.println("-- " + s);
            }

        }
    }

    private static void populateMap(Map<String, List<String>> map, String company, String employee) {
        List<String> tmp;
        if (map.containsKey(company)) {
            tmp = map.get(company);
            if (!tmp.contains(employee)) {
                tmp.add(employee);
                map.put(company, tmp);
            }
        } else {
            tmp = new ArrayList<>();
            tmp.add(employee);
            map.put(company, tmp);
        }
    }
}
