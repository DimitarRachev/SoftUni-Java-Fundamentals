package FinalExamPreparation.p04ProgrammingFundamentalsFinalExam;

import java.util.Scanner;

public class p01PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder passwd = new StringBuilder(scanner.nextLine());
        String line;
        while (!"Done".equals(line = scanner.nextLine())) {
            String[] input = line.split("\\s+");
            String command = input[0];
            if (command.equals("TakeOdd")) {
                passwd = takeOdd(passwd);
                System.out.println(passwd);
            } else  if (command.equals("Cut")) {
                int index = Integer.parseInt(input[1]);
                int lenght = Integer.parseInt(input[2]);
                passwd.replace(index, index + lenght, "");
                System.out.println(passwd);
            } else  if (command.equals("Substitute")) {
                String substring = input[1];
                String substitude = input[2];
                if (passwd.indexOf(substring) == -1) {
                    System.out.println("Nothing to replace!");
                } else {
                    passwd = substitute(substring, substitude, passwd);
                    System.out.println(passwd);
                }
            }
        }
        System.out.println("Your password is: " + passwd);
    }

    private static StringBuilder substitute(String substring, String substitude, StringBuilder passwd) {
        return new StringBuilder(passwd.toString().replace(substring, substitude));
    }

    private static StringBuilder takeOdd(StringBuilder passwd) {
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < passwd.length(); i++) {
            if (i % 2 != 0) {
                temp.append(passwd.charAt(i));
            }
        }
        return temp;
    }
}
