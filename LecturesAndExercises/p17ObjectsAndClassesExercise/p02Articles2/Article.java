package LecturesAndExercises.p17ObjectsAndClassesExercise.p02Articles2;

public class Article {

        private String title;
        private String content;
        private String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public void Edit(String newContent){
            this.content = newContent;
        }
        public void ChangeAuthor(String newAuthor) {
            this.author = newAuthor;
        }

        public void Rename(String newTitle) {
            this.title = newTitle;
        }
//        @Override
//        private void ToString() {
//            System.out.printf("%s - %s:%s",this.title, this.content, this.author );
//        }


        public String getTitle() {
            return title;
        }

        public String getContent() {
            return content;
        }

        public String getAuthor() {
            return author;
        }

}
