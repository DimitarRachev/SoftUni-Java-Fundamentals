package LecturesAndExercises.p13ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p04ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String command = input.split(" ")[0];
            if (command.equals("Add")) {
                int number = Integer.parseInt(input.split(" ")[1]);
                list.add(number);
            } else if (command.equals("Remove")) {
                int number = Integer.parseInt(input.split(" ")[1]);
               list.remove(Integer.valueOf(number));
            } else if (command.equals("RemoveAt")) {
                int index = Integer.parseInt(input.split(" ")[1]);
                list.remove(index);
            } else if (command.equals("Insert")) {
                int index = Integer.parseInt(input.split(" ")[2]);
                int number = Integer.parseInt(input.split(" ")[1]);
                list.add(index, number);
            }
            input = scanner.nextLine();
        }
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }



}
