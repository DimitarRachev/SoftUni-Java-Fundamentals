package LecturesAndExercises.p18ObjectsAndClassesMoreExercise.P03CarSalesman;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Engine> engines = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<String> input = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
            String model = input.get(0);
            int power = Integer.parseInt(input.get(1));
            input.remove(0);
            input.remove(0);
            String displacement = "n/a";
            String efficiency = "n/a";
            while (input.size() > 0) {
                String next = input.get(0);
                if (next.charAt(0) >= 48 && next.charAt(0) <= 57) {
                    displacement = next;
                } else {
                    efficiency = next;
                }
                input.remove(0);
            }
            Engine tmp = new Engine(model, power, displacement, efficiency);
            engines.add(tmp);
        }
        int m = Integer.parseInt(scanner.nextLine());
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            List<String> input = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
            String model = input.get(0);
            String en = input.get(1);
            Engine engine = findEngine(en, engines);
            input.remove(0);
            input.remove(0);
            String weight = "n/a";
            String color = "n/a";
            while (input.size() > 0) {
                String next = input.get(0);
                if (next.charAt(0) >= 48 && next.charAt(0) <= 57) {
                    weight = next;
                } else {
                    color = next;
                }
                input.remove(0);
            }
            Car tmp = new Car(model, engine, weight, color);
            cars.add(tmp);
        }

        for (Car car : cars) {
            System.out.printf("%s:%n", car.getModel());
            System.out.printf("  %s:%n", car.getEngine().getModel());
            System.out.printf("    Power: %s%n", car.getEngine().getPower());
            System.out.printf("    Displacement: %s%n", car.getEngine().getDisplacement());
            System.out.printf("    Efficiency: %s%n", car.getEngine().getEfficiency());
            System.out.printf("  Weight: %s%n", car.getWeight());
            System.out.printf("  Color: %s%n", car.getColor());
        }



    }

    private static Engine findEngine(String en, List<Engine> engines) {
        for (Engine engine : engines) {
            if (engine.getModel().equals(en)) {
                return engine;
            }
        }
        return null;
    }

}
