package LecturesAndExercises.p15ListsMoreExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p03TakeSkipRope {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Character> nums = new ArrayList<>();
        List<Character> chars = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            char tmp = input.charAt(i);
            if (tmp >= 48 && tmp <= 57) {
                nums.add(tmp);
            } else {
                chars.add(tmp);
            }
        }
        List<Integer> take = new ArrayList<>();
        List<Integer> skip = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            int tmp = Integer.parseInt(String.valueOf(nums.get(i)));
            if (i % 2 == 0) {
                take.add(tmp);
            } else {
                skip.add(tmp);
            }
        }
        List<Character> finalList = new ArrayList<>();
        for (int i = 0; i < take.size(); i++) {
            int takeChars = take.get(i);
            if (takeChars > chars.size()) {
                takeChars = chars.size();
            }
            int skipChars = skip.get(i);
            for (int j = 0; j < takeChars ; j++) {
                finalList.add(chars.get(j));
            }
            for (int j = 0; j < takeChars; j++) {
                chars.remove(0);
            }
            if (skipChars > chars.size()) {
                skipChars = chars.size();
            }
            for (int j = 0; j < skipChars; j++) {
                chars.remove(0);
            }
        }
        for (Character character : finalList) {
            System.out.print(character);
        }


    }
}
