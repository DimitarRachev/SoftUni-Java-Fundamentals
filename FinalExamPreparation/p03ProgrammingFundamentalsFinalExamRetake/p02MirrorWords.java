package FinalExamPreparation.p03ProgrammingFundamentalsFinalExamRetake;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p02MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("([@#])(?<first>[A-Za-z]{3,})\\1{2}(?<second>[A-Za-z]{3,})\\1");
        Matcher matcher = pattern.matcher(input);
        List<MirrorWords> words = new ArrayList<>();
        int pairs = 0;
        while (matcher.find()) {
            pairs++;
            if (matcher.group("first").equals(new StringBuilder(matcher.group("second")).reverse().toString())) {
                words.add(new MirrorWords(matcher.group("first"), matcher.group("second")));
            }
        }
        if (pairs == 0) {
            System.out.println("No word pairs found!");
        } else {
            System.out.println(pairs + " word pairs found!");
        }
        if (words.isEmpty()) {
            System.out.println("No mirror words!");
        } else {
            System.out.println("The mirror words are:");
            for (int i = 0; i < words.size(); i++) {
                System.out.print(words.get(i));
                if (i != words.size() - 1) {
                    System.out.print(", ");
                }
            }
        }
    }

    static class MirrorWords {
        String first;
        String second;

        public MirrorWords(String first, String second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public String toString() {
            return this.first + " <=> " + this.second;
        }
    }
}
