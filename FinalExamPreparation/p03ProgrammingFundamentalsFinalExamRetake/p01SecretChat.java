package FinalExamPreparation.p03ProgrammingFundamentalsFinalExamRetake;

import java.util.Scanner;

public class p01SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder message = new StringBuilder(scanner.nextLine());
        String line;
        while (!"Reveal".equals(line = scanner.nextLine())) {
            String[] input = line.split(":\\|:");
            String command = input[0];

            switch (command) {
                case "InsertSpace":
                    int index = Integer.parseInt(input[1]);
                    message.insert(index, " ");
                    System.out.println(message);
                    break;
                case "Reverse":
                    String substring = input[1];
                    if (message.indexOf(substring) > -1) {
                        reverse(substring, message);
                        System.out.println(message);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "ChangeAll":
                    String oldString = input[1];
                    String newString = input[2];
                    message = new StringBuilder(message.toString().replace(oldString, newString));
                    System.out.println(message);
                    break;
            }
        }
        System.out.println("You have a new text message: " + message);
    }

    private static void reverse(String substring, StringBuilder message) {
        StringBuilder temp = new StringBuilder(substring).reverse();
        message.delete(message.indexOf(substring),message.indexOf(substring) + substring.length());
        message.append(temp.toString());
    }
}
