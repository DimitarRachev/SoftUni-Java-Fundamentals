package LecturesAndExercises.p19MapsLambdaAndStreamAPILab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("D:\\JavaEX\\Sample500.csv"));
        String line = scanner.nextLine();
        line = scanner.nextLine();

        List<Double> items = new ArrayList<>();
        while (scanner.hasNext()) {

            String[] data = line.split(",");

            String item = data[4];
            items.add(Double.parseDouble(item));

            line = scanner.nextLine();
        }

//        for (Double item : items) {
//            System.out.println(item);
//        }
        items.sort(Double::compareTo);
        System.out.println(items.get((items.size()/2) - 1));

    }
}
