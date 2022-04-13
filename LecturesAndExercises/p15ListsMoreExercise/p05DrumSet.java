package LecturesAndExercises.p15ListsMoreExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p05DrumSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double savings = Double.parseDouble(scanner.nextLine());
        List<Integer> InitialDrumSet = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> drumSet = new ArrayList<>();
        for (Integer integer : InitialDrumSet) {
            drumSet.add(integer);
        }

        String input = scanner.nextLine();
        while (!input.equals("Hit it again, Gabsy!")) {
            int power = Integer.parseInt(input);
            for (int i = 0; i < drumSet.size(); i++) {
                drumSet.set(i, drumSet.get(i) - power);
                if (drumSet.get(i) <= 0) {
                    int price = InitialDrumSet.get(i) * 3;
                    if (price <= savings) {
                        savings -= price;
                        drumSet.set(i, InitialDrumSet.get(i));
                    } else {
                        int last = drumSet.size() -1;
                        drumSet.remove(i);
                        InitialDrumSet.remove(i);
                        if (i != last) {
                            i--;
                        }
                    }
                }
            }
            input = scanner.nextLine();
        }

        for (Integer integer : drumSet) {
            System.out.print(integer + " ");
        }
        System.out.println();
        System.out.printf("Gabsy has %.2flv.", savings);

    }
}
