package LecturesAndExercises.p14ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> train = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String command = input.split(" ")[0];
            if (command.equals("Add")) {
                int passengers = Integer.parseInt(input.split(" ")[1]);
                train.add(passengers);
            } else {
                int passengers = Integer.parseInt(input);
                for (int i = 0; i < train.size(); i++) {
                    int newNum = train.get(i) + passengers;
                    if (newNum <= maxCapacity) {
                        train.set(i, newNum);
                        break;
                    }
                }
            }

            input = scanner.nextLine();
        }
        for (Integer integer : train) {
            System.out.print(integer + " ");
        }

    }
}
