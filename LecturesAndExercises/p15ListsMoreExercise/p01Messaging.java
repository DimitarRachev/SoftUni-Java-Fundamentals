package LecturesAndExercises.p15ListsMoreExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p01Messaging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nums = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        String text = scanner.nextLine();
        List<Character> chars = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            chars.add(text.charAt(i));
        }
        List<Integer> sums = new ArrayList<>();
        List<String> finalList = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            int sum = 0;
            for (int j = 0; j < nums.get(i).length(); j++) {
                sum += Integer.parseInt(Character.toString(nums.get(i).charAt(j)));
            }
            //add to list with sums
            sums.add(sum);
        }
        for (int i = 0; i < sums.size(); i++) {
            int index = sums.get(i);
            while (index >= chars.size()) {
                index -= chars.size();
            }
            finalList.add(String.valueOf(chars.get(index)));
            chars.remove(index);
        }
        for (int i = 0; i < finalList.size(); i++) {
            System.out.print(finalList.get(i));
        }
    }
}
