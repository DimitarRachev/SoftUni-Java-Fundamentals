package LecturesAndExercises.p14ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p10SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("course start")) {
            String command = input.split(":")[0];
            if (command.equals("Add")) {
                String lessonTitle = input.split(":")[1];
                add(lessonTitle, list);
            } else if (command.equals("Insert")) {
                String lessonTitle = input.split(":")[1];
                int index = Integer.parseInt(input.split(":")[2]);
                insert(index, lessonTitle, list);
            } else if (command.equals("Remove")) {
                String lessonTitle = input.split(":")[1];
                remove(lessonTitle, list);
            } else if (command.equals("Swap")) {
                String lessonTitle1 = input.split(":")[1];
                String lessonTitle2 = input.split(":")[2];
                swap(lessonTitle1, lessonTitle2, list);
            } else if (command.equals("Exercise")) {
                String lessonTitle = input.split(":")[1];
                exercise(lessonTitle, list);

            }


            input = scanner.nextLine();
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%d.%s%n", i + 1, list.get(i));
        }
    }

    private static void exercise(String lessonTitle, List<String> list) {
        if (!list.contains(lessonTitle)) {
            list.add(lessonTitle);
            String temp = lessonTitle + "-Exercise";
            list.add(temp);
        } else {
            String temp = lessonTitle + "-Exercise";
            if (!list.contains(temp)) {
                int index = list.indexOf(lessonTitle);
                list.add(index + 1, temp);
            }
        }
    }

    private static void swap(String lessonTitle1, String lessonTitle2, List<String> list) {
        if (list.contains(lessonTitle1) && list.contains(lessonTitle2)) {
            String swapTemp = lessonTitle1;
            int tempIndex = list.indexOf(lessonTitle2);
            list.set(list.indexOf(lessonTitle1), lessonTitle2);
            list.set(tempIndex, swapTemp);
            String temp1 = lessonTitle1 + "-Exercise";
            if (list.contains(temp1)) {
                int index = list.indexOf(temp1);
                list.remove(index);
                list.add(list.indexOf(lessonTitle1) + 1, temp1);
            }
            String temp2 = lessonTitle2 + "-Exercise";
            if (list.contains(temp2)) {
                int index = list.indexOf(temp2);
                list.remove(index);
                list.add(list.indexOf(lessonTitle2) + 1, temp2);
            }
        }
    }

    private static void remove(String lessonTitle, List<String> list) {
        if (list.contains(lessonTitle)) {
            list.remove(lessonTitle);
        }
    }

    private static void insert(int index, String lessonTitle, List<String> list) {
        if (!list.contains(lessonTitle)) {
            list.add(index, lessonTitle);
        }
    }

    private static void add(String lessonTitle, List<String> list) {
        if (!list.contains(lessonTitle)) {
            list.add(lessonTitle);
        }

    }
}
