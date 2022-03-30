package FinalExamPreparation.p01ProgrammingFundamentalsFinalExamRetake;

import java.util.Scanner;

public class p01TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder input = new StringBuilder(scanner.nextLine());

        String line;
        while (!"Decode".equals(line = scanner.nextLine())) {
            String[] arr = line.split("\\|");
            String command = arr[0];

            if (command.equals("Move")) {
                int num = Integer.parseInt(arr[1]);
                move(num, input);
            } else if (command.equals("Insert")) {
                int index = Integer.parseInt(arr[1]);
                String value = arr[2];
                input.insert(index, value);
            } else if (command.equals("ChangeAll")) {
                String subString = arr[1];
                String replacement = arr[2];
               input = new StringBuilder(input.toString().replace(subString, replacement));
            }
        }

        System.out.println("The decrypted message is: " + input.toString());
    }

    private static void move(int num, StringBuilder input) {
        String temp = input.substring(0, num);
        input.delete(0, num);
        input.append(temp);
    }
}
