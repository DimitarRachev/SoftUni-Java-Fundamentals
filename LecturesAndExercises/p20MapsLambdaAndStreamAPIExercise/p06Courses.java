package LecturesAndExercises.p20MapsLambdaAndStreamAPIExercise;

import java.util.*;

public class p06Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> map = new LinkedHashMap<>();
        String input;

        while (!"end".equals(input = scanner.nextLine())) {
            String courseName = input.split(" : ")[0];
            String studentName = input.split(" : ")[1];
            if (map.containsKey(courseName)) {
                List<String> tpm = map.get(courseName);
                tpm.add(studentName);
                map.put(courseName, tpm);
            } else {
                List<String> tmp = new ArrayList<>();
                tmp.add(studentName);
                map.put(courseName, tmp);
            }
        }

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            List<String> tmp = entry.getValue();
            System.out.printf("%s: %d%n", entry.getKey(), tmp.size());
            for (String s : tmp) {
                System.out.printf("-- %s%n", s);
            }
        }

    }
}
