package FinalExamPreparation.p05ProgrammingFundamentalsFinalExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p02EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long coolTreshhold = 1;
        String input = scanner.nextLine();
        Pattern coolPattern = Pattern.compile("\\d");
        Matcher coolMather = coolPattern.matcher(input);
        while (coolMather.find()) {
            coolTreshhold = coolTreshhold * Integer.parseInt(coolMather.group());
        }
        System.out.println("Cool threshold: " + coolTreshhold);

        int emojis = 0;
        List<String> coolEmojis =new ArrayList<>();
        Pattern pattern = Pattern.compile("([:]{2}|[*]{2})(?<emoji>[A-Z][a-z]{2,})\\1");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            emojis++;
            String emoji = matcher.group("emoji");
            int coolness = 0;
            for (int i = 0; i < emoji.length(); i++) {
                coolness += emoji.charAt(i);
            }
            if (coolness > coolTreshhold) {
                coolEmojis.add(matcher.group());
            }
        }

        System.out.println(emojis + " emojis found in the text. The cool ones are:");
        coolEmojis.forEach(System.out::println);
    }
}
