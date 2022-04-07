package FinalExamPreparation.p05ProgrammingFundamentalsFinalExam;

import java.util.Locale;
import java.util.Scanner;

public class p01ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder actKey = new StringBuilder(scanner.nextLine());
        String line;
        while (!"Generate".equals(line = scanner.nextLine())) {
            String[] input = line.split(">>>");
            String command = input[0];
            switch (command) {
                case "Contains":
                    String subString = input[1];
                    contains(actKey, subString);
                    break;
                case "Flip":
                    String parameter = input[1];
                    int startIndex = Integer.parseInt(input[2]);
                    int endIndex = Integer.parseInt(input[3]);
                    String substring = actKey.substring(startIndex, endIndex);

                    substring = parameter.equals("Upper") ? substring.toUpperCase(Locale.ROOT) :  substring.toLowerCase(Locale.ROOT);
                    actKey.replace(startIndex, endIndex, substring);
                    System.out.println(actKey);
                    break;
                case "Slice":
                    int start = Integer.parseInt(input[1]);
                    int end = Integer.parseInt(input[2]);
                    actKey.delete(start, end);
                    System.out.println(actKey);
                    break;
            }
        }

        System.out.println("Your activation key is: " + actKey);
    }

    private static void contains(StringBuilder actKey, String subString) {
        if (actKey.indexOf(subString) > -1) {
            System.out.printf("%s contains %s%n", actKey, subString);
        } else {
            System.out.println("Substring not found!");
        }
    }
}
