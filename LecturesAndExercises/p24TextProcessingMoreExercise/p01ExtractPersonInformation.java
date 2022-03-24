package LecturesAndExercises.p24TextProcessingMoreExercise;

import javax.xml.crypto.dsig.spec.XPathType;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p01ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String name = input.substring(input.indexOf("@") + 1, input.indexOf("|"));
            String age = input.substring(input.indexOf("#") + 1, input.indexOf("*"));
            System.out.printf("%s is %d years old.%n", name, Integer.parseInt(age));

        }

    }
}
