package LecturesAndExercises.p17ObjectsAndClassesExercise.P07OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;
        List<Person> personList = new ArrayList<>();
        while (!"End".equals(input = scanner.nextLine())) {
            String name = input.split("\\s+")[0];
            String ID = input.split("\\s+")[1];
            int age = Integer.parseInt(input.split("\\s+")[2]);
            Person tmp = new Person(name, ID, age);
            personList.add(tmp);
        }
        personList.sort(Comparator.comparing(Person::getAge));

        for (Person person : personList) {
            System.out.printf("%s with ID: %s is %d years old.%n", person.getName(), person.getID(), person.getAge());
        }

    }
}
