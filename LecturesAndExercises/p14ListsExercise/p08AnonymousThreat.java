package LecturesAndExercises.p14ListsExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class p08AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("3:1")) {
            String command = input.split("\\s+")[0];
            if (command.equals("merge")) {
                int startIndex = Integer.parseInt(input.split("\\s+")[1]);
                int endIndex = Integer.parseInt(input.split("\\s+")[2]);
                merge(startIndex, endIndex, list);
            } else if (command.equals("divide")) {
                int index = Integer.parseInt(input.split("\\s+")[1]);
                int partitions = Integer.parseInt(input.split("\\s+")[2]);
                divide(index, partitions, list);

            }
            input = scanner.nextLine();
        }
        for (String s : list) {
            System.out.print(s + " ");
        }


    }

    private static void divide(int index, int partitions, List<String> list) {
        String chars = list.get(index);
        int charInPartition = chars.length() / partitions;
        List<String> tempList = new ArrayList<>();
        for (int i = 0; i < chars.length(); i++) {
            String x = "" + chars.charAt(i);
            tempList.add(x);
        }
        List<String> finalList = new ArrayList<>();
        for (int i = 0; i < partitions - 1; i++) {
            String temp = "";
            for (int j = 0; j < charInPartition; j++) {
                temp += tempList.get(j);
            }
            for (int j = 0; j < charInPartition; j++) {
                tempList.remove(0);
            }
            finalList.add(temp);
        }
//        for (String s : tempList) {
//            finalList.add(s);
//        }
        String temp = "";
        for (String s : tempList) {
            temp += s;
        }
        finalList.add(temp);
        list.remove(index);
        for (int i = finalList.size() - 1; i >= 0; i--) {
            list.add(index, finalList.get(i));
        }


    }

    public static void merge(int startIndex, int endIndex, List<String> list) {
        if (startIndex < 0) {
            startIndex = 0;
        } else if (startIndex >= list.size()) {
            return;
        }
        if (endIndex >= list.size()) {
            endIndex = list.size() - 1;
        } else if (endIndex < 0) {
            return;
        }
        String temp = "";
        for (int i = startIndex; i <= endIndex; i++) {
            temp += list.get(i);
        }
        for (int i = startIndex; i <= endIndex; i++) {
            list.remove(startIndex);
        }
        list.add(startIndex, temp);
    }
}
