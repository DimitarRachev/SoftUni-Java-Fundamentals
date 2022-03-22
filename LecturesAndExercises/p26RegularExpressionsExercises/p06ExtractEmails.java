package LecturesAndExercises.p26RegularExpressionsExercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p06ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern pattern = Pattern.compile("^(?<username>[A-Za-z0-9]+[.\\-_]*[A-Za-z0-9]+)@(?<host>[A-Za-z]+\\-*[A-Za-z]+\\.[A-Za-z]*\\-*[A-Za-z]*\\.?[A-Za-z]*\\-*[A-Za-z]+)");
String[] input = scanner.nextLine().split("\\s+");
        for (int i = 0; i < input.length; i++) {
            Matcher matcher = pattern.matcher(input[i]);

                while (matcher.find()) {
                    System.out.println(matcher.group());
                }
        }


    }
}
