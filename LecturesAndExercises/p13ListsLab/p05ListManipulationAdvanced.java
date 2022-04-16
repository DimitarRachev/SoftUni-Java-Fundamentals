package LecturesAndExercises.p13ListsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p05ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//     List<String> x =Arrays.stream(sc.nextLine().split(" ")).collect(Collectors.toList());
//     List<Integer> list = new ArrayList<>();
//        for (String s : x) {
//           int num = Integer.parseInt(s);
//            list.add(num);
//        }

       List<Integer> list = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String input = sc.nextLine();
        while (!input.equals("end")) {
            String command = input.split(" ")[0];

            if (command.equals("Contains")) {
                int number = Integer.parseInt(input.split(" ")[1]);
                contains(number, list);
            } else if (command.equals("Print")) {
                String secondCommand = input.split(" ")[1];
                print(secondCommand, list);
            } else if (command.equals("Get")) { //have second command, which I don't use
                getSum(list);
            } else if (command.equals("Filter")) {
                String condition = input.split(" ")[1];
                int number = Integer.parseInt(input.split(" ")[2]);
                filter(condition, number, list);
            }
            input = sc.nextLine();
        }
    }

    public static void filter(String condition, int number, List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        if (condition.equals(">")) {
            for (Integer integer : list) {
                if (integer > number) {
                    result.add(integer);
                }
            }
        } else if (condition.equals(">=")) {
            for (Integer integer : list) {
                if (integer >= number) {
                    result.add(integer);
                }
            }

        } else if (condition.equals("<")) {
            for (Integer integer : list) {
                if (integer < number) {
                    result.add(integer);
                }
            }
        } else if (condition.equals("<=")) {
            for (Integer integer : list) {
                if (integer <= number) {
                    result.add(integer);
                }
            }
        }
        for (Integer integer : result) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }

    public static void getSum(List<Integer> list) {
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        System.out.println(sum);
    }

    public static void print(String command, List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (command.equals("odd")) {
                if (list.get(i) % 2 != 0) {
                    result.add(list.get(i));
                }
            } else if (command.equals("even")) {
                if (list.get(i) % 2 == 0) {
                    result.add(list.get(i));
                }
            }
        }
        for (Integer integer : result) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }

    public static void contains(int number, List<Integer> list) {
        boolean containsNumber = false;
        for (Integer integer : list) {
            if (integer == number) {
                containsNumber = true;
                break;
            }
        }
        if (containsNumber) {
            System.out.println("Yes");
        } else {
            System.out.println("No such number");
        }
    }

}
