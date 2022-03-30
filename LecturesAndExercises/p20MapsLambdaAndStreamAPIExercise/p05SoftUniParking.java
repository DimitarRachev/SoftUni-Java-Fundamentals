package LecturesAndExercises.p20MapsLambdaAndStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class p05SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> register = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String command = input[0];

            if (command.equals("register")) {
                String name = input[1];
                String plate = input[2];
                if (register.containsKey(name)) {
                    System.out.println("ERROR: already registered with plate number " + register.get(name));
                } else {
                    register.put(name, plate);
                    System.out.printf("%s registered %s successfully%n", name, plate);
                }
            } else if (command.equals("unregister")) {
                String name = input[1];
                if (register.containsKey(name)) {
                    register.remove(name);
                    System.out.printf("%s unregistered successfully%n", name);
                } else {
                    System.out.printf("ERROR: user %s not found%n", name);
                }
            }
        }

        for (Map.Entry<String, String> entry : register.entrySet()) {
            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());
        }

    }
}
