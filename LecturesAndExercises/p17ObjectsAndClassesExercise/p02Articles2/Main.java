package LecturesAndExercises.p17ObjectsAndClassesExercise.p02Articles2;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(",\\s");
        Article book = new Article(input[0], input[1], input[2]);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String com = scanner.nextLine();
            String command = com.split(":")[0];

            if (command.equals("Edit")) {
                String value = com.split(":\\s")[1];

                book.Edit(value);

            } else if (command.equals("ChangeAuthor")) {
                String value = com.split(":\\s")[1];

                book.ChangeAuthor(value);

            } else if (command.equals("Rename")) {
                String value = com.split(":\\s")[1];

                book.Rename(value);
            }
        }
        System.out.printf("%s - %s: %s",book.getTitle(),book.getContent(),book.getAuthor());
    }

}


