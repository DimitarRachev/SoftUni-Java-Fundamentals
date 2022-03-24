package LecturesAndExercises.p23TextProcessingExercise;

import java.util.Scanner;

public class p03ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        String file = path.substring(path.lastIndexOf("\\") +1);
        String name = file.substring(0, file.indexOf("."));
        String extension = file.substring(file.indexOf(".") + 1);
        System.out.printf("File name: %s%n", name);
        System.out.printf("File extension: %s", extension);


    }
}
