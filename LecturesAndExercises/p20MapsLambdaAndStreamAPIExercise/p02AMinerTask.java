package LecturesAndExercises.p20MapsLambdaAndStreamAPIExercise;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class p02AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        Map<String, Integer> map = new LinkedHashMap<>();


        while (!"stop".equals(input = scanner.nextLine())) {

            String key = input;
            int quantity = Integer.parseInt(scanner.nextLine());
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + quantity);
            } else {
                map.put(key, quantity);
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }

    }
}
