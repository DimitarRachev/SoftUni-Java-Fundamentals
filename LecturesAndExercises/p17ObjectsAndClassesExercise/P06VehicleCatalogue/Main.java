package LecturesAndExercises.p17ObjectsAndClassesExercise.P06VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        List<Vehicle> vehicles = new ArrayList<>();
         while (!"End".equals(input = sc.nextLine())) {
            String[] data = input.split(" ");
            Vehicle tpm = new Vehicle(data[0], data[1], data[2], Integer.parseInt(data[3]));
            vehicles.add(tpm);
        }
         String in;
        while (!"Close the Catalogue".equals(in = sc.nextLine())) {
            for (int i = 0; i < vehicles.size(); i++) {
                if (vehicles.get(i).getModel().equals(in)) {
                    if (vehicles.get(i).getType().equals("car")) {
                        System.out.println("Type: Car");

                    } else {
                        System.out.println("Type: Truck");

                    }
                    System.out.println("Model: " + vehicles.get(i).getModel());
                    System.out.println("Color: " + vehicles.get(i).getColor());
                    System.out.println("Horsepower: " + vehicles.get(i).getHp());
                    break;
                }
            }
        }
        int cars = 0, trucks = 0, carsHp =0, trucksHp = 0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getType().equals("car")) {
                cars++;
                carsHp += vehicle.getHp();
            } else {
                trucks++;
                trucksHp += vehicle.getHp();
            }
        }
        double truckAverageHp = (double)trucksHp / trucks;
        if (trucks == 0 ) {
            truckAverageHp = 0.00;
        }
         double carsAverageHp = (double) carsHp / cars;
        if (cars == 0) {
            carsAverageHp = 0.00;
        }
        System.out.printf("Cars have average horsepower of: %.2f.%n", carsAverageHp);
        System.out.printf("Trucks have average horsepower of: %.2f.", truckAverageHp);
    }
}
