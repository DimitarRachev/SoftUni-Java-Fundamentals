package LecturesAndExercises.p17ObjectsAndClassesExercise;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {
    static class Article {

        private String getTitle() {
            return title;
        }

        private String getContent() {
            return content;
        }

        private String getAuthor() {
            return author;
        }

        String title;
        String content;
        String author;

        private Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Article> articles = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(",\\s+");
            String title = data[0];
            String content = data[1];
            String author = data[2];

            Article article = new Article(title, content, author);
            articles.add(article);
        }

        String command = scanner.nextLine();
//        switch (command) {
//            case "title":
//                articles.sort(Comparator.comparing(Article::getTitle));
//                break;
//
//            case "content":
//                articles.sort(Comparator.comparing(Article::getContent));
//                break;
//
//            case "author":
//                articles.sort(Comparator.comparing(Article::getAuthor));
//                break;
//        }

        for (Article article : articles) {
            System.out.printf("%s - %s: %s%n", article.getTitle(), article.getContent(), article.getAuthor());
        }
    }
}

