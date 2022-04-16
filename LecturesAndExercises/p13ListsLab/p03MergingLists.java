package LecturesAndExercises.p13ListsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p03MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list1 = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> result = new ArrayList<>();
        int iterator = 0, lastIndex = 0;
        boolean is1Bigger = true;
        if (list1.size() >= list2.size()) {
            iterator = list2.size();
            //rest = list1.size() - list2.size();
        } else {
            iterator = list1.size();
            is1Bigger = false;
            //rest = list2.size() - list1.size();
        }
        for (int i = 0; i < iterator; i++) {
            lastIndex = i;
            result.add(list1.get(i));
            result.add(list2.get(i));
        }
        if (is1Bigger) {
            for (int i = lastIndex + 1; i < list1.size(); i++) {
                result.add(list1.get(i));
            }
        } else {
            for (int i = lastIndex + 1; i < list2.size(); i++) {
                result.add(list2.get(i));
            }
        }
        for (Integer integer : result) {
            System.out.print(integer + " ");
        }

    }
}
