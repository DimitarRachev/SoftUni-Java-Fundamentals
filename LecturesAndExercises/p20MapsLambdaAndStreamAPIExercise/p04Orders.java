package LecturesAndExercises.p20MapsLambdaAndStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class p04Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String , double[]> map = new LinkedHashMap<>();
        String input;

        while (!"buy".equals(input = scanner.nextLine())) {
            double[] tempArray = new double[2];
            String key = input.split("\\s+")[0];
            tempArray[0] = Double.parseDouble(input.split("\\s+")[1]);
            tempArray[1] = Double.parseDouble(input.split("\\s+")[2]);

            if (map.containsKey(key)) {
                double[] tmp = {tempArray[0],map.get(key)[1] + tempArray[1]};
                map.put(key,tmp);
            } else {
                map.put(key, tempArray);
            }
        }

        for (Map.Entry<String, double[]> entry : map.entrySet()) {
            System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()[0] * entry.getValue()[1]);
        }

    }
}
