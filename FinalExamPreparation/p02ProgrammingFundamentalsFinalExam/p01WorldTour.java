package FinalExamPreparation.p02ProgrammingFundamentalsFinalExam;

import java.util.Scanner;

public class p01WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder destination = new StringBuilder(scanner.nextLine());

        String line;
        while (!"Travel".equals(line = scanner.nextLine())) {
            String[] input = line.split(":");
            String command = input[0];
            if (command.equals("Add Stop")) {
                int index = Integer.parseInt(input[1]);
                String str = input[2];
                if (indexIsValid(index, destination)) {
                    destination.insert(index, str);
                }
                System.out.println(destination);

            } else if (command.equals("Remove Stop")) {
                int startIndex = Integer.parseInt(input[1]);
                int endIndex = Integer.parseInt(input[2]) + 1;
                if (indexIsValid(startIndex, destination) && indexIsValid(endIndex -1, destination)) {
                    destination.delete(startIndex, endIndex);
                }
                System.out.println(destination);

            } else if (command.equals("Switch")) {
                String oldStr = input[1];
                String newStr = input[2];
                if (destination.indexOf(oldStr) > -1) {
                    destination.replace(destination.indexOf(oldStr), destination.indexOf(oldStr) + oldStr.length(), newStr);
                }
                System.out.println(destination);
            }
        }
        System.out.println("Ready for world tour! Planned stops: " + destination);
    }

    private static boolean indexIsValid(int index, StringBuilder destination) {
        return index >= 0 && index < destination.length();
    }
}
