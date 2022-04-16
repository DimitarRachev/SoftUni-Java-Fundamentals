package LecturesAndExercises.p13ListsLab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p07RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
//        for (int integer = 0; integer < list.size(); integer++) {
//            if (list.get(integer) < 0) {
//                list.remove(integer);
//                integer--;
//            }
//        }
//        if (list.size() == 0) {
//            System.out.println("empty");
//        } else {
//            for (int i = list.size() - 1; i >= 0; i--) {
//                System.out.print(list.get(i) + " ");
//            }
//        }
        list.removeIf(n -> n < 0);
        Collections.reverse(list);
        if (list.isEmpty()) {
            System.out.println("empty");
        } else {
            System.out.println(list.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}
