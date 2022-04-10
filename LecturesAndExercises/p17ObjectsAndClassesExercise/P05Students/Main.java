package LecturesAndExercises.p17ObjectsAndClassesExercise.P05Students;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Student> strudents = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            Student tpm = new Student(input[0], input[1], Double.parseDouble(input[2]));
            strudents.add(tpm);
        }
        strudents.sort(Comparator.comparing(Student::getGrade));
        Collections.reverse(strudents);
        for (Student s : strudents) {
            System.out.printf("%s %s: %.2f%n", s.getFirstName(), s.getLastName(), s.getGrade());
        }

    }
}
