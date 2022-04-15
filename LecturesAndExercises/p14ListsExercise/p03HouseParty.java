package LecturesAndExercises.p14ListsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p03HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numCommands = Integer.parseInt(scanner.nextLine());
        List<String> list = new ArrayList<>();
        for (int i = 0; i < numCommands; i++) {
            String input = scanner.nextLine();
            String name = input.split(" ")[0];
            String status = input.split(" ")[2];
            if (status.equals("going!")) {
                if (list.contains(name)) {
                    System.out.printf("%s is already in the list!%n", name);
                } else {
                    list.add(name);
                }
            } else if (status.equals("not")) {
                if (!list.contains(name)) {
                    System.out.printf("%s is not in the list!%n", name);
                } else {
                    list.remove(name);
                }
            }
        }
        for (String s : list) {
            System.out.println(s);
        }

    }
}
