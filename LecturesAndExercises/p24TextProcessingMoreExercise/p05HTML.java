package LecturesAndExercises.p24TextProcessingMoreExercise;

import java.util.Scanner;

public class p05HTML {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String title = scanner.nextLine();
        String article = scanner.nextLine();
        String comment = scanner.nextLine();

        System.out.println("<h1>");
        System.out.println(title);
        System.out.println("</h1>");
        System.out.println("<article>");
        System.out.println(article);
        System.out.println("</article>");

        while (!comment.equals("end of comments")) {
            System.out.println("<div>");
            System.out.println(comment);
            System.out.println("</div>");
            comment = scanner.nextLine();
        }

    }
}
