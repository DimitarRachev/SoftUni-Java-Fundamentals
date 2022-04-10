package LecturesAndExercises.p17ObjectsAndClassesExercise;

import java.util.Random;
import java.util.Scanner;

public class p01AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] phrases = {"Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
        String[] events = {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
        String[] autors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        int n = Integer.parseInt(scanner.nextLine());
        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            System.out.printf("%s %s %s – %s.%n", phrases[rnd.nextInt(phrases.length)], events[rnd.nextInt(events.length)], autors[rnd.nextInt(autors.length)] ,cities[rnd.nextInt(cities.length)]);
        }

    }
}
