package FinalExamPreparation.p04ProgrammingFundamentalsFinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p02FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern pattern = Pattern.compile("@#+(?<item>[A-Z][A-Za-z0-9]{4,}[A-Z])@#+");
        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String item = matcher.group("item");
                Pattern digitpattern = Pattern.compile("\\d+");
                Matcher digitMatcher = digitpattern.matcher(item);
                StringBuilder groupId = new StringBuilder();
                while (digitMatcher.find()) {
                    groupId.append(digitMatcher.group());
                }
                if (groupId.length() == 0) {
                    System.out.println("Product group: 00");
                } else {
                    System.out.println("Product group: " + groupId);
                }
            } else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
