package LecturesAndExercises.p26RegularExpressionsExercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p03SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "%(?<consumer>[A-Z][a-z]+)%[^|$%]*<(?<product>\\w+)>[^|$%]*\\|(?<count>\\d+)\\|[^|$%\\d]*(?<price>\\d*\\.?\\d*)\\$";
        Pattern pattern = Pattern.compile(regex);
        String input;
        double sum = 0;

        while (!"end of shift".equals(input = scanner.nextLine())) {
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                String name = matcher.group("consumer");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));
                sum += count * price;
                System.out.printf("%s: %s - %.2f%n", name, product, count * price);
            }
        }
        System.out.printf("Total income: %.2f", sum);

    }
}
