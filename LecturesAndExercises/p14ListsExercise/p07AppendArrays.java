package LecturesAndExercises.p14ListsExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p07AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> initialList = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        for (int i = 0; i < initialList.size() / 2; i++) {
            String first = initialList.get(i);
            String second = initialList.get(initialList.size() -1 -i);
            initialList.set(i, second);
            initialList.set(initialList.size() -1 -i, first);
        }

    List<String> finalList = new ArrayList<>();
        for (String s : initialList) {
            List<String> tempList = Arrays.stream(s.split("\\s+")).collect(Collectors.toList());
            for (String s1 : tempList) {
                if (!s1.equals("")) {

                    finalList.add(s1);
                }
            }
        }
        for (String s : finalList) {
            System.out.print(s + " ");
        }

    }
}
