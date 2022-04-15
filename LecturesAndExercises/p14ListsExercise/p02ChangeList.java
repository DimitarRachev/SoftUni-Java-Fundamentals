package LecturesAndExercises.p14ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String command = input.split(" ")[0];
            if (command.equals("Delete")) {
                int element = Integer.parseInt(input.split(" ")[1]);
                list.removeIf(n -> n == element);
            } else if (command.equals("Insert")) {
                int element = Integer.parseInt(input.split(" ")[1]);
                int position = Integer.parseInt(input.split(" ")[2]);
                list.add(position, element);
            }
            input = scanner.nextLine();
        }
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }

    }
}
