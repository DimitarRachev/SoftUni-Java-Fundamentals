package LecturesAndExercises.p01BasicSyntaxConditionalStatementsAndLoopsLab;

public class p08DivisibleBy3 {
    public static void main(String[] args) {

        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
