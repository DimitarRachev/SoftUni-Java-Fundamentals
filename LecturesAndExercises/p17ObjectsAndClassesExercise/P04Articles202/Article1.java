package LecturesAndExercises.p17ObjectsAndClassesExercise.P04Articles202;

public class Article1 {
    private final String title;
    private final String content;
    private final String author;

    public Article1(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }


    public  String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }
}
