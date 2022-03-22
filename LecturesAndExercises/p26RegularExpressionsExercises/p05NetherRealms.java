package LecturesAndExercises.p26RegularExpressionsExercises;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p05NetherRealms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] demons = scanner.nextLine().split("\\s*,+\\s*");

        for (String demon : demons) {
            Pattern heathPattern = Pattern.compile("[^0-9+\\-*/.]");
            Matcher healthMatcher = heathPattern.matcher(demon);
            int demonHealth = 0;

            while (healthMatcher.find()) {
                char temp = healthMatcher.group().charAt(0);
                demonHealth += temp;
            }

            Pattern dmgCalcPatter = Pattern.compile("([\\-+]?\\d+\\.\\d+|[\\-+]?\\d+)");
            Matcher dmgNumMatcher = dmgCalcPatter.matcher(demon);

            double dmg = 0;
            while (dmgNumMatcher.find()) {
                dmg += Double.parseDouble(dmgNumMatcher.group());
            }

            Pattern multiplication = Pattern.compile("[*/]");
            Matcher multi = multiplication.matcher(demon);
            List<String> actions = new ArrayList<>();

            while (multi.find()) {
                actions.add(multi.group());
            }

            for (String action : actions) {
                switch (action) {
                    case "*":
                        dmg *= 2;
                        break;
                    case "/":
                        dmg /= 2;
                        break;
                }
            }
            System.out.printf("%s - %d health, %.2f damage%n", demon, demonHealth, dmg);
        }
    }
}
