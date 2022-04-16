package LecturesAndExercises.p13ListsLab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p01SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> list = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                list.set(i +1, list.get(i) * 2);
                list.remove(i);
                i = -1;
            }
        }
        System.out.println(joinElementsByDelimiter(list, " "));

    }
    public static String joinElementsByDelimiter(List<Double> list, String delimiter) {
        String output = "";
        for (Double aDouble : list) {
            output += (new DecimalFormat("0.#").format(aDouble) + delimiter);
        }
        return output;

    }
}
