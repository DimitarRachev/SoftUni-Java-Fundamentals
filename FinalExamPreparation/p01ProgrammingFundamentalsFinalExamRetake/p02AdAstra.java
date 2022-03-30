package FinalExamPreparation.p01ProgrammingFundamentalsFinalExamRetake;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p02AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("([#|])(?<name>[a-zA-Z\\s]+)\\1(?<expiration>\\d{2}/\\d{2}/\\d{2})\\1(?<calories>\\d{1,5})\\1");
        Matcher matcher = pattern.matcher(input);

        List<Item> items = new ArrayList<>();
        int totalCalories = 0;
        while (matcher.find()) {
            totalCalories += Integer.parseInt(matcher.group("calories"));
            items.add(new Item(matcher.group("name"), matcher.group("expiration"), Integer.parseInt(matcher.group("calories"))));
        }

        System.out.println("You have food to last you for: " + totalCalories / 2000 + " days!");
        items.forEach(System.out::println);
    }

    public static class Item {
        String name;
        String expiration;
        int calories;

        public Item(String name, String expiration, int calories) {
            this.name = name;
            this.expiration = expiration;
            this.calories = calories;
        }

        @Override
        public String toString() {
            return "Item: " + this.name + ", Best before: " + this.expiration + ", Nutrition: " + this.calories;
        }
    }
}
