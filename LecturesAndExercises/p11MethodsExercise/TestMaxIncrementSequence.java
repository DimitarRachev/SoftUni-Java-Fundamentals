package LecturesAndExercises.p11MethodsExercise;

public class TestMaxIncrementSequence {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 1, 1, 2, 3, 1, 1, 1, 2, 1, 1, 2, 3, 4, 1, 1, 2, 3, 4, 5};
        int longestLenght = 0;
        int currentLenght = 1;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] < numbers[i + 1]) {
                currentLenght++;
            } else {
                currentLenght = 1;
            }
            if (longestLenght < currentLenght) {
                longestLenght = currentLenght;
            }
        }
        System.out.println(longestLenght);
    }
}
