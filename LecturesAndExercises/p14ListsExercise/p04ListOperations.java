package LecturesAndExercises.p14ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p04ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String command = input.split("\\s+")[0];
            if (command.equals("Add")) {
                int number = Integer.parseInt(input.split("\\s+")[1]);
                list.add(number);
            } else if (command.equals("Insert")) {
                int number = Integer.parseInt(input.split("\\s+")[1]);
                int index = Integer.parseInt(input.split("\\s+")[2]);
                if (index < 0 || index >= list.size()) {
                    System.out.println("Invalid index");
                } else {
                    list.add(index, number);
                }
            } else if (command.equals("Remove")) {
                int index = Integer.parseInt(input.split("\\s+")[1]);
                if (index < 0 || index >= list.size()) {
                    System.out.println("Invalid index");
                } else {
                    list.remove(index);
                }
            } else if (command.equals("Shift")) {
                String secondCommand = input.split("\\s+")[1];
                int count = Integer.parseInt(input.split("\\s+")[2]);
                shift(secondCommand, count, list);
            }
            input = scanner.nextLine();
        }
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }

    }

    public static void shift(String command, int count, List<Integer> list) {
        if (command.equals("left")) {
            for (int i = 0; i < count; i++) {
                int temp = list.get(0);
                for (int j = 0; j < list.size() - 1; j++) {
                    list.set(j, list.get(j+1));
                }
                list.set(list.size() -1,temp);
            }
        } else if (command.equals("right")) {
            for (int i = 0; i < count; i++) {
                int temp = list.get(list.size() -1);
                for (int j = list.size() -1; j > 0 ; j--) {
                    list.set(j, list.get(j -1));
                }
                list.set(0, temp);
            }
        }

    }
}
