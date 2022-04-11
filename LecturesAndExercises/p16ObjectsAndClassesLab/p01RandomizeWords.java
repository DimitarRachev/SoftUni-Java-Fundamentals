package LecturesAndExercises.p16ObjectsAndClassesLab;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p01RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rdn = new Random();
        List<String> list = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        int iterator = list.size();
        for (int i = 0; i < iterator; i++) {
            String next = list.get(rdn.nextInt(list.size()));
            System.out.println(next);
            list.remove(next);
        }

    }
}
