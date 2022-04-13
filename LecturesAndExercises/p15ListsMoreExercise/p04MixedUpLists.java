package LecturesAndExercises.p15ListsMoreExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p04MixedUpLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list1 = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> parameters = new ArrayList<>();
        if (list1.size() > list2.size()) {
            parameters = takeParameters(list1);
        } else {
            parameters = takeParameters2(list2);
        }
        int start = parameters.stream().min(Integer::compare).get();
        int end = parameters.stream().max(Integer::compare).get();
        List<Integer> combinedList = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            combinedList.add(list1.get(i));
            combinedList.add(list2.get(list2.size() - 1 - i));
        }
        List<Integer> finalList = new ArrayList<>();
        for (int i = 0; i < combinedList.size(); i++) {
            if (combinedList.get(i) > start && combinedList.get(i) < end) {
                finalList.add(combinedList.get(i));
            }
        }
        finalList.sort(Integer::compare);
        for (Integer integer : finalList) {
            System.out.print(integer + " ");
        }

    }

    private static List<Integer> takeParameters2(List<Integer> list) {
        List<Integer> tmp = new ArrayList<>();
        tmp.add(list.get(0));
        tmp.add(list.get(1));
        list.remove(0);
        list.remove(0);
        return tmp;
    }

    private static List<Integer> takeParameters(List<Integer> list) {
        List<Integer> tmp = new ArrayList<>();
        tmp.add(list.get(list.size() - 1));
        tmp.add(list.get(list.size() - 2));
        list.remove(list.size() - 1);
        list.remove(list.size() - 1);
        return tmp;
    }
}
