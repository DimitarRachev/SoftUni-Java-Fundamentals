package LecturesAndExercises.p15ListsMoreExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p02CarRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> track = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        double leftCar = 0;
        for (int i = 0; i < track.size() / 2; i++) {
            int stage = track.get(i);
            if (stage == 0) {
                leftCar *= 0.8;
            } else {
                leftCar += stage;
            }
        }
        double rightCar = 0;
        for (int i = track.size() - 1; i > track.size() / 2 ; i--) {
            int stage = track.get(i);
            if (stage == 0) {
                rightCar *= 0.8;
            } else {
                rightCar += stage;
            }
        }
        if (rightCar < leftCar) {
            System.out.printf("The winner is right with total time: %.1f", rightCar);
        } else {
            System.out.printf("The winner is left with total time: %.1f", leftCar);
        }
    }
}
