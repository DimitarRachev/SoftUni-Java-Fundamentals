package LecturesAndExercises.p14ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p05BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();
        int bomb = Integer.parseInt(input.split("\\s+")[0]);
        while (list.contains(bomb)) {
            int power = Integer.parseInt(input.split("\\s+")[1]);
            int begin = list.indexOf(bomb) - power;
            if (begin < 0) {
                begin = 0;
            }
            int end = list.indexOf(bomb) + power;
            if (end > list.size() - 1) {
                end = list.size() - 1;
            }
            for (int i = end; i >= begin; i--) {
                list.remove(i);
            }
        }
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        System.out.println(sum);

    }
}
