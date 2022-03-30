package LecturesAndExercises.p20MapsLambdaAndStreamAPIExercise;

import java.util.*;

public class p07StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> map = new LinkedHashMap<>();

        populateMap(scanner, n, map);
        Map<String, Double> average = new LinkedHashMap<>();
        extractAverageMap(map, average);

        printMap(average);


    }

    private static void printMap(Map<String, Double> average) {
        for (Map.Entry<String, Double> entry : average.entrySet()) {
            System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue());
        }
    }

    private static void extractAverageMap(Map<String, List<Double>> map, Map<String, Double> average) {
        for (Map.Entry<String, List<Double>> entry : map.entrySet()) {
            List<Double> tmp = entry.getValue();
//            double sum = 0;
//            for (Double grade : tmp) {
//                sum += grade;
//            }
//            sum = sum / tmp.size();
//          double sum = tmp.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
            double sum = tmp.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);

            if (sum >= 4.50) {
                average.put(entry.getKey(), sum);
            }
        }
    }

    private static void populateMap(Scanner scanner, int n, Map<String, List<Double>> map) {
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            if (map.containsKey(name)) {
                List<Double> tmp = map.get(name);
                tmp.add(grade);
                map.put(name,tmp);
            } else {
                List<Double> tmp = new ArrayList<>();
                tmp.add(grade);
                map.put(name,tmp);
            }
        }
    }
}
