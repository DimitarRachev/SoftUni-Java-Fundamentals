package LecturesAndExercises.p17ObjectsAndClassesExercise.P04Articles202;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Article1> books = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String com = scanner.nextLine();
            String title = com.split(",\\s")[0];
            String content = com.split(",\\s")[1];
            String author = com.split(",\\s")[2];
            Article1 tmp = new Article1(title, content, author);
            books.add(tmp);
        }

        String searchCriteria = scanner.nextLine();
//        switch (searchCriteria) {
//            case "title":
//                books.sort(Comparator.comparing(Article1::getTitle));
//                break;
//            case "content":
//                books.sort(Comparator.comparing(Article1::getContent));
//                break;
//            case "author":
//                books.sort(Comparator.comparing(Article1::getAuthor));
//                break;
//        }
        for (Article1 book : books) {
            System.out.printf("%s - %s: %s%n", book.getTitle(), book.getContent(), book.getAuthor());
        }
    }
}


