package FinalExamPreparation.p03ProgrammingFundamentalsFinalExamRetake;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class p03NeedforSpeedIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Car> cars = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            String[] input = scanner.nextLine().split("\\|");
            String name = input[0];
            int mileage = Integer.parseInt(input[1]);
            int fuel = Integer.parseInt(input[2]);
            cars.put(name, new Car(name, mileage, fuel));
        }

        String line;
        while (!"Stop".equals(line = scanner.nextLine())) {
            String[] input = line.split(" : ");
            String command = input[0];
            String car = input[1];

            if (command.equals("Drive")) {
                int distance = Integer.parseInt(input[2]);
                int fuel = Integer.parseInt(input[3]);
                drive(cars.get(car), distance, fuel);
                if (cars.get(car).getMileage() >= 100_000) {
                    System.out.println("Time to sell the " + car + "!");
                    cars.remove(car);
                }

            } else if (command.equals("Refuel")) {
                int fuel = Integer.parseInt(input[2]);
                refuel(cars.get(car), fuel);
            } else if (command.equals("Revert")) {
                int kms = Integer.parseInt(input[2]);
                revert(cars.get(car), kms);
            }
        }
        cars.values().forEach(System.out::println);
    }

    private static void revert(Car car, int kms) {
        if (car.getMileage() - kms < 10_000) {
            car.setMileage(10_000);
        } else {
            car.setMileage(car.getMileage() - kms);
            System.out.printf("%s mileage decreased by %d kilometers%n", car.getName(), kms);
        }
    }

    private static void refuel(Car car, int fuel) {
        if (car.getFuel() + fuel > 75) {
            fuel = 75 - car.getFuel();
        }
        car.setFuel(car.getFuel() + fuel);
        System.out.printf("%s refueled with %d liters%n", car.getName(), fuel);
    }

    private static void drive(Car car, int distance, int fuel) {
        if (fuel > car.getFuel()) {
            System.out.println("Not enough fuel to make that ride");
        } else {
            car.setMileage(car.getMileage() + distance);
            car.setFuel(car.getFuel() - fuel);
            System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", car.getName(), distance, fuel);
        }
    }

    static class Car {
        private String name;
        private int mileage;
        private int fuel;

        public Car(String name, int mileage, int fuel) {
            this.name = name;
            this.mileage = mileage;
            this.fuel = fuel;
        }

        public String getName() {
            return name;
        }

        public int getMileage() {
            return mileage;
        }

        public int getFuel() {
            return fuel;
        }

        public void setMileage(int mileage) {
            this.mileage = mileage;
        }

        public void setFuel(int fuel) {
            this.fuel = fuel;
        }

        @Override
        public String toString() {
            return String.format("%s -> Mileage: %d kms, Fuel in the tank: %d lt.", this.name, this.mileage, this.fuel);
        }
    }
}
