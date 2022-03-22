package LecturesAndExercises.p26RegularExpressionsExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p01Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> items = new ArrayList<>();

        String regex = ">>(?<item>[A-Za-z]+)<<(?<price>\\d+\\.?\\d*)!(?<quantity>\\d+)";
        Pattern pattern = Pattern.compile(regex);
        String input;
        double sum = 0;
        while (!"Purchase".equals(input = scanner.nextLine())) {
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                String price = matcher.group("price");
                String quantity = matcher.group("quantity");
                sum += Double.parseDouble(price) * Integer.parseInt(quantity);
                items.add(matcher.group("item"));
            }
        }
        System.out.println("Bought furniture:");
        for (String item : items) {
            System.out.println(item);
        }

        System.out.printf("Total money spend: %.2f", sum);
    }
}
