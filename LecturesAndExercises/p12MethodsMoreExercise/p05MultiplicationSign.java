package LecturesAndExercises.p12MethodsMoreExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p05MultiplicationSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();
        nums.add(Integer.parseInt(scanner.nextLine()));
        nums.add(Integer.parseInt(scanner.nextLine()));
        nums.add(Integer.parseInt(scanner.nextLine()));
        if (nums.get(0) == 0 || nums.get(1) == 0 || nums.get(2) == 0) {
            System.out.printf("zero");
        } else if (checkSign(nums)) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }
    }

    private static boolean checkSign(List<Integer> nums) {
        boolean isPositive = true;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) == 0) {
                isPositive = true;
                break;
            } else if (nums.get(i) < 0) {
                isPositive = !isPositive;
            }
        }
        return isPositive;
    }

}
