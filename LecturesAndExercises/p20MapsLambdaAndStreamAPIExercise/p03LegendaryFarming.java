package LecturesAndExercises.p20MapsLambdaAndStreamAPIExercise;

import java.util.*;
import java.util.stream.Collectors;

public class p03LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("shards", 0);
        map.put("fragments", 0);
        map.put("motes", 0);

        while (true){
            List<String> input = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
            List<Integer> quantity = new ArrayList<>();
            List<String> items = new ArrayList<>();

            while (input.size() > 0) {
                quantity.add(Integer.parseInt(input.get(0)));
                items.add(input.get(1).toLowerCase(Locale.ROOT));
                input.remove(0);
                input.remove(0);
            }
            int end = items.size();
            for (int i = 0; i < end; i++) {
                if (map.containsKey(items.get(0))) {
                    map.put(items.get(0), map.get(items.get(0)) + quantity.get(0));
                } else {
                    map.put(items.get(0), quantity.get(0));
                }
                items.remove(0);
                quantity.remove(0);


                if (map.get("shards") >= 250) {
                    map.put("shards", map.get("shards") - 250);
                    System.out.println("Shadowmourne obtained!");
                    printMap(map);
                    return;
                }

                if (map.get("fragments") >= 250) {
                    map.put("fragments", map.get("fragments") - 250);
                    System.out.println("Valanyr obtained!");
                    printMap(map);
                    return;
                }

                if (map.get("motes") >= 250) {
                    map.put("motes", map.get("motes") - 250);
                    System.out.println("Dragonwrath obtained!");
                    printMap(map);
                    return;
                }
            }
        }

    }

    private static void printMap(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        }

    }
}
