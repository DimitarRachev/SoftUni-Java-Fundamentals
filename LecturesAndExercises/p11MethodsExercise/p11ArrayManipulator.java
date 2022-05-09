package LecturesAndExercises.p11MethodsExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p11ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] commandArray = command.split(" ");
            if (commandArray[0].equals("max")) {
                if (commandArray[1].equals("odd")) {
                    maxOddIndex(array);

                } else if (commandArray[1].equals("even")) {
                    maxEvenIndex(array);

                }
            }

            if (commandArray[0].equals("min")) {
                if (commandArray[1].equals("odd")) {
                    minOddIndex(array);

                } else if (commandArray[1].equals("even")) {
                    minEvenIndex(array);

                }
            }

            if (commandArray[0].equals("exchange")) {
                int index = Integer.parseInt(commandArray[1]);
                if (index < 0 || index >= array.length) {
                    System.out.println("Invalid index");
                } else {
                    array = exchangeNums(index, array);
                }
            }

            if (commandArray[0].equals("first")) {
                int count = Integer.parseInt(commandArray[1]);
                if (count > array.length || count <= 0) {
                    System.out.println("Invalid count");
                } else {
                    if (commandArray[2].equals("odd")) {
                        firstXOdd(count, array);
                    } else if (commandArray[2].equals("even")) {
                        firstXEven(count, array);
                    }
                }
            } else if (commandArray[0].equals("last")) {
                int count = Integer.parseInt(commandArray[1]);
                if (count > array.length || count <= 0) {
                    System.out.println("Invalid count");
                } else {
                    if (commandArray[2].equals("odd")) {
                        lastXOdd(count, array);
                    } else if (commandArray[2].equals("even")) {
                        lastXEven(count, array);
                    }
                }
            }
            command = scanner.nextLine();
        }

        List<Integer> arr = Arrays.stream(array).boxed().collect(Collectors.toList());  // принтиране на крайният масив, като лист
        System.out.println(arr);                                                        //
    }

    public static void lastXEven(int index, int[] arr) {
        List<Integer> result = new ArrayList<>();
        int counter = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] % 2 == 0 && counter < index) {
                result.add(0, arr[i]);
                counter++;
            }
        }
        System.out.println(result);
    }

    public static void lastXOdd(int index, int[] arr) {
        List<Integer> result = new ArrayList<>();
        int counter = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] % 2 != 0 && counter < index) {
                result.add(0, arr[i]);
                counter++;
            }
        }
        System.out.println(result);
    }

    public static void firstXEven(int index, int[] arr) {
        List<Integer> result = new ArrayList<>();
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && counter < index) {
                counter++;
                result.add(arr[i]);
            }
        }
        System.out.println(result);
    }

    public static void firstXOdd(int index, int[] arr) {
        List<Integer> result = new ArrayList<>();
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0 && counter < index) {
                counter++;
                result.add(arr[i]);
            }
        }
        System.out.println(result);
    }

    public static int[] exchangeNums(int index, int[] array) {
        for (int i = 0; i <= index; i++) {

            int temp = array[0];
            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }
            array[array.length - 1] = temp;
        }
        return array;
    }

    public static void minOddIndex(int[] arr) {
        int minIndex = -1;
        int minNum = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0 && arr[i] <= minNum) {
                minNum = arr[i];
                minIndex = i;
            }
        }
        if (minIndex == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(minIndex);
        }
    }

    public static void minEvenIndex(int[] arr) {
        int minIndex = -1;
        int minNum = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] <= minNum) {
                minNum = arr[i];
                minIndex = i;
            }
        }
        if (minIndex == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(minIndex);
        }
    }

    public static void maxOddIndex(int[] arr) {
        int maxIndex = -1;
        int maxNum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0 && arr[i] >= maxNum) {
                maxNum = arr[i];
                maxIndex = i;
            }
        }
        if (maxIndex == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(maxIndex);
        }
    }

    public static void maxEvenIndex(int[] arr) {
        int maxIndex = -1;
        int maxNum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] >= maxNum) {
                maxNum = arr[i];
                maxIndex = i;
            }
        }
        if (maxIndex == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(maxIndex);
        }

    }

}