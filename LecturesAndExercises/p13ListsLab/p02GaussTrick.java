package LecturesAndExercises.p13ListsLab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p02GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> list = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());
        int iterator = list.size() / 2;
        for (int i = 0; i < iterator; i++) {
            double sum = list.get(i) + list.get(list.size() -1);
            list.set(i, sum);
            list.remove(list.size() -1);
        }
        System.out.print(joinElementsByDelimiter(list, " "));
    }
    public static String joinElementsByDelimiter(List<Double> list, String delimiter) {
        String output = "";
        for (Double aDouble : list) {
            output += (new DecimalFormat("0.#").format(aDouble) + delimiter);
        }
        return output;

    }
}
