package LecturesAndExercises.p18ObjectsAndClassesMoreExercise.P02RawData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Car> cars = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String model = input[0];
            int speed = Integer.parseInt(input[1]);
            int power = Integer.parseInt(input[2]);
            int weight = Integer.parseInt(input[3]);
            String type = input[4];
            double p1 = Double.parseDouble(input[5]);
            int a1 = Integer.parseInt(input[6]);
            double p2 = Double.parseDouble(input[7]);
            int a2 = Integer.parseInt(input[8]);
            double p3 = Double.parseDouble(input[9]);
            int a3 = Integer.parseInt(input[10]);
            double p4 = Double.parseDouble(input[11]);
            int a4 = Integer.parseInt(input[12]);
            Car tmp = new Car(model, speed, power, weight, type, p1, a1, p2, a2, p3, a3, p4, a4);
            cars.add(tmp);
        }
        String check = scanner.nextLine();

       List<Car> searchList = new ArrayList<>();
        if (check.equals("fragile")) {
            for (Car x : cars) {
                if (x.getCargo().getType().equals("fragile")) {
                    for (Car.Tyre tyre : x.tyreSet) {
                        if (tyre.getPressure() < 1) {
                            searchList.add(x);
                            break;
                        }
                    }

                }
            }

        } else {
            for (Car x : cars) {
                if (x.getCargo().getType().equals(check)) {
                    if (x.getEngine().getPower() > 250) {
                        searchList.add(x);
                    }
                }
            }

        }
        for (Car car : searchList) {
            System.out.println(car.getModel());
        }

    }
}
